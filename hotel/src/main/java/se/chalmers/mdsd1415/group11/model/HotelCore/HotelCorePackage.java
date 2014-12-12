/**
 */
package se.chalmers.mdsd1415.group11.model.HotelCore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl;

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
 * @see HotelCoreFactory
 * @model kind="package"
 * @generated
 */
public interface HotelCorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HotelCore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///model/HotelCore.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model.HotelCore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HotelCorePackage eINSTANCE = HotelCorePackageImpl.init();

	/**
	 * The meta object id for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelImpl <em>Hotel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelImpl
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getHotel()
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
	 * The meta object id for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.TabImpl <em>Tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.TabImpl
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getTab()
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
	 * The meta object id for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.KeyCardImpl <em>Key Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.KeyCardImpl
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getKeyCard()
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
	 * The meta object id for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.EquipmentImpl <em>Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.EquipmentImpl
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getEquipment()
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
	 * The meta object id for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.RoomTypeImpl <em>Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.RoomTypeImpl
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getRoomType()
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_FEATURE_COUNT = 2;

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
	 * The meta object id for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.RoomImpl
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getRoom()
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
	 * The feature id for the '<em><b>Room Type</b></em>' reference.
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
	 * The operation id for the '<em>Add Equipment To Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___ADD_EQUIPMENT_TO_ROOM__STRING = 3;

	/**
	 * The operation id for the '<em>Remove Equipment Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___REMOVE_EQUIPMENT_ITEM__STRING = 4;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.ScheduledEventsImpl <em>Scheduled Events</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.ScheduledEventsImpl
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getScheduledEvents()
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
	 * The meta object id for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.BillImpl <em>Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.BillImpl
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getBill()
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
	 * The meta object id for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.SleepRoomImpl <em>Sleep Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.SleepRoomImpl
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getSleepRoom()
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP_ROOM__NAME = ROOM_TYPE__NAME;

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
	 * The meta object id for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.CustomerImpl
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getCustomer()
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
	 * The meta object id for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.PaymentDetailsImpl <em>Payment Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.PaymentDetailsImpl
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getPaymentDetails()
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
	 * The meta object id for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.ReservationImpl <em>Reservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.ReservationImpl
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getReservation()
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
	 * The meta object id for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.BookingImpl
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getBooking()
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
	 * The meta object id for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.ConferenceRoomImpl <em>Conference Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.ConferenceRoomImpl
	 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getConferenceRoom()
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM__NAME = ROOM_TYPE__NAME;

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
	 * Returns the meta object for class '{@link Hotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel</em>'.
	 * @see Hotel
	 * @generated
	 */
	EClass getHotel();

	/**
	 * Returns the meta object for class '{@link Tab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab</em>'.
	 * @see Tab
	 * @generated
	 */
	EClass getTab();

	/**
	 * Returns the meta object for the attribute '{@link Tab#getTabItems <em>Tab Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Items</em>'.
	 * @see Tab#getTabItems()
	 * @see #getTab()
	 * @generated
	 */
	EAttribute getTab_TabItems();

	/**
	 * Returns the meta object for the '{@link Tab#addItemToTab(java.lang.String, double) <em>Add Item To Tab</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Item To Tab</em>' operation.
	 * @see Tab#addItemToTab(java.lang.String, double)
	 * @generated
	 */
	EOperation getTab__AddItemToTab__String_double();

	/**
	 * Returns the meta object for the '{@link Tab#getTotalCost() <em>Get Total Cost</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Total Cost</em>' operation.
	 * @see Tab#getTotalCost()
	 * @generated
	 */
	EOperation getTab__GetTotalCost();

	/**
	 * Returns the meta object for the '{@link Tab#removeTabItem(java.lang.String) <em>Remove Tab Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Tab Item</em>' operation.
	 * @see Tab#removeTabItem(java.lang.String)
	 * @generated
	 */
	EOperation getTab__RemoveTabItem__String();

	/**
	 * Returns the meta object for the '{@link Tab#getAll() <em>Get All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All</em>' operation.
	 * @see Tab#getAll()
	 * @generated
	 */
	EOperation getTab__GetAll();

	/**
	 * Returns the meta object for class '{@link KeyCard <em>Key Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Card</em>'.
	 * @see KeyCard
	 * @generated
	 */
	EClass getKeyCard();

	/**
	 * Returns the meta object for the attribute '{@link KeyCard#getKeyCardID <em>Key Card ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Card ID</em>'.
	 * @see KeyCard#getKeyCardID()
	 * @see #getKeyCard()
	 * @generated
	 */
	EAttribute getKeyCard_KeyCardID();

	/**
	 * Returns the meta object for the '{@link KeyCard#getID() <em>Get ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get ID</em>' operation.
	 * @see KeyCard#getID()
	 * @generated
	 */
	EOperation getKeyCard__GetID();

	/**
	 * Returns the meta object for the '{@link KeyCard#setID(int) <em>Set ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set ID</em>' operation.
	 * @see KeyCard#setID(int)
	 * @generated
	 */
	EOperation getKeyCard__SetID__int();

	/**
	 * Returns the meta object for class '{@link Equipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipment</em>'.
	 * @see Equipment
	 * @generated
	 */
	EClass getEquipment();

	/**
	 * Returns the meta object for the attribute '{@link Equipment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Equipment#getName()
	 * @see #getEquipment()
	 * @generated
	 */
	EAttribute getEquipment_Name();

	/**
	 * Returns the meta object for the '{@link Equipment#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see Equipment#getName()
	 * @generated
	 */
	EOperation getEquipment__GetName();

	/**
	 * Returns the meta object for class '{@link RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Type</em>'.
	 * @see RoomType
	 * @generated
	 */
	EClass getRoomType();

	/**
	 * Returns the meta object for the attribute '{@link RoomType#getCostPerNight <em>Cost Per Night</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Per Night</em>'.
	 * @see RoomType#getCostPerNight()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_CostPerNight();

	/**
	 * Returns the meta object for the attribute '{@link RoomType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RoomType#getName()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Name();

	/**
	 * Returns the meta object for the '{@link RoomType#getCostPerNight() <em>Get Cost Per Night</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cost Per Night</em>' operation.
	 * @see RoomType#getCostPerNight()
	 * @generated
	 */
	EOperation getRoomType__GetCostPerNight();

	/**
	 * Returns the meta object for the '{@link RoomType#setCostPerNight(double) <em>Set Cost Per Night</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Cost Per Night</em>' operation.
	 * @see RoomType#setCostPerNight(double)
	 * @generated
	 */
	EOperation getRoomType__SetCostPerNight__double();

	/**
	 * Returns the meta object for class '{@link Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link Room#getRoomNumber <em>Room Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Number</em>'.
	 * @see Room#getRoomNumber()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_RoomNumber();

	/**
	 * Returns the meta object for the reference '{@link Room#getRoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Type</em>'.
	 * @see Room#getRoomType()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_RoomType();

	/**
	 * Returns the meta object for the attribute '{@link Room#isCleaned <em>Cleaned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cleaned</em>'.
	 * @see Room#isCleaned()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Cleaned();

	/**
	 * Returns the meta object for the reference list '{@link Room#getEquipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equipment</em>'.
	 * @see Room#getEquipment()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Equipment();

	/**
	 * Returns the meta object for the '{@link Room#getRoomType() <em>Get Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Type</em>' operation.
	 * @see Room#getRoomType()
	 * @generated
	 */
	EOperation getRoom__GetRoomType();

	/**
	 * Returns the meta object for the '{@link Room#addRoomType(RoomType) <em>Add Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room Type</em>' operation.
	 * @see Room#addRoomType(RoomType)
	 * @generated
	 */
	EOperation getRoom__AddRoomType__RoomType();

	/**
	 * Returns the meta object for the '{@link Room#removeRoomType(RoomType) <em>Remove Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room Type</em>' operation.
	 * @see Room#removeRoomType(RoomType)
	 * @generated
	 */
	EOperation getRoom__RemoveRoomType__RoomType();

	/**
	 * Returns the meta object for the '{@link Room#addEquipmentToRoom(java.lang.String) <em>Add Equipment To Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Equipment To Room</em>' operation.
	 * @see Room#addEquipmentToRoom(java.lang.String)
	 * @generated
	 */
	EOperation getRoom__AddEquipmentToRoom__String();

	/**
	 * Returns the meta object for the '{@link Room#removeEquipmentItem(java.lang.String) <em>Remove Equipment Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Equipment Item</em>' operation.
	 * @see Room#removeEquipmentItem(java.lang.String)
	 * @generated
	 */
	EOperation getRoom__RemoveEquipmentItem__String();

	/**
	 * Returns the meta object for class '{@link ScheduledEvents <em>Scheduled Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduled Events</em>'.
	 * @see ScheduledEvents
	 * @generated
	 */
	EClass getScheduledEvents();

	/**
	 * Returns the meta object for the attribute '{@link ScheduledEvents#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Events</em>'.
	 * @see ScheduledEvents#getEvents()
	 * @see #getScheduledEvents()
	 * @generated
	 */
	EAttribute getScheduledEvents_Events();

	/**
	 * Returns the meta object for the '{@link ScheduledEvents#addEvent(java.lang.String, long) <em>Add Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Event</em>' operation.
	 * @see ScheduledEvents#addEvent(java.lang.String, long)
	 * @generated
	 */
	EOperation getScheduledEvents__AddEvent__String_long();

	/**
	 * Returns the meta object for the '{@link ScheduledEvents#getEvents() <em>Get Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Events</em>' operation.
	 * @see ScheduledEvents#getEvents()
	 * @generated
	 */
	EOperation getScheduledEvents__GetEvents();

	/**
	 * Returns the meta object for the '{@link ScheduledEvents#updateEvent(java.lang.String, long) <em>Update Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Event</em>' operation.
	 * @see ScheduledEvents#updateEvent(java.lang.String, long)
	 * @generated
	 */
	EOperation getScheduledEvents__UpdateEvent__String_long();

	/**
	 * Returns the meta object for the '{@link ScheduledEvents#deleteEvent(java.lang.String) <em>Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Event</em>' operation.
	 * @see ScheduledEvents#deleteEvent(java.lang.String)
	 * @generated
	 */
	EOperation getScheduledEvents__DeleteEvent__String();

	/**
	 * Returns the meta object for class '{@link Bill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill</em>'.
	 * @see Bill
	 * @generated
	 */
	EClass getBill();

	/**
	 * Returns the meta object for the attribute '{@link Bill#getPaid <em>Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paid</em>'.
	 * @see Bill#getPaid()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_Paid();

	/**
	 * Returns the meta object for the attribute '{@link Bill#getGrandTotal <em>Grand Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grand Total</em>'.
	 * @see Bill#getGrandTotal()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_GrandTotal();

	/**
	 * Returns the meta object for the '{@link Bill#addToBill(double) <em>Add To Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add To Bill</em>' operation.
	 * @see Bill#addToBill(double)
	 * @generated
	 */
	EOperation getBill__AddToBill__double();

	/**
	 * Returns the meta object for the '{@link Bill#isPaid() <em>Is Paid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Paid</em>' operation.
	 * @see Bill#isPaid()
	 * @generated
	 */
	EOperation getBill__IsPaid();

	/**
	 * Returns the meta object for the '{@link Bill#removeFromBill(double) <em>Remove From Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove From Bill</em>' operation.
	 * @see Bill#removeFromBill(double)
	 * @generated
	 */
	EOperation getBill__RemoveFromBill__double();

	/**
	 * Returns the meta object for the '{@link Bill#leftToPay() <em>Left To Pay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Left To Pay</em>' operation.
	 * @see Bill#leftToPay()
	 * @generated
	 */
	EOperation getBill__LeftToPay();

	/**
	 * Returns the meta object for the '{@link Bill#pay(double) <em>Pay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay</em>' operation.
	 * @see Bill#pay(double)
	 * @generated
	 */
	EOperation getBill__Pay__double();

	/**
	 * Returns the meta object for class '{@link SleepRoom <em>Sleep Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sleep Room</em>'.
	 * @see SleepRoom
	 * @generated
	 */
	EClass getSleepRoom();

	/**
	 * Returns the meta object for the attribute '{@link SleepRoom#getNbrOfBeds <em>Nbr Of Beds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nbr Of Beds</em>'.
	 * @see SleepRoom#getNbrOfBeds()
	 * @see #getSleepRoom()
	 * @generated
	 */
	EAttribute getSleepRoom_NbrOfBeds();

	/**
	 * Returns the meta object for the '{@link SleepRoom#getNbrOfBeds() <em>Get Nbr Of Beds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nbr Of Beds</em>' operation.
	 * @see SleepRoom#getNbrOfBeds()
	 * @generated
	 */
	EOperation getSleepRoom__GetNbrOfBeds();

	/**
	 * Returns the meta object for the '{@link SleepRoom#setNbrOfBeds(int) <em>Set Nbr Of Beds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Nbr Of Beds</em>' operation.
	 * @see SleepRoom#setNbrOfBeds(int)
	 * @generated
	 */
	EOperation getSleepRoom__SetNbrOfBeds__int();

	/**
	 * Returns the meta object for class '{@link Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link Customer#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Customer#getId()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Id();

	/**
	 * Returns the meta object for the attribute '{@link Customer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Customer#getName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Name();

	/**
	 * Returns the meta object for the reference '{@link Customer#getPaymentDetails <em>Payment Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Details</em>'.
	 * @see Customer#getPaymentDetails()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_PaymentDetails();

	/**
	 * Returns the meta object for the attribute '{@link Customer#getLoyaltyPoints <em>Loyalty Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loyalty Points</em>'.
	 * @see Customer#getLoyaltyPoints()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_LoyaltyPoints();

	/**
	 * Returns the meta object for the '{@link Customer#getId() <em>Get Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Id</em>' operation.
	 * @see Customer#getId()
	 * @generated
	 */
	EOperation getCustomer__GetId();

	/**
	 * Returns the meta object for the '{@link Customer#setId(java.lang.String) <em>Set Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Id</em>' operation.
	 * @see Customer#setId(java.lang.String)
	 * @generated
	 */
	EOperation getCustomer__SetId__String();

	/**
	 * Returns the meta object for the '{@link Customer#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see Customer#getName()
	 * @generated
	 */
	EOperation getCustomer__GetName();

	/**
	 * Returns the meta object for the '{@link Customer#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see Customer#setName(java.lang.String)
	 * @generated
	 */
	EOperation getCustomer__SetName__String();

	/**
	 * Returns the meta object for the '{@link Customer#getLoyaltyPoints() <em>Get Loyalty Points</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Loyalty Points</em>' operation.
	 * @see Customer#getLoyaltyPoints()
	 * @generated
	 */
	EOperation getCustomer__GetLoyaltyPoints();

	/**
	 * Returns the meta object for the '{@link Customer#addLoyaltyPoints(int) <em>Add Loyalty Points</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Loyalty Points</em>' operation.
	 * @see Customer#addLoyaltyPoints(int)
	 * @generated
	 */
	EOperation getCustomer__AddLoyaltyPoints__int();

	/**
	 * Returns the meta object for the '{@link Customer#removeLoyaltyPoints(int) <em>Remove Loyalty Points</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Loyalty Points</em>' operation.
	 * @see Customer#removeLoyaltyPoints(int)
	 * @generated
	 */
	EOperation getCustomer__RemoveLoyaltyPoints__int();

	/**
	 * Returns the meta object for the '{@link Customer#getPaymentDetails() <em>Get Payment Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Payment Details</em>' operation.
	 * @see Customer#getPaymentDetails()
	 * @generated
	 */
	EOperation getCustomer__GetPaymentDetails();

	/**
	 * Returns the meta object for the '{@link Customer#setPaymentDetails(PaymentDetails) <em>Set Payment Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Payment Details</em>' operation.
	 * @see Customer#setPaymentDetails(PaymentDetails)
	 * @generated
	 */
	EOperation getCustomer__SetPaymentDetails__PaymentDetails();

	/**
	 * Returns the meta object for class '{@link PaymentDetails <em>Payment Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Details</em>'.
	 * @see PaymentDetails
	 * @generated
	 */
	EClass getPaymentDetails();

	/**
	 * Returns the meta object for the attribute '{@link PaymentDetails#getCcNumber <em>Cc Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Number</em>'.
	 * @see PaymentDetails#getCcNumber()
	 * @see #getPaymentDetails()
	 * @generated
	 */
	EAttribute getPaymentDetails_CcNumber();

	/**
	 * Returns the meta object for the attribute '{@link PaymentDetails#getCcv <em>Ccv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ccv</em>'.
	 * @see PaymentDetails#getCcv()
	 * @see #getPaymentDetails()
	 * @generated
	 */
	EAttribute getPaymentDetails_Ccv();

	/**
	 * Returns the meta object for the attribute '{@link PaymentDetails#getExpiryMonth <em>Expiry Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Month</em>'.
	 * @see PaymentDetails#getExpiryMonth()
	 * @see #getPaymentDetails()
	 * @generated
	 */
	EAttribute getPaymentDetails_ExpiryMonth();

	/**
	 * Returns the meta object for the attribute '{@link PaymentDetails#getExpiryYear <em>Expiry Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Year</em>'.
	 * @see PaymentDetails#getExpiryYear()
	 * @see #getPaymentDetails()
	 * @generated
	 */
	EAttribute getPaymentDetails_ExpiryYear();

	/**
	 * Returns the meta object for the attribute '{@link PaymentDetails#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see PaymentDetails#getFirstName()
	 * @see #getPaymentDetails()
	 * @generated
	 */
	EAttribute getPaymentDetails_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link PaymentDetails#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see PaymentDetails#getLastName()
	 * @see #getPaymentDetails()
	 * @generated
	 */
	EAttribute getPaymentDetails_LastName();

	/**
	 * Returns the meta object for the '{@link PaymentDetails#getCcNumber() <em>Get Cc Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cc Number</em>' operation.
	 * @see PaymentDetails#getCcNumber()
	 * @generated
	 */
	EOperation getPaymentDetails__GetCcNumber();

	/**
	 * Returns the meta object for the '{@link PaymentDetails#setCcNumber(java.lang.String) <em>Set Cc Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Cc Number</em>' operation.
	 * @see PaymentDetails#setCcNumber(java.lang.String)
	 * @generated
	 */
	EOperation getPaymentDetails__SetCcNumber__String();

	/**
	 * Returns the meta object for the '{@link PaymentDetails#getCcV() <em>Get Cc V</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cc V</em>' operation.
	 * @see PaymentDetails#getCcV()
	 * @generated
	 */
	EOperation getPaymentDetails__GetCcV();

	/**
	 * Returns the meta object for the '{@link PaymentDetails#setCcv(java.lang.String) <em>Set Ccv</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Ccv</em>' operation.
	 * @see PaymentDetails#setCcv(java.lang.String)
	 * @generated
	 */
	EOperation getPaymentDetails__SetCcv__String();

	/**
	 * Returns the meta object for the '{@link PaymentDetails#getExpiryMonth() <em>Get Expiry Month</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expiry Month</em>' operation.
	 * @see PaymentDetails#getExpiryMonth()
	 * @generated
	 */
	EOperation getPaymentDetails__GetExpiryMonth();

	/**
	 * Returns the meta object for the '{@link PaymentDetails#setExpiryMonth(int) <em>Set Expiry Month</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Expiry Month</em>' operation.
	 * @see PaymentDetails#setExpiryMonth(int)
	 * @generated
	 */
	EOperation getPaymentDetails__SetExpiryMonth__int();

	/**
	 * Returns the meta object for the '{@link PaymentDetails#setExpiryYear(int) <em>Set Expiry Year</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Expiry Year</em>' operation.
	 * @see PaymentDetails#setExpiryYear(int)
	 * @generated
	 */
	EOperation getPaymentDetails__SetExpiryYear__int();

	/**
	 * Returns the meta object for the '{@link PaymentDetails#getExpiryYear() <em>Get Expiry Year</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expiry Year</em>' operation.
	 * @see PaymentDetails#getExpiryYear()
	 * @generated
	 */
	EOperation getPaymentDetails__GetExpiryYear();

	/**
	 * Returns the meta object for the '{@link PaymentDetails#getFirstName() <em>Get First Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get First Name</em>' operation.
	 * @see PaymentDetails#getFirstName()
	 * @generated
	 */
	EOperation getPaymentDetails__GetFirstName();

	/**
	 * Returns the meta object for the '{@link PaymentDetails#setFirstName(java.lang.String) <em>Set First Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set First Name</em>' operation.
	 * @see PaymentDetails#setFirstName(java.lang.String)
	 * @generated
	 */
	EOperation getPaymentDetails__SetFirstName__String();

	/**
	 * Returns the meta object for the '{@link PaymentDetails#setLastName(java.lang.String) <em>Set Last Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Last Name</em>' operation.
	 * @see PaymentDetails#setLastName(java.lang.String)
	 * @generated
	 */
	EOperation getPaymentDetails__SetLastName__String();

	/**
	 * Returns the meta object for the '{@link PaymentDetails#getLastName() <em>Get Last Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Last Name</em>' operation.
	 * @see PaymentDetails#getLastName()
	 * @generated
	 */
	EOperation getPaymentDetails__GetLastName();

	/**
	 * Returns the meta object for class '{@link Reservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation</em>'.
	 * @see Reservation
	 * @generated
	 */
	EClass getReservation();

	/**
	 * Returns the meta object for the reference '{@link Reservation#getTab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tab</em>'.
	 * @see Reservation#getTab()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Tab();

	/**
	 * Returns the meta object for the reference list '{@link Reservation#getKeyCard <em>Key Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Key Card</em>'.
	 * @see Reservation#getKeyCard()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_KeyCard();

	/**
	 * Returns the meta object for the reference '{@link Reservation#getScheduledEvents <em>Scheduled Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scheduled Events</em>'.
	 * @see Reservation#getScheduledEvents()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_ScheduledEvents();

	/**
	 * Returns the meta object for the reference '{@link Reservation#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see Reservation#getRoom()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Room();

	/**
	 * Returns the meta object for the reference list '{@link Reservation#getCostCategory <em>Cost Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cost Category</em>'.
	 * @see Reservation#getCostCategory()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_CostCategory();

	/**
	 * Returns the meta object for the attribute '{@link Reservation#getCheckedIn <em>Checked In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked In</em>'.
	 * @see Reservation#getCheckedIn()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_CheckedIn();

	/**
	 * Returns the meta object for the attribute '{@link Reservation#getCheckedOut <em>Checked Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked Out</em>'.
	 * @see Reservation#getCheckedOut()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_CheckedOut();

	/**
	 * Returns the meta object for the attribute '{@link Reservation#getStartDay <em>Start Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Day</em>'.
	 * @see Reservation#getStartDay()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_StartDay();

	/**
	 * Returns the meta object for the attribute '{@link Reservation#getEndDay <em>End Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Day</em>'.
	 * @see Reservation#getEndDay()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_EndDay();

	/**
	 * Returns the meta object for the attribute '{@link Reservation#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Responsible</em>'.
	 * @see Reservation#getResponsible()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_Responsible();

	/**
	 * Returns the meta object for the attribute '{@link Reservation#getNumberOfGuests <em>Number Of Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Guests</em>'.
	 * @see Reservation#getNumberOfGuests()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_NumberOfGuests();

	/**
	 * Returns the meta object for the '{@link Reservation#getCheckedIn() <em>Get Checked In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Checked In</em>' operation.
	 * @see Reservation#getCheckedIn()
	 * @generated
	 */
	EOperation getReservation__GetCheckedIn();

	/**
	 * Returns the meta object for the '{@link Reservation#setCheckedIn(long) <em>Set Checked In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Checked In</em>' operation.
	 * @see Reservation#setCheckedIn(long)
	 * @generated
	 */
	EOperation getReservation__SetCheckedIn__long();

	/**
	 * Returns the meta object for the '{@link Reservation#getCheckedOut() <em>Get Checked Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Checked Out</em>' operation.
	 * @see Reservation#getCheckedOut()
	 * @generated
	 */
	EOperation getReservation__GetCheckedOut();

	/**
	 * Returns the meta object for the '{@link Reservation#setCheckedOut(long) <em>Set Checked Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Checked Out</em>' operation.
	 * @see Reservation#setCheckedOut(long)
	 * @generated
	 */
	EOperation getReservation__SetCheckedOut__long();

	/**
	 * Returns the meta object for the '{@link Reservation#setStartDay(long) <em>Set Start Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Start Day</em>' operation.
	 * @see Reservation#setStartDay(long)
	 * @generated
	 */
	EOperation getReservation__SetStartDay__long();

	/**
	 * Returns the meta object for the '{@link Reservation#getStartDay() <em>Get Start Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Start Day</em>' operation.
	 * @see Reservation#getStartDay()
	 * @generated
	 */
	EOperation getReservation__GetStartDay();

	/**
	 * Returns the meta object for the '{@link Reservation#setEndDay(long) <em>Set End Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set End Day</em>' operation.
	 * @see Reservation#setEndDay(long)
	 * @generated
	 */
	EOperation getReservation__SetEndDay__long();

	/**
	 * Returns the meta object for the '{@link Reservation#getEndDay() <em>Get End Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get End Day</em>' operation.
	 * @see Reservation#getEndDay()
	 * @generated
	 */
	EOperation getReservation__GetEndDay();

	/**
	 * Returns the meta object for the '{@link Reservation#getResponsible() <em>Get Responsible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Responsible</em>' operation.
	 * @see Reservation#getResponsible()
	 * @generated
	 */
	EOperation getReservation__GetResponsible();

	/**
	 * Returns the meta object for the '{@link Reservation#setResponsible(java.lang.String) <em>Set Responsible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Responsible</em>' operation.
	 * @see Reservation#setResponsible(java.lang.String)
	 * @generated
	 */
	EOperation getReservation__SetResponsible__String();

	/**
	 * Returns the meta object for the '{@link Reservation#getNumberOfGuests() <em>Get Number Of Guests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Number Of Guests</em>' operation.
	 * @see Reservation#getNumberOfGuests()
	 * @generated
	 */
	EOperation getReservation__GetNumberOfGuests();

	/**
	 * Returns the meta object for the '{@link Reservation#setNumberOfGuests(int) <em>Set Number Of Guests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Number Of Guests</em>' operation.
	 * @see Reservation#setNumberOfGuests(int)
	 * @generated
	 */
	EOperation getReservation__SetNumberOfGuests__int();

	/**
	 * Returns the meta object for the '{@link Reservation#getRoom() <em>Get Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room</em>' operation.
	 * @see Reservation#getRoom()
	 * @generated
	 */
	EOperation getReservation__GetRoom();

	/**
	 * Returns the meta object for the '{@link Reservation#setRoom(Room) <em>Set Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Room</em>' operation.
	 * @see Reservation#setRoom(Room)
	 * @generated
	 */
	EOperation getReservation__SetRoom__Room();

	/**
	 * Returns the meta object for the '{@link Reservation#getCostCategory() <em>Get Cost Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cost Category</em>' operation.
	 * @see Reservation#getCostCategory()
	 * @generated
	 */
	EOperation getReservation__GetCostCategory();

	/**
	 * Returns the meta object for the '{@link Reservation#addCostCategory(RoomType) <em>Add Cost Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Cost Category</em>' operation.
	 * @see Reservation#addCostCategory(RoomType)
	 * @generated
	 */
	EOperation getReservation__AddCostCategory__RoomType();

	/**
	 * Returns the meta object for the '{@link Reservation#getEvents() <em>Get Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Events</em>' operation.
	 * @see Reservation#getEvents()
	 * @generated
	 */
	EOperation getReservation__GetEvents();

	/**
	 * Returns the meta object for the '{@link Reservation#removeAllEvents() <em>Remove All Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove All Events</em>' operation.
	 * @see Reservation#removeAllEvents()
	 * @generated
	 */
	EOperation getReservation__RemoveAllEvents();

	/**
	 * Returns the meta object for the '{@link Reservation#getKeyCards() <em>Get Key Cards</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Key Cards</em>' operation.
	 * @see Reservation#getKeyCards()
	 * @generated
	 */
	EOperation getReservation__GetKeyCards();

	/**
	 * Returns the meta object for the '{@link Reservation#addKeyCard(KeyCard) <em>Add Key Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Key Card</em>' operation.
	 * @see Reservation#addKeyCard(KeyCard)
	 * @generated
	 */
	EOperation getReservation__AddKeyCard__KeyCard();

	/**
	 * Returns the meta object for the '{@link Reservation#removeKeyCard(KeyCard) <em>Remove Key Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Key Card</em>' operation.
	 * @see Reservation#removeKeyCard(KeyCard)
	 * @generated
	 */
	EOperation getReservation__RemoveKeyCard__KeyCard();

	/**
	 * Returns the meta object for the '{@link Reservation#removeCostCategory(RoomType) <em>Remove Cost Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Cost Category</em>' operation.
	 * @see Reservation#removeCostCategory(RoomType)
	 * @generated
	 */
	EOperation getReservation__RemoveCostCategory__RoomType();

	/**
	 * Returns the meta object for the '{@link Reservation#getTab() <em>Get Tab</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tab</em>' operation.
	 * @see Reservation#getTab()
	 * @generated
	 */
	EOperation getReservation__GetTab();

	/**
	 * Returns the meta object for class '{@link Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the reference '{@link Booking#getBill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bill</em>'.
	 * @see Booking#getBill()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Bill();

	/**
	 * Returns the meta object for the reference '{@link Booking#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see Booking#getCustomer()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Customer();

	/**
	 * Returns the meta object for the reference list '{@link Booking#getReservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reservation</em>'.
	 * @see Booking#getReservation()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Reservation();

	/**
	 * Returns the meta object for the attribute '{@link Booking#getBookingNbr <em>Booking Nbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Nbr</em>'.
	 * @see Booking#getBookingNbr()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_BookingNbr();

	/**
	 * Returns the meta object for the '{@link Booking#getBookingNbr() <em>Get Booking Nbr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking Nbr</em>' operation.
	 * @see Booking#getBookingNbr()
	 * @generated
	 */
	EOperation getBooking__GetBookingNbr();

	/**
	 * Returns the meta object for the '{@link Booking#getReservations() <em>Get Reservations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Reservations</em>' operation.
	 * @see Booking#getReservations()
	 * @generated
	 */
	EOperation getBooking__GetReservations();

	/**
	 * Returns the meta object for the '{@link Booking#addReservation(Reservation) <em>Add Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Reservation</em>' operation.
	 * @see Booking#addReservation(Reservation)
	 * @generated
	 */
	EOperation getBooking__AddReservation__Reservation();

	/**
	 * Returns the meta object for the '{@link Booking#removeReservation(Reservation) <em>Remove Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Reservation</em>' operation.
	 * @see Booking#removeReservation(Reservation)
	 * @generated
	 */
	EOperation getBooking__RemoveReservation__Reservation();

	/**
	 * Returns the meta object for the '{@link Booking#getCustomer() <em>Get Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Customer</em>' operation.
	 * @see Booking#getCustomer()
	 * @generated
	 */
	EOperation getBooking__GetCustomer();

	/**
	 * Returns the meta object for the '{@link Booking#changeCustomer(Customer) <em>Change Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Customer</em>' operation.
	 * @see Booking#changeCustomer(Customer)
	 * @generated
	 */
	EOperation getBooking__ChangeCustomer__Customer();

	/**
	 * Returns the meta object for the '{@link Booking#getBill() <em>Get Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bill</em>' operation.
	 * @see Booking#getBill()
	 * @generated
	 */
	EOperation getBooking__GetBill();

	/**
	 * Returns the meta object for the '{@link Booking#setCustomer(Customer) <em>Set Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Customer</em>' operation.
	 * @see Booking#setCustomer(Customer)
	 * @generated
	 */
	EOperation getBooking__SetCustomer__Customer();

	/**
	 * Returns the meta object for class '{@link ConferenceRoom <em>Conference Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conference Room</em>'.
	 * @see ConferenceRoom
	 * @generated
	 */
	EClass getConferenceRoom();

	/**
	 * Returns the meta object for the attribute '{@link ConferenceRoom#getMaxNbrOfPeople <em>Max Nbr Of People</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Nbr Of People</em>'.
	 * @see ConferenceRoom#getMaxNbrOfPeople()
	 * @see #getConferenceRoom()
	 * @generated
	 */
	EAttribute getConferenceRoom_MaxNbrOfPeople();

	/**
	 * Returns the meta object for the '{@link ConferenceRoom#getNbrOfPeople() <em>Get Nbr Of People</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nbr Of People</em>' operation.
	 * @see ConferenceRoom#getNbrOfPeople()
	 * @generated
	 */
	EOperation getConferenceRoom__GetNbrOfPeople();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HotelCoreFactory getHotelCoreFactory();

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
		 * The meta object literal for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelImpl <em>Hotel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelImpl
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getHotel()
		 * @generated
		 */
		EClass HOTEL = eINSTANCE.getHotel();

		/**
		 * The meta object literal for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.TabImpl <em>Tab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.TabImpl
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getTab()
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
		 * The meta object literal for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.KeyCardImpl <em>Key Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.KeyCardImpl
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getKeyCard()
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
		 * The meta object literal for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.EquipmentImpl <em>Equipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.EquipmentImpl
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getEquipment()
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
		 * The meta object literal for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.RoomTypeImpl <em>Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.RoomTypeImpl
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getRoomType()
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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__NAME = eINSTANCE.getRoomType_Name();

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
		 * The meta object literal for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.RoomImpl
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getRoom()
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
		 * The meta object literal for the '<em><b>Room Type</b></em>' reference feature.
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
		 * The meta object literal for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.ScheduledEventsImpl <em>Scheduled Events</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.ScheduledEventsImpl
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getScheduledEvents()
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
		 * The meta object literal for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.BillImpl <em>Bill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.BillImpl
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getBill()
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
		 * The meta object literal for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.SleepRoomImpl <em>Sleep Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.SleepRoomImpl
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getSleepRoom()
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
		 * The meta object literal for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.CustomerImpl
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getCustomer()
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
		 * The meta object literal for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.PaymentDetailsImpl <em>Payment Details</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.PaymentDetailsImpl
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getPaymentDetails()
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
		 * The meta object literal for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.ReservationImpl <em>Reservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.ReservationImpl
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getReservation()
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
		 * The meta object literal for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.BookingImpl
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getBooking()
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
		 * The meta object literal for the '{@link se.chalmers.mdsd1415.group11.model.HotelCore.impl.ConferenceRoomImpl <em>Conference Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.ConferenceRoomImpl
		 * @see se.chalmers.mdsd1415.group11.model.HotelCore.impl.HotelCorePackageImpl#getConferenceRoom()
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

	}

} //HotelCorePackage
