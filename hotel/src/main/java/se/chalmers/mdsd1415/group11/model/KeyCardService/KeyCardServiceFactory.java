/**
 */
package se.chalmers.mdsd1415.group11.model.KeyCardService;

import org.eclipse.emf.ecore.EFactory;
import se.chalmers.mdsd1415.group11.model.KeyCardService.impl.KeyCardServiceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see KeyCardServicePackage
 * @generated
 */
public interface KeyCardServiceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KeyCardServiceFactory eINSTANCE = KeyCardServiceFactoryImpl.init();

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
