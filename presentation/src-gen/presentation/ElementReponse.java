/**
 */
package presentation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Reponse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link presentation.ElementReponse#getTexte <em>Texte</em>}</li>
 * </ul>
 *
 * @see presentation.PresentationPackage#getElementReponse()
 * @model
 * @generated
 */
public interface ElementReponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texte</em>' attribute.
	 * @see #setTexte(String)
	 * @see presentation.PresentationPackage#getElementReponse_Texte()
	 * @model required="true"
	 * @generated
	 */
	String getTexte();

	/**
	 * Sets the value of the '{@link presentation.ElementReponse#getTexte <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texte</em>' attribute.
	 * @see #getTexte()
	 * @generated
	 */
	void setTexte(String value);

} // ElementReponse
