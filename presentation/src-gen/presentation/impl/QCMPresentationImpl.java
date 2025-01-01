/**
 */
package presentation.impl;

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

import presentation.PageQuestion;
import presentation.PresentationPackage;
import presentation.QCMPresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QCM Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link presentation.impl.QCMPresentationImpl#getTitre <em>Titre</em>}</li>
 *   <li>{@link presentation.impl.QCMPresentationImpl#getPremiereQuestion <em>Premiere Question</em>}</li>
 *   <li>{@link presentation.impl.QCMPresentationImpl#getQuestions <em>Questions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QCMPresentationImpl extends MinimalEObjectImpl.Container implements QCMPresentation {
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
	 * The cached value of the '{@link #getPremiereQuestion() <em>Premiere Question</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremiereQuestion()
	 * @generated
	 * @ordered
	 */
	protected PageQuestion premiereQuestion;

	/**
	 * The cached value of the '{@link #getQuestions() <em>Questions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestions()
	 * @generated
	 * @ordered
	 */
	protected EList<PageQuestion> questions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QCMPresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.QCM_PRESENTATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.QCM_PRESENTATION__TITRE, oldTitre,
					titre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PageQuestion getPremiereQuestion() {
		if (premiereQuestion != null && premiereQuestion.eIsProxy()) {
			InternalEObject oldPremiereQuestion = (InternalEObject) premiereQuestion;
			premiereQuestion = (PageQuestion) eResolveProxy(oldPremiereQuestion);
			if (premiereQuestion != oldPremiereQuestion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PresentationPackage.QCM_PRESENTATION__PREMIERE_QUESTION, oldPremiereQuestion,
							premiereQuestion));
			}
		}
		return premiereQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageQuestion basicGetPremiereQuestion() {
		return premiereQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPremiereQuestion(PageQuestion newPremiereQuestion) {
		PageQuestion oldPremiereQuestion = premiereQuestion;
		premiereQuestion = newPremiereQuestion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PresentationPackage.QCM_PRESENTATION__PREMIERE_QUESTION, oldPremiereQuestion, premiereQuestion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PageQuestion> getQuestions() {
		if (questions == null) {
			questions = new EObjectContainmentEList<PageQuestion>(PageQuestion.class, this,
					PresentationPackage.QCM_PRESENTATION__QUESTIONS);
		}
		return questions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PresentationPackage.QCM_PRESENTATION__QUESTIONS:
			return ((InternalEList<?>) getQuestions()).basicRemove(otherEnd, msgs);
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
		case PresentationPackage.QCM_PRESENTATION__TITRE:
			return getTitre();
		case PresentationPackage.QCM_PRESENTATION__PREMIERE_QUESTION:
			if (resolve)
				return getPremiereQuestion();
			return basicGetPremiereQuestion();
		case PresentationPackage.QCM_PRESENTATION__QUESTIONS:
			return getQuestions();
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
		case PresentationPackage.QCM_PRESENTATION__TITRE:
			setTitre((String) newValue);
			return;
		case PresentationPackage.QCM_PRESENTATION__PREMIERE_QUESTION:
			setPremiereQuestion((PageQuestion) newValue);
			return;
		case PresentationPackage.QCM_PRESENTATION__QUESTIONS:
			getQuestions().clear();
			getQuestions().addAll((Collection<? extends PageQuestion>) newValue);
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
		case PresentationPackage.QCM_PRESENTATION__TITRE:
			setTitre(TITRE_EDEFAULT);
			return;
		case PresentationPackage.QCM_PRESENTATION__PREMIERE_QUESTION:
			setPremiereQuestion((PageQuestion) null);
			return;
		case PresentationPackage.QCM_PRESENTATION__QUESTIONS:
			getQuestions().clear();
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
		case PresentationPackage.QCM_PRESENTATION__TITRE:
			return TITRE_EDEFAULT == null ? titre != null : !TITRE_EDEFAULT.equals(titre);
		case PresentationPackage.QCM_PRESENTATION__PREMIERE_QUESTION:
			return premiereQuestion != null;
		case PresentationPackage.QCM_PRESENTATION__QUESTIONS:
			return questions != null && !questions.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //QCMPresentationImpl
