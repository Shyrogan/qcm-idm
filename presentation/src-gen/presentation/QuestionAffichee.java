/**
 */
package presentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Affichee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link presentation.QuestionAffichee#getCategories <em>Categories</em>}</li>
 *   <li>{@link presentation.QuestionAffichee#getIntitule <em>Intitule</em>}</li>
 *   <li>{@link presentation.QuestionAffichee#getNiveauDifficulte <em>Niveau Difficulte</em>}</li>
 *   <li>{@link presentation.QuestionAffichee#isChoixMultiple <em>Choix Multiple</em>}</li>
 *   <li>{@link presentation.QuestionAffichee#getReponsesPossibles <em>Reponses Possibles</em>}</li>
 * </ul>
 *
 * @see presentation.PresentationPackage#getQuestionAffichee()
 * @model
 * @generated
 */
public interface QuestionAffichee extends EObject {
	/**
	 * Returns the value of the '<em><b>Categories</b></em>' reference list.
	 * The list contents are of type {@link presentation.CategorieQuestion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' reference list.
	 * @see presentation.PresentationPackage#getQuestionAffichee_Categories()
	 * @model
	 * @generated
	 */
	EList<CategorieQuestion> getCategories();

	/**
	 * Returns the value of the '<em><b>Intitule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intitule</em>' attribute.
	 * @see #setIntitule(String)
	 * @see presentation.PresentationPackage#getQuestionAffichee_Intitule()
	 * @model required="true"
	 * @generated
	 */
	String getIntitule();

	/**
	 * Sets the value of the '{@link presentation.QuestionAffichee#getIntitule <em>Intitule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intitule</em>' attribute.
	 * @see #getIntitule()
	 * @generated
	 */
	void setIntitule(String value);

	/**
	 * Returns the value of the '<em><b>Niveau Difficulte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Difficulte</em>' attribute.
	 * @see #setNiveauDifficulte(int)
	 * @see presentation.PresentationPackage#getQuestionAffichee_NiveauDifficulte()
	 * @model
	 * @generated
	 */
	int getNiveauDifficulte();

	/**
	 * Sets the value of the '{@link presentation.QuestionAffichee#getNiveauDifficulte <em>Niveau Difficulte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Difficulte</em>' attribute.
	 * @see #getNiveauDifficulte()
	 * @generated
	 */
	void setNiveauDifficulte(int value);

	/**
	 * Returns the value of the '<em><b>Choix Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choix Multiple</em>' attribute.
	 * @see #setChoixMultiple(boolean)
	 * @see presentation.PresentationPackage#getQuestionAffichee_ChoixMultiple()
	 * @model
	 * @generated
	 */
	boolean isChoixMultiple();

	/**
	 * Sets the value of the '{@link presentation.QuestionAffichee#isChoixMultiple <em>Choix Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choix Multiple</em>' attribute.
	 * @see #isChoixMultiple()
	 * @generated
	 */
	void setChoixMultiple(boolean value);

	/**
	 * Returns the value of the '<em><b>Reponses Possibles</b></em>' containment reference list.
	 * The list contents are of type {@link presentation.ReponseProposee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reponses Possibles</em>' containment reference list.
	 * @see presentation.PresentationPackage#getQuestionAffichee_ReponsesPossibles()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReponseProposee> getReponsesPossibles();

} // QuestionAffichee
