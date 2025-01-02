/**
 */
package presentation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import presentation.PresentationPackage;
import presentation.ReponseProposee;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reponse Proposee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link presentation.impl.ReponseProposeeImpl#getTexte <em>Texte</em>}</li>
 *   <li>{@link presentation.impl.ReponseProposeeImpl#isEstCorrecte <em>Est Correcte</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReponseProposeeImpl extends MinimalEObjectImpl.Container implements ReponseProposee {
	/**
	 * The default value of the '{@link #getTexte() <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexte()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTexte() <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexte()
	 * @generated
	 * @ordered
	 */
	protected String texte = TEXTE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEstCorrecte() <em>Est Correcte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEstCorrecte()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EST_CORRECTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEstCorrecte() <em>Est Correcte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEstCorrecte()
	 * @generated
	 * @ordered
	 */
	protected boolean estCorrecte = EST_CORRECTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReponseProposeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.REPONSE_PROPOSEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTexte() {
		return texte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTexte(String newTexte) {
		String oldTexte = texte;
		texte = newTexte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.REPONSE_PROPOSEE__TEXTE, oldTexte,
					texte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEstCorrecte() {
		return estCorrecte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstCorrecte(boolean newEstCorrecte) {
		boolean oldEstCorrecte = estCorrecte;
		estCorrecte = newEstCorrecte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.REPONSE_PROPOSEE__EST_CORRECTE,
					oldEstCorrecte, estCorrecte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PresentationPackage.REPONSE_PROPOSEE__TEXTE:
			return getTexte();
		case PresentationPackage.REPONSE_PROPOSEE__EST_CORRECTE:
			return isEstCorrecte();
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
		case PresentationPackage.REPONSE_PROPOSEE__TEXTE:
			setTexte((String) newValue);
			return;
		case PresentationPackage.REPONSE_PROPOSEE__EST_CORRECTE:
			setEstCorrecte((Boolean) newValue);
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
		case PresentationPackage.REPONSE_PROPOSEE__TEXTE:
			setTexte(TEXTE_EDEFAULT);
			return;
		case PresentationPackage.REPONSE_PROPOSEE__EST_CORRECTE:
			setEstCorrecte(EST_CORRECTE_EDEFAULT);
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
		case PresentationPackage.REPONSE_PROPOSEE__TEXTE:
			return TEXTE_EDEFAULT == null ? texte != null : !TEXTE_EDEFAULT.equals(texte);
		case PresentationPackage.REPONSE_PROPOSEE__EST_CORRECTE:
			return estCorrecte != EST_CORRECTE_EDEFAULT;
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
		result.append(" (texte: ");
		result.append(texte);
		result.append(", estCorrecte: ");
		result.append(estCorrecte);
		result.append(')');
		return result.toString();
	}

} //ReponseProposeeImpl
