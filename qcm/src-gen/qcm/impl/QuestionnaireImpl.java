/**
 */
package qcm.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import qcm.QcmPackage;
import qcm.Question;
import qcm.Questionnaire;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qcm.impl.QuestionnaireImpl#getTitre <em>Titre</em>}</li>
 *   <li>{@link qcm.impl.QuestionnaireImpl#isRetourArriere <em>Retour Arriere</em>}</li>
 *   <li>{@link qcm.impl.QuestionnaireImpl#isMelange <em>Melange</em>}</li>
 *   <li>{@link qcm.impl.QuestionnaireImpl#getNbQuestion <em>Nb Question</em>}</li>
 *   <li>{@link qcm.impl.QuestionnaireImpl#getPossede <em>Possede</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireImpl extends MinimalEObjectImpl.Container implements Questionnaire {
	/**
	 * The default value of the '{@link #getTitre() <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitre()
	 * @generated
	 * @ordered
	 */
	protected static final String TITRE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTitre() <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitre()
	 * @generated
	 * @ordered
	 */
	protected String titre = TITRE_EDEFAULT;
	/**
	 * The default value of the '{@link #isRetourArriere() <em>Retour Arriere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetourArriere()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETOUR_ARRIERE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isRetourArriere() <em>Retour Arriere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetourArriere()
	 * @generated
	 * @ordered
	 */
	protected boolean retourArriere = RETOUR_ARRIERE_EDEFAULT;
	/**
	 * The default value of the '{@link #isMelange() <em>Melange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMelange()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MELANGE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isMelange() <em>Melange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMelange()
	 * @generated
	 * @ordered
	 */
	protected boolean melange = MELANGE_EDEFAULT;
	/**
	 * The default value of the '{@link #getNbQuestion() <em>Nb Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbQuestion()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_QUESTION_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getNbQuestion() <em>Nb Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbQuestion()
	 * @generated
	 * @ordered
	 */
	protected long nbQuestion = NB_QUESTION_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPossede() <em>Possede</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossede()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> possede;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QcmPackage.Literals.QUESTIONNAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitre() {
		return titre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitre(String newTitre) {
		String oldTitre = titre;
		titre = newTitre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QcmPackage.QUESTIONNAIRE__TITRE, oldTitre, titre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRetourArriere() {
		return retourArriere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetourArriere(boolean newRetourArriere) {
		boolean oldRetourArriere = retourArriere;
		retourArriere = newRetourArriere;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QcmPackage.QUESTIONNAIRE__RETOUR_ARRIERE,
					oldRetourArriere, retourArriere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMelange() {
		return melange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMelange(boolean newMelange) {
		boolean oldMelange = melange;
		melange = newMelange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QcmPackage.QUESTIONNAIRE__MELANGE, oldMelange,
					melange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getNbQuestion() {
		return nbQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Question> getPossede() {
		if (possede == null) {
			possede = new EObjectContainmentEList<Question>(Question.class, this, QcmPackage.QUESTIONNAIRE__POSSEDE);
		}
		return possede;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QcmPackage.QUESTIONNAIRE__POSSEDE:
			return ((InternalEList<?>) getPossede()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QcmPackage.QUESTIONNAIRE__TITRE:
			return getTitre();
		case QcmPackage.QUESTIONNAIRE__RETOUR_ARRIERE:
			return isRetourArriere();
		case QcmPackage.QUESTIONNAIRE__MELANGE:
			return isMelange();
		case QcmPackage.QUESTIONNAIRE__NB_QUESTION:
			return getNbQuestion();
		case QcmPackage.QUESTIONNAIRE__POSSEDE:
			return getPossede();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case QcmPackage.QUESTIONNAIRE__TITRE:
			setTitre((String) newValue);
			return;
		case QcmPackage.QUESTIONNAIRE__RETOUR_ARRIERE:
			setRetourArriere((Boolean) newValue);
			return;
		case QcmPackage.QUESTIONNAIRE__MELANGE:
			setMelange((Boolean) newValue);
			return;
		case QcmPackage.QUESTIONNAIRE__POSSEDE:
			getPossede().clear();
			getPossede().addAll((Collection<? extends Question>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case QcmPackage.QUESTIONNAIRE__TITRE:
			setTitre(TITRE_EDEFAULT);
			return;
		case QcmPackage.QUESTIONNAIRE__RETOUR_ARRIERE:
			setRetourArriere(RETOUR_ARRIERE_EDEFAULT);
			return;
		case QcmPackage.QUESTIONNAIRE__MELANGE:
			setMelange(MELANGE_EDEFAULT);
			return;
		case QcmPackage.QUESTIONNAIRE__POSSEDE:
			getPossede().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case QcmPackage.QUESTIONNAIRE__TITRE:
			return TITRE_EDEFAULT == null ? titre != null : !TITRE_EDEFAULT.equals(titre);
		case QcmPackage.QUESTIONNAIRE__RETOUR_ARRIERE:
			return retourArriere != RETOUR_ARRIERE_EDEFAULT;
		case QcmPackage.QUESTIONNAIRE__MELANGE:
			return melange != MELANGE_EDEFAULT;
		case QcmPackage.QUESTIONNAIRE__NB_QUESTION:
			return nbQuestion != NB_QUESTION_EDEFAULT;
		case QcmPackage.QUESTIONNAIRE__POSSEDE:
			return possede != null && !possede.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (titre: ");
		result.append(titre);
		result.append(", retourArriere: ");
		result.append(retourArriere);
		result.append(", melange: ");
		result.append(melange);
		result.append(", nbQuestion: ");
		result.append(nbQuestion);
		result.append(')');
		return result.toString();
	}

} //QuestionnaireImpl
