package qcm.m2m;

import presentation.*;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import qcm.Question;
import qcm.Questionnaire;
import qcm.Reponse;
import qcm.Etiquette;
import qcm.dsl.DSLStandaloneSetup;
import java.util.Set;
import java.util.stream.Collectors;
public class M2M {
    private static class TransformationParams {
    	List<String> filterTags;
        Integer difficulteMin;
        Integer difficulteMax;
        boolean trierParDifficulte;
        boolean ordreCroissant;
        boolean matchAllTags;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java M2M <qcm_file> [tags] [-d min max] [-sort asc|desc] [-matchAll]");
            return;
        }

        TransformationParams params = new TransformationParams();
        String qcmFile = args[0];
        
        for (int i = 1; i < args.length; i++) {
            switch (args[i]) {
                case "-d":
                    params.difficulteMin = Integer.parseInt(args[++i]);
                    params.difficulteMax = Integer.parseInt(args[++i]);
                    break;
                case "-sort":
                    params.trierParDifficulte = true;
                    params.ordreCroissant = args[++i].equals("asc");
                    break;
                case "-matchAll":
                    params.matchAllTags = true;
                    break;
                default:
                    if (params.filterTags == null) {
                        params.filterTags = new ArrayList<>();
                    }
                    params.filterTags.add(args[i]);
            }
        }

        Questionnaire questionnaire = chargerQuestionnaire(qcmFile);
        Presentation presentation = transformerQuestionnaire(questionnaire, params);
        sauvegarderPresentation(presentation, "model/presentation.xmi");
    }
    
    
    private static Questionnaire chargerQuestionnaire(String path) {
        System.out.println("Chargement du questionnaire depuis: " + path);
        
        Injector injector = new DSLStandaloneSetup().createInjectorAndDoEMFRegistration();
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        Resource resource = resourceSet.createResource(URI.createURI(path));
        
        try {
            resource.load(resourceSet.getLoadOptions());
            Questionnaire questionnaire = (Questionnaire) resource.getContents().get(0);
            System.out.println("Questionnaire chargé avec succès - Titre: " + questionnaire.getTitre());
            return questionnaire;
        } catch (IOException e) {
            System.err.println("Erreur lors du chargement du questionnaire: " + e.getMessage());
            throw new RuntimeException("Erreur lors du chargement du questionnaire", e);
        }
    }
    

    private static Presentation transformerQuestionnaire(Questionnaire questionnaire, TransformationParams params) {
        Presentation presentation = PresentationFactory.eINSTANCE.createPresentation();
        presentation.setTitre(questionnaire.getTitre());
        presentation.setRetourAutorise(questionnaire.isRetourArriere());
        
        List<Question> questions = new ArrayList<>(questionnaire.getPossede());
        if (questionnaire.isMelange()) {
        	Collections.shuffle(questions);
        }
  
        List<Question> questionsFiltrees = filtrerQuestions(questions, params);
        if (params.trierParDifficulte) {
            trierQuestions(questionsFiltrees, params.ordreCroissant);
        }
        
        List<Page> pages = creerPages(questionsFiltrees, presentation);
        etablirNavigation(pages);
        presentation.getPages().addAll(pages);
        return presentation;
    }

    private static List<Question> filtrerQuestions(List<Question> questions, TransformationParams params) {
    	   return questions.stream()
    	       .filter(q -> {
    	           boolean matchTags = true;
    	           if (params.filterTags != null && !params.filterTags.isEmpty()) {
    	               Set<String> questionTags = q.getEtiquette().stream()
    	                   .map(Etiquette::getCategorie)
    	                   .collect(Collectors.toSet());
    	                   
    	               if (params.matchAllTags) {
    	                   matchTags = questionTags.containsAll(params.filterTags);
    	               } else {
    	                   matchTags = params.filterTags.stream()
    	                       .anyMatch(questionTags::contains);
    	               }
    	           }
    	           
    	           boolean matchDifficulte = (params.difficulteMin == null || q.getDifficulte() >= params.difficulteMin) &&
    	               (params.difficulteMax == null || q.getDifficulte() <= params.difficulteMax);
    	               
    	           return matchTags && matchDifficulte;
    	       })
    	       .collect(Collectors.toList());
    	}
    private static void trierQuestions(List<Question> questions, boolean croissant) {
        questions.sort((q1, q2) -> croissant ? 
            Long.compare(q1.getDifficulte(), q2.getDifficulte()) :
            Long.compare(q2.getDifficulte(), q1.getDifficulte()));
    }


    private static List<Page> creerPages(List<Question> questions, Presentation presentation) {
        List<Page> pages = new ArrayList<>();
        int numeroPage = 1;
        
        for (Question questionSource : questions) {  // Utilise la liste filtrée
            Page page = creerPage(questionSource, numeroPage++, presentation);
            pages.add(page);
        }
        return pages;
    }

    // Modifier creerPage pour accepter la présentation
    private static Page creerPage(Question questionSource, int numero, Presentation presentation) {
        System.out.println("Création de la page " + numero);
        
        Page page = PresentationFactory.eINSTANCE.createPage();
        page.setNumero(numero);
        page.setQuestion(creerQuestionAffichee(questionSource, presentation)); // Passer la présentation
        
        return page;
    }

    private static QuestionAffichee creerQuestionAffichee(Question questionSource, Presentation presentation) {
        System.out.println("Création d'une question affichée: " + questionSource.getIntitule());
        
        QuestionAffichee questionAffichee = PresentationFactory.eINSTANCE.createQuestionAffichee();
        questionAffichee.setIntitule(questionSource.getIntitule());
        questionAffichee.setNiveauDifficulte((int) questionSource.getDifficulte());
        questionAffichee.setChoixMultiple(questionSource.getReponses()
        		.stream()
        		.filter(Reponse::isValide)
        		.count() > 1
        );
        
        // Ajouter les catégories directement à la question
        for (Etiquette etiquette : questionSource.getEtiquette()) {
            // Chercher si la catégorie existe déjà ou en créer une nouvelle
            CategorieQuestion categorie = trouverOuCreerCategorie(presentation, etiquette.getCategorie());
            questionAffichee.getCategories().add(categorie);  // Nécessite d'ajouter une relation categories dans le métamodèle
        }
        
        creerReponses(questionSource, questionAffichee);
        return questionAffichee;
    }
    
    
    
    private static CategorieQuestion trouverOuCreerCategorie(Presentation presentation, String nomCategorie) {
        // Chercher dans les catégories existantes
        for (CategorieQuestion cat : presentation.getCategoriesSelectionnees()) {
            if (cat.getNom().equals(nomCategorie)) {
                return cat;
            }
        }
        
        // Créer une nouvelle catégorie si non trouvée
        CategorieQuestion nouvelleCat = PresentationFactory.eINSTANCE.createCategorieQuestion();
        nouvelleCat.setNom(nomCategorie);
        presentation.getCategoriesSelectionnees().add(nouvelleCat);
        return nouvelleCat;
    }


    private static void creerReponses(Question questionSource, QuestionAffichee questionAffichee) {
        System.out.println("Création des réponses pour la question: " + questionSource.getIntitule());
        
        for (Reponse reponseSource : questionSource.getReponses()) {
            ReponseProposee reponseProposee = PresentationFactory.eINSTANCE.createReponseProposee();
            reponseProposee.setTexte(reponseSource.getIntitule());
            reponseProposee.setEstCorrecte(reponseSource.isValide());
            questionAffichee.getReponsesPossibles().add(reponseProposee);
            System.out.println("Réponse ajoutée: " + reponseSource.getIntitule());
        }
    }

    private static void ajouterCategories(Presentation presentation, List<Question> questions) {
        System.out.println("Ajout des catégories au niveau de la présentation");
        
        // Utilisation d'un Set pour éviter les doublons
        java.util.Set<String> categoriesUniques = new java.util.HashSet<>();
        
        // Collecter toutes les catégories uniques
        for (Question question : questions) {
            for (Etiquette etiquette : question.getEtiquette()) {
                if (categoriesUniques.add(etiquette.getCategorie())) {
                    // Création de la catégorie seulement si elle n'existe pas déjà
                    CategorieQuestion categorie = PresentationFactory.eINSTANCE.createCategorieQuestion();
                    categorie.setNom(etiquette.getCategorie());
                    presentation.getCategoriesSelectionnees().add(categorie);
                    System.out.println("Catégorie ajoutée à la présentation: " + etiquette.getCategorie());
                }
            }
        }
        
        System.out.println("Nombre total de catégories uniques: " + categoriesUniques.size());
    }

    private static void etablirNavigation(List<Page> pages) {
        System.out.println("Établissement de la navigation entre les pages");
        
        for (int i = 0; i < pages.size(); i++) {
            if (i > 0) {
                pages.get(i).setPagePrecedente(pages.get(i-1));
                System.out.println("Lien précédent établi pour la page " + (i+1));
            }
            if (i < pages.size() - 1) {
                pages.get(i).setPageSuivante(pages.get(i+1));
                System.out.println("Lien suivant établi pour la page " + (i+1));
            }
        }
    }

    private static void sauvegarderPresentation(Presentation presentation, String path) {
        System.out.println("Sauvegarde de la présentation dans: " + path);
        
        Injector injector = new DSLStandaloneSetup().createInjectorAndDoEMFRegistration();
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        Resource presentationResource = resourceSet.createResource(URI.createURI(path));
        presentationResource.getContents().add(presentation);
        
        try {
            presentationResource.save(null);
            System.out.println("Présentation sauvegardée avec succès");
        } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde de la présentation: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
