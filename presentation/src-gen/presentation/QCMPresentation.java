/**
 */
package presentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QCM Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link presentation.QCMPresentation#getTitre <em>Titre</em>}</li>
 *   <li>{@link presentation.QCMPresentation#getPremiereQuestion <em>Premiere Question</em>}</li>
 *   <li>{@link presentation.QCMPresentation#getQuestions <em>Questions</em>}</li>
 * </ul>
 *
 * @see presentation.PresentationPackage#getQCMPresentation()
 * @model
 * @generated
 */
public interface QCMPresentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titre</em>' attribute.
	 * @see #setTitre(String)
	 * @see presentation.PresentationPackage#getQCMPresentation_Titre()
	 * @model required="true"
	 * @generated
	 */
	String getTitre();

	/**
	 * Sets the value of the '{@link presentation.QCMPresentation#getTitre <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titre</em>' attribute.
	 * @see #getTitre()
	 * @generated
	 */
	void setTitre(String value);

	/**
	 * Returns the value of the '<em><b>Premiere Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Premiere Question</em>' reference.
	 * @see #setPremiereQuestion(PageQuestion)
	 * @see presentation.PresentationPackage#getQCMPresentation_PremiereQuestion()
	 * @model required="true"
	 * @generated
	 */
	PageQuestion getPremiereQuestion();

	/**
	 * Sets the value of the '{@link presentation.QCMPresentation#getPremiereQuestion <em>Premiere Question</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Premiere Question</em>' reference.
	 * @see #getPremiereQuestion()
	 * @generated
	 */
	void setPremiereQuestion(PageQuestion value);

	/**
	 * Returns the value of the '<em><b>Questions</b></em>' containment reference list.
	 * The list contents are of type {@link presentation.PageQuestion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questions</em>' containment reference list.
	 * @see presentation.PresentationPackage#getQCMPresentation_Questions()
	 * @model containment="true"
	 * @generated
	 */
	EList<PageQuestion> getQuestions();

} // QCMPresentation
