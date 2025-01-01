/**
 */
package presentation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import presentation.ElementReponse;
import presentation.PageQuestion;
import presentation.PresentationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link presentation.impl.PageQuestionImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link presentation.impl.PageQuestionImpl#getBonneReponse <em>Bonne Reponse</em>}</li>
 *   <li>{@link presentation.impl.PageQuestionImpl#getReponses <em>Reponses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageQuestionImpl extends MinimalEObjectImpl.Container implements PageQuestion {
	/**
	 * The default value of the '{@link #getQuestion() <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected static final String QUESTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected String question = QUESTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBonneReponse() <em>Bonne Reponse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBonneReponse()
	 * @generated
	 * @ordered
	 */
	protected ElementReponse bonneReponse;

	/**
	 * The cached value of the '{@link #getReponses() <em>Reponses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReponses()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementReponse> reponses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageQuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.PAGE_QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuestion() {
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuestion(String newQuestion) {
		String oldQuestion = question;
		question = newQuestion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.PAGE_QUESTION__QUESTION,
					oldQuestion, question));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementReponse getBonneReponse() {
		if (bonneReponse != null && bonneReponse.eIsProxy()) {
			InternalEObject oldBonneReponse = (InternalEObject) bonneReponse;
			bonneReponse = (ElementReponse) eResolveProxy(oldBonneReponse);
			if (bonneReponse != oldBonneReponse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PresentationPackage.PAGE_QUESTION__BONNE_REPONSE, oldBonneReponse, bonneReponse));
			}
		}
		return bonneReponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementReponse basicGetBonneReponse() {
		return bonneReponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBonneReponse(ElementReponse newBonneReponse) {
		ElementReponse oldBonneReponse = bonneReponse;
		bonneReponse = newBonneReponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.PAGE_QUESTION__BONNE_REPONSE,
					oldBonneReponse, bonneReponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementReponse> getReponses() {
		if (reponses == null) {
			reponses = new EObjectResolvingEList<ElementReponse>(ElementReponse.class, this,
					PresentationPackage.PAGE_QUESTION__REPONSES);
		}
		return reponses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PresentationPackage.PAGE_QUESTION__QUESTION:
			return getQuestion();
		case PresentationPackage.PAGE_QUESTION__BONNE_REPONSE:
			if (resolve)
				return getBonneReponse();
			return basicGetBonneReponse();
		case PresentationPackage.PAGE_QUESTION__REPONSES:
			return getReponses();
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
		case PresentationPackage.PAGE_QUESTION__QUESTION:
			setQuestion((String) newValue);
			return;
		case PresentationPackage.PAGE_QUESTION__BONNE_REPONSE:
			setBonneReponse((ElementReponse) newValue);
			return;
		case PresentationPackage.PAGE_QUESTION__REPONSES:
			getReponses().clear();
			getReponses().addAll((Collection<? extends ElementReponse>) newValue);
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
		case PresentationPackage.PAGE_QUESTION__QUESTION:
			setQuestion(QUESTION_EDEFAULT);
			return;
		case PresentationPackage.PAGE_QUESTION__BONNE_REPONSE:
			setBonneReponse((ElementReponse) null);
			return;
		case PresentationPackage.PAGE_QUESTION__REPONSES:
			getReponses().clear();
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
		case PresentationPackage.PAGE_QUESTION__QUESTION:
			return QUESTION_EDEFAULT == null ? question != null : !QUESTION_EDEFAULT.equals(question);
		case PresentationPackage.PAGE_QUESTION__BONNE_REPONSE:
			return bonneReponse != null;
		case PresentationPackage.PAGE_QUESTION__REPONSES:
			return reponses != null && !reponses.isEmpty();
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
		result.append(" (question: ");
		result.append(question);
		result.append(')');
		return result.toString();
	}

} //PageQuestionImpl
