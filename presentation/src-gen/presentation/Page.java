/**
 */
package presentation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link presentation.Page#getNumero <em>Numero</em>}</li>
 *   <li>{@link presentation.Page#getQuestion <em>Question</em>}</li>
 *   <li>{@link presentation.Page#getPageSuivante <em>Page Suivante</em>}</li>
 *   <li>{@link presentation.Page#getPagePrecedente <em>Page Precedente</em>}</li>
 * </ul>
 *
 * @see presentation.PresentationPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero</em>' attribute.
	 * @see #setNumero(int)
	 * @see presentation.PresentationPackage#getPage_Numero()
	 * @model
	 * @generated
	 */
	int getNumero();

	/**
	 * Sets the value of the '{@link presentation.Page#getNumero <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero</em>' attribute.
	 * @see #getNumero()
	 * @generated
	 */
	void setNumero(int value);

	/**
	 * Returns the value of the '<em><b>Question</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' containment reference.
	 * @see #setQuestion(QuestionAffichee)
	 * @see presentation.PresentationPackage#getPage_Question()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QuestionAffichee getQuestion();

	/**
	 * Sets the value of the '{@link presentation.Page#getQuestion <em>Question</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' containment reference.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(QuestionAffichee value);

	/**
	 * Returns the value of the '<em><b>Page Suivante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Suivante</em>' reference.
	 * @see #setPageSuivante(Page)
	 * @see presentation.PresentationPackage#getPage_PageSuivante()
	 * @model
	 * @generated
	 */
	Page getPageSuivante();

	/**
	 * Sets the value of the '{@link presentation.Page#getPageSuivante <em>Page Suivante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Suivante</em>' reference.
	 * @see #getPageSuivante()
	 * @generated
	 */
	void setPageSuivante(Page value);

	/**
	 * Returns the value of the '<em><b>Page Precedente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Precedente</em>' reference.
	 * @see #setPagePrecedente(Page)
	 * @see presentation.PresentationPackage#getPage_PagePrecedente()
	 * @model
	 * @generated
	 */
	Page getPagePrecedente();

	/**
	 * Sets the value of the '{@link presentation.Page#getPagePrecedente <em>Page Precedente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Precedente</em>' reference.
	 * @see #getPagePrecedente()
	 * @generated
	 */
	void setPagePrecedente(Page value);

} // Page
