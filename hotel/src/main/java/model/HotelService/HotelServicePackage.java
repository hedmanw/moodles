/**
 */
package model.HotelService;

import org.eclipse.emf.ecore.EClass;
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
 * @see model.HotelService.HotelServiceFactory
 * @model kind="package"
 * @generated
 */
public interface HotelServicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HotelService";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///model/HotelService.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model.HotelService";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HotelServicePackage eINSTANCE = model.HotelService.impl.HotelServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link model.HotelService.impl.SystemUserImpl <em>System User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.impl.SystemUserImpl
	 * @see model.HotelService.impl.HotelServicePackageImpl#getSystemUser()
	 * @generated
	 */
	int SYSTEM_USER = 0;

	/**
	 * The number of structural features of the '<em>System User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_USER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>System User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.HotelService.ExternalUser <em>External User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.ExternalUser
	 * @see model.HotelService.impl.HotelServicePackageImpl#getExternalUser()
	 * @generated
	 */
	int EXTERNAL_USER = 1;

	/**
	 * The number of structural features of the '<em>External User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_USER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>External User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.HotelService.HotelReceptionist <em>Hotel Receptionist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.HotelReceptionist
	 * @see model.HotelService.impl.HotelServicePackageImpl#getHotelReceptionist()
	 * @generated
	 */
	int HOTEL_RECEPTIONIST = 3;

	/**
	 * The meta object id for the '{@link model.HotelService.IRoomManager <em>IRoom Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.IRoomManager
	 * @see model.HotelService.impl.HotelServicePackageImpl#getIRoomManager()
	 * @generated
	 */
	int IROOM_MANAGER = 5;

	/**
	 * The meta object id for the '{@link model.HotelService.impl.RoomManagerImpl <em>Room Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.impl.RoomManagerImpl
	 * @see model.HotelService.impl.HotelServicePackageImpl#getRoomManager()
	 * @generated
	 */
	int ROOM_MANAGER = 6;

	/**
	 * The meta object id for the '{@link model.HotelService.IBookingManager <em>IBooking Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.IBookingManager
	 * @see model.HotelService.impl.HotelServicePackageImpl#getIBookingManager()
	 * @generated
	 */
	int IBOOKING_MANAGER = 11;

	/**
	 * The meta object id for the '{@link model.HotelService.impl.BookingManagerImpl <em>Booking Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.impl.BookingManagerImpl
	 * @see model.HotelService.impl.HotelServicePackageImpl#getBookingManager()
	 * @generated
	 */
	int BOOKING_MANAGER = 12;

	/**
	 * The meta object id for the '{@link model.HotelService.IReservationManager <em>IReservation Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.IReservationManager
	 * @see model.HotelService.impl.HotelServicePackageImpl#getIReservationManager()
	 * @generated
	 */
	int IRESERVATION_MANAGER = 9;

	/**
	 * The meta object id for the '{@link model.HotelService.impl.ReservationManagerImpl <em>Reservation Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.impl.ReservationManagerImpl
	 * @see model.HotelService.impl.HotelServicePackageImpl#getReservationManager()
	 * @generated
	 */
	int RESERVATION_MANAGER = 10;

	/**
	 * The meta object id for the '{@link model.HotelService.HotelManager <em>Hotel Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.HotelManager
	 * @see model.HotelService.impl.HotelServicePackageImpl#getHotelManager()
	 * @generated
	 */
	int HOTEL_MANAGER = 4;

	/**
	 * The meta object id for the '{@link model.HotelService.HotelStaff <em>Hotel Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.HotelStaff
	 * @see model.HotelService.impl.HotelServicePackageImpl#getHotelStaff()
	 * @generated
	 */
	int HOTEL_STAFF = 2;

	/**
	 * The number of structural features of the '<em>Hotel Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_STAFF_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Hotel Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_STAFF_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Hotel Receptionist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_RECEPTIONIST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Hotel Receptionist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_RECEPTIONIST_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Hotel Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Hotel Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_MANAGER_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>IRoom Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Available Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MANAGER___GET_AVAILABLE_ROOMS__DATE_DATE_ELIST = 0;

	/**
	 * The operation id for the '<em>Get Room Occupancy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MANAGER___GET_ROOM_OCCUPANCY__DATE_DATE = 1;

	/**
	 * The number of operations of the '<em>IRoom Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MANAGER_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>All Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER__ALL_ROOMS = IROOM_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Room Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_FEATURE_COUNT = IROOM_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Available Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___GET_AVAILABLE_ROOMS__DATE_DATE_ELIST = IROOM_MANAGER___GET_AVAILABLE_ROOMS__DATE_DATE_ELIST;

	/**
	 * The operation id for the '<em>Get Room Occupancy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___GET_ROOM_OCCUPANCY__DATE_DATE = IROOM_MANAGER___GET_ROOM_OCCUPANCY__DATE_DATE;

	/**
	 * The number of operations of the '<em>Room Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_OPERATION_COUNT = IROOM_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.HotelService.IRoomTypeManager <em>IRoom Type Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.IRoomTypeManager
	 * @see model.HotelService.impl.HotelServicePackageImpl#getIRoomTypeManager()
	 * @generated
	 */
	int IROOM_TYPE_MANAGER = 7;

	/**
	 * The number of structural features of the '<em>IRoom Type Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_TYPE_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_TYPE_MANAGER___GET_ROOM_TYPES = 0;

	/**
	 * The number of operations of the '<em>IRoom Type Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_TYPE_MANAGER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.HotelService.impl.RoomTypeManagerImpl <em>Room Type Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.impl.RoomTypeManagerImpl
	 * @see model.HotelService.impl.HotelServicePackageImpl#getRoomTypeManager()
	 * @generated
	 */
	int ROOM_TYPE_MANAGER = 8;

	/**
	 * The feature id for the '<em><b>All Room Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_MANAGER__ALL_ROOM_TYPES = IROOM_TYPE_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Room Type Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_MANAGER_FEATURE_COUNT = IROOM_TYPE_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_MANAGER___GET_ROOM_TYPES = IROOM_TYPE_MANAGER___GET_ROOM_TYPES;

	/**
	 * The number of operations of the '<em>Room Type Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_MANAGER_OPERATION_COUNT = IROOM_TYPE_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IReservation Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESERVATION_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESERVATION_MANAGER___CREATE_RESERVATION__BOOKING_DATE_DATE_LONG_LONG = 0;

	/**
	 * The operation id for the '<em>Get Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESERVATION_MANAGER___GET_RESERVATION__LONG = 1;

	/**
	 * The operation id for the '<em>Get Non Checked In Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESERVATION_MANAGER___GET_NON_CHECKED_IN_RESERVATION__BOOKING = 2;

	/**
	 * The operation id for the '<em>Check In Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESERVATION_MANAGER___CHECK_IN_RESERVATION__LONG = 3;

	/**
	 * The operation id for the '<em>Check Out Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESERVATION_MANAGER___CHECK_OUT_RESERVATION__RESERVATION = 4;

	/**
	 * The operation id for the '<em>Get Current Reservation By Room Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESERVATION_MANAGER___GET_CURRENT_RESERVATION_BY_ROOM_NUMBER__INT = 5;

	/**
	 * The number of operations of the '<em>IReservation Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESERVATION_MANAGER_OPERATION_COUNT = 6;

	/**
	 * The feature id for the '<em><b>All Reservations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_MANAGER__ALL_RESERVATIONS = IRESERVATION_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reservation Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_MANAGER_FEATURE_COUNT = IRESERVATION_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_MANAGER___CREATE_RESERVATION__BOOKING_DATE_DATE_LONG_LONG = IRESERVATION_MANAGER___CREATE_RESERVATION__BOOKING_DATE_DATE_LONG_LONG;

	/**
	 * The operation id for the '<em>Get Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_MANAGER___GET_RESERVATION__LONG = IRESERVATION_MANAGER___GET_RESERVATION__LONG;

	/**
	 * The operation id for the '<em>Get Non Checked In Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_MANAGER___GET_NON_CHECKED_IN_RESERVATION__BOOKING = IRESERVATION_MANAGER___GET_NON_CHECKED_IN_RESERVATION__BOOKING;

	/**
	 * The operation id for the '<em>Check In Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_MANAGER___CHECK_IN_RESERVATION__LONG = IRESERVATION_MANAGER___CHECK_IN_RESERVATION__LONG;

	/**
	 * The operation id for the '<em>Check Out Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_MANAGER___CHECK_OUT_RESERVATION__RESERVATION = IRESERVATION_MANAGER___CHECK_OUT_RESERVATION__RESERVATION;

	/**
	 * The operation id for the '<em>Get Current Reservation By Room Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_MANAGER___GET_CURRENT_RESERVATION_BY_ROOM_NUMBER__INT = IRESERVATION_MANAGER___GET_CURRENT_RESERVATION_BY_ROOM_NUMBER__INT;

	/**
	 * The number of operations of the '<em>Reservation Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_MANAGER_OPERATION_COUNT = IRESERVATION_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IBooking Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGER___CREATE_BOOKING = 0;

	/**
	 * The operation id for the '<em>Get Booking By Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGER___GET_BOOKING_BY_NUMBER__LONG = 1;

	/**
	 * The operation id for the '<em>Delete Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGER___DELETE_BOOKING__BOOKING = 2;

	/**
	 * The operation id for the '<em>Get Bookings By Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGER___GET_BOOKINGS_BY_CUSTOMER__CUSTOMER = 3;

	/**
	 * The operation id for the '<em>Set Booking Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGER___SET_BOOKING_CUSTOMER__BOOKING_CUSTOMER = 4;

	/**
	 * The operation id for the '<em>Is Bill Paid In Full</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGER___IS_BILL_PAID_IN_FULL__BOOKING = 5;

	/**
	 * The operation id for the '<em>Get Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGER___GET_BILL__BOOKING = 6;

	/**
	 * The operation id for the '<em>Get Booking By Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGER___GET_BOOKING_BY_RESERVATION__RESERVATION_BOOKING = 7;

	/**
	 * The number of operations of the '<em>IBooking Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGER_OPERATION_COUNT = 8;

	/**
	 * The feature id for the '<em><b>All Bookings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER__ALL_BOOKINGS = IBOOKING_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Booking Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_FEATURE_COUNT = IBOOKING_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___CREATE_BOOKING = IBOOKING_MANAGER___CREATE_BOOKING;

	/**
	 * The operation id for the '<em>Get Booking By Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_BOOKING_BY_NUMBER__LONG = IBOOKING_MANAGER___GET_BOOKING_BY_NUMBER__LONG;

	/**
	 * The operation id for the '<em>Delete Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___DELETE_BOOKING__BOOKING = IBOOKING_MANAGER___DELETE_BOOKING__BOOKING;

	/**
	 * The operation id for the '<em>Get Bookings By Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_BOOKINGS_BY_CUSTOMER__CUSTOMER = IBOOKING_MANAGER___GET_BOOKINGS_BY_CUSTOMER__CUSTOMER;

	/**
	 * The operation id for the '<em>Set Booking Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___SET_BOOKING_CUSTOMER__BOOKING_CUSTOMER = IBOOKING_MANAGER___SET_BOOKING_CUSTOMER__BOOKING_CUSTOMER;

	/**
	 * The operation id for the '<em>Is Bill Paid In Full</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___IS_BILL_PAID_IN_FULL__BOOKING = IBOOKING_MANAGER___IS_BILL_PAID_IN_FULL__BOOKING;

	/**
	 * The operation id for the '<em>Get Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_BILL__BOOKING = IBOOKING_MANAGER___GET_BILL__BOOKING;

	/**
	 * The operation id for the '<em>Get Booking By Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_BOOKING_BY_RESERVATION__RESERVATION_BOOKING = IBOOKING_MANAGER___GET_BOOKING_BY_RESERVATION__RESERVATION_BOOKING;

	/**
	 * The number of operations of the '<em>Booking Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_OPERATION_COUNT = IBOOKING_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.HotelService.ICustomerManager <em>ICustomer Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.ICustomerManager
	 * @see model.HotelService.impl.HotelServicePackageImpl#getICustomerManager()
	 * @generated
	 */
	int ICUSTOMER_MANAGER = 13;

	/**
	 * The number of structural features of the '<em>ICustomer Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMER_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Customer By Id Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMER_MANAGER___GET_CUSTOMER_BY_ID_NUMBER__STRING = 0;

	/**
	 * The operation id for the '<em>Get Customers By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMER_MANAGER___GET_CUSTOMERS_BY_NAME__STRING = 1;

	/**
	 * The operation id for the '<em>Get Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMER_MANAGER___GET_CUSTOMER__LONG = 2;

	/**
	 * The operation id for the '<em>Create Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMER_MANAGER___CREATE_CUSTOMER__STRING_STRING = 3;

	/**
	 * The operation id for the '<em>Set Payment Details For Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMER_MANAGER___SET_PAYMENT_DETAILS_FOR_CUSTOMER__CUSTOMER_STRING_STRING_STRING_STRING_INT_INT = 4;

	/**
	 * The operation id for the '<em>Get Payment Details By Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMER_MANAGER___GET_PAYMENT_DETAILS_BY_CUSTOMER__CUSTOMER = 5;

	/**
	 * The number of operations of the '<em>ICustomer Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMER_MANAGER_OPERATION_COUNT = 6;


	/**
	 * The meta object id for the '{@link model.HotelService.impl.CustomerManagerImpl <em>Customer Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.impl.CustomerManagerImpl
	 * @see model.HotelService.impl.HotelServicePackageImpl#getCustomerManager()
	 * @generated
	 */
	int CUSTOMER_MANAGER = 14;

	/**
	 * The feature id for the '<em><b>All Customers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_MANAGER__ALL_CUSTOMERS = ICUSTOMER_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Customer Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_MANAGER_FEATURE_COUNT = ICUSTOMER_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Customer By Id Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_MANAGER___GET_CUSTOMER_BY_ID_NUMBER__STRING = ICUSTOMER_MANAGER___GET_CUSTOMER_BY_ID_NUMBER__STRING;

	/**
	 * The operation id for the '<em>Get Customers By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_MANAGER___GET_CUSTOMERS_BY_NAME__STRING = ICUSTOMER_MANAGER___GET_CUSTOMERS_BY_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_MANAGER___GET_CUSTOMER__LONG = ICUSTOMER_MANAGER___GET_CUSTOMER__LONG;

	/**
	 * The operation id for the '<em>Create Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_MANAGER___CREATE_CUSTOMER__STRING_STRING = ICUSTOMER_MANAGER___CREATE_CUSTOMER__STRING_STRING;

	/**
	 * The operation id for the '<em>Set Payment Details For Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_MANAGER___SET_PAYMENT_DETAILS_FOR_CUSTOMER__CUSTOMER_STRING_STRING_STRING_STRING_INT_INT = ICUSTOMER_MANAGER___SET_PAYMENT_DETAILS_FOR_CUSTOMER__CUSTOMER_STRING_STRING_STRING_STRING_INT_INT;

	/**
	 * The operation id for the '<em>Get Payment Details By Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_MANAGER___GET_PAYMENT_DETAILS_BY_CUSTOMER__CUSTOMER = ICUSTOMER_MANAGER___GET_PAYMENT_DETAILS_BY_CUSTOMER__CUSTOMER;

	/**
	 * The number of operations of the '<em>Customer Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_MANAGER_OPERATION_COUNT = ICUSTOMER_MANAGER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link model.HotelService.SystemUser <em>System User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System User</em>'.
	 * @see model.HotelService.SystemUser
	 * @generated
	 */
	EClass getSystemUser();

	/**
	 * Returns the meta object for class '{@link model.HotelService.ExternalUser <em>External User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External User</em>'.
	 * @see model.HotelService.ExternalUser
	 * @generated
	 */
	EClass getExternalUser();

	/**
	 * Returns the meta object for class '{@link model.HotelService.HotelReceptionist <em>Hotel Receptionist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Receptionist</em>'.
	 * @see model.HotelService.HotelReceptionist
	 * @generated
	 */
	EClass getHotelReceptionist();

	/**
	 * Returns the meta object for class '{@link model.HotelService.IRoomManager <em>IRoom Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRoom Manager</em>'.
	 * @see model.HotelService.IRoomManager
	 * @generated
	 */
	EClass getIRoomManager();

	/**
	 * Returns the meta object for the '{@link model.HotelService.IRoomManager#getAvailableRooms(java.util.Date, java.util.Date, org.eclipse.emf.common.util.EList) <em>Get Available Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Rooms</em>' operation.
	 * @see model.HotelService.IRoomManager#getAvailableRooms(java.util.Date, java.util.Date, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getIRoomManager__GetAvailableRooms__Date_Date_EList();

	/**
	 * Returns the meta object for the '{@link model.HotelService.IRoomManager#getRoomOccupancy(java.util.Date, java.util.Date) <em>Get Room Occupancy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Occupancy</em>' operation.
	 * @see model.HotelService.IRoomManager#getRoomOccupancy(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getIRoomManager__GetRoomOccupancy__Date_Date();

	/**
	 * Returns the meta object for class '{@link model.HotelService.RoomManager <em>Room Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Manager</em>'.
	 * @see model.HotelService.RoomManager
	 * @generated
	 */
	EClass getRoomManager();

	/**
	 * Returns the meta object for the reference list '{@link model.HotelService.RoomManager#getAllRooms <em>All Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Rooms</em>'.
	 * @see model.HotelService.RoomManager#getAllRooms()
	 * @see #getRoomManager()
	 * @generated
	 */
	EReference getRoomManager_AllRooms();

	/**
	 * Returns the meta object for class '{@link model.HotelService.IBookingManager <em>IBooking Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBooking Manager</em>'.
	 * @see model.HotelService.IBookingManager
	 * @generated
	 */
	EClass getIBookingManager();

	/**
	 * Returns the meta object for the '{@link model.HotelService.IBookingManager#createBooking() <em>Create Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Booking</em>' operation.
	 * @see model.HotelService.IBookingManager#createBooking()
	 * @generated
	 */
	EOperation getIBookingManager__CreateBooking();

	/**
	 * Returns the meta object for the '{@link model.HotelService.IBookingManager#getBookingByNumber(long) <em>Get Booking By Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking By Number</em>' operation.
	 * @see model.HotelService.IBookingManager#getBookingByNumber(long)
	 * @generated
	 */
	EOperation getIBookingManager__GetBookingByNumber__long();

	/**
	 * Returns the meta object for the '{@link model.HotelService.IBookingManager#deleteBooking(model.HotelCore.Booking) <em>Delete Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Booking</em>' operation.
	 * @see model.HotelService.IBookingManager#deleteBooking(model.HotelCore.Booking)
	 * @generated
	 */
	EOperation getIBookingManager__DeleteBooking__Booking();

	/**
	 * Returns the meta object for the '{@link model.HotelService.IBookingManager#getBookingsByCustomer(model.HotelCore.Customer) <em>Get Bookings By Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bookings By Customer</em>' operation.
	 * @see model.HotelService.IBookingManager#getBookingsByCustomer(model.HotelCore.Customer)
	 * @generated
	 */
	EOperation getIBookingManager__GetBookingsByCustomer__Customer();

	/**
	 * Returns the meta object for the '{@link model.HotelService.IBookingManager#setBookingCustomer(model.HotelCore.Booking, model.HotelCore.Customer) <em>Set Booking Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Booking Customer</em>' operation.
	 * @see model.HotelService.IBookingManager#setBookingCustomer(model.HotelCore.Booking, model.HotelCore.Customer)
	 * @generated
	 */
	EOperation getIBookingManager__SetBookingCustomer__Booking_Customer();

	/**
	 * Returns the meta object for the '{@link model.HotelService.IBookingManager#isBillPaidInFull(model.HotelCore.Booking) <em>Is Bill Paid In Full</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Bill Paid In Full</em>' operation.
	 * @see model.HotelService.IBookingManager#isBillPaidInFull(model.HotelCore.Booking)
	 * @generated
	 */
	EOperation getIBookingManager__IsBillPaidInFull__Booking();

	/**
	 * Returns the meta object for the '{@link model.HotelService.IBookingManager#getBill(model.HotelCore.Booking) <em>Get Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bill</em>' operation.
	 * @see model.HotelService.IBookingManager#getBill(model.HotelCore.Booking)
	 * @generated
	 */
	EOperation getIBookingManager__GetBill__Booking();

	/**
	 * Returns the meta object for the '{@link model.HotelService.IBookingManager#getBookingByReservation(model.HotelCore.Reservation, model.HotelCore.Booking) <em>Get Booking By Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking By Reservation</em>' operation.
	 * @see model.HotelService.IBookingManager#getBookingByReservation(model.HotelCore.Reservation, model.HotelCore.Booking)
	 * @generated
	 */
	EOperation getIBookingManager__GetBookingByReservation__Reservation_Booking();

	/**
	 * Returns the meta object for class '{@link model.HotelService.BookingManager <em>Booking Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Manager</em>'.
	 * @see model.HotelService.BookingManager
	 * @generated
	 */
	EClass getBookingManager();

	/**
	 * Returns the meta object for the reference list '{@link model.HotelService.BookingManager#getAllBookings <em>All Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Bookings</em>'.
	 * @see model.HotelService.BookingManager#getAllBookings()
	 * @see #getBookingManager()
	 * @generated
	 */
	EReference getBookingManager_AllBookings();

	/**
	 * Returns the meta object for class '{@link model.HotelService.IReservationManager <em>IReservation Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IReservation Manager</em>'.
	 * @see model.HotelService.IReservationManager
	 * @generated
	 */
	EClass getIReservationManager();

	/**
	 * Returns the meta object for the '{@link model.HotelService.IReservationManager#createReservation(model.HotelCore.Booking, java.util.Date, java.util.Date, long, long) <em>Create Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Reservation</em>' operation.
	 * @see model.HotelService.IReservationManager#createReservation(model.HotelCore.Booking, java.util.Date, java.util.Date, long, long)
	 * @generated
	 */
	EOperation getIReservationManager__CreateReservation__Booking_Date_Date_long_long();

	/**
	 * Returns the meta object for the '{@link model.HotelService.IReservationManager#getReservation(long) <em>Get Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Reservation</em>' operation.
	 * @see model.HotelService.IReservationManager#getReservation(long)
	 * @generated
	 */
	EOperation getIReservationManager__GetReservation__long();

	/**
	 * Returns the meta object for the '{@link model.HotelService.IReservationManager#getNonCheckedInReservation(model.HotelCore.Booking) <em>Get Non Checked In Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Non Checked In Reservation</em>' operation.
	 * @see model.HotelService.IReservationManager#getNonCheckedInReservation(model.HotelCore.Booking)
	 * @generated
	 */
	EOperation getIReservationManager__GetNonCheckedInReservation__Booking();

	/**
	 * Returns the meta object for the '{@link model.HotelService.IReservationManager#checkInReservation(long) <em>Check In Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In Reservation</em>' operation.
	 * @see model.HotelService.IReservationManager#checkInReservation(long)
	 * @generated
	 */
	EOperation getIReservationManager__CheckInReservation__long();

	/**
	 * Returns the meta object for the '{@link model.HotelService.IReservationManager#checkOutReservation(model.HotelCore.Reservation) <em>Check Out Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out Reservation</em>' operation.
	 * @see model.HotelService.IReservationManager#checkOutReservation(model.HotelCore.Reservation)
	 * @generated
	 */
	EOperation getIReservationManager__CheckOutReservation__Reservation();

	/**
	 * Returns the meta object for the '{@link model.HotelService.IReservationManager#getCurrentReservationByRoomNumber(int) <em>Get Current Reservation By Room Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Current Reservation By Room Number</em>' operation.
	 * @see model.HotelService.IReservationManager#getCurrentReservationByRoomNumber(int)
	 * @generated
	 */
	EOperation getIReservationManager__GetCurrentReservationByRoomNumber__int();

	/**
	 * Returns the meta object for class '{@link model.HotelService.ReservationManager <em>Reservation Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation Manager</em>'.
	 * @see model.HotelService.ReservationManager
	 * @generated
	 */
	EClass getReservationManager();

	/**
	 * Returns the meta object for the reference list '{@link model.HotelService.ReservationManager#getAllReservations <em>All Reservations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Reservations</em>'.
	 * @see model.HotelService.ReservationManager#getAllReservations()
	 * @see #getReservationManager()
	 * @generated
	 */
	EReference getReservationManager_AllReservations();

	/**
	 * Returns the meta object for class '{@link model.HotelService.HotelManager <em>Hotel Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Manager</em>'.
	 * @see model.HotelService.HotelManager
	 * @generated
	 */
	EClass getHotelManager();

	/**
	 * Returns the meta object for class '{@link model.HotelService.HotelStaff <em>Hotel Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Staff</em>'.
	 * @see model.HotelService.HotelStaff
	 * @generated
	 */
	EClass getHotelStaff();

	/**
	 * Returns the meta object for class '{@link model.HotelService.IRoomTypeManager <em>IRoom Type Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRoom Type Manager</em>'.
	 * @see model.HotelService.IRoomTypeManager
	 * @generated
	 */
	EClass getIRoomTypeManager();

	/**
	 * Returns the meta object for the '{@link model.HotelService.IRoomTypeManager#getRoomTypes() <em>Get Room Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Types</em>' operation.
	 * @see model.HotelService.IRoomTypeManager#getRoomTypes()
	 * @generated
	 */
	EOperation getIRoomTypeManager__GetRoomTypes();

	/**
	 * Returns the meta object for class '{@link model.HotelService.RoomTypeManager <em>Room Type Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Type Manager</em>'.
	 * @see model.HotelService.RoomTypeManager
	 * @generated
	 */
	EClass getRoomTypeManager();

	/**
	 * Returns the meta object for the reference list '{@link model.HotelService.RoomTypeManager#getAllRoomTypes <em>All Room Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Room Types</em>'.
	 * @see model.HotelService.RoomTypeManager#getAllRoomTypes()
	 * @see #getRoomTypeManager()
	 * @generated
	 */
	EReference getRoomTypeManager_AllRoomTypes();

	/**
	 * Returns the meta object for class '{@link model.HotelService.ICustomerManager <em>ICustomer Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ICustomer Manager</em>'.
	 * @see model.HotelService.ICustomerManager
	 * @generated
	 */
	EClass getICustomerManager();

	/**
	 * Returns the meta object for the '{@link model.HotelService.ICustomerManager#getCustomerByIdNumber(java.lang.String) <em>Get Customer By Id Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Customer By Id Number</em>' operation.
	 * @see model.HotelService.ICustomerManager#getCustomerByIdNumber(java.lang.String)
	 * @generated
	 */
	EOperation getICustomerManager__GetCustomerByIdNumber__String();

	/**
	 * Returns the meta object for the '{@link model.HotelService.ICustomerManager#getCustomersByName(java.lang.String) <em>Get Customers By Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Customers By Name</em>' operation.
	 * @see model.HotelService.ICustomerManager#getCustomersByName(java.lang.String)
	 * @generated
	 */
	EOperation getICustomerManager__GetCustomersByName__String();

	/**
	 * Returns the meta object for the '{@link model.HotelService.ICustomerManager#getCustomer(long) <em>Get Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Customer</em>' operation.
	 * @see model.HotelService.ICustomerManager#getCustomer(long)
	 * @generated
	 */
	EOperation getICustomerManager__GetCustomer__long();

	/**
	 * Returns the meta object for the '{@link model.HotelService.ICustomerManager#createCustomer(java.lang.String, java.lang.String) <em>Create Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Customer</em>' operation.
	 * @see model.HotelService.ICustomerManager#createCustomer(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getICustomerManager__CreateCustomer__String_String();

	/**
	 * Returns the meta object for the '{@link model.HotelService.ICustomerManager#setPaymentDetailsForCustomer(model.HotelCore.Customer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int) <em>Set Payment Details For Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Payment Details For Customer</em>' operation.
	 * @see model.HotelService.ICustomerManager#setPaymentDetailsForCustomer(model.HotelCore.Customer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int)
	 * @generated
	 */
	EOperation getICustomerManager__SetPaymentDetailsForCustomer__Customer_String_String_String_String_int_int();

	/**
	 * Returns the meta object for the '{@link model.HotelService.ICustomerManager#getPaymentDetailsByCustomer(model.HotelCore.Customer) <em>Get Payment Details By Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Payment Details By Customer</em>' operation.
	 * @see model.HotelService.ICustomerManager#getPaymentDetailsByCustomer(model.HotelCore.Customer)
	 * @generated
	 */
	EOperation getICustomerManager__GetPaymentDetailsByCustomer__Customer();

	/**
	 * Returns the meta object for class '{@link model.HotelService.CustomerManager <em>Customer Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Manager</em>'.
	 * @see model.HotelService.CustomerManager
	 * @generated
	 */
	EClass getCustomerManager();

	/**
	 * Returns the meta object for the reference list '{@link model.HotelService.CustomerManager#getAllCustomers <em>All Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Customers</em>'.
	 * @see model.HotelService.CustomerManager#getAllCustomers()
	 * @see #getCustomerManager()
	 * @generated
	 */
	EReference getCustomerManager_AllCustomers();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HotelServiceFactory getHotelServiceFactory();

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
		 * The meta object literal for the '{@link model.HotelService.impl.SystemUserImpl <em>System User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.impl.SystemUserImpl
		 * @see model.HotelService.impl.HotelServicePackageImpl#getSystemUser()
		 * @generated
		 */
		EClass SYSTEM_USER = eINSTANCE.getSystemUser();

		/**
		 * The meta object literal for the '{@link model.HotelService.ExternalUser <em>External User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.ExternalUser
		 * @see model.HotelService.impl.HotelServicePackageImpl#getExternalUser()
		 * @generated
		 */
		EClass EXTERNAL_USER = eINSTANCE.getExternalUser();

		/**
		 * The meta object literal for the '{@link model.HotelService.HotelReceptionist <em>Hotel Receptionist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.HotelReceptionist
		 * @see model.HotelService.impl.HotelServicePackageImpl#getHotelReceptionist()
		 * @generated
		 */
		EClass HOTEL_RECEPTIONIST = eINSTANCE.getHotelReceptionist();

		/**
		 * The meta object literal for the '{@link model.HotelService.IRoomManager <em>IRoom Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.IRoomManager
		 * @see model.HotelService.impl.HotelServicePackageImpl#getIRoomManager()
		 * @generated
		 */
		EClass IROOM_MANAGER = eINSTANCE.getIRoomManager();

		/**
		 * The meta object literal for the '<em><b>Get Available Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MANAGER___GET_AVAILABLE_ROOMS__DATE_DATE_ELIST = eINSTANCE.getIRoomManager__GetAvailableRooms__Date_Date_EList();

		/**
		 * The meta object literal for the '<em><b>Get Room Occupancy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MANAGER___GET_ROOM_OCCUPANCY__DATE_DATE = eINSTANCE.getIRoomManager__GetRoomOccupancy__Date_Date();

		/**
		 * The meta object literal for the '{@link model.HotelService.impl.RoomManagerImpl <em>Room Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.impl.RoomManagerImpl
		 * @see model.HotelService.impl.HotelServicePackageImpl#getRoomManager()
		 * @generated
		 */
		EClass ROOM_MANAGER = eINSTANCE.getRoomManager();

		/**
		 * The meta object literal for the '<em><b>All Rooms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_MANAGER__ALL_ROOMS = eINSTANCE.getRoomManager_AllRooms();

		/**
		 * The meta object literal for the '{@link model.HotelService.IBookingManager <em>IBooking Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.IBookingManager
		 * @see model.HotelService.impl.HotelServicePackageImpl#getIBookingManager()
		 * @generated
		 */
		EClass IBOOKING_MANAGER = eINSTANCE.getIBookingManager();

		/**
		 * The meta object literal for the '<em><b>Create Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGER___CREATE_BOOKING = eINSTANCE.getIBookingManager__CreateBooking();

		/**
		 * The meta object literal for the '<em><b>Get Booking By Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGER___GET_BOOKING_BY_NUMBER__LONG = eINSTANCE.getIBookingManager__GetBookingByNumber__long();

		/**
		 * The meta object literal for the '<em><b>Delete Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGER___DELETE_BOOKING__BOOKING = eINSTANCE.getIBookingManager__DeleteBooking__Booking();

		/**
		 * The meta object literal for the '<em><b>Get Bookings By Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGER___GET_BOOKINGS_BY_CUSTOMER__CUSTOMER = eINSTANCE.getIBookingManager__GetBookingsByCustomer__Customer();

		/**
		 * The meta object literal for the '<em><b>Set Booking Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGER___SET_BOOKING_CUSTOMER__BOOKING_CUSTOMER = eINSTANCE.getIBookingManager__SetBookingCustomer__Booking_Customer();

		/**
		 * The meta object literal for the '<em><b>Is Bill Paid In Full</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGER___IS_BILL_PAID_IN_FULL__BOOKING = eINSTANCE.getIBookingManager__IsBillPaidInFull__Booking();

		/**
		 * The meta object literal for the '<em><b>Get Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGER___GET_BILL__BOOKING = eINSTANCE.getIBookingManager__GetBill__Booking();

		/**
		 * The meta object literal for the '<em><b>Get Booking By Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGER___GET_BOOKING_BY_RESERVATION__RESERVATION_BOOKING = eINSTANCE.getIBookingManager__GetBookingByReservation__Reservation_Booking();

		/**
		 * The meta object literal for the '{@link model.HotelService.impl.BookingManagerImpl <em>Booking Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.impl.BookingManagerImpl
		 * @see model.HotelService.impl.HotelServicePackageImpl#getBookingManager()
		 * @generated
		 */
		EClass BOOKING_MANAGER = eINSTANCE.getBookingManager();

		/**
		 * The meta object literal for the '<em><b>All Bookings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_MANAGER__ALL_BOOKINGS = eINSTANCE.getBookingManager_AllBookings();

		/**
		 * The meta object literal for the '{@link model.HotelService.IReservationManager <em>IReservation Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.IReservationManager
		 * @see model.HotelService.impl.HotelServicePackageImpl#getIReservationManager()
		 * @generated
		 */
		EClass IRESERVATION_MANAGER = eINSTANCE.getIReservationManager();

		/**
		 * The meta object literal for the '<em><b>Create Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESERVATION_MANAGER___CREATE_RESERVATION__BOOKING_DATE_DATE_LONG_LONG = eINSTANCE.getIReservationManager__CreateReservation__Booking_Date_Date_long_long();

		/**
		 * The meta object literal for the '<em><b>Get Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESERVATION_MANAGER___GET_RESERVATION__LONG = eINSTANCE.getIReservationManager__GetReservation__long();

		/**
		 * The meta object literal for the '<em><b>Get Non Checked In Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESERVATION_MANAGER___GET_NON_CHECKED_IN_RESERVATION__BOOKING = eINSTANCE.getIReservationManager__GetNonCheckedInReservation__Booking();

		/**
		 * The meta object literal for the '<em><b>Check In Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESERVATION_MANAGER___CHECK_IN_RESERVATION__LONG = eINSTANCE.getIReservationManager__CheckInReservation__long();

		/**
		 * The meta object literal for the '<em><b>Check Out Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESERVATION_MANAGER___CHECK_OUT_RESERVATION__RESERVATION = eINSTANCE.getIReservationManager__CheckOutReservation__Reservation();

		/**
		 * The meta object literal for the '<em><b>Get Current Reservation By Room Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESERVATION_MANAGER___GET_CURRENT_RESERVATION_BY_ROOM_NUMBER__INT = eINSTANCE.getIReservationManager__GetCurrentReservationByRoomNumber__int();

		/**
		 * The meta object literal for the '{@link model.HotelService.impl.ReservationManagerImpl <em>Reservation Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.impl.ReservationManagerImpl
		 * @see model.HotelService.impl.HotelServicePackageImpl#getReservationManager()
		 * @generated
		 */
		EClass RESERVATION_MANAGER = eINSTANCE.getReservationManager();

		/**
		 * The meta object literal for the '<em><b>All Reservations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_MANAGER__ALL_RESERVATIONS = eINSTANCE.getReservationManager_AllReservations();

		/**
		 * The meta object literal for the '{@link model.HotelService.HotelManager <em>Hotel Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.HotelManager
		 * @see model.HotelService.impl.HotelServicePackageImpl#getHotelManager()
		 * @generated
		 */
		EClass HOTEL_MANAGER = eINSTANCE.getHotelManager();

		/**
		 * The meta object literal for the '{@link model.HotelService.HotelStaff <em>Hotel Staff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.HotelStaff
		 * @see model.HotelService.impl.HotelServicePackageImpl#getHotelStaff()
		 * @generated
		 */
		EClass HOTEL_STAFF = eINSTANCE.getHotelStaff();

		/**
		 * The meta object literal for the '{@link model.HotelService.IRoomTypeManager <em>IRoom Type Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.IRoomTypeManager
		 * @see model.HotelService.impl.HotelServicePackageImpl#getIRoomTypeManager()
		 * @generated
		 */
		EClass IROOM_TYPE_MANAGER = eINSTANCE.getIRoomTypeManager();

		/**
		 * The meta object literal for the '<em><b>Get Room Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_TYPE_MANAGER___GET_ROOM_TYPES = eINSTANCE.getIRoomTypeManager__GetRoomTypes();

		/**
		 * The meta object literal for the '{@link model.HotelService.impl.RoomTypeManagerImpl <em>Room Type Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.impl.RoomTypeManagerImpl
		 * @see model.HotelService.impl.HotelServicePackageImpl#getRoomTypeManager()
		 * @generated
		 */
		EClass ROOM_TYPE_MANAGER = eINSTANCE.getRoomTypeManager();

		/**
		 * The meta object literal for the '<em><b>All Room Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_TYPE_MANAGER__ALL_ROOM_TYPES = eINSTANCE.getRoomTypeManager_AllRoomTypes();

		/**
		 * The meta object literal for the '{@link model.HotelService.ICustomerManager <em>ICustomer Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.ICustomerManager
		 * @see model.HotelService.impl.HotelServicePackageImpl#getICustomerManager()
		 * @generated
		 */
		EClass ICUSTOMER_MANAGER = eINSTANCE.getICustomerManager();

		/**
		 * The meta object literal for the '<em><b>Get Customer By Id Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMER_MANAGER___GET_CUSTOMER_BY_ID_NUMBER__STRING = eINSTANCE.getICustomerManager__GetCustomerByIdNumber__String();

		/**
		 * The meta object literal for the '<em><b>Get Customers By Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMER_MANAGER___GET_CUSTOMERS_BY_NAME__STRING = eINSTANCE.getICustomerManager__GetCustomersByName__String();

		/**
		 * The meta object literal for the '<em><b>Get Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMER_MANAGER___GET_CUSTOMER__LONG = eINSTANCE.getICustomerManager__GetCustomer__long();

		/**
		 * The meta object literal for the '<em><b>Create Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMER_MANAGER___CREATE_CUSTOMER__STRING_STRING = eINSTANCE.getICustomerManager__CreateCustomer__String_String();

		/**
		 * The meta object literal for the '<em><b>Set Payment Details For Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMER_MANAGER___SET_PAYMENT_DETAILS_FOR_CUSTOMER__CUSTOMER_STRING_STRING_STRING_STRING_INT_INT = eINSTANCE.getICustomerManager__SetPaymentDetailsForCustomer__Customer_String_String_String_String_int_int();

		/**
		 * The meta object literal for the '<em><b>Get Payment Details By Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMER_MANAGER___GET_PAYMENT_DETAILS_BY_CUSTOMER__CUSTOMER = eINSTANCE.getICustomerManager__GetPaymentDetailsByCustomer__Customer();

		/**
		 * The meta object literal for the '{@link model.HotelService.impl.CustomerManagerImpl <em>Customer Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.impl.CustomerManagerImpl
		 * @see model.HotelService.impl.HotelServicePackageImpl#getCustomerManager()
		 * @generated
		 */
		EClass CUSTOMER_MANAGER = eINSTANCE.getCustomerManager();

		/**
		 * The meta object literal for the '<em><b>All Customers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_MANAGER__ALL_CUSTOMERS = eINSTANCE.getCustomerManager_AllCustomers();

	}

} //HotelServicePackage
