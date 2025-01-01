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
	 * The meta object id for the '{@link presentation.impl.QCMPresentationImpl <em>QCM Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see presentation.impl.QCMPresentationImpl
	 * @see presentation.impl.PresentationPackageImpl#getQCMPresentation()
	 * @generated
	 */
	int QCM_PRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCM_PRESENTATION__TITRE = 0;

	/**
	 * The feature id for the '<em><b>Premiere Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCM_PRESENTATION__PREMIERE_QUESTION = 1;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCM_PRESENTATION__QUESTIONS = 2;

	/**
	 * The number of structural features of the '<em>QCM Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCM_PRESENTATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>QCM Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCM_PRESENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link presentation.impl.PageQuestionImpl <em>Page Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see presentation.impl.PageQuestionImpl
	 * @see presentation.impl.PresentationPackageImpl#getPageQuestion()
	 * @generated
	 */
	int PAGE_QUESTION = 1;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_QUESTION__QUESTION = 0;

	/**
	 * The feature id for the '<em><b>Bonne Reponse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_QUESTION__BONNE_REPONSE = 1;

	/**
	 * The feature id for the '<em><b>Reponses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_QUESTION__REPONSES = 2;

	/**
	 * The number of structural features of the '<em>Page Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_QUESTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Page Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link presentation.impl.ElementReponseImpl <em>Element Reponse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see presentation.impl.ElementReponseImpl
	 * @see presentation.impl.PresentationPackageImpl#getElementReponse()
	 * @generated
	 */
	int ELEMENT_REPONSE = 2;

	/**
	 * The feature id for the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REPONSE__TEXTE = 0;

	/**
	 * The number of structural features of the '<em>Element Reponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element Reponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REPONSE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link presentation.QCMPresentation <em>QCM Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QCM Presentation</em>'.
	 * @see presentation.QCMPresentation
	 * @generated
	 */
	EClass getQCMPresentation();

	/**
	 * Returns the meta object for the attribute '{@link presentation.QCMPresentation#getTitre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titre</em>'.
	 * @see presentation.QCMPresentation#getTitre()
	 * @see #getQCMPresentation()
	 * @generated
	 */
	EAttribute getQCMPresentation_Titre();

	/**
	 * Returns the meta object for the reference '{@link presentation.QCMPresentation#getPremiereQuestion <em>Premiere Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Premiere Question</em>'.
	 * @see presentation.QCMPresentation#getPremiereQuestion()
	 * @see #getQCMPresentation()
	 * @generated
	 */
	EReference getQCMPresentation_PremiereQuestion();

	/**
	 * Returns the meta object for the containment reference list '{@link presentation.QCMPresentation#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions</em>'.
	 * @see presentation.QCMPresentation#getQuestions()
	 * @see #getQCMPresentation()
	 * @generated
	 */
	EReference getQCMPresentation_Questions();

	/**
	 * Returns the meta object for class '{@link presentation.PageQuestion <em>Page Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Question</em>'.
	 * @see presentation.PageQuestion
	 * @generated
	 */
	EClass getPageQuestion();

	/**
	 * Returns the meta object for the attribute '{@link presentation.PageQuestion#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see presentation.PageQuestion#getQuestion()
	 * @see #getPageQuestion()
	 * @generated
	 */
	EAttribute getPageQuestion_Question();

	/**
	 * Returns the meta object for the reference '{@link presentation.PageQuestion#getBonneReponse <em>Bonne Reponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bonne Reponse</em>'.
	 * @see presentation.PageQuestion#getBonneReponse()
	 * @see #getPageQuestion()
	 * @generated
	 */
	EReference getPageQuestion_BonneReponse();

	/**
	 * Returns the meta object for the reference list '{@link presentation.PageQuestion#getReponses <em>Reponses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reponses</em>'.
	 * @see presentation.PageQuestion#getReponses()
	 * @see #getPageQuestion()
	 * @generated
	 */
	EReference getPageQuestion_Reponses();

	/**
	 * Returns the meta object for class '{@link presentation.ElementReponse <em>Element Reponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Reponse</em>'.
	 * @see presentation.ElementReponse
	 * @generated
	 */
	EClass getElementReponse();

	/**
	 * Returns the meta object for the attribute '{@link presentation.ElementReponse#getTexte <em>Texte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texte</em>'.
	 * @see presentation.ElementReponse#getTexte()
	 * @see #getElementReponse()
	 * @generated
	 */
	EAttribute getElementReponse_Texte();

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
		 * The meta object literal for the '{@link presentation.impl.QCMPresentationImpl <em>QCM Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see presentation.impl.QCMPresentationImpl
		 * @see presentation.impl.PresentationPackageImpl#getQCMPresentation()
		 * @generated
		 */
		EClass QCM_PRESENTATION = eINSTANCE.getQCMPresentation();

		/**
		 * The meta object literal for the '<em><b>Titre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QCM_PRESENTATION__TITRE = eINSTANCE.getQCMPresentation_Titre();

		/**
		 * The meta object literal for the '<em><b>Premiere Question</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QCM_PRESENTATION__PREMIERE_QUESTION = eINSTANCE.getQCMPresentation_PremiereQuestion();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QCM_PRESENTATION__QUESTIONS = eINSTANCE.getQCMPresentation_Questions();

		/**
		 * The meta object literal for the '{@link presentation.impl.PageQuestionImpl <em>Page Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see presentation.impl.PageQuestionImpl
		 * @see presentation.impl.PresentationPackageImpl#getPageQuestion()
		 * @generated
		 */
		EClass PAGE_QUESTION = eINSTANCE.getPageQuestion();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_QUESTION__QUESTION = eINSTANCE.getPageQuestion_Question();

		/**
		 * The meta object literal for the '<em><b>Bonne Reponse</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_QUESTION__BONNE_REPONSE = eINSTANCE.getPageQuestion_BonneReponse();

		/**
		 * The meta object literal for the '<em><b>Reponses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_QUESTION__REPONSES = eINSTANCE.getPageQuestion_Reponses();

		/**
		 * The meta object literal for the '{@link presentation.impl.ElementReponseImpl <em>Element Reponse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see presentation.impl.ElementReponseImpl
		 * @see presentation.impl.PresentationPackageImpl#getElementReponse()
		 * @generated
		 */
		EClass ELEMENT_REPONSE = eINSTANCE.getElementReponse();

		/**
		 * The meta object literal for the '<em><b>Texte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_REPONSE__TEXTE = eINSTANCE.getElementReponse_Texte();

	}

} //PresentationPackage
