/**
 */
package qcm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import qcm.Etiquette;
import qcm.QcmPackage;
import qcm.Question;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Etiquette</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qcm.impl.EtiquetteImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link qcm.impl.EtiquetteImpl#getQuestions <em>Questions</em>}</li>
 *   <li>{@link qcm.impl.EtiquetteImpl#getSousEtiquette <em>Sous Etiquette</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EtiquetteImpl extends MinimalEObjectImpl.Container implements Etiquette {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORIE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected String categorie = CATEGORIE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSousEtiquette() <em>Sous Etiquette</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousEtiquette()
	 * @generated
	 * @ordered
	 */
	protected Etiquette sousEtiquette;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EtiquetteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QcmPackage.Literals.ETIQUETTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategorie(String newCategorie) {
		String oldCategorie = categorie;
		categorie = newCategorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QcmPackage.ETIQUETTE__CATEGORIE, oldCategorie,
					categorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Question getQuestions() {
		if (eContainerFeatureID() != QcmPackage.ETIQUETTE__QUESTIONS)
			return null;
		return (Question) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestions(Question newQuestions, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newQuestions, QcmPackage.ETIQUETTE__QUESTIONS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuestions(Question newQuestions) {
		if (newQuestions != eInternalContainer()
				|| (eContainerFeatureID() != QcmPackage.ETIQUETTE__QUESTIONS && newQuestions != null)) {
			if (EcoreUtil.isAncestor(this, newQuestions))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newQuestions != null)
				msgs = ((InternalEObject) newQuestions).eInverseAdd(this, QcmPackage.QUESTION__ETIQUETTE,
						Question.class, msgs);
			msgs = basicSetQuestions(newQuestions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QcmPackage.ETIQUETTE__QUESTIONS, newQuestions,
					newQuestions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Etiquette getSousEtiquette() {
		if (sousEtiquette != null && sousEtiquette.eIsProxy()) {
			InternalEObject oldSousEtiquette = (InternalEObject) sousEtiquette;
			sousEtiquette = (Etiquette) eResolveProxy(oldSousEtiquette);
			if (sousEtiquette != oldSousEtiquette) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QcmPackage.ETIQUETTE__SOUS_ETIQUETTE,
							oldSousEtiquette, sousEtiquette));
			}
		}
		return sousEtiquette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Etiquette basicGetSousEtiquette() {
		return sousEtiquette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSousEtiquette(Etiquette newSousEtiquette) {
		Etiquette oldSousEtiquette = sousEtiquette;
		sousEtiquette = newSousEtiquette;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QcmPackage.ETIQUETTE__SOUS_ETIQUETTE,
					oldSousEtiquette, sousEtiquette));
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
		case QcmPackage.ETIQUETTE__QUESTIONS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetQuestions((Question) otherEnd, msgs);
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
		case QcmPackage.ETIQUETTE__QUESTIONS:
			return basicSetQuestions(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case QcmPackage.ETIQUETTE__QUESTIONS:
			return eInternalContainer().eInverseRemove(this, QcmPackage.QUESTION__ETIQUETTE, Question.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QcmPackage.ETIQUETTE__CATEGORIE:
			return getCategorie();
		case QcmPackage.ETIQUETTE__QUESTIONS:
			return getQuestions();
		case QcmPackage.ETIQUETTE__SOUS_ETIQUETTE:
			if (resolve)
				return getSousEtiquette();
			return basicGetSousEtiquette();
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
		case QcmPackage.ETIQUETTE__CATEGORIE:
			setCategorie((String) newValue);
			return;
		case QcmPackage.ETIQUETTE__QUESTIONS:
			setQuestions((Question) newValue);
			return;
		case QcmPackage.ETIQUETTE__SOUS_ETIQUETTE:
			setSousEtiquette((Etiquette) newValue);
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
		case QcmPackage.ETIQUETTE__CATEGORIE:
			setCategorie(CATEGORIE_EDEFAULT);
			return;
		case QcmPackage.ETIQUETTE__QUESTIONS:
			setQuestions((Question) null);
			return;
		case QcmPackage.ETIQUETTE__SOUS_ETIQUETTE:
			setSousEtiquette((Etiquette) null);
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
		case QcmPackage.ETIQUETTE__CATEGORIE:
			return CATEGORIE_EDEFAULT == null ? categorie != null : !CATEGORIE_EDEFAULT.equals(categorie);
		case QcmPackage.ETIQUETTE__QUESTIONS:
			return getQuestions() != null;
		case QcmPackage.ETIQUETTE__SOUS_ETIQUETTE:
			return sousEtiquette != null;
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
		result.append(" (categorie: ");
		result.append(categorie);
		result.append(')');
		return result.toString();
	}

} //EtiquetteImpl
