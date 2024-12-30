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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qcm.Etiquette;
import qcm.QcmPackage;
import qcm.Question;
import qcm.Reponse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qcm.impl.QuestionImpl#getIntitule <em>Intitule</em>}</li>
 *   <li>{@link qcm.impl.QuestionImpl#isReponseUnique <em>Reponse Unique</em>}</li>
 *   <li>{@link qcm.impl.QuestionImpl#getDifficulte <em>Difficulte</em>}</li>
 *   <li>{@link qcm.impl.QuestionImpl#getQuestionSuivante <em>Question Suivante</em>}</li>
 *   <li>{@link qcm.impl.QuestionImpl#getReponses <em>Reponses</em>}</li>
 *   <li>{@link qcm.impl.QuestionImpl#getEtiquette <em>Etiquette</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionImpl extends MinimalEObjectImpl.Container implements Question {
	/**
	 * The default value of the '{@link #getIntitule() <em>Intitule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntitule()
	 * @generated
	 * @ordered
	 */
	protected static final String INTITULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntitule() <em>Intitule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntitule()
	 * @generated
	 * @ordered
	 */
	protected String intitule = INTITULE_EDEFAULT;

	/**
	 * The default value of the '{@link #isReponseUnique() <em>Reponse Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReponseUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPONSE_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReponseUnique() <em>Reponse Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReponseUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean reponseUnique = REPONSE_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDifficulte() <em>Difficulte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficulte()
	 * @generated
	 * @ordered
	 */
	protected static final long DIFFICULTE_EDEFAULT = 1L;

	/**
	 * The cached value of the '{@link #getDifficulte() <em>Difficulte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficulte()
	 * @generated
	 * @ordered
	 */
	protected long difficulte = DIFFICULTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuestionSuivante() <em>Question Suivante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionSuivante()
	 * @generated
	 * @ordered
	 */
	protected Question questionSuivante;

	/**
	 * The cached value of the '{@link #getReponses() <em>Reponses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReponses()
	 * @generated
	 * @ordered
	 */
	protected EList<Reponse> reponses;

	/**
	 * The cached value of the '{@link #getEtiquette() <em>Etiquette</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtiquette()
	 * @generated
	 * @ordered
	 */
	protected EList<Etiquette> etiquette;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QcmPackage.Literals.QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIntitule() {
		return intitule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntitule(String newIntitule) {
		String oldIntitule = intitule;
		intitule = newIntitule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QcmPackage.QUESTION__INTITULE, oldIntitule,
					intitule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReponseUnique() {
		return reponseUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReponseUnique(boolean newReponseUnique) {
		boolean oldReponseUnique = reponseUnique;
		reponseUnique = newReponseUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QcmPackage.QUESTION__REPONSE_UNIQUE, oldReponseUnique,
					reponseUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDifficulte() {
		return difficulte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDifficulte(long newDifficulte) {
		long oldDifficulte = difficulte;
		difficulte = newDifficulte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QcmPackage.QUESTION__DIFFICULTE, oldDifficulte,
					difficulte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Question getQuestionSuivante() {
		if (questionSuivante != null && questionSuivante.eIsProxy()) {
			InternalEObject oldQuestionSuivante = (InternalEObject) questionSuivante;
			questionSuivante = (Question) eResolveProxy(oldQuestionSuivante);
			if (questionSuivante != oldQuestionSuivante) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QcmPackage.QUESTION__QUESTION_SUIVANTE,
							oldQuestionSuivante, questionSuivante));
			}
		}
		return questionSuivante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question basicGetQuestionSuivante() {
		return questionSuivante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuestionSuivante(Question newQuestionSuivante) {
		Question oldQuestionSuivante = questionSuivante;
		questionSuivante = newQuestionSuivante;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QcmPackage.QUESTION__QUESTION_SUIVANTE,
					oldQuestionSuivante, questionSuivante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reponse> getReponses() {
		if (reponses == null) {
			reponses = new EObjectContainmentEList<Reponse>(Reponse.class, this, QcmPackage.QUESTION__REPONSES);
		}
		return reponses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Etiquette> getEtiquette() {
		if (etiquette == null) {
			etiquette = new EObjectContainmentWithInverseEList<Etiquette>(Etiquette.class, this,
					QcmPackage.QUESTION__ETIQUETTE, QcmPackage.ETIQUETTE__QUESTIONS);
		}
		return etiquette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QcmPackage.QUESTION__ETIQUETTE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEtiquette()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QcmPackage.QUESTION__REPONSES:
			return ((InternalEList<?>) getReponses()).basicRemove(otherEnd, msgs);
		case QcmPackage.QUESTION__ETIQUETTE:
			return ((InternalEList<?>) getEtiquette()).basicRemove(otherEnd, msgs);
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
		case QcmPackage.QUESTION__INTITULE:
			return getIntitule();
		case QcmPackage.QUESTION__REPONSE_UNIQUE:
			return isReponseUnique();
		case QcmPackage.QUESTION__DIFFICULTE:
			return getDifficulte();
		case QcmPackage.QUESTION__QUESTION_SUIVANTE:
			if (resolve)
				return getQuestionSuivante();
			return basicGetQuestionSuivante();
		case QcmPackage.QUESTION__REPONSES:
			return getReponses();
		case QcmPackage.QUESTION__ETIQUETTE:
			return getEtiquette();
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
		case QcmPackage.QUESTION__INTITULE:
			setIntitule((String) newValue);
			return;
		case QcmPackage.QUESTION__REPONSE_UNIQUE:
			setReponseUnique((Boolean) newValue);
			return;
		case QcmPackage.QUESTION__DIFFICULTE:
			setDifficulte((Long) newValue);
			return;
		case QcmPackage.QUESTION__QUESTION_SUIVANTE:
			setQuestionSuivante((Question) newValue);
			return;
		case QcmPackage.QUESTION__REPONSES:
			getReponses().clear();
			getReponses().addAll((Collection<? extends Reponse>) newValue);
			return;
		case QcmPackage.QUESTION__ETIQUETTE:
			getEtiquette().clear();
			getEtiquette().addAll((Collection<? extends Etiquette>) newValue);
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
		case QcmPackage.QUESTION__INTITULE:
			setIntitule(INTITULE_EDEFAULT);
			return;
		case QcmPackage.QUESTION__REPONSE_UNIQUE:
			setReponseUnique(REPONSE_UNIQUE_EDEFAULT);
			return;
		case QcmPackage.QUESTION__DIFFICULTE:
			setDifficulte(DIFFICULTE_EDEFAULT);
			return;
		case QcmPackage.QUESTION__QUESTION_SUIVANTE:
			setQuestionSuivante((Question) null);
			return;
		case QcmPackage.QUESTION__REPONSES:
			getReponses().clear();
			return;
		case QcmPackage.QUESTION__ETIQUETTE:
			getEtiquette().clear();
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
		case QcmPackage.QUESTION__INTITULE:
			return INTITULE_EDEFAULT == null ? intitule != null : !INTITULE_EDEFAULT.equals(intitule);
		case QcmPackage.QUESTION__REPONSE_UNIQUE:
			return reponseUnique != REPONSE_UNIQUE_EDEFAULT;
		case QcmPackage.QUESTION__DIFFICULTE:
			return difficulte != DIFFICULTE_EDEFAULT;
		case QcmPackage.QUESTION__QUESTION_SUIVANTE:
			return questionSuivante != null;
		case QcmPackage.QUESTION__REPONSES:
			return reponses != null && !reponses.isEmpty();
		case QcmPackage.QUESTION__ETIQUETTE:
			return etiquette != null && !etiquette.isEmpty();
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
		result.append(" (intitule: ");
		result.append(intitule);
		result.append(", reponseUnique: ");
		result.append(reponseUnique);
		result.append(", difficulte: ");
		result.append(difficulte);
		result.append(')');
		return result.toString();
	}

} //QuestionImpl
