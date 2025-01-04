/**
 */
package qcm;

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
 * @see qcm.QcmFactory
 * @model kind="package"
 * @generated
 */
public interface QcmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qcm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/qcm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qcm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QcmPackage eINSTANCE = qcm.impl.QcmPackageImpl.init();

	/**
	 * The meta object id for the '{@link qcm.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qcm.impl.QuestionnaireImpl
	 * @see qcm.impl.QcmPackageImpl#getQuestionnaire()
	 * @generated
	 */
	int QUESTIONNAIRE = 0;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__TITRE = 0;

	/**
	 * The feature id for the '<em><b>Retour Arriere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__RETOUR_ARRIERE = 1;

	/**
	 * The feature id for the '<em><b>Melange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__MELANGE = 2;

	/**
	 * The feature id for the '<em><b>Nb Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__NB_QUESTION = 3;

	/**
	 * The feature id for the '<em><b>Possede</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__POSSEDE = 4;

	/**
	 * The number of structural features of the '<em>Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qcm.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qcm.impl.QuestionImpl
	 * @see qcm.impl.QcmPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 1;

	/**
	 * The feature id for the '<em><b>Intitule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__INTITULE = 0;

	/**
	 * The feature id for the '<em><b>Reponse Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__REPONSE_UNIQUE = 1;

	/**
	 * The feature id for the '<em><b>Difficulte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__DIFFICULTE = 2;

	/**
	 * The feature id for the '<em><b>Reponses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__REPONSES = 3;

	/**
	 * The feature id for the '<em><b>Etiquette</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ETIQUETTE = 4;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qcm.impl.ReponseImpl <em>Reponse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qcm.impl.ReponseImpl
	 * @see qcm.impl.QcmPackageImpl#getReponse()
	 * @generated
	 */
	int REPONSE = 2;

	/**
	 * The feature id for the '<em><b>Intitule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE__INTITULE = 0;

	/**
	 * The feature id for the '<em><b>Valide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE__VALIDE = 1;

	/**
	 * The number of structural features of the '<em>Reponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qcm.impl.EtiquetteImpl <em>Etiquette</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qcm.impl.EtiquetteImpl
	 * @see qcm.impl.QcmPackageImpl#getEtiquette()
	 * @generated
	 */
	int ETIQUETTE = 3;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETIQUETTE__CATEGORIE = 0;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETIQUETTE__QUESTIONS = 1;

	/**
	 * The feature id for the '<em><b>Sous Etiquette</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETIQUETTE__SOUS_ETIQUETTE = 2;

	/**
	 * The number of structural features of the '<em>Etiquette</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETIQUETTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Etiquette</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETIQUETTE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link qcm.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionnaire</em>'.
	 * @see qcm.Questionnaire
	 * @generated
	 */
	EClass getQuestionnaire();

	/**
	 * Returns the meta object for the attribute '{@link qcm.Questionnaire#getTitre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titre</em>'.
	 * @see qcm.Questionnaire#getTitre()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EAttribute getQuestionnaire_Titre();

	/**
	 * Returns the meta object for the attribute '{@link qcm.Questionnaire#isRetourArriere <em>Retour Arriere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retour Arriere</em>'.
	 * @see qcm.Questionnaire#isRetourArriere()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EAttribute getQuestionnaire_RetourArriere();

	/**
	 * Returns the meta object for the attribute '{@link qcm.Questionnaire#isMelange <em>Melange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Melange</em>'.
	 * @see qcm.Questionnaire#isMelange()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EAttribute getQuestionnaire_Melange();

	/**
	 * Returns the meta object for the attribute '{@link qcm.Questionnaire#getNbQuestion <em>Nb Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Question</em>'.
	 * @see qcm.Questionnaire#getNbQuestion()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EAttribute getQuestionnaire_NbQuestion();

	/**
	 * Returns the meta object for the containment reference list '{@link qcm.Questionnaire#getPossede <em>Possede</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Possede</em>'.
	 * @see qcm.Questionnaire#getPossede()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_Possede();

	/**
	 * Returns the meta object for class '{@link qcm.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see qcm.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link qcm.Question#getIntitule <em>Intitule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intitule</em>'.
	 * @see qcm.Question#getIntitule()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Intitule();

	/**
	 * Returns the meta object for the attribute '{@link qcm.Question#isReponseUnique <em>Reponse Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reponse Unique</em>'.
	 * @see qcm.Question#isReponseUnique()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_ReponseUnique();

	/**
	 * Returns the meta object for the attribute '{@link qcm.Question#getDifficulte <em>Difficulte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difficulte</em>'.
	 * @see qcm.Question#getDifficulte()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Difficulte();

	/**
	 * Returns the meta object for the containment reference list '{@link qcm.Question#getReponses <em>Reponses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reponses</em>'.
	 * @see qcm.Question#getReponses()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Reponses();

	/**
	 * Returns the meta object for the containment reference list '{@link qcm.Question#getEtiquette <em>Etiquette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Etiquette</em>'.
	 * @see qcm.Question#getEtiquette()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Etiquette();

	/**
	 * Returns the meta object for class '{@link qcm.Reponse <em>Reponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reponse</em>'.
	 * @see qcm.Reponse
	 * @generated
	 */
	EClass getReponse();

	/**
	 * Returns the meta object for the attribute '{@link qcm.Reponse#getIntitule <em>Intitule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intitule</em>'.
	 * @see qcm.Reponse#getIntitule()
	 * @see #getReponse()
	 * @generated
	 */
	EAttribute getReponse_Intitule();

	/**
	 * Returns the meta object for the attribute '{@link qcm.Reponse#isValide <em>Valide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valide</em>'.
	 * @see qcm.Reponse#isValide()
	 * @see #getReponse()
	 * @generated
	 */
	EAttribute getReponse_Valide();

	/**
	 * Returns the meta object for class '{@link qcm.Etiquette <em>Etiquette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Etiquette</em>'.
	 * @see qcm.Etiquette
	 * @generated
	 */
	EClass getEtiquette();

	/**
	 * Returns the meta object for the attribute '{@link qcm.Etiquette#getCategorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Categorie</em>'.
	 * @see qcm.Etiquette#getCategorie()
	 * @see #getEtiquette()
	 * @generated
	 */
	EAttribute getEtiquette_Categorie();

	/**
	 * Returns the meta object for the container reference '{@link qcm.Etiquette#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Questions</em>'.
	 * @see qcm.Etiquette#getQuestions()
	 * @see #getEtiquette()
	 * @generated
	 */
	EReference getEtiquette_Questions();

	/**
	 * Returns the meta object for the reference '{@link qcm.Etiquette#getSousEtiquette <em>Sous Etiquette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sous Etiquette</em>'.
	 * @see qcm.Etiquette#getSousEtiquette()
	 * @see #getEtiquette()
	 * @generated
	 */
	EReference getEtiquette_SousEtiquette();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QcmFactory getQcmFactory();

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
		 * The meta object literal for the '{@link qcm.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qcm.impl.QuestionnaireImpl
		 * @see qcm.impl.QcmPackageImpl#getQuestionnaire()
		 * @generated
		 */
		EClass QUESTIONNAIRE = eINSTANCE.getQuestionnaire();
		/**
		 * The meta object literal for the '<em><b>Titre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE__TITRE = eINSTANCE.getQuestionnaire_Titre();
		/**
		 * The meta object literal for the '<em><b>Retour Arriere</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE__RETOUR_ARRIERE = eINSTANCE.getQuestionnaire_RetourArriere();
		/**
		 * The meta object literal for the '<em><b>Melange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE__MELANGE = eINSTANCE.getQuestionnaire_Melange();
		/**
		 * The meta object literal for the '<em><b>Nb Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE__NB_QUESTION = eINSTANCE.getQuestionnaire_NbQuestion();
		/**
		 * The meta object literal for the '<em><b>Possede</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__POSSEDE = eINSTANCE.getQuestionnaire_Possede();
		/**
		 * The meta object literal for the '{@link qcm.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qcm.impl.QuestionImpl
		 * @see qcm.impl.QcmPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();
		/**
		 * The meta object literal for the '<em><b>Intitule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__INTITULE = eINSTANCE.getQuestion_Intitule();
		/**
		 * The meta object literal for the '<em><b>Reponse Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__REPONSE_UNIQUE = eINSTANCE.getQuestion_ReponseUnique();
		/**
		 * The meta object literal for the '<em><b>Difficulte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__DIFFICULTE = eINSTANCE.getQuestion_Difficulte();
		/**
		 * The meta object literal for the '<em><b>Reponses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__REPONSES = eINSTANCE.getQuestion_Reponses();
		/**
		 * The meta object literal for the '<em><b>Etiquette</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__ETIQUETTE = eINSTANCE.getQuestion_Etiquette();
		/**
		 * The meta object literal for the '{@link qcm.impl.ReponseImpl <em>Reponse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qcm.impl.ReponseImpl
		 * @see qcm.impl.QcmPackageImpl#getReponse()
		 * @generated
		 */
		EClass REPONSE = eINSTANCE.getReponse();
		/**
		 * The meta object literal for the '<em><b>Intitule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPONSE__INTITULE = eINSTANCE.getReponse_Intitule();
		/**
		 * The meta object literal for the '<em><b>Valide</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPONSE__VALIDE = eINSTANCE.getReponse_Valide();
		/**
		 * The meta object literal for the '{@link qcm.impl.EtiquetteImpl <em>Etiquette</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qcm.impl.EtiquetteImpl
		 * @see qcm.impl.QcmPackageImpl#getEtiquette()
		 * @generated
		 */
		EClass ETIQUETTE = eINSTANCE.getEtiquette();
		/**
		 * The meta object literal for the '<em><b>Categorie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETIQUETTE__CATEGORIE = eINSTANCE.getEtiquette_Categorie();
		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETIQUETTE__QUESTIONS = eINSTANCE.getEtiquette_Questions();
		/**
		 * The meta object literal for the '<em><b>Sous Etiquette</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETIQUETTE__SOUS_ETIQUETTE = eINSTANCE.getEtiquette_SousEtiquette();

	}

} //QcmPackage
