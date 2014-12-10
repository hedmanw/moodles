/**
 */
package model.HotelService;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
	 * The meta object id for the '{@link model.HotelService.impl.HotelReceptionistImpl <em>Hotel Receptionist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.impl.HotelReceptionistImpl
	 * @see model.HotelService.impl.HotelServicePackageImpl#getHotelReceptionist()
	 * @generated
	 */
	int HOTEL_RECEPTIONIST = 0;

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
	 * The meta object id for the '{@link model.HotelService.IRoomManager <em>IRoom Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.IRoomManager
	 * @see model.HotelService.impl.HotelServicePackageImpl#getIRoomManager()
	 * @generated
	 */
	int IROOM_MANAGER = 1;

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
	 * The meta object id for the '{@link model.HotelService.IBookingManager <em>IBooking Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.IBookingManager
	 * @see model.HotelService.impl.HotelServicePackageImpl#getIBookingManager()
	 * @generated
	 */
	int IBOOKING_MANAGER = 2;

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
	 * The operation id for the '<em>Get Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGER___GET_BOOKING__LONG = 1;

	/**
	 * The operation id for the '<em>Delete Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGER___DELETE_BOOKING__LONG = 2;

	/**
	 * The operation id for the '<em>Get Bookings By Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGER___GET_BOOKINGS_BY_CUSTOMER__LONG = 3;

	/**
	 * The operation id for the '<em>Set Booking Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGER___SET_BOOKING_CUSTOMER__LONG_LONG = 4;

	/**
	 * The operation id for the '<em>Is Bill Paid In Full</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGER___IS_BILL_PAID_IN_FULL__LONG = 5;

	/**
	 * The operation id for the '<em>Get Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGER___GET_BILL__LONG = 6;

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
	 * The meta object id for the '{@link model.HotelService.IReservationManager <em>IReservation Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.IReservationManager
	 * @see model.HotelService.impl.HotelServicePackageImpl#getIReservationManager()
	 * @generated
	 */
	int IRESERVATION_MANAGER = 3;

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
	 * The operation id for the '<em>Set Responsible For Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESERVATION_MANAGER___SET_RESPONSIBLE_FOR_RESERVATION__LONG_STRING = 2;

	/**
	 * The operation id for the '<em>Get Non Checked In Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESERVATION_MANAGER___GET_NON_CHECKED_IN_RESERVATION__LONG = 3;

	/**
	 * The operation id for the '<em>Set Number Of Guests For Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESERVATION_MANAGER___SET_NUMBER_OF_GUESTS_FOR_RESERVATION__LONG_INT = 4;

	/**
	 * The operation id for the '<em>Check In Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESERVATION_MANAGER___CHECK_IN_RESERVATION__LONG = 5;

	/**
	 * The operation id for the '<em>Check Out Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESERVATION_MANAGER___CHECK_OUT_RESERVATION__RESERVATION = 6;

	/**
	 * The operation id for the '<em>Get Current Reservation By Room Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESERVATION_MANAGER___GET_CURRENT_RESERVATION_BY_ROOM_NUMBER__INT = 7;

	/**
	 * The number of operations of the '<em>IReservation Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESERVATION_MANAGER_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link model.HotelService.impl.HotelManagerImpl <em>Hotel Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.impl.HotelManagerImpl
	 * @see model.HotelService.impl.HotelServicePackageImpl#getHotelManager()
	 * @generated
	 */
	int HOTEL_MANAGER = 4;

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
	 * The meta object id for the '{@link model.HotelService.HotelManagerProvides <em>Hotel Manager Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.HotelManagerProvides
	 * @see model.HotelService.impl.HotelServicePackageImpl#getHotelManagerProvides()
	 * @generated
	 */
	int HOTEL_MANAGER_PROVIDES = 5;

	/**
	 * The number of structural features of the '<em>Hotel Manager Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_MANAGER_PROVIDES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Hotel Manager Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_MANAGER_PROVIDES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.HotelService.impl.HotelStaffImpl <em>Hotel Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.impl.HotelStaffImpl
	 * @see model.HotelService.impl.HotelServicePackageImpl#getHotelStaff()
	 * @generated
	 */
	int HOTEL_STAFF = 6;

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
	 * The meta object id for the '{@link model.HotelService.HotelStaffProvides <em>Hotel Staff Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.HotelStaffProvides
	 * @see model.HotelService.impl.HotelServicePackageImpl#getHotelStaffProvides()
	 * @generated
	 */
	int HOTEL_STAFF_PROVIDES = 7;

	/**
	 * The number of structural features of the '<em>Hotel Staff Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_STAFF_PROVIDES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Hotel Staff Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_STAFF_PROVIDES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.HotelService.IRoomTypeManager <em>IRoom Type Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.IRoomTypeManager
	 * @see model.HotelService.impl.HotelServicePackageImpl#getIRoomTypeManager()
	 * @generated
	 */
	int IROOM_TYPE_MANAGER = 8;

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
	 * The meta object id for the '{@link model.HotelService.ICustomerManager <em>ICustomer Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.ICustomerManager
	 * @see model.HotelService.impl.HotelServicePackageImpl#getICustomerManager()
	 * @generated
	 */
	int ICUSTOMER_MANAGER = 9;

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
	int ICUSTOMER_MANAGER___SET_PAYMENT_DETAILS_FOR_CUSTOMER__LONG_STRING_STRING_STRING_STRING_INT_INT = 4;

	/**
	 * The operation id for the '<em>Get Payment Details By Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMER_MANAGER___GET_PAYMENT_DETAILS_BY_CUSTOMER__LONG = 5;

	/**
	 * The number of operations of the '<em>ICustomer Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMER_MANAGER_OPERATION_COUNT = 6;


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
	 * Returns the meta object for the '{@link model.HotelService.IBookingManager#getBooking(long) <em>Get Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking</em>' operation.
	 * @see model.HotelService.IBookingManager#getBooking(long)
	 * @generated
	 */
	EOperation getIBookingManager__GetBooking__long();

	/**
	 * Returns the meta object for the '{@link model.HotelService.IBookingManager#deleteBooking(long) <em>Delete Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Booking</em>' operation.
	 * @see model.HotelService.IBookingManager#deleteBooking(long)
	 * @generated
	 */
	EOperation getIBookingManager__DeleteBooking__long();

	/**
	 * Returns the meta object for the '{@link model.HotelService.IBookingManager#getBookingsByCustomer(long) <em>Get Bookings By Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bookings By Customer</em>' operation.
	 * @see model.HotelService.IBookingManager#getBookingsByCustomer(long)
	 * @generated
	 */
	EOperation getIBookingManager__GetBookingsByCustomer__long();

	/**
	 * Returns the meta object for the '{@link model.HotelService.IBookingManager#setBookingCustomer(long, long) <em>Set Booking Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Booking Customer</em>' operation.
	 * @see model.HotelService.IBookingManager#setBookingCustomer(long, long)
	 * @generated
	 */
	EOperation getIBookingManager__SetBookingCustomer__long_long();

	/**
	 * Returns the meta object for the '{@link model.HotelService.IBookingManager#isBillPaidInFull(long) <em>Is Bill Paid In Full</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Bill Paid In Full</em>' operation.
	 * @see model.HotelService.IBookingManager#isBillPaidInFull(long)
	 * @generated
	 */
	EOperation getIBookingManager__IsBillPaidInFull__long();

	/**
	 * Returns the meta object for the '{@link model.HotelService.IBookingManager#getBill(long) <em>Get Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bill</em>' operation.
	 * @see model.HotelService.IBookingManager#getBill(long)
	 * @generated
	 */
	EOperation getIBookingManager__GetBill__long();

	/**
	 * Returns the meta object for the '{@link model.HotelService.IBookingManager#getBookingByReservation(HotelSystem.Reservation, HotelSystem.Booking) <em>Get Booking By Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking By Reservation</em>' operation.
	 * @see model.HotelService.IBookingManager#getBookingByReservation(HotelSystem.Reservation, HotelSystem.Booking)
	 * @generated
	 */
	EOperation getIBookingManager__GetBookingByReservation__Reservation_Booking();

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
	 * Returns the meta object for the '{@link model.HotelService.IReservationManager#createReservation(HotelSystem.Booking, java.util.Date, java.util.Date, long, long) <em>Create Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Reservation</em>' operation.
	 * @see model.HotelService.IReservationManager#createReservation(HotelSystem.Booking, java.util.Date, java.util.Date, long, long)
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
	 * Returns the meta object for the '{@link model.HotelService.IReservationManager#setResponsibleForReservation(long, java.lang.String) <em>Set Responsible For Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Responsible For Reservation</em>' operation.
	 * @see model.HotelService.IReservationManager#setResponsibleForReservation(long, java.lang.String)
	 * @generated
	 */
	EOperation getIReservationManager__SetResponsibleForReservation__long_String();

	/**
	 * Returns the meta object for the '{@link model.HotelService.IReservationManager#getNonCheckedInReservation(long) <em>Get Non Checked In Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Non Checked In Reservation</em>' operation.
	 * @see model.HotelService.IReservationManager#getNonCheckedInReservation(long)
	 * @generated
	 */
	EOperation getIReservationManager__GetNonCheckedInReservation__long();

	/**
	 * Returns the meta object for the '{@link model.HotelService.IReservationManager#setNumberOfGuestsForReservation(long, int) <em>Set Number Of Guests For Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Number Of Guests For Reservation</em>' operation.
	 * @see model.HotelService.IReservationManager#setNumberOfGuestsForReservation(long, int)
	 * @generated
	 */
	EOperation getIReservationManager__SetNumberOfGuestsForReservation__long_int();

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
	 * Returns the meta object for the '{@link model.HotelService.IReservationManager#checkOutReservation(HotelSystem.Reservation) <em>Check Out Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out Reservation</em>' operation.
	 * @see model.HotelService.IReservationManager#checkOutReservation(HotelSystem.Reservation)
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
	 * Returns the meta object for class '{@link model.HotelService.HotelManager <em>Hotel Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Manager</em>'.
	 * @see model.HotelService.HotelManager
	 * @generated
	 */
	EClass getHotelManager();

	/**
	 * Returns the meta object for class '{@link model.HotelService.HotelManagerProvides <em>Hotel Manager Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Manager Provides</em>'.
	 * @see model.HotelService.HotelManagerProvides
	 * @generated
	 */
	EClass getHotelManagerProvides();

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
	 * Returns the meta object for class '{@link model.HotelService.HotelStaffProvides <em>Hotel Staff Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Staff Provides</em>'.
	 * @see model.HotelService.HotelStaffProvides
	 * @generated
	 */
	EClass getHotelStaffProvides();

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
	 * Returns the meta object for the '{@link model.HotelService.ICustomerManager#setPaymentDetailsForCustomer(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int) <em>Set Payment Details For Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Payment Details For Customer</em>' operation.
	 * @see model.HotelService.ICustomerManager#setPaymentDetailsForCustomer(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int)
	 * @generated
	 */
	EOperation getICustomerManager__SetPaymentDetailsForCustomer__long_String_String_String_String_int_int();

	/**
	 * Returns the meta object for the '{@link model.HotelService.ICustomerManager#getPaymentDetailsByCustomer(long) <em>Get Payment Details By Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Payment Details By Customer</em>' operation.
	 * @see model.HotelService.ICustomerManager#getPaymentDetailsByCustomer(long)
	 * @generated
	 */
	EOperation getICustomerManager__GetPaymentDetailsByCustomer__long();

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
		 * The meta object literal for the '{@link model.HotelService.impl.HotelReceptionistImpl <em>Hotel Receptionist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.impl.HotelReceptionistImpl
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
		 * The meta object literal for the '<em><b>Get Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGER___GET_BOOKING__LONG = eINSTANCE.getIBookingManager__GetBooking__long();

		/**
		 * The meta object literal for the '<em><b>Delete Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGER___DELETE_BOOKING__LONG = eINSTANCE.getIBookingManager__DeleteBooking__long();

		/**
		 * The meta object literal for the '<em><b>Get Bookings By Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGER___GET_BOOKINGS_BY_CUSTOMER__LONG = eINSTANCE.getIBookingManager__GetBookingsByCustomer__long();

		/**
		 * The meta object literal for the '<em><b>Set Booking Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGER___SET_BOOKING_CUSTOMER__LONG_LONG = eINSTANCE.getIBookingManager__SetBookingCustomer__long_long();

		/**
		 * The meta object literal for the '<em><b>Is Bill Paid In Full</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGER___IS_BILL_PAID_IN_FULL__LONG = eINSTANCE.getIBookingManager__IsBillPaidInFull__long();

		/**
		 * The meta object literal for the '<em><b>Get Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGER___GET_BILL__LONG = eINSTANCE.getIBookingManager__GetBill__long();

		/**
		 * The meta object literal for the '<em><b>Get Booking By Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING_MANAGER___GET_BOOKING_BY_RESERVATION__RESERVATION_BOOKING = eINSTANCE.getIBookingManager__GetBookingByReservation__Reservation_Booking();

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
		 * The meta object literal for the '<em><b>Set Responsible For Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESERVATION_MANAGER___SET_RESPONSIBLE_FOR_RESERVATION__LONG_STRING = eINSTANCE.getIReservationManager__SetResponsibleForReservation__long_String();

		/**
		 * The meta object literal for the '<em><b>Get Non Checked In Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESERVATION_MANAGER___GET_NON_CHECKED_IN_RESERVATION__LONG = eINSTANCE.getIReservationManager__GetNonCheckedInReservation__long();

		/**
		 * The meta object literal for the '<em><b>Set Number Of Guests For Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESERVATION_MANAGER___SET_NUMBER_OF_GUESTS_FOR_RESERVATION__LONG_INT = eINSTANCE.getIReservationManager__SetNumberOfGuestsForReservation__long_int();

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
		 * The meta object literal for the '{@link model.HotelService.impl.HotelManagerImpl <em>Hotel Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.impl.HotelManagerImpl
		 * @see model.HotelService.impl.HotelServicePackageImpl#getHotelManager()
		 * @generated
		 */
		EClass HOTEL_MANAGER = eINSTANCE.getHotelManager();

		/**
		 * The meta object literal for the '{@link model.HotelService.HotelManagerProvides <em>Hotel Manager Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.HotelManagerProvides
		 * @see model.HotelService.impl.HotelServicePackageImpl#getHotelManagerProvides()
		 * @generated
		 */
		EClass HOTEL_MANAGER_PROVIDES = eINSTANCE.getHotelManagerProvides();

		/**
		 * The meta object literal for the '{@link model.HotelService.impl.HotelStaffImpl <em>Hotel Staff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.impl.HotelStaffImpl
		 * @see model.HotelService.impl.HotelServicePackageImpl#getHotelStaff()
		 * @generated
		 */
		EClass HOTEL_STAFF = eINSTANCE.getHotelStaff();

		/**
		 * The meta object literal for the '{@link model.HotelService.HotelStaffProvides <em>Hotel Staff Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.HotelStaffProvides
		 * @see model.HotelService.impl.HotelServicePackageImpl#getHotelStaffProvides()
		 * @generated
		 */
		EClass HOTEL_STAFF_PROVIDES = eINSTANCE.getHotelStaffProvides();

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
		EOperation ICUSTOMER_MANAGER___SET_PAYMENT_DETAILS_FOR_CUSTOMER__LONG_STRING_STRING_STRING_STRING_INT_INT = eINSTANCE.getICustomerManager__SetPaymentDetailsForCustomer__long_String_String_String_String_int_int();

		/**
		 * The meta object literal for the '<em><b>Get Payment Details By Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMER_MANAGER___GET_PAYMENT_DETAILS_BY_CUSTOMER__LONG = eINSTANCE.getICustomerManager__GetPaymentDetailsByCustomer__long();

	}

} //HotelServicePackage
