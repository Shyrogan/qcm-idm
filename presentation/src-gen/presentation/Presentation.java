/**
 */
package presentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link presentation.Presentation#getTitre <em>Titre</em>}</li>
 *   <li>{@link presentation.Presentation#isRetourAutorise <em>Retour Autorise</em>}</li>
 *   <li>{@link presentation.Presentation#isQuestionsAleatoires <em>Questions Aleatoires</em>}</li>
 *   <li>{@link presentation.Presentation#getPages <em>Pages</em>}</li>
 *   <li>{@link presentation.Presentation#getCategoriesSelectionnees <em>Categories Selectionnees</em>}</li>
 * </ul>
 *
 * @see presentation.PresentationPackage#getPresentation()
 * @model
 * @generated
 */
public interface Presentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titre</em>' attribute.
	 * @see #setTitre(String)
	 * @see presentation.PresentationPackage#getPresentation_Titre()
	 * @model required="true"
	 * @generated
	 */
	String getTitre();

	/**
	 * Sets the value of the '{@link presentation.Presentation#getTitre <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titre</em>' attribute.
	 * @see #getTitre()
	 * @generated
	 */
	void setTitre(String value);

	/**
	 * Returns the value of the '<em><b>Retour Autorise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retour Autorise</em>' attribute.
	 * @see #setRetourAutorise(boolean)
	 * @see presentation.PresentationPackage#getPresentation_RetourAutorise()
	 * @model
	 * @generated
	 */
	boolean isRetourAutorise();

	/**
	 * Sets the value of the '{@link presentation.Presentation#isRetourAutorise <em>Retour Autorise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retour Autorise</em>' attribute.
	 * @see #isRetourAutorise()
	 * @generated
	 */
	void setRetourAutorise(boolean value);

	/**
	 * Returns the value of the '<em><b>Questions Aleatoires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questions Aleatoires</em>' attribute.
	 * @see #setQuestionsAleatoires(boolean)
	 * @see presentation.PresentationPackage#getPresentation_QuestionsAleatoires()
	 * @model
	 * @generated
	 */
	boolean isQuestionsAleatoires();

	/**
	 * Sets the value of the '{@link presentation.Presentation#isQuestionsAleatoires <em>Questions Aleatoires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questions Aleatoires</em>' attribute.
	 * @see #isQuestionsAleatoires()
	 * @generated
	 */
	void setQuestionsAleatoires(boolean value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link presentation.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see presentation.PresentationPackage#getPresentation_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Categories Selectionnees</b></em>' containment reference list.
	 * The list contents are of type {@link presentation.CategorieQuestion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories Selectionnees</em>' containment reference list.
	 * @see presentation.PresentationPackage#getPresentation_CategoriesSelectionnees()
	 * @model containment="true"
	 * @generated
	 */
	EList<CategorieQuestion> getCategoriesSelectionnees();

} // Presentation
