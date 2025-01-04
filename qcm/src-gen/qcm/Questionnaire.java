/**
 */
package qcm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qcm.Questionnaire#getTitre <em>Titre</em>}</li>
 *   <li>{@link qcm.Questionnaire#isRetourArriere <em>Retour Arriere</em>}</li>
 *   <li>{@link qcm.Questionnaire#isMelange <em>Melange</em>}</li>
 *   <li>{@link qcm.Questionnaire#getNbQuestion <em>Nb Question</em>}</li>
 *   <li>{@link qcm.Questionnaire#getPossede <em>Possede</em>}</li>
 * </ul>
 *
 * @see qcm.QcmPackage#getQuestionnaire()
 * @model
 * @generated
 */
public interface Questionnaire extends EObject {

	/**
	 * Returns the value of the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titre</em>' attribute.
	 * @see #setTitre(String)
	 * @see qcm.QcmPackage#getQuestionnaire_Titre()
	 * @model required="true"
	 * @generated
	 */
	String getTitre();

	/**
	 * Sets the value of the '{@link qcm.Questionnaire#getTitre <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titre</em>' attribute.
	 * @see #getTitre()
	 * @generated
	 */
	void setTitre(String value);

	/**
	 * Returns the value of the '<em><b>Retour Arriere</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retour Arriere</em>' attribute.
	 * @see #setRetourArriere(boolean)
	 * @see qcm.QcmPackage#getQuestionnaire_RetourArriere()
	 * @model default="true"
	 * @generated
	 */
	boolean isRetourArriere();

	/**
	 * Sets the value of the '{@link qcm.Questionnaire#isRetourArriere <em>Retour Arriere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retour Arriere</em>' attribute.
	 * @see #isRetourArriere()
	 * @generated
	 */
	void setRetourArriere(boolean value);

	/**
	 * Returns the value of the '<em><b>Melange</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Melange</em>' attribute.
	 * @see #setMelange(boolean)
	 * @see qcm.QcmPackage#getQuestionnaire_Melange()
	 * @model default="false"
	 * @generated
	 */
	boolean isMelange();

	/**
	 * Sets the value of the '{@link qcm.Questionnaire#isMelange <em>Melange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Melange</em>' attribute.
	 * @see #isMelange()
	 * @generated
	 */
	void setMelange(boolean value);

	/**
	 * Returns the value of the '<em><b>Nb Question</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Question</em>' attribute.
	 * @see qcm.QcmPackage#getQuestionnaire_NbQuestion()
	 * @model default="0" required="true" changeable="false" derived="true"
	 * @generated
	 */
	long getNbQuestion();

	/**
	 * Returns the value of the '<em><b>Possede</b></em>' containment reference list.
	 * The list contents are of type {@link qcm.Question}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possede</em>' containment reference list.
	 * @see qcm.QcmPackage#getQuestionnaire_Possede()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Question> getPossede();

	//contraintes OCL:
	//-- Définition de la dérivation de nbQuestion
	//context Questionnaire::nbQuestion : ELong
	//derive: self.possede->size()

} // Questionnaire
