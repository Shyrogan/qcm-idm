/**
 */
package presentation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see presentation.PresentationFactory
 * @model kind="package"
 * @generated
 */
public interface PresentationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "presentation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/presentation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "presentation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PresentationPackage eINSTANCE = presentation.impl.PresentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link presentation.impl.PresentationImpl <em>Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see presentation.impl.PresentationImpl
	 * @see presentation.impl.PresentationPackageImpl#getPresentation()
	 * @generated
	 */
	int PRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__TITRE = 0;

	/**
	 * The feature id for the '<em><b>Retour Autorise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__RETOUR_AUTORISE = 1;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__PAGES = 2;

	/**
	 * The feature id for the '<em><b>Categories Selectionnees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__CATEGORIES_SELECTIONNEES = 3;

	/**
	 * The number of structural features of the '<em>Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link presentation.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see presentation.impl.PageImpl
	 * @see presentation.impl.PresentationPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NUMERO = 0;

	/**
	 * The feature id for the '<em><b>Question</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__QUESTION = 1;

	/**
	 * The feature id for the '<em><b>Page Suivante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PAGE_SUIVANTE = 2;

	/**
	 * The feature id for the '<em><b>Page Precedente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PAGE_PRECEDENTE = 3;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link presentation.impl.QuestionAfficheeImpl <em>Question Affichee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see presentation.impl.QuestionAfficheeImpl
	 * @see presentation.impl.PresentationPackageImpl#getQuestionAffichee()
	 * @generated
	 */
	int QUESTION_AFFICHEE = 2;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_AFFICHEE__CATEGORIES = 0;

	/**
	 * The feature id for the '<em><b>Intitule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_AFFICHEE__INTITULE = 1;

	/**
	 * The feature id for the '<em><b>Niveau Difficulte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_AFFICHEE__NIVEAU_DIFFICULTE = 2;

	/**
	 * The feature id for the '<em><b>Choix Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_AFFICHEE__CHOIX_MULTIPLE = 3;

	/**
	 * The feature id for the '<em><b>Reponses Possibles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_AFFICHEE__REPONSES_POSSIBLES = 4;

	/**
	 * The number of structural features of the '<em>Question Affichee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_AFFICHEE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Question Affichee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_AFFICHEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link presentation.impl.ReponseProposeeImpl <em>Reponse Proposee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see presentation.impl.ReponseProposeeImpl
	 * @see presentation.impl.PresentationPackageImpl#getReponseProposee()
	 * @generated
	 */
	int REPONSE_PROPOSEE = 3;

	/**
	 * The feature id for the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_PROPOSEE__TEXTE = 0;

	/**
	 * The feature id for the '<em><b>Est Correcte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_PROPOSEE__EST_CORRECTE = 1;

	/**
	 * The number of structural features of the '<em>Reponse Proposee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_PROPOSEE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reponse Proposee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_PROPOSEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link presentation.impl.CategorieQuestionImpl <em>Categorie Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see presentation.impl.CategorieQuestionImpl
	 * @see presentation.impl.PresentationPackageImpl#getCategorieQuestion()
	 * @generated
	 */
	int CATEGORIE_QUESTION = 4;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIE_QUESTION__NOM = 0;

	/**
	 * The feature id for the '<em><b>Sous Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIE_QUESTION__SOUS_CATEGORIES = 1;

	/**
	 * The number of structural features of the '<em>Categorie Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIE_QUESTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Categorie Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIE_QUESTION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link presentation.Presentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presentation</em>'.
	 * @see presentation.Presentation
	 * @generated
	 */
	EClass getPresentation();

	/**
	 * Returns the meta object for the attribute '{@link presentation.Presentation#getTitre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titre</em>'.
	 * @see presentation.Presentation#getTitre()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_Titre();

	/**
	 * Returns the meta object for the attribute '{@link presentation.Presentation#isRetourAutorise <em>Retour Autorise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retour Autorise</em>'.
	 * @see presentation.Presentation#isRetourAutorise()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_RetourAutorise();

	/**
	 * Returns the meta object for the containment reference list '{@link presentation.Presentation#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see presentation.Presentation#getPages()
	 * @see #getPresentation()
	 * @generated
	 */
	EReference getPresentation_Pages();

	/**
	 * Returns the meta object for the containment reference list '{@link presentation.Presentation#getCategoriesSelectionnees <em>Categories Selectionnees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories Selectionnees</em>'.
	 * @see presentation.Presentation#getCategoriesSelectionnees()
	 * @see #getPresentation()
	 * @generated
	 */
	EReference getPresentation_CategoriesSelectionnees();

	/**
	 * Returns the meta object for class '{@link presentation.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see presentation.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link presentation.Page#getNumero <em>Numero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero</em>'.
	 * @see presentation.Page#getNumero()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Numero();

	/**
	 * Returns the meta object for the containment reference '{@link presentation.Page#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Question</em>'.
	 * @see presentation.Page#getQuestion()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Question();

	/**
	 * Returns the meta object for the reference '{@link presentation.Page#getPageSuivante <em>Page Suivante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Page Suivante</em>'.
	 * @see presentation.Page#getPageSuivante()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_PageSuivante();

	/**
	 * Returns the meta object for the reference '{@link presentation.Page#getPagePrecedente <em>Page Precedente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Page Precedente</em>'.
	 * @see presentation.Page#getPagePrecedente()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_PagePrecedente();

	/**
	 * Returns the meta object for class '{@link presentation.QuestionAffichee <em>Question Affichee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Affichee</em>'.
	 * @see presentation.QuestionAffichee
	 * @generated
	 */
	EClass getQuestionAffichee();

	/**
	 * Returns the meta object for the reference list '{@link presentation.QuestionAffichee#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Categories</em>'.
	 * @see presentation.QuestionAffichee#getCategories()
	 * @see #getQuestionAffichee()
	 * @generated
	 */
	EReference getQuestionAffichee_Categories();

	/**
	 * Returns the meta object for the attribute '{@link presentation.QuestionAffichee#getIntitule <em>Intitule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intitule</em>'.
	 * @see presentation.QuestionAffichee#getIntitule()
	 * @see #getQuestionAffichee()
	 * @generated
	 */
	EAttribute getQuestionAffichee_Intitule();

	/**
	 * Returns the meta object for the attribute '{@link presentation.QuestionAffichee#getNiveauDifficulte <em>Niveau Difficulte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Niveau Difficulte</em>'.
	 * @see presentation.QuestionAffichee#getNiveauDifficulte()
	 * @see #getQuestionAffichee()
	 * @generated
	 */
	EAttribute getQuestionAffichee_NiveauDifficulte();

	/**
	 * Returns the meta object for the attribute '{@link presentation.QuestionAffichee#isChoixMultiple <em>Choix Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Choix Multiple</em>'.
	 * @see presentation.QuestionAffichee#isChoixMultiple()
	 * @see #getQuestionAffichee()
	 * @generated
	 */
	EAttribute getQuestionAffichee_ChoixMultiple();

	/**
	 * Returns the meta object for the containment reference list '{@link presentation.QuestionAffichee#getReponsesPossibles <em>Reponses Possibles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reponses Possibles</em>'.
	 * @see presentation.QuestionAffichee#getReponsesPossibles()
	 * @see #getQuestionAffichee()
	 * @generated
	 */
	EReference getQuestionAffichee_ReponsesPossibles();

	/**
	 * Returns the meta object for class '{@link presentation.ReponseProposee <em>Reponse Proposee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reponse Proposee</em>'.
	 * @see presentation.ReponseProposee
	 * @generated
	 */
	EClass getReponseProposee();

	/**
	 * Returns the meta object for the attribute '{@link presentation.ReponseProposee#getTexte <em>Texte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texte</em>'.
	 * @see presentation.ReponseProposee#getTexte()
	 * @see #getReponseProposee()
	 * @generated
	 */
	EAttribute getReponseProposee_Texte();

	/**
	 * Returns the meta object for the attribute '{@link presentation.ReponseProposee#isEstCorrecte <em>Est Correcte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Est Correcte</em>'.
	 * @see presentation.ReponseProposee#isEstCorrecte()
	 * @see #getReponseProposee()
	 * @generated
	 */
	EAttribute getReponseProposee_EstCorrecte();

	/**
	 * Returns the meta object for class '{@link presentation.CategorieQuestion <em>Categorie Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categorie Question</em>'.
	 * @see presentation.CategorieQuestion
	 * @generated
	 */
	EClass getCategorieQuestion();

	/**
	 * Returns the meta object for the attribute '{@link presentation.CategorieQuestion#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see presentation.CategorieQuestion#getNom()
	 * @see #getCategorieQuestion()
	 * @generated
	 */
	EAttribute getCategorieQuestion_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link presentation.CategorieQuestion#getSousCategories <em>Sous Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sous Categories</em>'.
	 * @see presentation.CategorieQuestion#getSousCategories()
	 * @see #getCategorieQuestion()
	 * @generated
	 */
	EReference getCategorieQuestion_SousCategories();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PresentationFactory getPresentationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link presentation.impl.PresentationImpl <em>Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see presentation.impl.PresentationImpl
		 * @see presentation.impl.PresentationPackageImpl#getPresentation()
		 * @generated
		 */
		EClass PRESENTATION = eINSTANCE.getPresentation();

		/**
		 * The meta object literal for the '<em><b>Titre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__TITRE = eINSTANCE.getPresentation_Titre();

		/**
		 * The meta object literal for the '<em><b>Retour Autorise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__RETOUR_AUTORISE = eINSTANCE.getPresentation_RetourAutorise();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION__PAGES = eINSTANCE.getPresentation_Pages();

		/**
		 * The meta object literal for the '<em><b>Categories Selectionnees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION__CATEGORIES_SELECTIONNEES = eINSTANCE.getPresentation_CategoriesSelectionnees();

		/**
		 * The meta object literal for the '{@link presentation.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see presentation.impl.PageImpl
		 * @see presentation.impl.PresentationPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Numero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NUMERO = eINSTANCE.getPage_Numero();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__QUESTION = eINSTANCE.getPage_Question();

		/**
		 * The meta object literal for the '<em><b>Page Suivante</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PAGE_SUIVANTE = eINSTANCE.getPage_PageSuivante();

		/**
		 * The meta object literal for the '<em><b>Page Precedente</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PAGE_PRECEDENTE = eINSTANCE.getPage_PagePrecedente();

		/**
		 * The meta object literal for the '{@link presentation.impl.QuestionAfficheeImpl <em>Question Affichee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see presentation.impl.QuestionAfficheeImpl
		 * @see presentation.impl.PresentationPackageImpl#getQuestionAffichee()
		 * @generated
		 */
		EClass QUESTION_AFFICHEE = eINSTANCE.getQuestionAffichee();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_AFFICHEE__CATEGORIES = eINSTANCE.getQuestionAffichee_Categories();

		/**
		 * The meta object literal for the '<em><b>Intitule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_AFFICHEE__INTITULE = eINSTANCE.getQuestionAffichee_Intitule();

		/**
		 * The meta object literal for the '<em><b>Niveau Difficulte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_AFFICHEE__NIVEAU_DIFFICULTE = eINSTANCE.getQuestionAffichee_NiveauDifficulte();

		/**
		 * The meta object literal for the '<em><b>Choix Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_AFFICHEE__CHOIX_MULTIPLE = eINSTANCE.getQuestionAffichee_ChoixMultiple();

		/**
		 * The meta object literal for the '<em><b>Reponses Possibles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_AFFICHEE__REPONSES_POSSIBLES = eINSTANCE.getQuestionAffichee_ReponsesPossibles();

		/**
		 * The meta object literal for the '{@link presentation.impl.ReponseProposeeImpl <em>Reponse Proposee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see presentation.impl.ReponseProposeeImpl
		 * @see presentation.impl.PresentationPackageImpl#getReponseProposee()
		 * @generated
		 */
		EClass REPONSE_PROPOSEE = eINSTANCE.getReponseProposee();

		/**
		 * The meta object literal for the '<em><b>Texte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPONSE_PROPOSEE__TEXTE = eINSTANCE.getReponseProposee_Texte();

		/**
		 * The meta object literal for the '<em><b>Est Correcte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPONSE_PROPOSEE__EST_CORRECTE = eINSTANCE.getReponseProposee_EstCorrecte();

		/**
		 * The meta object literal for the '{@link presentation.impl.CategorieQuestionImpl <em>Categorie Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see presentation.impl.CategorieQuestionImpl
		 * @see presentation.impl.PresentationPackageImpl#getCategorieQuestion()
		 * @generated
		 */
		EClass CATEGORIE_QUESTION = eINSTANCE.getCategorieQuestion();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORIE_QUESTION__NOM = eINSTANCE.getCategorieQuestion_Nom();

		/**
		 * The meta object literal for the '<em><b>Sous Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIE_QUESTION__SOUS_CATEGORIES = eINSTANCE.getCategorieQuestion_SousCategories();

	}

} //PresentationPackage
