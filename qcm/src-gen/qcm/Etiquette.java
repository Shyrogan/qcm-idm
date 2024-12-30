/**
 */
package qcm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Etiquette</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qcm.Etiquette#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link qcm.Etiquette#getQuestions <em>Questions</em>}</li>
 *   <li>{@link qcm.Etiquette#getSousEtiquette <em>Sous Etiquette</em>}</li>
 * </ul>
 *
 * @see qcm.QcmPackage#getEtiquette()
 * @model
 * @generated
 */
public interface Etiquette extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see #setCategorie(String)
	 * @see qcm.QcmPackage#getEtiquette_Categorie()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getCategorie();

	/**
	 * Sets the value of the '{@link qcm.Etiquette#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(String value);

	/**
	 * Returns the value of the '<em><b>Questions</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qcm.Question#getEtiquette <em>Etiquette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questions</em>' container reference.
	 * @see #setQuestions(Question)
	 * @see qcm.QcmPackage#getEtiquette_Questions()
	 * @see qcm.Question#getEtiquette
	 * @model opposite="etiquette" required="true" transient="false"
	 * @generated
	 */
	Question getQuestions();

	/**
	 * Sets the value of the '{@link qcm.Etiquette#getQuestions <em>Questions</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questions</em>' container reference.
	 * @see #getQuestions()
	 * @generated
	 */
	void setQuestions(Question value);

	/**
	 * Returns the value of the '<em><b>Sous Etiquette</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Etiquette</em>' reference.
	 * @see #setSousEtiquette(Etiquette)
	 * @see qcm.QcmPackage#getEtiquette_SousEtiquette()
	 * @model
	 * @generated
	 */
	Etiquette getSousEtiquette();

	/**
	 * Sets the value of the '{@link qcm.Etiquette#getSousEtiquette <em>Sous Etiquette</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Etiquette</em>' reference.
	 * @see #getSousEtiquette()
	 * @generated
	 */
	void setSousEtiquette(Etiquette value);

} // Etiquette
