/**
 */
package presentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categorie Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link presentation.CategorieQuestion#getNom <em>Nom</em>}</li>
 *   <li>{@link presentation.CategorieQuestion#getSousCategories <em>Sous Categories</em>}</li>
 * </ul>
 *
 * @see presentation.PresentationPackage#getCategorieQuestion()
 * @model
 * @generated
 */
public interface CategorieQuestion extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see presentation.PresentationPackage#getCategorieQuestion_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link presentation.CategorieQuestion#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Sous Categories</b></em>' containment reference list.
	 * The list contents are of type {@link presentation.CategorieQuestion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Categories</em>' containment reference list.
	 * @see presentation.PresentationPackage#getCategorieQuestion_SousCategories()
	 * @model containment="true"
	 * @generated
	 */
	EList<CategorieQuestion> getSousCategories();

} // CategorieQuestion
