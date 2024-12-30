/**
 */
package qcm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reponse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qcm.Reponse#getIntitule <em>Intitule</em>}</li>
 *   <li>{@link qcm.Reponse#isValide <em>Valide</em>}</li>
 * </ul>
 *
 * @see qcm.QcmPackage#getReponse()
 * @model
 * @generated
 */
public interface Reponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Intitule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intitule</em>' attribute.
	 * @see #setIntitule(String)
	 * @see qcm.QcmPackage#getReponse_Intitule()
	 * @model required="true"
	 * @generated
	 */
	String getIntitule();

	/**
	 * Sets the value of the '{@link qcm.Reponse#getIntitule <em>Intitule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intitule</em>' attribute.
	 * @see #getIntitule()
	 * @generated
	 */
	void setIntitule(String value);

	/**
	 * Returns the value of the '<em><b>Valide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valide</em>' attribute.
	 * @see #setValide(boolean)
	 * @see qcm.QcmPackage#getReponse_Valide()
	 * @model
	 * @generated
	 */
	boolean isValide();

	/**
	 * Sets the value of the '{@link qcm.Reponse#isValide <em>Valide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valide</em>' attribute.
	 * @see #isValide()
	 * @generated
	 */
	void setValide(boolean value);

} // Reponse
