/**
 */
package keyCardService;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see keyCardService.KeyCardServicePackage
 * @generated
 */
public interface KeyCardServiceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KeyCardServiceFactory eINSTANCE = keyCardService.impl.KeyCardServiceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Key Cards</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Cards</em>'.
	 * @generated
	 */
	KeyCards createKeyCards();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KeyCardServicePackage getKeyCardServicePackage();

} //KeyCardServiceFactory
