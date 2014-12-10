/**
 */
package model;

import org.eclipse.emf.ecore.EClass;
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
 * @see model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///model.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.impl.BookingActivityImpl <em>Booking Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BookingActivityImpl
	 * @see model.impl.ModelPackageImpl#getBookingActivity()
	 * @generated
	 */
	int BOOKING_ACTIVITY = 0;

	/**
	 * The number of structural features of the '<em>Booking Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_ACTIVITY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.showRoomOccupancyImpl <em>show Room Occupancy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.showRoomOccupancyImpl
	 * @see model.impl.ModelPackageImpl#getshowRoomOccupancy()
	 * @generated
	 */
	int SHOW_ROOM_OCCUPANCY = 1;

	/**
	 * The feature id for the '<em><b>U</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_ROOM_OCCUPANCY__U = 0;

	/**
	 * The feature id for the '<em><b>Rm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_ROOM_OCCUPANCY__RM = 1;

	/**
	 * The number of structural features of the '<em>show Room Occupancy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_ROOM_OCCUPANCY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link model.impl.CheckInSuccessImpl <em>Check In Success</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.CheckInSuccessImpl
	 * @see model.impl.ModelPackageImpl#getCheckInSuccess()
	 * @generated
	 */
	int CHECK_IN_SUCCESS = 2;

	/**
	 * The feature id for the '<em><b>R</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IN_SUCCESS__R = 0;

	/**
	 * The feature id for the '<em><b>K</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IN_SUCCESS__K = 1;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IN_SUCCESS__CUSTOMER = 2;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IN_SUCCESS__ACTOR = 3;

	/**
	 * The feature id for the '<em><b>Bm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IN_SUCCESS__BM = 4;

	/**
	 * The feature id for the '<em><b>B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IN_SUCCESS__B = 5;

	/**
	 * The number of structural features of the '<em>Check In Success</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IN_SUCCESS_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link model.impl.reserveARoomImpl <em>reserve ARoom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.reserveARoomImpl
	 * @see model.impl.ModelPackageImpl#getreserveARoom()
	 * @generated
	 */
	int RESERVE_AROOM = 3;

	/**
	 * The feature id for the '<em><b>R</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_AROOM__R = 0;

	/**
	 * The feature id for the '<em><b>Reservation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_AROOM__RESERVATION = 1;

	/**
	 * The feature id for the '<em><b>Booking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_AROOM__BOOKING = 2;

	/**
	 * The feature id for the '<em><b>Room Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_AROOM__ROOM_MANAGER = 3;

	/**
	 * The feature id for the '<em><b>Reservation Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_AROOM__RESERVATION_MANAGER = 4;

	/**
	 * The feature id for the '<em><b>Booking Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_AROOM__BOOKING_MANAGER = 5;

	/**
	 * The number of structural features of the '<em>reserve ARoom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_AROOM_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link model.impl.makeABookingImpl <em>make ABooking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.makeABookingImpl
	 * @see model.impl.ModelPackageImpl#getmakeABooking()
	 * @generated
	 */
	int MAKE_ABOOKING = 4;

	/**
	 * The feature id for the '<em><b>R</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_ABOOKING__R = 0;

	/**
	 * The feature id for the '<em><b>B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_ABOOKING__B = 1;

	/**
	 * The feature id for the '<em><b>C</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_ABOOKING__C = 2;

	/**
	 * The feature id for the '<em><b>Pd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_ABOOKING__PD = 3;

	/**
	 * The feature id for the '<em><b>Bank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_ABOOKING__BANK = 4;

	/**
	 * The feature id for the '<em><b>Bm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_ABOOKING__BM = 5;

	/**
	 * The feature id for the '<em><b>Cm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_ABOOKING__CM = 6;

	/**
	 * The number of structural features of the '<em>make ABooking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_ABOOKING_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link model.impl.checkOutSuccessImpl <em>check Out Success</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.checkOutSuccessImpl
	 * @see model.impl.ModelPackageImpl#getcheckOutSuccess()
	 * @generated
	 */
	int CHECK_OUT_SUCCESS = 5;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_OUT_SUCCESS__ACTOR = 0;

	/**
	 * The feature id for the '<em><b>Key Cards</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_OUT_SUCCESS__KEY_CARDS = 1;

	/**
	 * The feature id for the '<em><b>R</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_OUT_SUCCESS__R = 2;

	/**
	 * The feature id for the '<em><b>B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_OUT_SUCCESS__B = 3;

	/**
	 * The feature id for the '<em><b>Bank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_OUT_SUCCESS__BANK = 4;

	/**
	 * The feature id for the '<em><b>C</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_OUT_SUCCESS__C = 5;

	/**
	 * The feature id for the '<em><b>Rm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_OUT_SUCCESS__RM = 6;

	/**
	 * The feature id for the '<em><b>Bm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_OUT_SUCCESS__BM = 7;

	/**
	 * The number of structural features of the '<em>check Out Success</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_OUT_SUCCESS_FEATURE_COUNT = 8;


	/**
	 * Returns the meta object for class '{@link model.BookingActivity <em>Booking Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Activity</em>'.
	 * @see model.BookingActivity
	 * @generated
	 */
	EClass getBookingActivity();

	/**
	 * Returns the meta object for class '{@link model.showRoomOccupancy <em>show Room Occupancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>show Room Occupancy</em>'.
	 * @see model.showRoomOccupancy
	 * @generated
	 */
	EClass getshowRoomOccupancy();

	/**
	 * Returns the meta object for the reference '{@link model.showRoomOccupancy#getU <em>U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>U</em>'.
	 * @see model.showRoomOccupancy#getU()
	 * @see #getshowRoomOccupancy()
	 * @generated
	 */
	EReference getshowRoomOccupancy_U();

	/**
	 * Returns the meta object for the reference '{@link model.showRoomOccupancy#getRm <em>Rm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rm</em>'.
	 * @see model.showRoomOccupancy#getRm()
	 * @see #getshowRoomOccupancy()
	 * @generated
	 */
	EReference getshowRoomOccupancy_Rm();

	/**
	 * Returns the meta object for class '{@link model.CheckInSuccess <em>Check In Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check In Success</em>'.
	 * @see model.CheckInSuccess
	 * @generated
	 */
	EClass getCheckInSuccess();

	/**
	 * Returns the meta object for the reference '{@link model.CheckInSuccess#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>R</em>'.
	 * @see model.CheckInSuccess#getR()
	 * @see #getCheckInSuccess()
	 * @generated
	 */
	EReference getCheckInSuccess_R();

	/**
	 * Returns the meta object for the reference '{@link model.CheckInSuccess#getK <em>K</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>K</em>'.
	 * @see model.CheckInSuccess#getK()
	 * @see #getCheckInSuccess()
	 * @generated
	 */
	EReference getCheckInSuccess_K();

	/**
	 * Returns the meta object for the reference '{@link model.CheckInSuccess#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see model.CheckInSuccess#getCustomer()
	 * @see #getCheckInSuccess()
	 * @generated
	 */
	EReference getCheckInSuccess_Customer();

	/**
	 * Returns the meta object for the reference '{@link model.CheckInSuccess#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see model.CheckInSuccess#getActor()
	 * @see #getCheckInSuccess()
	 * @generated
	 */
	EReference getCheckInSuccess_Actor();

	/**
	 * Returns the meta object for the reference '{@link model.CheckInSuccess#getBm <em>Bm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bm</em>'.
	 * @see model.CheckInSuccess#getBm()
	 * @see #getCheckInSuccess()
	 * @generated
	 */
	EReference getCheckInSuccess_Bm();

	/**
	 * Returns the meta object for the reference '{@link model.CheckInSuccess#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>B</em>'.
	 * @see model.CheckInSuccess#getB()
	 * @see #getCheckInSuccess()
	 * @generated
	 */
	EReference getCheckInSuccess_B();

	/**
	 * Returns the meta object for class '{@link model.reserveARoom <em>reserve ARoom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>reserve ARoom</em>'.
	 * @see model.reserveARoom
	 * @generated
	 */
	EClass getreserveARoom();

	/**
	 * Returns the meta object for the reference '{@link model.reserveARoom#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>R</em>'.
	 * @see model.reserveARoom#getR()
	 * @see #getreserveARoom()
	 * @generated
	 */
	EReference getreserveARoom_R();

	/**
	 * Returns the meta object for the reference '{@link model.reserveARoom#getReservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservation</em>'.
	 * @see model.reserveARoom#getReservation()
	 * @see #getreserveARoom()
	 * @generated
	 */
	EReference getreserveARoom_Reservation();

	/**
	 * Returns the meta object for the reference '{@link model.reserveARoom#getBooking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booking</em>'.
	 * @see model.reserveARoom#getBooking()
	 * @see #getreserveARoom()
	 * @generated
	 */
	EReference getreserveARoom_Booking();

	/**
	 * Returns the meta object for the reference '{@link model.reserveARoom#getRoomManager <em>Room Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Manager</em>'.
	 * @see model.reserveARoom#getRoomManager()
	 * @see #getreserveARoom()
	 * @generated
	 */
	EReference getreserveARoom_RoomManager();

	/**
	 * Returns the meta object for the reference '{@link model.reserveARoom#getReservationManager <em>Reservation Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservation Manager</em>'.
	 * @see model.reserveARoom#getReservationManager()
	 * @see #getreserveARoom()
	 * @generated
	 */
	EReference getreserveARoom_ReservationManager();

	/**
	 * Returns the meta object for the reference '{@link model.reserveARoom#getBookingManager <em>Booking Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booking Manager</em>'.
	 * @see model.reserveARoom#getBookingManager()
	 * @see #getreserveARoom()
	 * @generated
	 */
	EReference getreserveARoom_BookingManager();

	/**
	 * Returns the meta object for class '{@link model.makeABooking <em>make ABooking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>make ABooking</em>'.
	 * @see model.makeABooking
	 * @generated
	 */
	EClass getmakeABooking();

	/**
	 * Returns the meta object for the reference '{@link model.makeABooking#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>R</em>'.
	 * @see model.makeABooking#getR()
	 * @see #getmakeABooking()
	 * @generated
	 */
	EReference getmakeABooking_R();

	/**
	 * Returns the meta object for the reference '{@link model.makeABooking#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>B</em>'.
	 * @see model.makeABooking#getB()
	 * @see #getmakeABooking()
	 * @generated
	 */
	EReference getmakeABooking_B();

	/**
	 * Returns the meta object for the reference '{@link model.makeABooking#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>C</em>'.
	 * @see model.makeABooking#getC()
	 * @see #getmakeABooking()
	 * @generated
	 */
	EReference getmakeABooking_C();

	/**
	 * Returns the meta object for the reference '{@link model.makeABooking#getPd <em>Pd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pd</em>'.
	 * @see model.makeABooking#getPd()
	 * @see #getmakeABooking()
	 * @generated
	 */
	EReference getmakeABooking_Pd();

	/**
	 * Returns the meta object for the reference '{@link model.makeABooking#getBank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bank</em>'.
	 * @see model.makeABooking#getBank()
	 * @see #getmakeABooking()
	 * @generated
	 */
	EReference getmakeABooking_Bank();

	/**
	 * Returns the meta object for the reference '{@link model.makeABooking#getBm <em>Bm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bm</em>'.
	 * @see model.makeABooking#getBm()
	 * @see #getmakeABooking()
	 * @generated
	 */
	EReference getmakeABooking_Bm();

	/**
	 * Returns the meta object for the reference '{@link model.makeABooking#getCm <em>Cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cm</em>'.
	 * @see model.makeABooking#getCm()
	 * @see #getmakeABooking()
	 * @generated
	 */
	EReference getmakeABooking_Cm();

	/**
	 * Returns the meta object for class '{@link model.checkOutSuccess <em>check Out Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>check Out Success</em>'.
	 * @see model.checkOutSuccess
	 * @generated
	 */
	EClass getcheckOutSuccess();

	/**
	 * Returns the meta object for the reference '{@link model.checkOutSuccess#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see model.checkOutSuccess#getActor()
	 * @see #getcheckOutSuccess()
	 * @generated
	 */
	EReference getcheckOutSuccess_Actor();

	/**
	 * Returns the meta object for the reference '{@link model.checkOutSuccess#getKeyCards <em>Key Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key Cards</em>'.
	 * @see model.checkOutSuccess#getKeyCards()
	 * @see #getcheckOutSuccess()
	 * @generated
	 */
	EReference getcheckOutSuccess_KeyCards();

	/**
	 * Returns the meta object for the reference '{@link model.checkOutSuccess#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>R</em>'.
	 * @see model.checkOutSuccess#getR()
	 * @see #getcheckOutSuccess()
	 * @generated
	 */
	EReference getcheckOutSuccess_R();

	/**
	 * Returns the meta object for the reference '{@link model.checkOutSuccess#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>B</em>'.
	 * @see model.checkOutSuccess#getB()
	 * @see #getcheckOutSuccess()
	 * @generated
	 */
	EReference getcheckOutSuccess_B();

	/**
	 * Returns the meta object for the reference '{@link model.checkOutSuccess#getBank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bank</em>'.
	 * @see model.checkOutSuccess#getBank()
	 * @see #getcheckOutSuccess()
	 * @generated
	 */
	EReference getcheckOutSuccess_Bank();

	/**
	 * Returns the meta object for the reference '{@link model.checkOutSuccess#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>C</em>'.
	 * @see model.checkOutSuccess#getC()
	 * @see #getcheckOutSuccess()
	 * @generated
	 */
	EReference getcheckOutSuccess_C();

	/**
	 * Returns the meta object for the reference '{@link model.checkOutSuccess#getRm <em>Rm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rm</em>'.
	 * @see model.checkOutSuccess#getRm()
	 * @see #getcheckOutSuccess()
	 * @generated
	 */
	EReference getcheckOutSuccess_Rm();

	/**
	 * Returns the meta object for the reference '{@link model.checkOutSuccess#getBm <em>Bm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bm</em>'.
	 * @see model.checkOutSuccess#getBm()
	 * @see #getcheckOutSuccess()
	 * @generated
	 */
	EReference getcheckOutSuccess_Bm();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link model.impl.BookingActivityImpl <em>Booking Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.BookingActivityImpl
		 * @see model.impl.ModelPackageImpl#getBookingActivity()
		 * @generated
		 */
		EClass BOOKING_ACTIVITY = eINSTANCE.getBookingActivity();

		/**
		 * The meta object literal for the '{@link model.impl.showRoomOccupancyImpl <em>show Room Occupancy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.showRoomOccupancyImpl
		 * @see model.impl.ModelPackageImpl#getshowRoomOccupancy()
		 * @generated
		 */
		EClass SHOW_ROOM_OCCUPANCY = eINSTANCE.getshowRoomOccupancy();

		/**
		 * The meta object literal for the '<em><b>U</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOW_ROOM_OCCUPANCY__U = eINSTANCE.getshowRoomOccupancy_U();

		/**
		 * The meta object literal for the '<em><b>Rm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOW_ROOM_OCCUPANCY__RM = eINSTANCE.getshowRoomOccupancy_Rm();

		/**
		 * The meta object literal for the '{@link model.impl.CheckInSuccessImpl <em>Check In Success</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.CheckInSuccessImpl
		 * @see model.impl.ModelPackageImpl#getCheckInSuccess()
		 * @generated
		 */
		EClass CHECK_IN_SUCCESS = eINSTANCE.getCheckInSuccess();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_IN_SUCCESS__R = eINSTANCE.getCheckInSuccess_R();

		/**
		 * The meta object literal for the '<em><b>K</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_IN_SUCCESS__K = eINSTANCE.getCheckInSuccess_K();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_IN_SUCCESS__CUSTOMER = eINSTANCE.getCheckInSuccess_Customer();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_IN_SUCCESS__ACTOR = eINSTANCE.getCheckInSuccess_Actor();

		/**
		 * The meta object literal for the '<em><b>Bm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_IN_SUCCESS__BM = eINSTANCE.getCheckInSuccess_Bm();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_IN_SUCCESS__B = eINSTANCE.getCheckInSuccess_B();

		/**
		 * The meta object literal for the '{@link model.impl.reserveARoomImpl <em>reserve ARoom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.reserveARoomImpl
		 * @see model.impl.ModelPackageImpl#getreserveARoom()
		 * @generated
		 */
		EClass RESERVE_AROOM = eINSTANCE.getreserveARoom();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVE_AROOM__R = eINSTANCE.getreserveARoom_R();

		/**
		 * The meta object literal for the '<em><b>Reservation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVE_AROOM__RESERVATION = eINSTANCE.getreserveARoom_Reservation();

		/**
		 * The meta object literal for the '<em><b>Booking</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVE_AROOM__BOOKING = eINSTANCE.getreserveARoom_Booking();

		/**
		 * The meta object literal for the '<em><b>Room Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVE_AROOM__ROOM_MANAGER = eINSTANCE.getreserveARoom_RoomManager();

		/**
		 * The meta object literal for the '<em><b>Reservation Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVE_AROOM__RESERVATION_MANAGER = eINSTANCE.getreserveARoom_ReservationManager();

		/**
		 * The meta object literal for the '<em><b>Booking Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVE_AROOM__BOOKING_MANAGER = eINSTANCE.getreserveARoom_BookingManager();

		/**
		 * The meta object literal for the '{@link model.impl.makeABookingImpl <em>make ABooking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.makeABookingImpl
		 * @see model.impl.ModelPackageImpl#getmakeABooking()
		 * @generated
		 */
		EClass MAKE_ABOOKING = eINSTANCE.getmakeABooking();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAKE_ABOOKING__R = eINSTANCE.getmakeABooking_R();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAKE_ABOOKING__B = eINSTANCE.getmakeABooking_B();

		/**
		 * The meta object literal for the '<em><b>C</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAKE_ABOOKING__C = eINSTANCE.getmakeABooking_C();

		/**
		 * The meta object literal for the '<em><b>Pd</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAKE_ABOOKING__PD = eINSTANCE.getmakeABooking_Pd();

		/**
		 * The meta object literal for the '<em><b>Bank</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAKE_ABOOKING__BANK = eINSTANCE.getmakeABooking_Bank();

		/**
		 * The meta object literal for the '<em><b>Bm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAKE_ABOOKING__BM = eINSTANCE.getmakeABooking_Bm();

		/**
		 * The meta object literal for the '<em><b>Cm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAKE_ABOOKING__CM = eINSTANCE.getmakeABooking_Cm();

		/**
		 * The meta object literal for the '{@link model.impl.checkOutSuccessImpl <em>check Out Success</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.checkOutSuccessImpl
		 * @see model.impl.ModelPackageImpl#getcheckOutSuccess()
		 * @generated
		 */
		EClass CHECK_OUT_SUCCESS = eINSTANCE.getcheckOutSuccess();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_OUT_SUCCESS__ACTOR = eINSTANCE.getcheckOutSuccess_Actor();

		/**
		 * The meta object literal for the '<em><b>Key Cards</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_OUT_SUCCESS__KEY_CARDS = eINSTANCE.getcheckOutSuccess_KeyCards();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_OUT_SUCCESS__R = eINSTANCE.getcheckOutSuccess_R();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_OUT_SUCCESS__B = eINSTANCE.getcheckOutSuccess_B();

		/**
		 * The meta object literal for the '<em><b>Bank</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_OUT_SUCCESS__BANK = eINSTANCE.getcheckOutSuccess_Bank();

		/**
		 * The meta object literal for the '<em><b>C</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_OUT_SUCCESS__C = eINSTANCE.getcheckOutSuccess_C();

		/**
		 * The meta object literal for the '<em><b>Rm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_OUT_SUCCESS__RM = eINSTANCE.getcheckOutSuccess_Rm();

		/**
		 * The meta object literal for the '<em><b>Bm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_OUT_SUCCESS__BM = eINSTANCE.getcheckOutSuccess_Bm();

	}

} //ModelPackage
