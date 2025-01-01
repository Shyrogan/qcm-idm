/**
 */
package presentation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see presentation.PresentationPackage
 * @generated
 */
public interface PresentationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PresentationFactory eINSTANCE = presentation.impl.PresentationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>QCM Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QCM Presentation</em>'.
	 * @generated
	 */
	QCMPresentation createQCMPresentation();

	/**
	 * Returns a new object of class '<em>Page Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Question</em>'.
	 * @generated
	 */
	PageQuestion createPageQuestion();

	/**
	 * Returns a new object of class '<em>Element Reponse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Reponse</em>'.
	 * @generated
	 */
	ElementReponse createElementReponse();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PresentationPackage getPresentationPackage();

} //PresentationFactory
