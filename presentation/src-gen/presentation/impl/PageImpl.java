/**
 */
package presentation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import presentation.Page;
import presentation.PresentationPackage;
import presentation.QuestionAffichee;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link presentation.impl.PageImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link presentation.impl.PageImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link presentation.impl.PageImpl#getPageSuivante <em>Page Suivante</em>}</li>
 *   <li>{@link presentation.impl.PageImpl#getPagePrecedente <em>Page Precedente</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends MinimalEObjectImpl.Container implements Page {
	/**
	 * The default value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected int numero = NUMERO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected QuestionAffichee question;

	/**
	 * The cached value of the '{@link #getPageSuivante() <em>Page Suivante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageSuivante()
	 * @generated
	 * @ordered
	 */
	protected Page pageSuivante;

	/**
	 * The cached value of the '{@link #getPagePrecedente() <em>Page Precedente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagePrecedente()
	 * @generated
	 * @ordered
	 */
	protected Page pagePrecedente;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumero() {
		return numero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumero(int newNumero) {
		int oldNumero = numero;
		numero = newNumero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.PAGE__NUMERO, oldNumero, numero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionAffichee getQuestion() {
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestion(QuestionAffichee newQuestion, NotificationChain msgs) {
		QuestionAffichee oldQuestion = question;
		question = newQuestion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PresentationPackage.PAGE__QUESTION, oldQuestion, newQuestion);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuestion(QuestionAffichee newQuestion) {
		if (newQuestion != question) {
			NotificationChain msgs = null;
			if (question != null)
				msgs = ((InternalEObject) question).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PresentationPackage.PAGE__QUESTION, null, msgs);
			if (newQuestion != null)
				msgs = ((InternalEObject) newQuestion).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PresentationPackage.PAGE__QUESTION, null, msgs);
			msgs = basicSetQuestion(newQuestion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.PAGE__QUESTION, newQuestion,
					newQuestion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Page getPageSuivante() {
		if (pageSuivante != null && pageSuivante.eIsProxy()) {
			InternalEObject oldPageSuivante = (InternalEObject) pageSuivante;
			pageSuivante = (Page) eResolveProxy(oldPageSuivante);
			if (pageSuivante != oldPageSuivante) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PresentationPackage.PAGE__PAGE_SUIVANTE,
							oldPageSuivante, pageSuivante));
			}
		}
		return pageSuivante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetPageSuivante() {
		return pageSuivante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPageSuivante(Page newPageSuivante) {
		Page oldPageSuivante = pageSuivante;
		pageSuivante = newPageSuivante;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.PAGE__PAGE_SUIVANTE,
					oldPageSuivante, pageSuivante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Page getPagePrecedente() {
		if (pagePrecedente != null && pagePrecedente.eIsProxy()) {
			InternalEObject oldPagePrecedente = (InternalEObject) pagePrecedente;
			pagePrecedente = (Page) eResolveProxy(oldPagePrecedente);
			if (pagePrecedente != oldPagePrecedente) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PresentationPackage.PAGE__PAGE_PRECEDENTE,
							oldPagePrecedente, pagePrecedente));
			}
		}
		return pagePrecedente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetPagePrecedente() {
		return pagePrecedente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPagePrecedente(Page newPagePrecedente) {
		Page oldPagePrecedente = pagePrecedente;
		pagePrecedente = newPagePrecedente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.PAGE__PAGE_PRECEDENTE,
					oldPagePrecedente, pagePrecedente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PresentationPackage.PAGE__QUESTION:
			return basicSetQuestion(null, msgs);
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
		case PresentationPackage.PAGE__NUMERO:
			return getNumero();
		case PresentationPackage.PAGE__QUESTION:
			return getQuestion();
		case PresentationPackage.PAGE__PAGE_SUIVANTE:
			if (resolve)
				return getPageSuivante();
			return basicGetPageSuivante();
		case PresentationPackage.PAGE__PAGE_PRECEDENTE:
			if (resolve)
				return getPagePrecedente();
			return basicGetPagePrecedente();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PresentationPackage.PAGE__NUMERO:
			setNumero((Integer) newValue);
			return;
		case PresentationPackage.PAGE__QUESTION:
			setQuestion((QuestionAffichee) newValue);
			return;
		case PresentationPackage.PAGE__PAGE_SUIVANTE:
			setPageSuivante((Page) newValue);
			return;
		case PresentationPackage.PAGE__PAGE_PRECEDENTE:
			setPagePrecedente((Page) newValue);
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
		case PresentationPackage.PAGE__NUMERO:
			setNumero(NUMERO_EDEFAULT);
			return;
		case PresentationPackage.PAGE__QUESTION:
			setQuestion((QuestionAffichee) null);
			return;
		case PresentationPackage.PAGE__PAGE_SUIVANTE:
			setPageSuivante((Page) null);
			return;
		case PresentationPackage.PAGE__PAGE_PRECEDENTE:
			setPagePrecedente((Page) null);
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
		case PresentationPackage.PAGE__NUMERO:
			return numero != NUMERO_EDEFAULT;
		case PresentationPackage.PAGE__QUESTION:
			return question != null;
		case PresentationPackage.PAGE__PAGE_SUIVANTE:
			return pageSuivante != null;
		case PresentationPackage.PAGE__PAGE_PRECEDENTE:
			return pagePrecedente != null;
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
		result.append(" (numero: ");
		result.append(numero);
		result.append(')');
		return result.toString();
	}

} //PageImpl
