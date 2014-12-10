/**
 */
package HotelSystem;

import model.HotelService.HotelServicePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see HotelSystem.HotelSystemFactory
 * @model kind="package"
 * @generated
 */
public interface HotelSystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HotelSystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///HotelSystem.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "HotelSystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HotelSystemPackage eINSTANCE = HotelSystem.impl.HotelSystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link HotelSystem.impl.HotelImpl <em>Hotel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelSystem.impl.HotelImpl
	 * @see HotelSystem.impl.HotelSystemPackageImpl#getHotel()
	 * @generated
	 */
	int HOTEL = 0;

	/**
	 * The number of structural features of the '<em>Hotel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Hotel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link HotelSystem.impl.TabImpl <em>Tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelSystem.impl.TabImpl
	 * @see HotelSystem.impl.HotelSystemPackageImpl#getTab()
	 * @generated
	 */
	int TAB = 1;

	/**
	 * The feature id for the '<em><b>Tab Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__TAB_ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Add Item To Tab</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB___ADD_ITEM_TO_TAB__STRING_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Get Total Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB___GET_TOTAL_COST = 1;

	/**
	 * The operation id for the '<em>Remove Tab Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB___REMOVE_TAB_ITEM__STRING = 2;

	/**
	 * The operation id for the '<em>Get All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB___GET_ALL = 3;

	/**
	 * The number of operations of the '<em>Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link HotelSystem.impl.KeyCardImpl <em>Key Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelSystem.impl.KeyCardImpl
	 * @see HotelSystem.impl.HotelSystemPackageImpl#getKeyCard()
	 * @generated
	 */
	int KEY_CARD = 2;

	/**
	 * The feature id for the '<em><b>Key Card ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD__KEY_CARD_ID = 0;

	/**
	 * The number of structural features of the '<em>Key Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD___GET_ID = 0;

	/**
	 * The operation id for the '<em>Set ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD___SET_ID__INT = 1;

	/**
	 * The number of operations of the '<em>Key Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARD_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link HotelSystem.impl.EquipmentImpl <em>Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelSystem.impl.EquipmentImpl
	 * @see HotelSystem.impl.HotelSystemPackageImpl#getEquipment()
	 * @generated
	 */
	int EQUIPMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT___GET_NAME = 0;

	/**
	 * The number of operations of the '<em>Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link HotelSystem.impl.RoomTypeImpl <em>Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelSystem.impl.RoomTypeImpl
	 * @see HotelSystem.impl.HotelSystemPackageImpl#getRoomType()
	 * @generated
	 */
	int ROOM_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Cost Per Night</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__COST_PER_NIGHT = 0;

	/**
	 * The number of structural features of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Cost Per Night</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE___GET_COST_PER_NIGHT = 0;

	/**
	 * The operation id for the '<em>Set Cost Per Night</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE___SET_COST_PER_NIGHT__DOUBLE = 1;

	/**
	 * The number of operations of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link HotelSystem.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelSystem.impl.RoomImpl
	 * @see HotelSystem.impl.HotelSystemPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 5;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Room Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Cleaned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__CLEANED = 2;

	/**
	 * The feature id for the '<em><b>Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__EQUIPMENT = 3;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___GET_ROOM_TYPE = 0;

	/**
	 * The operation id for the '<em>Add Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___ADD_ROOM_TYPE__ROOMTYPE = 1;

	/**
	 * The operation id for the '<em>Remove Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___REMOVE_ROOM_TYPE__ROOMTYPE = 2;

	/**
	 * The operation id for the '<em>Get Equipment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___GET_EQUIPMENT = 3;

	/**
	 * The operation id for the '<em>Add Equipment To Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___ADD_EQUIPMENT_TO_ROOM__STRING = 4;

	/**
	 * The operation id for the '<em>Remove Equipment Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___REMOVE_EQUIPMENT_ITEM__STRING = 5;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link HotelSystem.impl.ScheduledEventsImpl <em>Scheduled Events</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelSystem.impl.ScheduledEventsImpl
	 * @see HotelSystem.impl.HotelSystemPackageImpl#getScheduledEvents()
	 * @generated
	 */
	int SCHEDULED_EVENTS = 6;

	/**
	 * The feature id for the '<em><b>Events</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_EVENTS__EVENTS = 0;

	/**
	 * The number of structural features of the '<em>Scheduled Events</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_EVENTS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Add Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_EVENTS___ADD_EVENT__STRING_LONG = 0;

	/**
	 * The operation id for the '<em>Get Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_EVENTS___GET_EVENTS = 1;

	/**
	 * The operation id for the '<em>Update Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_EVENTS___UPDATE_EVENT__STRING_LONG = 2;

	/**
	 * The operation id for the '<em>Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_EVENTS___DELETE_EVENT__STRING = 3;

	/**
	 * The number of operations of the '<em>Scheduled Events</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_EVENTS_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link HotelSystem.impl.BillImpl <em>Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelSystem.impl.BillImpl
	 * @see HotelSystem.impl.HotelSystemPackageImpl#getBill()
	 * @generated
	 */
	int BILL = 7;

	/**
	 * The feature id for the '<em><b>Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__PAID = 0;

	/**
	 * The feature id for the '<em><b>Grand Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__GRAND_TOTAL = 1;

	/**
	 * The number of structural features of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Add To Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL___ADD_TO_BILL__DOUBLE = 0;

	/**
	 * The operation id for the '<em>Is Paid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL___IS_PAID = 1;

	/**
	 * The operation id for the '<em>Remove From Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL___REMOVE_FROM_BILL__DOUBLE = 2;

	/**
	 * The operation id for the '<em>Left To Pay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL___LEFT_TO_PAY = 3;

	/**
	 * The operation id for the '<em>Pay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL___PAY__DOUBLE = 4;

	/**
	 * The number of operations of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link HotelSystem.impl.SleepRoomImpl <em>Sleep Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelSystem.impl.SleepRoomImpl
	 * @see HotelSystem.impl.HotelSystemPackageImpl#getSleepRoom()
	 * @generated
	 */
	int SLEEP_ROOM = 8;

	/**
	 * The feature id for the '<em><b>Cost Per Night</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP_ROOM__COST_PER_NIGHT = ROOM_TYPE__COST_PER_NIGHT;

	/**
	 * The feature id for the '<em><b>Nbr Of Beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP_ROOM__NBR_OF_BEDS = ROOM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sleep Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP_ROOM_FEATURE_COUNT = ROOM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Cost Per Night</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP_ROOM___GET_COST_PER_NIGHT = ROOM_TYPE___GET_COST_PER_NIGHT;

	/**
	 * The operation id for the '<em>Set Cost Per Night</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP_ROOM___SET_COST_PER_NIGHT__DOUBLE = ROOM_TYPE___SET_COST_PER_NIGHT__DOUBLE;

	/**
	 * The operation id for the '<em>Get Nbr Of Beds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP_ROOM___GET_NBR_OF_BEDS = ROOM_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Nbr Of Beds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP_ROOM___SET_NBR_OF_BEDS__INT = ROOM_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sleep Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP_ROOM_OPERATION_COUNT = ROOM_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link HotelSystem.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelSystem.impl.CustomerImpl
	 * @see HotelSystem.impl.HotelSystemPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Payment Details</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PAYMENT_DETAILS = 2;

	/**
	 * The feature id for the '<em><b>Loyalty Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__LOYALTY_POINTS = 3;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___GET_ID = 0;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___SET_ID__STRING = 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___GET_NAME = 2;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___SET_NAME__STRING = 3;

	/**
	 * The operation id for the '<em>Get Loyalty Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___GET_LOYALTY_POINTS = 4;

	/**
	 * The operation id for the '<em>Add Loyalty Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___ADD_LOYALTY_POINTS__INT = 5;

	/**
	 * The operation id for the '<em>Remove Loyalty Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___REMOVE_LOYALTY_POINTS__INT = 6;

	/**
	 * The operation id for the '<em>Get Payment Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___GET_PAYMENT_DETAILS = 7;

	/**
	 * The operation id for the '<em>Set Payment Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___SET_PAYMENT_DETAILS__PAYMENTDETAILS = 8;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link HotelSystem.impl.PaymentDetailsImpl <em>Payment Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelSystem.impl.PaymentDetailsImpl
	 * @see HotelSystem.impl.HotelSystemPackageImpl#getPaymentDetails()
	 * @generated
	 */
	int PAYMENT_DETAILS = 10;

	/**
	 * The feature id for the '<em><b>Cc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS__CC_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Ccv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS__CCV = 1;

	/**
	 * The feature id for the '<em><b>Expiry Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS__EXPIRY_MONTH = 2;

	/**
	 * The feature id for the '<em><b>Expiry Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS__EXPIRY_YEAR = 3;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS__FIRST_NAME = 4;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS__LAST_NAME = 5;

	/**
	 * The number of structural features of the '<em>Payment Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Get Cc Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS___GET_CC_NUMBER = 0;

	/**
	 * The operation id for the '<em>Set Cc Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS___SET_CC_NUMBER__STRING = 1;

	/**
	 * The operation id for the '<em>Get Cc V</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS___GET_CC_V = 2;

	/**
	 * The operation id for the '<em>Set Ccv</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS___SET_CCV__STRING = 3;

	/**
	 * The operation id for the '<em>Get Expiry Month</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS___GET_EXPIRY_MONTH = 4;

	/**
	 * The operation id for the '<em>Set Expiry Month</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS___SET_EXPIRY_MONTH__INT = 5;

	/**
	 * The operation id for the '<em>Set Expiry Year</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS___SET_EXPIRY_YEAR__INT = 6;

	/**
	 * The operation id for the '<em>Get Expiry Year</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS___GET_EXPIRY_YEAR = 7;

	/**
	 * The operation id for the '<em>Get First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS___GET_FIRST_NAME = 8;

	/**
	 * The operation id for the '<em>Set First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS___SET_FIRST_NAME__STRING = 9;

	/**
	 * The operation id for the '<em>Set Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS___SET_LAST_NAME__STRING = 10;

	/**
	 * The operation id for the '<em>Get Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS___GET_LAST_NAME = 11;

	/**
	 * The number of operations of the '<em>Payment Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS_OPERATION_COUNT = 12;

	/**
	 * The meta object id for the '{@link HotelSystem.impl.ReservationImpl <em>Reservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelSystem.impl.ReservationImpl
	 * @see HotelSystem.impl.HotelSystemPackageImpl#getReservation()
	 * @generated
	 */
	int RESERVATION = 11;

	/**
	 * The feature id for the '<em><b>Tab</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__TAB = 0;

	/**
	 * The feature id for the '<em><b>Key Card</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__KEY_CARD = 1;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__SCHEDULED_EVENTS = 2;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__ROOM = 3;

	/**
	 * The feature id for the '<em><b>Cost Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__COST_CATEGORY = 4;

	/**
	 * The feature id for the '<em><b>Checked In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__CHECKED_IN = 5;

	/**
	 * The feature id for the '<em><b>Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__CHECKED_OUT = 6;

	/**
	 * The feature id for the '<em><b>Start Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__START_DAY = 7;

	/**
	 * The feature id for the '<em><b>End Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__END_DAY = 8;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__RESPONSIBLE = 9;

	/**
	 * The feature id for the '<em><b>Number Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__NUMBER_OF_GUESTS = 10;

	/**
	 * The number of structural features of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>Get Checked In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___GET_CHECKED_IN = 0;

	/**
	 * The operation id for the '<em>Set Checked In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___SET_CHECKED_IN__LONG = 1;

	/**
	 * The operation id for the '<em>Get Checked Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___GET_CHECKED_OUT = 2;

	/**
	 * The operation id for the '<em>Set Checked Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___SET_CHECKED_OUT__LONG = 3;

	/**
	 * The operation id for the '<em>Set Start Day</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___SET_START_DAY__LONG = 4;

	/**
	 * The operation id for the '<em>Get Start Day</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___GET_START_DAY = 5;

	/**
	 * The operation id for the '<em>Set End Day</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___SET_END_DAY__LONG = 6;

	/**
	 * The operation id for the '<em>Get End Day</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___GET_END_DAY = 7;

	/**
	 * The operation id for the '<em>Get Responsible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___GET_RESPONSIBLE = 8;

	/**
	 * The operation id for the '<em>Set Responsible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___SET_RESPONSIBLE__STRING = 9;

	/**
	 * The operation id for the '<em>Get Number Of Guests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___GET_NUMBER_OF_GUESTS = 10;

	/**
	 * The operation id for the '<em>Set Number Of Guests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___SET_NUMBER_OF_GUESTS__INT = 11;

	/**
	 * The operation id for the '<em>Get Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___GET_ROOM = 12;

	/**
	 * The operation id for the '<em>Set Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___SET_ROOM__ROOM = 13;

	/**
	 * The operation id for the '<em>Get Cost Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___GET_COST_CATEGORY = 14;

	/**
	 * The operation id for the '<em>Add Cost Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___ADD_COST_CATEGORY__ROOMTYPE = 15;

	/**
	 * The operation id for the '<em>Get Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___GET_EVENTS = 16;

	/**
	 * The operation id for the '<em>Remove All Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___REMOVE_ALL_EVENTS = 17;

	/**
	 * The operation id for the '<em>Get Key Cards</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___GET_KEY_CARDS = 18;

	/**
	 * The operation id for the '<em>Add Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___ADD_KEY_CARD__KEYCARD = 19;

	/**
	 * The operation id for the '<em>Remove Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___REMOVE_KEY_CARD__KEYCARD = 20;

	/**
	 * The operation id for the '<em>Remove Cost Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___REMOVE_COST_CATEGORY__ROOMTYPE = 21;

	/**
	 * The operation id for the '<em>Get Tab</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___GET_TAB = 22;

	/**
	 * The number of operations of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPERATION_COUNT = 23;

	/**
	 * The meta object id for the '{@link HotelSystem.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelSystem.impl.BookingImpl
	 * @see HotelSystem.impl.HotelSystemPackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 12;

	/**
	 * The feature id for the '<em><b>Bill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BILL = 0;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CUSTOMER = 1;

	/**
	 * The feature id for the '<em><b>Reservation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__RESERVATION = 2;

	/**
	 * The feature id for the '<em><b>Booking Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BOOKING_NBR = 3;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Booking Nbr</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___GET_BOOKING_NBR = 0;

	/**
	 * The operation id for the '<em>Get Reservations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___GET_RESERVATIONS = 1;

	/**
	 * The operation id for the '<em>Add Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___ADD_RESERVATION__RESERVATION = 2;

	/**
	 * The operation id for the '<em>Remove Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___REMOVE_RESERVATION__RESERVATION = 3;

	/**
	 * The operation id for the '<em>Get Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___GET_CUSTOMER = 4;

	/**
	 * The operation id for the '<em>Change Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___CHANGE_CUSTOMER__CUSTOMER = 5;

	/**
	 * The operation id for the '<em>Get Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___GET_BILL = 6;

	/**
	 * The operation id for the '<em>Set Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___SET_CUSTOMER__CUSTOMER = 7;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link HotelSystem.impl.ConferenceRoomImpl <em>Conference Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelSystem.impl.ConferenceRoomImpl
	 * @see HotelSystem.impl.HotelSystemPackageImpl#getConferenceRoom()
	 * @generated
	 */
	int CONFERENCE_ROOM = 13;

	/**
	 * The feature id for the '<em><b>Cost Per Night</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM__COST_PER_NIGHT = ROOM_TYPE__COST_PER_NIGHT;

	/**
	 * The feature id for the '<em><b>Max Nbr Of People</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM__MAX_NBR_OF_PEOPLE = ROOM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conference Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_FEATURE_COUNT = ROOM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Cost Per Night</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM___GET_COST_PER_NIGHT = ROOM_TYPE___GET_COST_PER_NIGHT;

	/**
	 * The operation id for the '<em>Set Cost Per Night</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM___SET_COST_PER_NIGHT__DOUBLE = ROOM_TYPE___SET_COST_PER_NIGHT__DOUBLE;

	/**
	 * The operation id for the '<em>Get Nbr Of People</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM___GET_NBR_OF_PEOPLE = ROOM_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conference Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_OPERATION_COUNT = ROOM_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link HotelSystem.impl.CustomerManagerImpl <em>Customer Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelSystem.impl.CustomerManagerImpl
	 * @see HotelSystem.impl.HotelSystemPackageImpl#getCustomerManager()
	 * @generated
	 */
	int CUSTOMER_MANAGER = 14;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_MANAGER__CUSTOMER = HotelServicePackage.ICUSTOMER_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Customer Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_MANAGER_FEATURE_COUNT = HotelServicePackage.ICUSTOMER_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Customer By Id Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_MANAGER___GET_CUSTOMER_BY_ID_NUMBER__STRING = HotelServicePackage.ICUSTOMER_MANAGER___GET_CUSTOMER_BY_ID_NUMBER__STRING;

	/**
	 * The operation id for the '<em>Get Customers By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_MANAGER___GET_CUSTOMERS_BY_NAME__STRING = HotelServicePackage.ICUSTOMER_MANAGER___GET_CUSTOMERS_BY_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_MANAGER___GET_CUSTOMER__LONG = HotelServicePackage.ICUSTOMER_MANAGER___GET_CUSTOMER__LONG;

	/**
	 * The operation id for the '<em>Create Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_MANAGER___CREATE_CUSTOMER__STRING_STRING = HotelServicePackage.ICUSTOMER_MANAGER___CREATE_CUSTOMER__STRING_STRING;

	/**
	 * The operation id for the '<em>Set Payment Details For Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_MANAGER___SET_PAYMENT_DETAILS_FOR_CUSTOMER__LONG_STRING_STRING_STRING_STRING_INT_INT = HotelServicePackage.ICUSTOMER_MANAGER___SET_PAYMENT_DETAILS_FOR_CUSTOMER__LONG_STRING_STRING_STRING_STRING_INT_INT;

	/**
	 * The operation id for the '<em>Get Payment Details By Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_MANAGER___GET_PAYMENT_DETAILS_BY_CUSTOMER__LONG = HotelServicePackage.ICUSTOMER_MANAGER___GET_PAYMENT_DETAILS_BY_CUSTOMER__LONG;

	/**
	 * The number of operations of the '<em>Customer Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_MANAGER_OPERATION_COUNT = HotelServicePackage.ICUSTOMER_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link HotelSystem.impl.RoomTypeManagerImpl <em>Room Type Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelSystem.impl.RoomTypeManagerImpl
	 * @see HotelSystem.impl.HotelSystemPackageImpl#getRoomTypeManager()
	 * @generated
	 */
	int ROOM_TYPE_MANAGER = 15;

	/**
	 * The feature id for the '<em><b>Room Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_MANAGER__ROOM_TYPE = HotelServicePackage.IROOM_TYPE_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Room Type Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_MANAGER_FEATURE_COUNT = HotelServicePackage.IROOM_TYPE_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_MANAGER___GET_ROOM_TYPES = HotelServicePackage.IROOM_TYPE_MANAGER___GET_ROOM_TYPES;

	/**
	 * The number of operations of the '<em>Room Type Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_MANAGER_OPERATION_COUNT = HotelServicePackage.IROOM_TYPE_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link HotelSystem.impl.BookingManagerImpl <em>Booking Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelSystem.impl.BookingManagerImpl
	 * @see HotelSystem.impl.HotelSystemPackageImpl#getBookingManager()
	 * @generated
	 */
	int BOOKING_MANAGER = 16;

	/**
	 * The feature id for the '<em><b>Booking</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER__BOOKING = HotelServicePackage.IBOOKING_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Booking Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_FEATURE_COUNT = HotelServicePackage.IBOOKING_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___CREATE_BOOKING = HotelServicePackage.IBOOKING_MANAGER___CREATE_BOOKING;

	/**
	 * The operation id for the '<em>Get Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_BOOKING__LONG = HotelServicePackage.IBOOKING_MANAGER___GET_BOOKING__LONG;

	/**
	 * The operation id for the '<em>Delete Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___DELETE_BOOKING__LONG = HotelServicePackage.IBOOKING_MANAGER___DELETE_BOOKING__LONG;

	/**
	 * The operation id for the '<em>Get Bookings By Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_BOOKINGS_BY_CUSTOMER__LONG = HotelServicePackage.IBOOKING_MANAGER___GET_BOOKINGS_BY_CUSTOMER__LONG;

	/**
	 * The operation id for the '<em>Set Booking Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___SET_BOOKING_CUSTOMER__LONG_LONG = HotelServicePackage.IBOOKING_MANAGER___SET_BOOKING_CUSTOMER__LONG_LONG;

	/**
	 * The operation id for the '<em>Is Bill Paid In Full</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___IS_BILL_PAID_IN_FULL__LONG = HotelServicePackage.IBOOKING_MANAGER___IS_BILL_PAID_IN_FULL__LONG;

	/**
	 * The operation id for the '<em>Get Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_BILL__LONG = HotelServicePackage.IBOOKING_MANAGER___GET_BILL__LONG;

	/**
	 * The operation id for the '<em>Get Booking By Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_BOOKING_BY_RESERVATION__RESERVATION_BOOKING = HotelServicePackage.IBOOKING_MANAGER___GET_BOOKING_BY_RESERVATION__RESERVATION_BOOKING;

	/**
	 * The number of operations of the '<em>Booking Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_OPERATION_COUNT = HotelServicePackage.IBOOKING_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link HotelSystem.impl.RoomManagerImpl <em>Room Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelSystem.impl.RoomManagerImpl
	 * @see HotelSystem.impl.HotelSystemPackageImpl#getRoomManager()
	 * @generated
	 */
	int ROOM_MANAGER = 17;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER__ROOM = HotelServicePackage.IROOM_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Room Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_FEATURE_COUNT = HotelServicePackage.IROOM_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Available Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___GET_AVAILABLE_ROOMS__DATE_DATE_ELIST = HotelServicePackage.IROOM_MANAGER___GET_AVAILABLE_ROOMS__DATE_DATE_ELIST;

	/**
	 * The operation id for the '<em>Get Room Occupancy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___GET_ROOM_OCCUPANCY__DATE_DATE = HotelServicePackage.IROOM_MANAGER___GET_ROOM_OCCUPANCY__DATE_DATE;

	/**
	 * The number of operations of the '<em>Room Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_OPERATION_COUNT = HotelServicePackage.IROOM_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link HotelSystem.impl.ReservationManagerImpl <em>Reservation Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelSystem.impl.ReservationManagerImpl
	 * @see HotelSystem.impl.HotelSystemPackageImpl#getReservationManager()
	 * @generated
	 */
	int RESERVATION_MANAGER = 18;

	/**
	 * The feature id for the '<em><b>Reservation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_MANAGER__RESERVATION = HotelServicePackage.IRESERVATION_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reservation Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_MANAGER_FEATURE_COUNT = HotelServicePackage.IRESERVATION_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_MANAGER___CREATE_RESERVATION__BOOKING_DATE_DATE_LONG_LONG = HotelServicePackage.IRESERVATION_MANAGER___CREATE_RESERVATION__BOOKING_DATE_DATE_LONG_LONG;

	/**
	 * The operation id for the '<em>Get Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_MANAGER___GET_RESERVATION__LONG = HotelServicePackage.IRESERVATION_MANAGER___GET_RESERVATION__LONG;

	/**
	 * The operation id for the '<em>Set Responsible For Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_MANAGER___SET_RESPONSIBLE_FOR_RESERVATION__LONG_STRING = HotelServicePackage.IRESERVATION_MANAGER___SET_RESPONSIBLE_FOR_RESERVATION__LONG_STRING;

	/**
	 * The operation id for the '<em>Get Non Checked In Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_MANAGER___GET_NON_CHECKED_IN_RESERVATION__LONG = HotelServicePackage.IRESERVATION_MANAGER___GET_NON_CHECKED_IN_RESERVATION__LONG;

	/**
	 * The operation id for the '<em>Set Number Of Guests For Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_MANAGER___SET_NUMBER_OF_GUESTS_FOR_RESERVATION__LONG_INT = HotelServicePackage.IRESERVATION_MANAGER___SET_NUMBER_OF_GUESTS_FOR_RESERVATION__LONG_INT;

	/**
	 * The operation id for the '<em>Check In Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_MANAGER___CHECK_IN_RESERVATION__LONG = HotelServicePackage.IRESERVATION_MANAGER___CHECK_IN_RESERVATION__LONG;

	/**
	 * The operation id for the '<em>Check Out Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_MANAGER___CHECK_OUT_RESERVATION__RESERVATION = HotelServicePackage.IRESERVATION_MANAGER___CHECK_OUT_RESERVATION__RESERVATION;

	/**
	 * The operation id for the '<em>Get Current Reservation By Room Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_MANAGER___GET_CURRENT_RESERVATION_BY_ROOM_NUMBER__INT = HotelServicePackage.IRESERVATION_MANAGER___GET_CURRENT_RESERVATION_BY_ROOM_NUMBER__INT;

	/**
	 * The number of operations of the '<em>Reservation Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_MANAGER_OPERATION_COUNT = HotelServicePackage.IRESERVATION_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link HotelSystem.PaymentMethod <em>Payment Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelSystem.PaymentMethod
	 * @see HotelSystem.impl.HotelSystemPackageImpl#getPaymentMethod()
	 * @generated
	 */
	int PAYMENT_METHOD = 19;


	/**
	 * Returns the meta object for class '{@link HotelSystem.Hotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel</em>'.
	 * @see HotelSystem.Hotel
	 * @generated
	 */
	EClass getHotel();

	/**
	 * Returns the meta object for class '{@link HotelSystem.Tab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab</em>'.
	 * @see HotelSystem.Tab
	 * @generated
	 */
	EClass getTab();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.Tab#getTabItems <em>Tab Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Items</em>'.
	 * @see HotelSystem.Tab#getTabItems()
	 * @see #getTab()
	 * @generated
	 */
	EAttribute getTab_TabItems();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Tab#addItemToTab(java.lang.String, double) <em>Add Item To Tab</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Item To Tab</em>' operation.
	 * @see HotelSystem.Tab#addItemToTab(java.lang.String, double)
	 * @generated
	 */
	EOperation getTab__AddItemToTab__String_double();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Tab#getTotalCost() <em>Get Total Cost</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Total Cost</em>' operation.
	 * @see HotelSystem.Tab#getTotalCost()
	 * @generated
	 */
	EOperation getTab__GetTotalCost();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Tab#removeTabItem(java.lang.String) <em>Remove Tab Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Tab Item</em>' operation.
	 * @see HotelSystem.Tab#removeTabItem(java.lang.String)
	 * @generated
	 */
	EOperation getTab__RemoveTabItem__String();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Tab#getAll() <em>Get All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All</em>' operation.
	 * @see HotelSystem.Tab#getAll()
	 * @generated
	 */
	EOperation getTab__GetAll();

	/**
	 * Returns the meta object for class '{@link HotelSystem.KeyCard <em>Key Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Card</em>'.
	 * @see HotelSystem.KeyCard
	 * @generated
	 */
	EClass getKeyCard();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.KeyCard#getKeyCardID <em>Key Card ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Card ID</em>'.
	 * @see HotelSystem.KeyCard#getKeyCardID()
	 * @see #getKeyCard()
	 * @generated
	 */
	EAttribute getKeyCard_KeyCardID();

	/**
	 * Returns the meta object for the '{@link HotelSystem.KeyCard#getID() <em>Get ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get ID</em>' operation.
	 * @see HotelSystem.KeyCard#getID()
	 * @generated
	 */
	EOperation getKeyCard__GetID();

	/**
	 * Returns the meta object for the '{@link HotelSystem.KeyCard#setID(int) <em>Set ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set ID</em>' operation.
	 * @see HotelSystem.KeyCard#setID(int)
	 * @generated
	 */
	EOperation getKeyCard__SetID__int();

	/**
	 * Returns the meta object for class '{@link HotelSystem.Equipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipment</em>'.
	 * @see HotelSystem.Equipment
	 * @generated
	 */
	EClass getEquipment();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.Equipment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see HotelSystem.Equipment#getName()
	 * @see #getEquipment()
	 * @generated
	 */
	EAttribute getEquipment_Name();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Equipment#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see HotelSystem.Equipment#getName()
	 * @generated
	 */
	EOperation getEquipment__GetName();

	/**
	 * Returns the meta object for class '{@link HotelSystem.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Type</em>'.
	 * @see HotelSystem.RoomType
	 * @generated
	 */
	EClass getRoomType();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.RoomType#getCostPerNight <em>Cost Per Night</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Per Night</em>'.
	 * @see HotelSystem.RoomType#getCostPerNight()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_CostPerNight();

	/**
	 * Returns the meta object for the '{@link HotelSystem.RoomType#getCostPerNight() <em>Get Cost Per Night</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cost Per Night</em>' operation.
	 * @see HotelSystem.RoomType#getCostPerNight()
	 * @generated
	 */
	EOperation getRoomType__GetCostPerNight();

	/**
	 * Returns the meta object for the '{@link HotelSystem.RoomType#setCostPerNight(double) <em>Set Cost Per Night</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Cost Per Night</em>' operation.
	 * @see HotelSystem.RoomType#setCostPerNight(double)
	 * @generated
	 */
	EOperation getRoomType__SetCostPerNight__double();

	/**
	 * Returns the meta object for class '{@link HotelSystem.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see HotelSystem.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.Room#getRoomNumber <em>Room Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Number</em>'.
	 * @see HotelSystem.Room#getRoomNumber()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_RoomNumber();

	/**
	 * Returns the meta object for the reference list '{@link HotelSystem.Room#getRoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room Type</em>'.
	 * @see HotelSystem.Room#getRoomType()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_RoomType();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.Room#isCleaned <em>Cleaned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cleaned</em>'.
	 * @see HotelSystem.Room#isCleaned()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Cleaned();

	/**
	 * Returns the meta object for the reference list '{@link HotelSystem.Room#getEquipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equipment</em>'.
	 * @see HotelSystem.Room#getEquipment()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Equipment();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Room#getRoomType() <em>Get Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Type</em>' operation.
	 * @see HotelSystem.Room#getRoomType()
	 * @generated
	 */
	EOperation getRoom__GetRoomType();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Room#addRoomType(HotelSystem.RoomType) <em>Add Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room Type</em>' operation.
	 * @see HotelSystem.Room#addRoomType(HotelSystem.RoomType)
	 * @generated
	 */
	EOperation getRoom__AddRoomType__RoomType();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Room#removeRoomType(HotelSystem.RoomType) <em>Remove Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room Type</em>' operation.
	 * @see HotelSystem.Room#removeRoomType(HotelSystem.RoomType)
	 * @generated
	 */
	EOperation getRoom__RemoveRoomType__RoomType();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Room#getEquipment() <em>Get Equipment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Equipment</em>' operation.
	 * @see HotelSystem.Room#getEquipment()
	 * @generated
	 */
	EOperation getRoom__GetEquipment();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Room#addEquipmentToRoom(java.lang.String) <em>Add Equipment To Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Equipment To Room</em>' operation.
	 * @see HotelSystem.Room#addEquipmentToRoom(java.lang.String)
	 * @generated
	 */
	EOperation getRoom__AddEquipmentToRoom__String();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Room#removeEquipmentItem(java.lang.String) <em>Remove Equipment Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Equipment Item</em>' operation.
	 * @see HotelSystem.Room#removeEquipmentItem(java.lang.String)
	 * @generated
	 */
	EOperation getRoom__RemoveEquipmentItem__String();

	/**
	 * Returns the meta object for class '{@link HotelSystem.ScheduledEvents <em>Scheduled Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduled Events</em>'.
	 * @see HotelSystem.ScheduledEvents
	 * @generated
	 */
	EClass getScheduledEvents();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.ScheduledEvents#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Events</em>'.
	 * @see HotelSystem.ScheduledEvents#getEvents()
	 * @see #getScheduledEvents()
	 * @generated
	 */
	EAttribute getScheduledEvents_Events();

	/**
	 * Returns the meta object for the '{@link HotelSystem.ScheduledEvents#addEvent(java.lang.String, long) <em>Add Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Event</em>' operation.
	 * @see HotelSystem.ScheduledEvents#addEvent(java.lang.String, long)
	 * @generated
	 */
	EOperation getScheduledEvents__AddEvent__String_long();

	/**
	 * Returns the meta object for the '{@link HotelSystem.ScheduledEvents#getEvents() <em>Get Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Events</em>' operation.
	 * @see HotelSystem.ScheduledEvents#getEvents()
	 * @generated
	 */
	EOperation getScheduledEvents__GetEvents();

	/**
	 * Returns the meta object for the '{@link HotelSystem.ScheduledEvents#updateEvent(java.lang.String, long) <em>Update Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Event</em>' operation.
	 * @see HotelSystem.ScheduledEvents#updateEvent(java.lang.String, long)
	 * @generated
	 */
	EOperation getScheduledEvents__UpdateEvent__String_long();

	/**
	 * Returns the meta object for the '{@link HotelSystem.ScheduledEvents#deleteEvent(java.lang.String) <em>Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Event</em>' operation.
	 * @see HotelSystem.ScheduledEvents#deleteEvent(java.lang.String)
	 * @generated
	 */
	EOperation getScheduledEvents__DeleteEvent__String();

	/**
	 * Returns the meta object for class '{@link HotelSystem.Bill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill</em>'.
	 * @see HotelSystem.Bill
	 * @generated
	 */
	EClass getBill();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.Bill#getPaid <em>Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paid</em>'.
	 * @see HotelSystem.Bill#getPaid()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_Paid();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.Bill#getGrandTotal <em>Grand Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grand Total</em>'.
	 * @see HotelSystem.Bill#getGrandTotal()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_GrandTotal();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Bill#addToBill(double) <em>Add To Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add To Bill</em>' operation.
	 * @see HotelSystem.Bill#addToBill(double)
	 * @generated
	 */
	EOperation getBill__AddToBill__double();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Bill#isPaid() <em>Is Paid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Paid</em>' operation.
	 * @see HotelSystem.Bill#isPaid()
	 * @generated
	 */
	EOperation getBill__IsPaid();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Bill#removeFromBill(double) <em>Remove From Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove From Bill</em>' operation.
	 * @see HotelSystem.Bill#removeFromBill(double)
	 * @generated
	 */
	EOperation getBill__RemoveFromBill__double();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Bill#leftToPay() <em>Left To Pay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Left To Pay</em>' operation.
	 * @see HotelSystem.Bill#leftToPay()
	 * @generated
	 */
	EOperation getBill__LeftToPay();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Bill#pay(double) <em>Pay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay</em>' operation.
	 * @see HotelSystem.Bill#pay(double)
	 * @generated
	 */
	EOperation getBill__Pay__double();

	/**
	 * Returns the meta object for class '{@link HotelSystem.SleepRoom <em>Sleep Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sleep Room</em>'.
	 * @see HotelSystem.SleepRoom
	 * @generated
	 */
	EClass getSleepRoom();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.SleepRoom#getNbrOfBeds <em>Nbr Of Beds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nbr Of Beds</em>'.
	 * @see HotelSystem.SleepRoom#getNbrOfBeds()
	 * @see #getSleepRoom()
	 * @generated
	 */
	EAttribute getSleepRoom_NbrOfBeds();

	/**
	 * Returns the meta object for the '{@link HotelSystem.SleepRoom#getNbrOfBeds() <em>Get Nbr Of Beds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nbr Of Beds</em>' operation.
	 * @see HotelSystem.SleepRoom#getNbrOfBeds()
	 * @generated
	 */
	EOperation getSleepRoom__GetNbrOfBeds();

	/**
	 * Returns the meta object for the '{@link HotelSystem.SleepRoom#setNbrOfBeds(int) <em>Set Nbr Of Beds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Nbr Of Beds</em>' operation.
	 * @see HotelSystem.SleepRoom#setNbrOfBeds(int)
	 * @generated
	 */
	EOperation getSleepRoom__SetNbrOfBeds__int();

	/**
	 * Returns the meta object for class '{@link HotelSystem.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see HotelSystem.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.Customer#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see HotelSystem.Customer#getId()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Id();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.Customer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see HotelSystem.Customer#getName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Name();

	/**
	 * Returns the meta object for the reference '{@link HotelSystem.Customer#getPaymentDetails <em>Payment Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Details</em>'.
	 * @see HotelSystem.Customer#getPaymentDetails()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_PaymentDetails();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.Customer#getLoyaltyPoints <em>Loyalty Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loyalty Points</em>'.
	 * @see HotelSystem.Customer#getLoyaltyPoints()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_LoyaltyPoints();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Customer#getId() <em>Get Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Id</em>' operation.
	 * @see HotelSystem.Customer#getId()
	 * @generated
	 */
	EOperation getCustomer__GetId();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Customer#setId(java.lang.String) <em>Set Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Id</em>' operation.
	 * @see HotelSystem.Customer#setId(java.lang.String)
	 * @generated
	 */
	EOperation getCustomer__SetId__String();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Customer#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see HotelSystem.Customer#getName()
	 * @generated
	 */
	EOperation getCustomer__GetName();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Customer#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see HotelSystem.Customer#setName(java.lang.String)
	 * @generated
	 */
	EOperation getCustomer__SetName__String();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Customer#getLoyaltyPoints() <em>Get Loyalty Points</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Loyalty Points</em>' operation.
	 * @see HotelSystem.Customer#getLoyaltyPoints()
	 * @generated
	 */
	EOperation getCustomer__GetLoyaltyPoints();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Customer#addLoyaltyPoints(int) <em>Add Loyalty Points</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Loyalty Points</em>' operation.
	 * @see HotelSystem.Customer#addLoyaltyPoints(int)
	 * @generated
	 */
	EOperation getCustomer__AddLoyaltyPoints__int();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Customer#removeLoyaltyPoints(int) <em>Remove Loyalty Points</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Loyalty Points</em>' operation.
	 * @see HotelSystem.Customer#removeLoyaltyPoints(int)
	 * @generated
	 */
	EOperation getCustomer__RemoveLoyaltyPoints__int();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Customer#getPaymentDetails() <em>Get Payment Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Payment Details</em>' operation.
	 * @see HotelSystem.Customer#getPaymentDetails()
	 * @generated
	 */
	EOperation getCustomer__GetPaymentDetails();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Customer#setPaymentDetails(HotelSystem.PaymentDetails) <em>Set Payment Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Payment Details</em>' operation.
	 * @see HotelSystem.Customer#setPaymentDetails(HotelSystem.PaymentDetails)
	 * @generated
	 */
	EOperation getCustomer__SetPaymentDetails__PaymentDetails();

	/**
	 * Returns the meta object for class '{@link HotelSystem.PaymentDetails <em>Payment Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Details</em>'.
	 * @see HotelSystem.PaymentDetails
	 * @generated
	 */
	EClass getPaymentDetails();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.PaymentDetails#getCcNumber <em>Cc Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Number</em>'.
	 * @see HotelSystem.PaymentDetails#getCcNumber()
	 * @see #getPaymentDetails()
	 * @generated
	 */
	EAttribute getPaymentDetails_CcNumber();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.PaymentDetails#getCcv <em>Ccv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ccv</em>'.
	 * @see HotelSystem.PaymentDetails#getCcv()
	 * @see #getPaymentDetails()
	 * @generated
	 */
	EAttribute getPaymentDetails_Ccv();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.PaymentDetails#getExpiryMonth <em>Expiry Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Month</em>'.
	 * @see HotelSystem.PaymentDetails#getExpiryMonth()
	 * @see #getPaymentDetails()
	 * @generated
	 */
	EAttribute getPaymentDetails_ExpiryMonth();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.PaymentDetails#getExpiryYear <em>Expiry Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Year</em>'.
	 * @see HotelSystem.PaymentDetails#getExpiryYear()
	 * @see #getPaymentDetails()
	 * @generated
	 */
	EAttribute getPaymentDetails_ExpiryYear();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.PaymentDetails#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see HotelSystem.PaymentDetails#getFirstName()
	 * @see #getPaymentDetails()
	 * @generated
	 */
	EAttribute getPaymentDetails_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.PaymentDetails#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see HotelSystem.PaymentDetails#getLastName()
	 * @see #getPaymentDetails()
	 * @generated
	 */
	EAttribute getPaymentDetails_LastName();

	/**
	 * Returns the meta object for the '{@link HotelSystem.PaymentDetails#getCcNumber() <em>Get Cc Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cc Number</em>' operation.
	 * @see HotelSystem.PaymentDetails#getCcNumber()
	 * @generated
	 */
	EOperation getPaymentDetails__GetCcNumber();

	/**
	 * Returns the meta object for the '{@link HotelSystem.PaymentDetails#setCcNumber(java.lang.String) <em>Set Cc Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Cc Number</em>' operation.
	 * @see HotelSystem.PaymentDetails#setCcNumber(java.lang.String)
	 * @generated
	 */
	EOperation getPaymentDetails__SetCcNumber__String();

	/**
	 * Returns the meta object for the '{@link HotelSystem.PaymentDetails#getCcV() <em>Get Cc V</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cc V</em>' operation.
	 * @see HotelSystem.PaymentDetails#getCcV()
	 * @generated
	 */
	EOperation getPaymentDetails__GetCcV();

	/**
	 * Returns the meta object for the '{@link HotelSystem.PaymentDetails#setCcv(java.lang.String) <em>Set Ccv</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Ccv</em>' operation.
	 * @see HotelSystem.PaymentDetails#setCcv(java.lang.String)
	 * @generated
	 */
	EOperation getPaymentDetails__SetCcv__String();

	/**
	 * Returns the meta object for the '{@link HotelSystem.PaymentDetails#getExpiryMonth() <em>Get Expiry Month</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expiry Month</em>' operation.
	 * @see HotelSystem.PaymentDetails#getExpiryMonth()
	 * @generated
	 */
	EOperation getPaymentDetails__GetExpiryMonth();

	/**
	 * Returns the meta object for the '{@link HotelSystem.PaymentDetails#setExpiryMonth(int) <em>Set Expiry Month</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Expiry Month</em>' operation.
	 * @see HotelSystem.PaymentDetails#setExpiryMonth(int)
	 * @generated
	 */
	EOperation getPaymentDetails__SetExpiryMonth__int();

	/**
	 * Returns the meta object for the '{@link HotelSystem.PaymentDetails#setExpiryYear(int) <em>Set Expiry Year</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Expiry Year</em>' operation.
	 * @see HotelSystem.PaymentDetails#setExpiryYear(int)
	 * @generated
	 */
	EOperation getPaymentDetails__SetExpiryYear__int();

	/**
	 * Returns the meta object for the '{@link HotelSystem.PaymentDetails#getExpiryYear() <em>Get Expiry Year</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expiry Year</em>' operation.
	 * @see HotelSystem.PaymentDetails#getExpiryYear()
	 * @generated
	 */
	EOperation getPaymentDetails__GetExpiryYear();

	/**
	 * Returns the meta object for the '{@link HotelSystem.PaymentDetails#getFirstName() <em>Get First Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get First Name</em>' operation.
	 * @see HotelSystem.PaymentDetails#getFirstName()
	 * @generated
	 */
	EOperation getPaymentDetails__GetFirstName();

	/**
	 * Returns the meta object for the '{@link HotelSystem.PaymentDetails#setFirstName(java.lang.String) <em>Set First Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set First Name</em>' operation.
	 * @see HotelSystem.PaymentDetails#setFirstName(java.lang.String)
	 * @generated
	 */
	EOperation getPaymentDetails__SetFirstName__String();

	/**
	 * Returns the meta object for the '{@link HotelSystem.PaymentDetails#setLastName(java.lang.String) <em>Set Last Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Last Name</em>' operation.
	 * @see HotelSystem.PaymentDetails#setLastName(java.lang.String)
	 * @generated
	 */
	EOperation getPaymentDetails__SetLastName__String();

	/**
	 * Returns the meta object for the '{@link HotelSystem.PaymentDetails#getLastName() <em>Get Last Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Last Name</em>' operation.
	 * @see HotelSystem.PaymentDetails#getLastName()
	 * @generated
	 */
	EOperation getPaymentDetails__GetLastName();

	/**
	 * Returns the meta object for class '{@link HotelSystem.Reservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation</em>'.
	 * @see HotelSystem.Reservation
	 * @generated
	 */
	EClass getReservation();

	/**
	 * Returns the meta object for the reference '{@link HotelSystem.Reservation#getTab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tab</em>'.
	 * @see HotelSystem.Reservation#getTab()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Tab();

	/**
	 * Returns the meta object for the reference list '{@link HotelSystem.Reservation#getKeyCard <em>Key Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Key Card</em>'.
	 * @see HotelSystem.Reservation#getKeyCard()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_KeyCard();

	/**
	 * Returns the meta object for the reference '{@link HotelSystem.Reservation#getScheduledEvents <em>Scheduled Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scheduled Events</em>'.
	 * @see HotelSystem.Reservation#getScheduledEvents()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_ScheduledEvents();

	/**
	 * Returns the meta object for the reference '{@link HotelSystem.Reservation#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see HotelSystem.Reservation#getRoom()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Room();

	/**
	 * Returns the meta object for the reference list '{@link HotelSystem.Reservation#getCostCategory <em>Cost Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cost Category</em>'.
	 * @see HotelSystem.Reservation#getCostCategory()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_CostCategory();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.Reservation#getCheckedIn <em>Checked In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked In</em>'.
	 * @see HotelSystem.Reservation#getCheckedIn()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_CheckedIn();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.Reservation#getCheckedOut <em>Checked Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked Out</em>'.
	 * @see HotelSystem.Reservation#getCheckedOut()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_CheckedOut();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.Reservation#getStartDay <em>Start Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Day</em>'.
	 * @see HotelSystem.Reservation#getStartDay()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_StartDay();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.Reservation#getEndDay <em>End Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Day</em>'.
	 * @see HotelSystem.Reservation#getEndDay()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_EndDay();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.Reservation#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Responsible</em>'.
	 * @see HotelSystem.Reservation#getResponsible()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_Responsible();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.Reservation#getNumberOfGuests <em>Number Of Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Guests</em>'.
	 * @see HotelSystem.Reservation#getNumberOfGuests()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_NumberOfGuests();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Reservation#getCheckedIn() <em>Get Checked In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Checked In</em>' operation.
	 * @see HotelSystem.Reservation#getCheckedIn()
	 * @generated
	 */
	EOperation getReservation__GetCheckedIn();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Reservation#setCheckedIn(long) <em>Set Checked In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Checked In</em>' operation.
	 * @see HotelSystem.Reservation#setCheckedIn(long)
	 * @generated
	 */
	EOperation getReservation__SetCheckedIn__long();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Reservation#getCheckedOut() <em>Get Checked Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Checked Out</em>' operation.
	 * @see HotelSystem.Reservation#getCheckedOut()
	 * @generated
	 */
	EOperation getReservation__GetCheckedOut();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Reservation#setCheckedOut(long) <em>Set Checked Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Checked Out</em>' operation.
	 * @see HotelSystem.Reservation#setCheckedOut(long)
	 * @generated
	 */
	EOperation getReservation__SetCheckedOut__long();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Reservation#setStartDay(long) <em>Set Start Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Start Day</em>' operation.
	 * @see HotelSystem.Reservation#setStartDay(long)
	 * @generated
	 */
	EOperation getReservation__SetStartDay__long();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Reservation#getStartDay() <em>Get Start Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Start Day</em>' operation.
	 * @see HotelSystem.Reservation#getStartDay()
	 * @generated
	 */
	EOperation getReservation__GetStartDay();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Reservation#setEndDay(long) <em>Set End Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set End Day</em>' operation.
	 * @see HotelSystem.Reservation#setEndDay(long)
	 * @generated
	 */
	EOperation getReservation__SetEndDay__long();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Reservation#getEndDay() <em>Get End Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get End Day</em>' operation.
	 * @see HotelSystem.Reservation#getEndDay()
	 * @generated
	 */
	EOperation getReservation__GetEndDay();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Reservation#getResponsible() <em>Get Responsible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Responsible</em>' operation.
	 * @see HotelSystem.Reservation#getResponsible()
	 * @generated
	 */
	EOperation getReservation__GetResponsible();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Reservation#setResponsible(java.lang.String) <em>Set Responsible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Responsible</em>' operation.
	 * @see HotelSystem.Reservation#setResponsible(java.lang.String)
	 * @generated
	 */
	EOperation getReservation__SetResponsible__String();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Reservation#getNumberOfGuests() <em>Get Number Of Guests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Number Of Guests</em>' operation.
	 * @see HotelSystem.Reservation#getNumberOfGuests()
	 * @generated
	 */
	EOperation getReservation__GetNumberOfGuests();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Reservation#setNumberOfGuests(int) <em>Set Number Of Guests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Number Of Guests</em>' operation.
	 * @see HotelSystem.Reservation#setNumberOfGuests(int)
	 * @generated
	 */
	EOperation getReservation__SetNumberOfGuests__int();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Reservation#getRoom() <em>Get Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room</em>' operation.
	 * @see HotelSystem.Reservation#getRoom()
	 * @generated
	 */
	EOperation getReservation__GetRoom();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Reservation#setRoom(HotelSystem.Room) <em>Set Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Room</em>' operation.
	 * @see HotelSystem.Reservation#setRoom(HotelSystem.Room)
	 * @generated
	 */
	EOperation getReservation__SetRoom__Room();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Reservation#getCostCategory() <em>Get Cost Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cost Category</em>' operation.
	 * @see HotelSystem.Reservation#getCostCategory()
	 * @generated
	 */
	EOperation getReservation__GetCostCategory();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Reservation#addCostCategory(HotelSystem.RoomType) <em>Add Cost Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Cost Category</em>' operation.
	 * @see HotelSystem.Reservation#addCostCategory(HotelSystem.RoomType)
	 * @generated
	 */
	EOperation getReservation__AddCostCategory__RoomType();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Reservation#getEvents() <em>Get Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Events</em>' operation.
	 * @see HotelSystem.Reservation#getEvents()
	 * @generated
	 */
	EOperation getReservation__GetEvents();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Reservation#removeAllEvents() <em>Remove All Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove All Events</em>' operation.
	 * @see HotelSystem.Reservation#removeAllEvents()
	 * @generated
	 */
	EOperation getReservation__RemoveAllEvents();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Reservation#getKeyCards() <em>Get Key Cards</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Key Cards</em>' operation.
	 * @see HotelSystem.Reservation#getKeyCards()
	 * @generated
	 */
	EOperation getReservation__GetKeyCards();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Reservation#addKeyCard(HotelSystem.KeyCard) <em>Add Key Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Key Card</em>' operation.
	 * @see HotelSystem.Reservation#addKeyCard(HotelSystem.KeyCard)
	 * @generated
	 */
	EOperation getReservation__AddKeyCard__KeyCard();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Reservation#removeKeyCard(HotelSystem.KeyCard) <em>Remove Key Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Key Card</em>' operation.
	 * @see HotelSystem.Reservation#removeKeyCard(HotelSystem.KeyCard)
	 * @generated
	 */
	EOperation getReservation__RemoveKeyCard__KeyCard();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Reservation#removeCostCategory(HotelSystem.RoomType) <em>Remove Cost Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Cost Category</em>' operation.
	 * @see HotelSystem.Reservation#removeCostCategory(HotelSystem.RoomType)
	 * @generated
	 */
	EOperation getReservation__RemoveCostCategory__RoomType();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Reservation#getTab() <em>Get Tab</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tab</em>' operation.
	 * @see HotelSystem.Reservation#getTab()
	 * @generated
	 */
	EOperation getReservation__GetTab();

	/**
	 * Returns the meta object for class '{@link HotelSystem.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see HotelSystem.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the reference '{@link HotelSystem.Booking#getBill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bill</em>'.
	 * @see HotelSystem.Booking#getBill()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Bill();

	/**
	 * Returns the meta object for the reference '{@link HotelSystem.Booking#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see HotelSystem.Booking#getCustomer()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Customer();

	/**
	 * Returns the meta object for the reference list '{@link HotelSystem.Booking#getReservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reservation</em>'.
	 * @see HotelSystem.Booking#getReservation()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Reservation();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.Booking#getBookingNbr <em>Booking Nbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Nbr</em>'.
	 * @see HotelSystem.Booking#getBookingNbr()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_BookingNbr();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Booking#getBookingNbr() <em>Get Booking Nbr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking Nbr</em>' operation.
	 * @see HotelSystem.Booking#getBookingNbr()
	 * @generated
	 */
	EOperation getBooking__GetBookingNbr();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Booking#getReservations() <em>Get Reservations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Reservations</em>' operation.
	 * @see HotelSystem.Booking#getReservations()
	 * @generated
	 */
	EOperation getBooking__GetReservations();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Booking#addReservation(HotelSystem.Reservation) <em>Add Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Reservation</em>' operation.
	 * @see HotelSystem.Booking#addReservation(HotelSystem.Reservation)
	 * @generated
	 */
	EOperation getBooking__AddReservation__Reservation();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Booking#removeReservation(HotelSystem.Reservation) <em>Remove Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Reservation</em>' operation.
	 * @see HotelSystem.Booking#removeReservation(HotelSystem.Reservation)
	 * @generated
	 */
	EOperation getBooking__RemoveReservation__Reservation();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Booking#getCustomer() <em>Get Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Customer</em>' operation.
	 * @see HotelSystem.Booking#getCustomer()
	 * @generated
	 */
	EOperation getBooking__GetCustomer();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Booking#changeCustomer(HotelSystem.Customer) <em>Change Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Customer</em>' operation.
	 * @see HotelSystem.Booking#changeCustomer(HotelSystem.Customer)
	 * @generated
	 */
	EOperation getBooking__ChangeCustomer__Customer();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Booking#getBill() <em>Get Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bill</em>' operation.
	 * @see HotelSystem.Booking#getBill()
	 * @generated
	 */
	EOperation getBooking__GetBill();

	/**
	 * Returns the meta object for the '{@link HotelSystem.Booking#setCustomer(HotelSystem.Customer) <em>Set Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Customer</em>' operation.
	 * @see HotelSystem.Booking#setCustomer(HotelSystem.Customer)
	 * @generated
	 */
	EOperation getBooking__SetCustomer__Customer();

	/**
	 * Returns the meta object for class '{@link HotelSystem.ConferenceRoom <em>Conference Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conference Room</em>'.
	 * @see HotelSystem.ConferenceRoom
	 * @generated
	 */
	EClass getConferenceRoom();

	/**
	 * Returns the meta object for the attribute '{@link HotelSystem.ConferenceRoom#getMaxNbrOfPeople <em>Max Nbr Of People</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Nbr Of People</em>'.
	 * @see HotelSystem.ConferenceRoom#getMaxNbrOfPeople()
	 * @see #getConferenceRoom()
	 * @generated
	 */
	EAttribute getConferenceRoom_MaxNbrOfPeople();

	/**
	 * Returns the meta object for the '{@link HotelSystem.ConferenceRoom#getNbrOfPeople() <em>Get Nbr Of People</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nbr Of People</em>' operation.
	 * @see HotelSystem.ConferenceRoom#getNbrOfPeople()
	 * @generated
	 */
	EOperation getConferenceRoom__GetNbrOfPeople();

	/**
	 * Returns the meta object for class '{@link HotelSystem.CustomerManager <em>Customer Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Manager</em>'.
	 * @see HotelSystem.CustomerManager
	 * @generated
	 */
	EClass getCustomerManager();

	/**
	 * Returns the meta object for the reference list '{@link HotelSystem.CustomerManager#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer</em>'.
	 * @see HotelSystem.CustomerManager#getCustomer()
	 * @see #getCustomerManager()
	 * @generated
	 */
	EReference getCustomerManager_Customer();

	/**
	 * Returns the meta object for class '{@link HotelSystem.RoomTypeManager <em>Room Type Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Type Manager</em>'.
	 * @see HotelSystem.RoomTypeManager
	 * @generated
	 */
	EClass getRoomTypeManager();

	/**
	 * Returns the meta object for the reference list '{@link HotelSystem.RoomTypeManager#getRoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room Type</em>'.
	 * @see HotelSystem.RoomTypeManager#getRoomType()
	 * @see #getRoomTypeManager()
	 * @generated
	 */
	EReference getRoomTypeManager_RoomType();

	/**
	 * Returns the meta object for class '{@link HotelSystem.BookingManager <em>Booking Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Manager</em>'.
	 * @see HotelSystem.BookingManager
	 * @generated
	 */
	EClass getBookingManager();

	/**
	 * Returns the meta object for the reference list '{@link HotelSystem.BookingManager#getBooking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Booking</em>'.
	 * @see HotelSystem.BookingManager#getBooking()
	 * @see #getBookingManager()
	 * @generated
	 */
	EReference getBookingManager_Booking();

	/**
	 * Returns the meta object for class '{@link HotelSystem.RoomManager <em>Room Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Manager</em>'.
	 * @see HotelSystem.RoomManager
	 * @generated
	 */
	EClass getRoomManager();

	/**
	 * Returns the meta object for the reference list '{@link HotelSystem.RoomManager#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room</em>'.
	 * @see HotelSystem.RoomManager#getRoom()
	 * @see #getRoomManager()
	 * @generated
	 */
	EReference getRoomManager_Room();

	/**
	 * Returns the meta object for class '{@link HotelSystem.ReservationManager <em>Reservation Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation Manager</em>'.
	 * @see HotelSystem.ReservationManager
	 * @generated
	 */
	EClass getReservationManager();

	/**
	 * Returns the meta object for the reference list '{@link HotelSystem.ReservationManager#getReservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reservation</em>'.
	 * @see HotelSystem.ReservationManager#getReservation()
	 * @see #getReservationManager()
	 * @generated
	 */
	EReference getReservationManager_Reservation();

	/**
	 * Returns the meta object for enum '{@link HotelSystem.PaymentMethod <em>Payment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Method</em>'.
	 * @see HotelSystem.PaymentMethod
	 * @generated
	 */
	EEnum getPaymentMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HotelSystemFactory getHotelSystemFactory();

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
		 * The meta object literal for the '{@link HotelSystem.impl.HotelImpl <em>Hotel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelSystem.impl.HotelImpl
		 * @see HotelSystem.impl.HotelSystemPackageImpl#getHotel()
		 * @generated
		 */
		EClass HOTEL = eINSTANCE.getHotel();

		/**
		 * The meta object literal for the '{@link HotelSystem.impl.TabImpl <em>Tab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelSystem.impl.TabImpl
		 * @see HotelSystem.impl.HotelSystemPackageImpl#getTab()
		 * @generated
		 */
		EClass TAB = eINSTANCE.getTab();

		/**
		 * The meta object literal for the '<em><b>Tab Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAB__TAB_ITEMS = eINSTANCE.getTab_TabItems();

		/**
		 * The meta object literal for the '<em><b>Add Item To Tab</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TAB___ADD_ITEM_TO_TAB__STRING_DOUBLE = eINSTANCE.getTab__AddItemToTab__String_double();

		/**
		 * The meta object literal for the '<em><b>Get Total Cost</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TAB___GET_TOTAL_COST = eINSTANCE.getTab__GetTotalCost();

		/**
		 * The meta object literal for the '<em><b>Remove Tab Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TAB___REMOVE_TAB_ITEM__STRING = eINSTANCE.getTab__RemoveTabItem__String();

		/**
		 * The meta object literal for the '<em><b>Get All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TAB___GET_ALL = eINSTANCE.getTab__GetAll();

		/**
		 * The meta object literal for the '{@link HotelSystem.impl.KeyCardImpl <em>Key Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelSystem.impl.KeyCardImpl
		 * @see HotelSystem.impl.HotelSystemPackageImpl#getKeyCard()
		 * @generated
		 */
		EClass KEY_CARD = eINSTANCE.getKeyCard();

		/**
		 * The meta object literal for the '<em><b>Key Card ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_CARD__KEY_CARD_ID = eINSTANCE.getKeyCard_KeyCardID();

		/**
		 * The meta object literal for the '<em><b>Get ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KEY_CARD___GET_ID = eINSTANCE.getKeyCard__GetID();

		/**
		 * The meta object literal for the '<em><b>Set ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KEY_CARD___SET_ID__INT = eINSTANCE.getKeyCard__SetID__int();

		/**
		 * The meta object literal for the '{@link HotelSystem.impl.EquipmentImpl <em>Equipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelSystem.impl.EquipmentImpl
		 * @see HotelSystem.impl.HotelSystemPackageImpl#getEquipment()
		 * @generated
		 */
		EClass EQUIPMENT = eINSTANCE.getEquipment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPMENT__NAME = eINSTANCE.getEquipment_Name();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EQUIPMENT___GET_NAME = eINSTANCE.getEquipment__GetName();

		/**
		 * The meta object literal for the '{@link HotelSystem.impl.RoomTypeImpl <em>Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelSystem.impl.RoomTypeImpl
		 * @see HotelSystem.impl.HotelSystemPackageImpl#getRoomType()
		 * @generated
		 */
		EClass ROOM_TYPE = eINSTANCE.getRoomType();

		/**
		 * The meta object literal for the '<em><b>Cost Per Night</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__COST_PER_NIGHT = eINSTANCE.getRoomType_CostPerNight();

		/**
		 * The meta object literal for the '<em><b>Get Cost Per Night</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_TYPE___GET_COST_PER_NIGHT = eINSTANCE.getRoomType__GetCostPerNight();

		/**
		 * The meta object literal for the '<em><b>Set Cost Per Night</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_TYPE___SET_COST_PER_NIGHT__DOUBLE = eINSTANCE.getRoomType__SetCostPerNight__double();

		/**
		 * The meta object literal for the '{@link HotelSystem.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelSystem.impl.RoomImpl
		 * @see HotelSystem.impl.HotelSystemPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Room Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__ROOM_NUMBER = eINSTANCE.getRoom_RoomNumber();

		/**
		 * The meta object literal for the '<em><b>Room Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ROOM_TYPE = eINSTANCE.getRoom_RoomType();

		/**
		 * The meta object literal for the '<em><b>Cleaned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__CLEANED = eINSTANCE.getRoom_Cleaned();

		/**
		 * The meta object literal for the '<em><b>Equipment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__EQUIPMENT = eINSTANCE.getRoom_Equipment();

		/**
		 * The meta object literal for the '<em><b>Get Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___GET_ROOM_TYPE = eINSTANCE.getRoom__GetRoomType();

		/**
		 * The meta object literal for the '<em><b>Add Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___ADD_ROOM_TYPE__ROOMTYPE = eINSTANCE.getRoom__AddRoomType__RoomType();

		/**
		 * The meta object literal for the '<em><b>Remove Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___REMOVE_ROOM_TYPE__ROOMTYPE = eINSTANCE.getRoom__RemoveRoomType__RoomType();

		/**
		 * The meta object literal for the '<em><b>Get Equipment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___GET_EQUIPMENT = eINSTANCE.getRoom__GetEquipment();

		/**
		 * The meta object literal for the '<em><b>Add Equipment To Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___ADD_EQUIPMENT_TO_ROOM__STRING = eINSTANCE.getRoom__AddEquipmentToRoom__String();

		/**
		 * The meta object literal for the '<em><b>Remove Equipment Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___REMOVE_EQUIPMENT_ITEM__STRING = eINSTANCE.getRoom__RemoveEquipmentItem__String();

		/**
		 * The meta object literal for the '{@link HotelSystem.impl.ScheduledEventsImpl <em>Scheduled Events</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelSystem.impl.ScheduledEventsImpl
		 * @see HotelSystem.impl.HotelSystemPackageImpl#getScheduledEvents()
		 * @generated
		 */
		EClass SCHEDULED_EVENTS = eINSTANCE.getScheduledEvents();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_EVENTS__EVENTS = eINSTANCE.getScheduledEvents_Events();

		/**
		 * The meta object literal for the '<em><b>Add Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHEDULED_EVENTS___ADD_EVENT__STRING_LONG = eINSTANCE.getScheduledEvents__AddEvent__String_long();

		/**
		 * The meta object literal for the '<em><b>Get Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHEDULED_EVENTS___GET_EVENTS = eINSTANCE.getScheduledEvents__GetEvents();

		/**
		 * The meta object literal for the '<em><b>Update Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHEDULED_EVENTS___UPDATE_EVENT__STRING_LONG = eINSTANCE.getScheduledEvents__UpdateEvent__String_long();

		/**
		 * The meta object literal for the '<em><b>Delete Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHEDULED_EVENTS___DELETE_EVENT__STRING = eINSTANCE.getScheduledEvents__DeleteEvent__String();

		/**
		 * The meta object literal for the '{@link HotelSystem.impl.BillImpl <em>Bill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelSystem.impl.BillImpl
		 * @see HotelSystem.impl.HotelSystemPackageImpl#getBill()
		 * @generated
		 */
		EClass BILL = eINSTANCE.getBill();

		/**
		 * The meta object literal for the '<em><b>Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__PAID = eINSTANCE.getBill_Paid();

		/**
		 * The meta object literal for the '<em><b>Grand Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__GRAND_TOTAL = eINSTANCE.getBill_GrandTotal();

		/**
		 * The meta object literal for the '<em><b>Add To Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL___ADD_TO_BILL__DOUBLE = eINSTANCE.getBill__AddToBill__double();

		/**
		 * The meta object literal for the '<em><b>Is Paid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL___IS_PAID = eINSTANCE.getBill__IsPaid();

		/**
		 * The meta object literal for the '<em><b>Remove From Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL___REMOVE_FROM_BILL__DOUBLE = eINSTANCE.getBill__RemoveFromBill__double();

		/**
		 * The meta object literal for the '<em><b>Left To Pay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL___LEFT_TO_PAY = eINSTANCE.getBill__LeftToPay();

		/**
		 * The meta object literal for the '<em><b>Pay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL___PAY__DOUBLE = eINSTANCE.getBill__Pay__double();

		/**
		 * The meta object literal for the '{@link HotelSystem.impl.SleepRoomImpl <em>Sleep Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelSystem.impl.SleepRoomImpl
		 * @see HotelSystem.impl.HotelSystemPackageImpl#getSleepRoom()
		 * @generated
		 */
		EClass SLEEP_ROOM = eINSTANCE.getSleepRoom();

		/**
		 * The meta object literal for the '<em><b>Nbr Of Beds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLEEP_ROOM__NBR_OF_BEDS = eINSTANCE.getSleepRoom_NbrOfBeds();

		/**
		 * The meta object literal for the '<em><b>Get Nbr Of Beds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SLEEP_ROOM___GET_NBR_OF_BEDS = eINSTANCE.getSleepRoom__GetNbrOfBeds();

		/**
		 * The meta object literal for the '<em><b>Set Nbr Of Beds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SLEEP_ROOM___SET_NBR_OF_BEDS__INT = eINSTANCE.getSleepRoom__SetNbrOfBeds__int();

		/**
		 * The meta object literal for the '{@link HotelSystem.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelSystem.impl.CustomerImpl
		 * @see HotelSystem.impl.HotelSystemPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__ID = eINSTANCE.getCustomer_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__NAME = eINSTANCE.getCustomer_Name();

		/**
		 * The meta object literal for the '<em><b>Payment Details</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__PAYMENT_DETAILS = eINSTANCE.getCustomer_PaymentDetails();

		/**
		 * The meta object literal for the '<em><b>Loyalty Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__LOYALTY_POINTS = eINSTANCE.getCustomer_LoyaltyPoints();

		/**
		 * The meta object literal for the '<em><b>Get Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___GET_ID = eINSTANCE.getCustomer__GetId();

		/**
		 * The meta object literal for the '<em><b>Set Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___SET_ID__STRING = eINSTANCE.getCustomer__SetId__String();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___GET_NAME = eINSTANCE.getCustomer__GetName();

		/**
		 * The meta object literal for the '<em><b>Set Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___SET_NAME__STRING = eINSTANCE.getCustomer__SetName__String();

		/**
		 * The meta object literal for the '<em><b>Get Loyalty Points</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___GET_LOYALTY_POINTS = eINSTANCE.getCustomer__GetLoyaltyPoints();

		/**
		 * The meta object literal for the '<em><b>Add Loyalty Points</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___ADD_LOYALTY_POINTS__INT = eINSTANCE.getCustomer__AddLoyaltyPoints__int();

		/**
		 * The meta object literal for the '<em><b>Remove Loyalty Points</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___REMOVE_LOYALTY_POINTS__INT = eINSTANCE.getCustomer__RemoveLoyaltyPoints__int();

		/**
		 * The meta object literal for the '<em><b>Get Payment Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___GET_PAYMENT_DETAILS = eINSTANCE.getCustomer__GetPaymentDetails();

		/**
		 * The meta object literal for the '<em><b>Set Payment Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___SET_PAYMENT_DETAILS__PAYMENTDETAILS = eINSTANCE.getCustomer__SetPaymentDetails__PaymentDetails();

		/**
		 * The meta object literal for the '{@link HotelSystem.impl.PaymentDetailsImpl <em>Payment Details</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelSystem.impl.PaymentDetailsImpl
		 * @see HotelSystem.impl.HotelSystemPackageImpl#getPaymentDetails()
		 * @generated
		 */
		EClass PAYMENT_DETAILS = eINSTANCE.getPaymentDetails();

		/**
		 * The meta object literal for the '<em><b>Cc Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DETAILS__CC_NUMBER = eINSTANCE.getPaymentDetails_CcNumber();

		/**
		 * The meta object literal for the '<em><b>Ccv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DETAILS__CCV = eINSTANCE.getPaymentDetails_Ccv();

		/**
		 * The meta object literal for the '<em><b>Expiry Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DETAILS__EXPIRY_MONTH = eINSTANCE.getPaymentDetails_ExpiryMonth();

		/**
		 * The meta object literal for the '<em><b>Expiry Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DETAILS__EXPIRY_YEAR = eINSTANCE.getPaymentDetails_ExpiryYear();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DETAILS__FIRST_NAME = eINSTANCE.getPaymentDetails_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DETAILS__LAST_NAME = eINSTANCE.getPaymentDetails_LastName();

		/**
		 * The meta object literal for the '<em><b>Get Cc Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_DETAILS___GET_CC_NUMBER = eINSTANCE.getPaymentDetails__GetCcNumber();

		/**
		 * The meta object literal for the '<em><b>Set Cc Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_DETAILS___SET_CC_NUMBER__STRING = eINSTANCE.getPaymentDetails__SetCcNumber__String();

		/**
		 * The meta object literal for the '<em><b>Get Cc V</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_DETAILS___GET_CC_V = eINSTANCE.getPaymentDetails__GetCcV();

		/**
		 * The meta object literal for the '<em><b>Set Ccv</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_DETAILS___SET_CCV__STRING = eINSTANCE.getPaymentDetails__SetCcv__String();

		/**
		 * The meta object literal for the '<em><b>Get Expiry Month</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_DETAILS___GET_EXPIRY_MONTH = eINSTANCE.getPaymentDetails__GetExpiryMonth();

		/**
		 * The meta object literal for the '<em><b>Set Expiry Month</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_DETAILS___SET_EXPIRY_MONTH__INT = eINSTANCE.getPaymentDetails__SetExpiryMonth__int();

		/**
		 * The meta object literal for the '<em><b>Set Expiry Year</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_DETAILS___SET_EXPIRY_YEAR__INT = eINSTANCE.getPaymentDetails__SetExpiryYear__int();

		/**
		 * The meta object literal for the '<em><b>Get Expiry Year</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_DETAILS___GET_EXPIRY_YEAR = eINSTANCE.getPaymentDetails__GetExpiryYear();

		/**
		 * The meta object literal for the '<em><b>Get First Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_DETAILS___GET_FIRST_NAME = eINSTANCE.getPaymentDetails__GetFirstName();

		/**
		 * The meta object literal for the '<em><b>Set First Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_DETAILS___SET_FIRST_NAME__STRING = eINSTANCE.getPaymentDetails__SetFirstName__String();

		/**
		 * The meta object literal for the '<em><b>Set Last Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_DETAILS___SET_LAST_NAME__STRING = eINSTANCE.getPaymentDetails__SetLastName__String();

		/**
		 * The meta object literal for the '<em><b>Get Last Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_DETAILS___GET_LAST_NAME = eINSTANCE.getPaymentDetails__GetLastName();

		/**
		 * The meta object literal for the '{@link HotelSystem.impl.ReservationImpl <em>Reservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelSystem.impl.ReservationImpl
		 * @see HotelSystem.impl.HotelSystemPackageImpl#getReservation()
		 * @generated
		 */
		EClass RESERVATION = eINSTANCE.getReservation();

		/**
		 * The meta object literal for the '<em><b>Tab</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__TAB = eINSTANCE.getReservation_Tab();

		/**
		 * The meta object literal for the '<em><b>Key Card</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__KEY_CARD = eINSTANCE.getReservation_KeyCard();

		/**
		 * The meta object literal for the '<em><b>Scheduled Events</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__SCHEDULED_EVENTS = eINSTANCE.getReservation_ScheduledEvents();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__ROOM = eINSTANCE.getReservation_Room();

		/**
		 * The meta object literal for the '<em><b>Cost Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__COST_CATEGORY = eINSTANCE.getReservation_CostCategory();

		/**
		 * The meta object literal for the '<em><b>Checked In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__CHECKED_IN = eINSTANCE.getReservation_CheckedIn();

		/**
		 * The meta object literal for the '<em><b>Checked Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__CHECKED_OUT = eINSTANCE.getReservation_CheckedOut();

		/**
		 * The meta object literal for the '<em><b>Start Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__START_DAY = eINSTANCE.getReservation_StartDay();

		/**
		 * The meta object literal for the '<em><b>End Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__END_DAY = eINSTANCE.getReservation_EndDay();

		/**
		 * The meta object literal for the '<em><b>Responsible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__RESPONSIBLE = eINSTANCE.getReservation_Responsible();

		/**
		 * The meta object literal for the '<em><b>Number Of Guests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__NUMBER_OF_GUESTS = eINSTANCE.getReservation_NumberOfGuests();

		/**
		 * The meta object literal for the '<em><b>Get Checked In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___GET_CHECKED_IN = eINSTANCE.getReservation__GetCheckedIn();

		/**
		 * The meta object literal for the '<em><b>Set Checked In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___SET_CHECKED_IN__LONG = eINSTANCE.getReservation__SetCheckedIn__long();

		/**
		 * The meta object literal for the '<em><b>Get Checked Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___GET_CHECKED_OUT = eINSTANCE.getReservation__GetCheckedOut();

		/**
		 * The meta object literal for the '<em><b>Set Checked Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___SET_CHECKED_OUT__LONG = eINSTANCE.getReservation__SetCheckedOut__long();

		/**
		 * The meta object literal for the '<em><b>Set Start Day</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___SET_START_DAY__LONG = eINSTANCE.getReservation__SetStartDay__long();

		/**
		 * The meta object literal for the '<em><b>Get Start Day</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___GET_START_DAY = eINSTANCE.getReservation__GetStartDay();

		/**
		 * The meta object literal for the '<em><b>Set End Day</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___SET_END_DAY__LONG = eINSTANCE.getReservation__SetEndDay__long();

		/**
		 * The meta object literal for the '<em><b>Get End Day</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___GET_END_DAY = eINSTANCE.getReservation__GetEndDay();

		/**
		 * The meta object literal for the '<em><b>Get Responsible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___GET_RESPONSIBLE = eINSTANCE.getReservation__GetResponsible();

		/**
		 * The meta object literal for the '<em><b>Set Responsible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___SET_RESPONSIBLE__STRING = eINSTANCE.getReservation__SetResponsible__String();

		/**
		 * The meta object literal for the '<em><b>Get Number Of Guests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___GET_NUMBER_OF_GUESTS = eINSTANCE.getReservation__GetNumberOfGuests();

		/**
		 * The meta object literal for the '<em><b>Set Number Of Guests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___SET_NUMBER_OF_GUESTS__INT = eINSTANCE.getReservation__SetNumberOfGuests__int();

		/**
		 * The meta object literal for the '<em><b>Get Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___GET_ROOM = eINSTANCE.getReservation__GetRoom();

		/**
		 * The meta object literal for the '<em><b>Set Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___SET_ROOM__ROOM = eINSTANCE.getReservation__SetRoom__Room();

		/**
		 * The meta object literal for the '<em><b>Get Cost Category</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___GET_COST_CATEGORY = eINSTANCE.getReservation__GetCostCategory();

		/**
		 * The meta object literal for the '<em><b>Add Cost Category</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___ADD_COST_CATEGORY__ROOMTYPE = eINSTANCE.getReservation__AddCostCategory__RoomType();

		/**
		 * The meta object literal for the '<em><b>Get Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___GET_EVENTS = eINSTANCE.getReservation__GetEvents();

		/**
		 * The meta object literal for the '<em><b>Remove All Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___REMOVE_ALL_EVENTS = eINSTANCE.getReservation__RemoveAllEvents();

		/**
		 * The meta object literal for the '<em><b>Get Key Cards</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___GET_KEY_CARDS = eINSTANCE.getReservation__GetKeyCards();

		/**
		 * The meta object literal for the '<em><b>Add Key Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___ADD_KEY_CARD__KEYCARD = eINSTANCE.getReservation__AddKeyCard__KeyCard();

		/**
		 * The meta object literal for the '<em><b>Remove Key Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___REMOVE_KEY_CARD__KEYCARD = eINSTANCE.getReservation__RemoveKeyCard__KeyCard();

		/**
		 * The meta object literal for the '<em><b>Remove Cost Category</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___REMOVE_COST_CATEGORY__ROOMTYPE = eINSTANCE.getReservation__RemoveCostCategory__RoomType();

		/**
		 * The meta object literal for the '<em><b>Get Tab</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___GET_TAB = eINSTANCE.getReservation__GetTab();

		/**
		 * The meta object literal for the '{@link HotelSystem.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelSystem.impl.BookingImpl
		 * @see HotelSystem.impl.HotelSystemPackageImpl#getBooking()
		 * @generated
		 */
		EClass BOOKING = eINSTANCE.getBooking();

		/**
		 * The meta object literal for the '<em><b>Bill</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__BILL = eINSTANCE.getBooking_Bill();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__CUSTOMER = eINSTANCE.getBooking_Customer();

		/**
		 * The meta object literal for the '<em><b>Reservation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__RESERVATION = eINSTANCE.getBooking_Reservation();

		/**
		 * The meta object literal for the '<em><b>Booking Nbr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__BOOKING_NBR = eINSTANCE.getBooking_BookingNbr();

		/**
		 * The meta object literal for the '<em><b>Get Booking Nbr</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___GET_BOOKING_NBR = eINSTANCE.getBooking__GetBookingNbr();

		/**
		 * The meta object literal for the '<em><b>Get Reservations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___GET_RESERVATIONS = eINSTANCE.getBooking__GetReservations();

		/**
		 * The meta object literal for the '<em><b>Add Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___ADD_RESERVATION__RESERVATION = eINSTANCE.getBooking__AddReservation__Reservation();

		/**
		 * The meta object literal for the '<em><b>Remove Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___REMOVE_RESERVATION__RESERVATION = eINSTANCE.getBooking__RemoveReservation__Reservation();

		/**
		 * The meta object literal for the '<em><b>Get Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___GET_CUSTOMER = eINSTANCE.getBooking__GetCustomer();

		/**
		 * The meta object literal for the '<em><b>Change Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___CHANGE_CUSTOMER__CUSTOMER = eINSTANCE.getBooking__ChangeCustomer__Customer();

		/**
		 * The meta object literal for the '<em><b>Get Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___GET_BILL = eINSTANCE.getBooking__GetBill();

		/**
		 * The meta object literal for the '<em><b>Set Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___SET_CUSTOMER__CUSTOMER = eINSTANCE.getBooking__SetCustomer__Customer();

		/**
		 * The meta object literal for the '{@link HotelSystem.impl.ConferenceRoomImpl <em>Conference Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelSystem.impl.ConferenceRoomImpl
		 * @see HotelSystem.impl.HotelSystemPackageImpl#getConferenceRoom()
		 * @generated
		 */
		EClass CONFERENCE_ROOM = eINSTANCE.getConferenceRoom();

		/**
		 * The meta object literal for the '<em><b>Max Nbr Of People</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFERENCE_ROOM__MAX_NBR_OF_PEOPLE = eINSTANCE.getConferenceRoom_MaxNbrOfPeople();

		/**
		 * The meta object literal for the '<em><b>Get Nbr Of People</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFERENCE_ROOM___GET_NBR_OF_PEOPLE = eINSTANCE.getConferenceRoom__GetNbrOfPeople();

		/**
		 * The meta object literal for the '{@link HotelSystem.impl.CustomerManagerImpl <em>Customer Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelSystem.impl.CustomerManagerImpl
		 * @see HotelSystem.impl.HotelSystemPackageImpl#getCustomerManager()
		 * @generated
		 */
		EClass CUSTOMER_MANAGER = eINSTANCE.getCustomerManager();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_MANAGER__CUSTOMER = eINSTANCE.getCustomerManager_Customer();

		/**
		 * The meta object literal for the '{@link HotelSystem.impl.RoomTypeManagerImpl <em>Room Type Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelSystem.impl.RoomTypeManagerImpl
		 * @see HotelSystem.impl.HotelSystemPackageImpl#getRoomTypeManager()
		 * @generated
		 */
		EClass ROOM_TYPE_MANAGER = eINSTANCE.getRoomTypeManager();

		/**
		 * The meta object literal for the '<em><b>Room Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_TYPE_MANAGER__ROOM_TYPE = eINSTANCE.getRoomTypeManager_RoomType();

		/**
		 * The meta object literal for the '{@link HotelSystem.impl.BookingManagerImpl <em>Booking Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelSystem.impl.BookingManagerImpl
		 * @see HotelSystem.impl.HotelSystemPackageImpl#getBookingManager()
		 * @generated
		 */
		EClass BOOKING_MANAGER = eINSTANCE.getBookingManager();

		/**
		 * The meta object literal for the '<em><b>Booking</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_MANAGER__BOOKING = eINSTANCE.getBookingManager_Booking();

		/**
		 * The meta object literal for the '{@link HotelSystem.impl.RoomManagerImpl <em>Room Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelSystem.impl.RoomManagerImpl
		 * @see HotelSystem.impl.HotelSystemPackageImpl#getRoomManager()
		 * @generated
		 */
		EClass ROOM_MANAGER = eINSTANCE.getRoomManager();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_MANAGER__ROOM = eINSTANCE.getRoomManager_Room();

		/**
		 * The meta object literal for the '{@link HotelSystem.impl.ReservationManagerImpl <em>Reservation Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelSystem.impl.ReservationManagerImpl
		 * @see HotelSystem.impl.HotelSystemPackageImpl#getReservationManager()
		 * @generated
		 */
		EClass RESERVATION_MANAGER = eINSTANCE.getReservationManager();

		/**
		 * The meta object literal for the '<em><b>Reservation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_MANAGER__RESERVATION = eINSTANCE.getReservationManager_Reservation();

		/**
		 * The meta object literal for the '{@link HotelSystem.PaymentMethod <em>Payment Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelSystem.PaymentMethod
		 * @see HotelSystem.impl.HotelSystemPackageImpl#getPaymentMethod()
		 * @generated
		 */
		EEnum PAYMENT_METHOD = eINSTANCE.getPaymentMethod();

	}

} //HotelSystemPackage
