/**
 */
package presentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link presentation.PageQuestion#getQuestion <em>Question</em>}</li>
 *   <li>{@link presentation.PageQuestion#getBonneReponse <em>Bonne Reponse</em>}</li>
 *   <li>{@link presentation.PageQuestion#getReponses <em>Reponses</em>}</li>
 * </ul>
 *
 * @see presentation.PresentationPackage#getPageQuestion()
 * @model
 * @generated
 */
public interface PageQuestion extends EObject {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' attribute.
	 * @see #setQuestion(String)
	 * @see presentation.PresentationPackage#getPageQuestion_Question()
	 * @model required="true"
	 * @generated
	 */
	String getQuestion();

	/**
	 * Sets the value of the '{@link presentation.PageQuestion#getQuestion <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' attribute.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(String value);

	/**
	 * Returns the value of the '<em><b>Bonne Reponse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bonne Reponse</em>' reference.
	 * @see #setBonneReponse(ElementReponse)
	 * @see presentation.PresentationPackage#getPageQuestion_BonneReponse()
	 * @model
	 * @generated
	 */
	ElementReponse getBonneReponse();

	/**
	 * Sets the value of the '{@link presentation.PageQuestion#getBonneReponse <em>Bonne Reponse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bonne Reponse</em>' reference.
	 * @see #getBonneReponse()
	 * @generated
	 */
	void setBonneReponse(ElementReponse value);

	/**
	 * Returns the value of the '<em><b>Reponses</b></em>' reference list.
	 * The list contents are of type {@link presentation.ElementReponse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reponses</em>' reference list.
	 * @see presentation.PresentationPackage#getPageQuestion_Reponses()
	 * @model
	 * @generated
	 */
	EList<ElementReponse> getReponses();

} // PageQuestion
