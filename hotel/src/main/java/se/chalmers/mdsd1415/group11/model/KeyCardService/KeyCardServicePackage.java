/**
 */
package se.chalmers.mdsd1415.group11.model.KeyCardService;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import se.chalmers.mdsd1415.group11.model.KeyCardService.impl.KeyCardServicePackageImpl;

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
 * @see KeyCardServiceFactory
 * @model kind="package"
 * @generated
 */
public interface KeyCardServicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "KeyCardService";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///model/KeyCardService.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model.KeyCardService";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KeyCardServicePackage eINSTANCE = KeyCardServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link se.chalmers.mdsd1415.group11.model.KeyCardService.impl.KeyCardsImpl <em>Key Cards</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.mdsd1415.group11.model.KeyCardService.impl.KeyCardsImpl
	 * @see se.chalmers.mdsd1415.group11.model.KeyCardService.impl.KeyCardServicePackageImpl#getKeyCards()
	 * @generated
	 */
	int KEY_CARDS = 0;

	/**
	 * The number of structural features of the '<em>Key Cards</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARDS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Key Cards</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link KeyCardsProvides <em>Key Cards Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KeyCardsProvides
	 * @see se.chalmers.mdsd1415.group11.model.KeyCardService.impl.KeyCardServicePackageImpl#getKeyCardsProvides()
	 * @generated
	 */
	int KEY_CARDS_PROVIDES = 1;

	/**
	 * The number of structural features of the '<em>Key Cards Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARDS_PROVIDES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Returned Cards</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARDS_PROVIDES___RETURNED_CARDS__LONG = 0;

	/**
	 * The operation id for the '<em>Assign Cards To Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARDS_PROVIDES___ASSIGN_CARDS_TO_RESERVATION__LONG_INT = 1;

	/**
	 * The number of operations of the '<em>Key Cards Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARDS_PROVIDES_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link KeyCards <em>Key Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Cards</em>'.
	 * @see KeyCards
	 * @generated
	 */
	EClass getKeyCards();

	/**
	 * Returns the meta object for class '{@link KeyCardsProvides <em>Key Cards Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Cards Provides</em>'.
	 * @see KeyCardsProvides
	 * @generated
	 */
	EClass getKeyCardsProvides();

	/**
	 * Returns the meta object for the '{@link KeyCardsProvides#returnedCards(long) <em>Returned Cards</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Returned Cards</em>' operation.
	 * @see KeyCardsProvides#returnedCards(long)
	 * @generated
	 */
	EOperation getKeyCardsProvides__ReturnedCards__long();

	/**
	 * Returns the meta object for the '{@link KeyCardsProvides#assignCardsToReservation(long, int) <em>Assign Cards To Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Assign Cards To Reservation</em>' operation.
	 * @see KeyCardsProvides#assignCardsToReservation(long, int)
	 * @generated
	 */
	EOperation getKeyCardsProvides__AssignCardsToReservation__long_int();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KeyCardServiceFactory getKeyCardServiceFactory();

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
		 * The meta object literal for the '{@link se.chalmers.mdsd1415.group11.model.KeyCardService.impl.KeyCardsImpl <em>Key Cards</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.mdsd1415.group11.model.KeyCardService.impl.KeyCardsImpl
		 * @see se.chalmers.mdsd1415.group11.model.KeyCardService.impl.KeyCardServicePackageImpl#getKeyCards()
		 * @generated
		 */
		EClass KEY_CARDS = eINSTANCE.getKeyCards();

		/**
		 * The meta object literal for the '{@link KeyCardsProvides <em>Key Cards Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KeyCardsProvides
		 * @see se.chalmers.mdsd1415.group11.model.KeyCardService.impl.KeyCardServicePackageImpl#getKeyCardsProvides()
		 * @generated
		 */
		EClass KEY_CARDS_PROVIDES = eINSTANCE.getKeyCardsProvides();

		/**
		 * The meta object literal for the '<em><b>Returned Cards</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KEY_CARDS_PROVIDES___RETURNED_CARDS__LONG = eINSTANCE.getKeyCardsProvides__ReturnedCards__long();

		/**
		 * The meta object literal for the '<em><b>Assign Cards To Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KEY_CARDS_PROVIDES___ASSIGN_CARDS_TO_RESERVATION__LONG_INT = eINSTANCE.getKeyCardsProvides__AssignCardsToReservation__long_int();

	}

} //KeyCardServicePackage
