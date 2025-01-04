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
import presentation.CategorieQuestion;
import presentation.Page;
import presentation.Presentation;
import presentation.PresentationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link presentation.impl.PresentationImpl#getTitre <em>Titre</em>}</li>
 *   <li>{@link presentation.impl.PresentationImpl#isRetourAutorise <em>Retour Autorise</em>}</li>
 *   <li>{@link presentation.impl.PresentationImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link presentation.impl.PresentationImpl#getCategoriesSelectionnees <em>Categories Selectionnees</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PresentationImpl extends MinimalEObjectImpl.Container implements Presentation {
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
	 * The default value of the '{@link #isRetourAutorise() <em>Retour Autorise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetourAutorise()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETOUR_AUTORISE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRetourAutorise() <em>Retour Autorise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetourAutorise()
	 * @generated
	 * @ordered
	 */
	protected boolean retourAutorise = RETOUR_AUTORISE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pages;

	/**
	 * The cached value of the '{@link #getCategoriesSelectionnees() <em>Categories Selectionnees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoriesSelectionnees()
	 * @generated
	 * @ordered
	 */
	protected EList<CategorieQuestion> categoriesSelectionnees;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.PRESENTATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.PRESENTATION__TITRE, oldTitre,
					titre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRetourAutorise() {
		return retourAutorise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetourAutorise(boolean newRetourAutorise) {
		boolean oldRetourAutorise = retourAutorise;
		retourAutorise = newRetourAutorise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.PRESENTATION__RETOUR_AUTORISE,
					oldRetourAutorise, retourAutorise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList<Page>(Page.class, this, PresentationPackage.PRESENTATION__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CategorieQuestion> getCategoriesSelectionnees() {
		if (categoriesSelectionnees == null) {
			categoriesSelectionnees = new EObjectContainmentEList<CategorieQuestion>(CategorieQuestion.class, this,
					PresentationPackage.PRESENTATION__CATEGORIES_SELECTIONNEES);
		}
		return categoriesSelectionnees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PresentationPackage.PRESENTATION__PAGES:
			return ((InternalEList<?>) getPages()).basicRemove(otherEnd, msgs);
		case PresentationPackage.PRESENTATION__CATEGORIES_SELECTIONNEES:
			return ((InternalEList<?>) getCategoriesSelectionnees()).basicRemove(otherEnd, msgs);
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
		case PresentationPackage.PRESENTATION__TITRE:
			return getTitre();
		case PresentationPackage.PRESENTATION__RETOUR_AUTORISE:
			return isRetourAutorise();
		case PresentationPackage.PRESENTATION__PAGES:
			return getPages();
		case PresentationPackage.PRESENTATION__CATEGORIES_SELECTIONNEES:
			return getCategoriesSelectionnees();
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
		case PresentationPackage.PRESENTATION__TITRE:
			setTitre((String) newValue);
			return;
		case PresentationPackage.PRESENTATION__RETOUR_AUTORISE:
			setRetourAutorise((Boolean) newValue);
			return;
		case PresentationPackage.PRESENTATION__PAGES:
			getPages().clear();
			getPages().addAll((Collection<? extends Page>) newValue);
			return;
		case PresentationPackage.PRESENTATION__CATEGORIES_SELECTIONNEES:
			getCategoriesSelectionnees().clear();
			getCategoriesSelectionnees().addAll((Collection<? extends CategorieQuestion>) newValue);
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
		case PresentationPackage.PRESENTATION__TITRE:
			setTitre(TITRE_EDEFAULT);
			return;
		case PresentationPackage.PRESENTATION__RETOUR_AUTORISE:
			setRetourAutorise(RETOUR_AUTORISE_EDEFAULT);
			return;
		case PresentationPackage.PRESENTATION__PAGES:
			getPages().clear();
			return;
		case PresentationPackage.PRESENTATION__CATEGORIES_SELECTIONNEES:
			getCategoriesSelectionnees().clear();
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
		case PresentationPackage.PRESENTATION__TITRE:
			return TITRE_EDEFAULT == null ? titre != null : !TITRE_EDEFAULT.equals(titre);
		case PresentationPackage.PRESENTATION__RETOUR_AUTORISE:
			return retourAutorise != RETOUR_AUTORISE_EDEFAULT;
		case PresentationPackage.PRESENTATION__PAGES:
			return pages != null && !pages.isEmpty();
		case PresentationPackage.PRESENTATION__CATEGORIES_SELECTIONNEES:
			return categoriesSelectionnees != null && !categoriesSelectionnees.isEmpty();
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
		result.append(", retourAutorise: ");
		result.append(retourAutorise);
		result.append(')');
		return result.toString();
	}

} //PresentationImpl
