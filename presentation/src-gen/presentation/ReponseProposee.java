/**
 */
package presentation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reponse Proposee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link presentation.ReponseProposee#getTexte <em>Texte</em>}</li>
 *   <li>{@link presentation.ReponseProposee#isEstCorrecte <em>Est Correcte</em>}</li>
 * </ul>
 *
 * @see presentation.PresentationPackage#getReponseProposee()
 * @model
 * @generated
 */
public interface ReponseProposee extends EObject {
	/**
	 * Returns the value of the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texte</em>' attribute.
	 * @see #setTexte(String)
	 * @see presentation.PresentationPackage#getReponseProposee_Texte()
	 * @model required="true"
	 * @generated
	 */
	String getTexte();

	/**
	 * Sets the value of the '{@link presentation.ReponseProposee#getTexte <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texte</em>' attribute.
	 * @see #getTexte()
	 * @generated
	 */
	void setTexte(String value);

	/**
	 * Returns the value of the '<em><b>Est Correcte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Correcte</em>' attribute.
	 * @see #setEstCorrecte(boolean)
	 * @see presentation.PresentationPackage#getReponseProposee_EstCorrecte()
	 * @model
	 * @generated
	 */
	boolean isEstCorrecte();

	/**
	 * Sets the value of the '{@link presentation.ReponseProposee#isEstCorrecte <em>Est Correcte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Correcte</em>' attribute.
	 * @see #isEstCorrecte()
	 * @generated
	 */
	void setEstCorrecte(boolean value);

} // ReponseProposee
