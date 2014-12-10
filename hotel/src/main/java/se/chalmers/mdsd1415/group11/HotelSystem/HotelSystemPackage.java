/**
 */
package HotelSystem;

import model.HotelService.HotelServicePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
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
	 * The feature id for the '<em><b>Nbr Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__NBR_OF_GUESTS = 10;

	/**
	 * The number of structural features of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_FEATURE_COUNT = 11;

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
	 * Returns the meta object for the attribute '{@link HotelSystem.Reservation#getNbrOfGuests <em>Nbr Of Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nbr Of Guests</em>'.
	 * @see HotelSystem.Reservation#getNbrOfGuests()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_NbrOfGuests();

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
		 * The meta object literal for the '<em><b>Nbr Of Guests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__NBR_OF_GUESTS = eINSTANCE.getReservation_NbrOfGuests();

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
