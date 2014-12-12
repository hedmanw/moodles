/**
 */
package se.chalmers.mdsd1415.group11.model.BankingService;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import se.chalmers.mdsd1415.group11.model.BankingService.impl.BankingServicePackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see BankingServiceFactory
 * @model kind="package"
 * @generated
 */
public interface BankingServicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BankingService";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///model/BankingService.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model.BankingService";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BankingServicePackage eINSTANCE = BankingServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link AdministratorProvides <em>Administrator Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AdministratorProvides
	 * @see se.chalmers.mdsd1415.group11.model.BankingService.impl.BankingServicePackageImpl#getAdministratorProvides()
	 * @generated
	 */
	int ADMINISTRATOR_PROVIDES = 0;

	/**
	 * The number of structural features of the '<em>Administrator Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_PROVIDES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Make Deposit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_PROVIDES___MAKE_DEPOSIT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Add Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_PROVIDES___ADD_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Remove Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_PROVIDES___REMOVE_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Get Balance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_PROVIDES___GET_BALANCE__STRING_STRING_INT_INT_STRING_STRING = 3;

	/**
	 * The number of operations of the '<em>Administrator Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_PROVIDES_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link CustomerProvides <em>Customer Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CustomerProvides
	 * @see se.chalmers.mdsd1415.group11.model.BankingService.impl.BankingServicePackageImpl#getCustomerProvides()
	 * @generated
	 */
	int CUSTOMER_PROVIDES = 1;

	/**
	 * The number of structural features of the '<em>Customer Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_PROVIDES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Make Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_PROVIDES___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Is Credit Card Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_PROVIDES___IS_CREDIT_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING = 1;

	/**
	 * The number of operations of the '<em>Customer Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_PROVIDES_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link se.chalmers.mdsd1415.group11.model.BankingService.impl.BankComponentImpl <em>Bank Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.mdsd1415.group11.model.BankingService.impl.BankComponentImpl
	 * @see se.chalmers.mdsd1415.group11.model.BankingService.impl.BankingServicePackageImpl#getBankComponent()
	 * @generated
	 */
	int BANK_COMPONENT = 2;

	/**
	 * The number of structural features of the '<em>Bank Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Bank Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_COMPONENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link AdministratorProvides <em>Administrator Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrator Provides</em>'.
	 * @see AdministratorProvides
	 * @generated
	 */
	EClass getAdministratorProvides();

	/**
	 * Returns the meta object for the '{@link AdministratorProvides#makeDeposit(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double) <em>Make Deposit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Deposit</em>' operation.
	 * @see AdministratorProvides#makeDeposit(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double)
	 * @generated
	 */
	EOperation getAdministratorProvides__MakeDeposit__String_String_int_int_String_String_double();

	/**
	 * Returns the meta object for the '{@link AdministratorProvides#addCreditCard(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Add Credit Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Credit Card</em>' operation.
	 * @see AdministratorProvides#addCreditCard(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAdministratorProvides__AddCreditCard__String_String_int_int_String_String();

	/**
	 * Returns the meta object for the '{@link AdministratorProvides#removeCreditCard(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Remove Credit Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Credit Card</em>' operation.
	 * @see AdministratorProvides#removeCreditCard(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAdministratorProvides__RemoveCreditCard__String_String_int_int_String_String();

	/**
	 * Returns the meta object for the '{@link AdministratorProvides#getBalance(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Get Balance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Balance</em>' operation.
	 * @see AdministratorProvides#getBalance(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAdministratorProvides__GetBalance__String_String_int_int_String_String();

	/**
	 * Returns the meta object for class '{@link CustomerProvides <em>Customer Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Provides</em>'.
	 * @see CustomerProvides
	 * @generated
	 */
	EClass getCustomerProvides();

	/**
	 * Returns the meta object for the '{@link CustomerProvides#makePayment(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double) <em>Make Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Payment</em>' operation.
	 * @see CustomerProvides#makePayment(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double)
	 * @generated
	 */
	EOperation getCustomerProvides__MakePayment__String_String_int_int_String_String_double();

	/**
	 * Returns the meta object for the '{@link CustomerProvides#isCreditCardValid(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Is Credit Card Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Credit Card Valid</em>' operation.
	 * @see CustomerProvides#isCreditCardValid(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCustomerProvides__IsCreditCardValid__String_String_int_int_String_String();

	/**
	 * Returns the meta object for class '{@link BankComponent <em>Bank Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank Component</em>'.
	 * @see BankComponent
	 * @generated
	 */
	EClass getBankComponent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BankingServiceFactory getBankingServiceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link AdministratorProvides <em>Administrator Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AdministratorProvides
		 * @see se.chalmers.mdsd1415.group11.model.BankingService.impl.BankingServicePackageImpl#getAdministratorProvides()
		 * @generated
		 */
		EClass ADMINISTRATOR_PROVIDES = eINSTANCE.getAdministratorProvides();

		/**
		 * The meta object literal for the '<em><b>Make Deposit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATOR_PROVIDES___MAKE_DEPOSIT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = eINSTANCE.getAdministratorProvides__MakeDeposit__String_String_int_int_String_String_double();

		/**
		 * The meta object literal for the '<em><b>Add Credit Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATOR_PROVIDES___ADD_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getAdministratorProvides__AddCreditCard__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Remove Credit Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATOR_PROVIDES___REMOVE_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getAdministratorProvides__RemoveCreditCard__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Get Balance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATOR_PROVIDES___GET_BALANCE__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getAdministratorProvides__GetBalance__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '{@link CustomerProvides <em>Customer Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CustomerProvides
		 * @see se.chalmers.mdsd1415.group11.model.BankingService.impl.BankingServicePackageImpl#getCustomerProvides()
		 * @generated
		 */
		EClass CUSTOMER_PROVIDES = eINSTANCE.getCustomerProvides();

		/**
		 * The meta object literal for the '<em><b>Make Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER_PROVIDES___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = eINSTANCE.getCustomerProvides__MakePayment__String_String_int_int_String_String_double();

		/**
		 * The meta object literal for the '<em><b>Is Credit Card Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER_PROVIDES___IS_CREDIT_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getCustomerProvides__IsCreditCardValid__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '{@link se.chalmers.mdsd1415.group11.model.BankingService.impl.BankComponentImpl <em>Bank Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.mdsd1415.group11.model.BankingService.impl.BankComponentImpl
		 * @see se.chalmers.mdsd1415.group11.model.BankingService.impl.BankingServicePackageImpl#getBankComponent()
		 * @generated
		 */
		EClass BANK_COMPONENT = eINSTANCE.getBankComponent();

	}

} //BankingServicePackage
