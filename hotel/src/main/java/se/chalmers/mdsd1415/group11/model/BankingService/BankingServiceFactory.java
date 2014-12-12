/**
 */
package se.chalmers.mdsd1415.group11.model.BankingService;

import org.eclipse.emf.ecore.EFactory;
import se.chalmers.mdsd1415.group11.model.BankingService.impl.BankingServiceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see BankingServicePackage
 * @generated
 */
public interface BankingServiceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BankingServiceFactory eINSTANCE = BankingServiceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bank Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bank Component</em>'.
	 * @generated
	 */
	BankComponent createBankComponent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BankingServicePackage getBankingServicePackage();

} //BankingServiceFactory
