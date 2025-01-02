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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import presentation.CategorieQuestion;
import presentation.PresentationPackage;
import presentation.QuestionAffichee;
import presentation.ReponseProposee;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question Affichee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link presentation.impl.QuestionAfficheeImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link presentation.impl.QuestionAfficheeImpl#getIntitule <em>Intitule</em>}</li>
 *   <li>{@link presentation.impl.QuestionAfficheeImpl#getNiveauDifficulte <em>Niveau Difficulte</em>}</li>
 *   <li>{@link presentation.impl.QuestionAfficheeImpl#isChoixMultiple <em>Choix Multiple</em>}</li>
 *   <li>{@link presentation.impl.QuestionAfficheeImpl#getReponsesPossibles <em>Reponses Possibles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionAfficheeImpl extends MinimalEObjectImpl.Container implements QuestionAffichee {
	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<CategorieQuestion> categories;

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
	 * The default value of the '{@link #getNiveauDifficulte() <em>Niveau Difficulte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauDifficulte()
	 * @generated
	 * @ordered
	 */
	protected static final int NIVEAU_DIFFICULTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNiveauDifficulte() <em>Niveau Difficulte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauDifficulte()
	 * @generated
	 * @ordered
	 */
	protected int niveauDifficulte = NIVEAU_DIFFICULTE_EDEFAULT;

	/**
	 * The default value of the '{@link #isChoixMultiple() <em>Choix Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChoixMultiple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHOIX_MULTIPLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isChoixMultiple() <em>Choix Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChoixMultiple()
	 * @generated
	 * @ordered
	 */
	protected boolean choixMultiple = CHOIX_MULTIPLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReponsesPossibles() <em>Reponses Possibles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReponsesPossibles()
	 * @generated
	 * @ordered
	 */
	protected EList<ReponseProposee> reponsesPossibles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionAfficheeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.QUESTION_AFFICHEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CategorieQuestion> getCategories() {
		if (categories == null) {
			categories = new EObjectResolvingEList<CategorieQuestion>(CategorieQuestion.class, this,
					PresentationPackage.QUESTION_AFFICHEE__CATEGORIES);
		}
		return categories;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.QUESTION_AFFICHEE__INTITULE,
					oldIntitule, intitule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNiveauDifficulte() {
		return niveauDifficulte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNiveauDifficulte(int newNiveauDifficulte) {
		int oldNiveauDifficulte = niveauDifficulte;
		niveauDifficulte = newNiveauDifficulte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PresentationPackage.QUESTION_AFFICHEE__NIVEAU_DIFFICULTE, oldNiveauDifficulte, niveauDifficulte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isChoixMultiple() {
		return choixMultiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChoixMultiple(boolean newChoixMultiple) {
		boolean oldChoixMultiple = choixMultiple;
		choixMultiple = newChoixMultiple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.QUESTION_AFFICHEE__CHOIX_MULTIPLE,
					oldChoixMultiple, choixMultiple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReponseProposee> getReponsesPossibles() {
		if (reponsesPossibles == null) {
			reponsesPossibles = new EObjectContainmentEList<ReponseProposee>(ReponseProposee.class, this,
					PresentationPackage.QUESTION_AFFICHEE__REPONSES_POSSIBLES);
		}
		return reponsesPossibles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PresentationPackage.QUESTION_AFFICHEE__REPONSES_POSSIBLES:
			return ((InternalEList<?>) getReponsesPossibles()).basicRemove(otherEnd, msgs);
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
		case PresentationPackage.QUESTION_AFFICHEE__CATEGORIES:
			return getCategories();
		case PresentationPackage.QUESTION_AFFICHEE__INTITULE:
			return getIntitule();
		case PresentationPackage.QUESTION_AFFICHEE__NIVEAU_DIFFICULTE:
			return getNiveauDifficulte();
		case PresentationPackage.QUESTION_AFFICHEE__CHOIX_MULTIPLE:
			return isChoixMultiple();
		case PresentationPackage.QUESTION_AFFICHEE__REPONSES_POSSIBLES:
			return getReponsesPossibles();
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
		case PresentationPackage.QUESTION_AFFICHEE__CATEGORIES:
			getCategories().clear();
			getCategories().addAll((Collection<? extends CategorieQuestion>) newValue);
			return;
		case PresentationPackage.QUESTION_AFFICHEE__INTITULE:
			setIntitule((String) newValue);
			return;
		case PresentationPackage.QUESTION_AFFICHEE__NIVEAU_DIFFICULTE:
			setNiveauDifficulte((Integer) newValue);
			return;
		case PresentationPackage.QUESTION_AFFICHEE__CHOIX_MULTIPLE:
			setChoixMultiple((Boolean) newValue);
			return;
		case PresentationPackage.QUESTION_AFFICHEE__REPONSES_POSSIBLES:
			getReponsesPossibles().clear();
			getReponsesPossibles().addAll((Collection<? extends ReponseProposee>) newValue);
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
		case PresentationPackage.QUESTION_AFFICHEE__CATEGORIES:
			getCategories().clear();
			return;
		case PresentationPackage.QUESTION_AFFICHEE__INTITULE:
			setIntitule(INTITULE_EDEFAULT);
			return;
		case PresentationPackage.QUESTION_AFFICHEE__NIVEAU_DIFFICULTE:
			setNiveauDifficulte(NIVEAU_DIFFICULTE_EDEFAULT);
			return;
		case PresentationPackage.QUESTION_AFFICHEE__CHOIX_MULTIPLE:
			setChoixMultiple(CHOIX_MULTIPLE_EDEFAULT);
			return;
		case PresentationPackage.QUESTION_AFFICHEE__REPONSES_POSSIBLES:
			getReponsesPossibles().clear();
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
		case PresentationPackage.QUESTION_AFFICHEE__CATEGORIES:
			return categories != null && !categories.isEmpty();
		case PresentationPackage.QUESTION_AFFICHEE__INTITULE:
			return INTITULE_EDEFAULT == null ? intitule != null : !INTITULE_EDEFAULT.equals(intitule);
		case PresentationPackage.QUESTION_AFFICHEE__NIVEAU_DIFFICULTE:
			return niveauDifficulte != NIVEAU_DIFFICULTE_EDEFAULT;
		case PresentationPackage.QUESTION_AFFICHEE__CHOIX_MULTIPLE:
			return choixMultiple != CHOIX_MULTIPLE_EDEFAULT;
		case PresentationPackage.QUESTION_AFFICHEE__REPONSES_POSSIBLES:
			return reponsesPossibles != null && !reponsesPossibles.isEmpty();
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
		result.append(", niveauDifficulte: ");
		result.append(niveauDifficulte);
		result.append(", choixMultiple: ");
		result.append(choixMultiple);
		result.append(')');
		return result.toString();
	}

} //QuestionAfficheeImpl
