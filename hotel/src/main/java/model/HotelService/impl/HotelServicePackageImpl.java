/**
 */
package model.HotelService.impl;

import HotelSystem.HotelSystemPackage;

import HotelSystem.impl.HotelSystemPackageImpl;

import model.BankingService.BankingServicePackage;

import model.BankingService.impl.BankingServicePackageImpl;

import model.HotelService.HotelManager;
import model.HotelService.HotelManagerProvides;
import model.HotelService.HotelReceptionist;
import model.HotelService.HotelServiceFactory;
import model.HotelService.HotelServicePackage;
import model.HotelService.HotelStaff;
import model.HotelService.HotelStaffProvides;
import model.HotelService.IBookingManager;
import model.HotelService.ICustomerManager;
import model.HotelService.IReservationManager;
import model.HotelService.IRoomManager;
import model.HotelService.IRoomTypeManager;

import model.KeyCardService.KeyCardServicePackage;

import model.KeyCardService.impl.KeyCardServicePackageImpl;

import model.ModelPackage;

import model.impl.ModelPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HotelServicePackageImpl extends EPackageImpl implements HotelServicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotelReceptionistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iRoomManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBookingManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iReservationManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotelManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotelManagerProvidesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotelStaffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotelStaffProvidesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iRoomTypeManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iCustomerManagerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see model.HotelService.HotelServicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HotelServicePackageImpl() {
		super(eNS_URI, HotelServiceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link HotelServicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HotelServicePackage init() {
		if (isInited) return (HotelServicePackage)EPackage.Registry.INSTANCE.getEPackage(HotelServicePackage.eNS_URI);

		// Obtain or create and register package
		HotelServicePackageImpl theHotelServicePackage = (HotelServicePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HotelServicePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HotelServicePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		HotelSystemPackageImpl theHotelSystemPackage = (HotelSystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HotelSystemPackage.eNS_URI) instanceof HotelSystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HotelSystemPackage.eNS_URI) : HotelSystemPackage.eINSTANCE);
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		BankingServicePackageImpl theBankingServicePackage = (BankingServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BankingServicePackage.eNS_URI) instanceof BankingServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BankingServicePackage.eNS_URI) : BankingServicePackage.eINSTANCE);
		KeyCardServicePackageImpl theKeyCardServicePackage = (KeyCardServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KeyCardServicePackage.eNS_URI) instanceof KeyCardServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KeyCardServicePackage.eNS_URI) : KeyCardServicePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theHotelServicePackage.createPackageContents();
		theHotelSystemPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theBankingServicePackage.createPackageContents();
		theKeyCardServicePackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theHotelServicePackage.initializePackageContents();
		theHotelSystemPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theBankingServicePackage.initializePackageContents();
		theKeyCardServicePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHotelServicePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HotelServicePackage.eNS_URI, theHotelServicePackage);
		return theHotelServicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotelReceptionist() {
		return hotelReceptionistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIRoomManager() {
		return iRoomManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomManager__GetAvailableRooms__Date_Date_EList() {
		return iRoomManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomManager__GetRoomOccupancy__Date_Date() {
		return iRoomManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBookingManager() {
		return iBookingManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManager__CreateBooking() {
		return iBookingManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManager__GetBookingByNumber__long() {
		return iBookingManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManager__DeleteBooking__Booking() {
		return iBookingManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManager__GetBookingsByCustomer__Customer() {
		return iBookingManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManager__SetBookingCustomer__Booking_Customer() {
		return iBookingManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManager__IsBillPaidInFull__Booking() {
		return iBookingManagerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManager__GetBill__Booking() {
		return iBookingManagerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManager__GetBookingByReservation__Reservation_Booking() {
		return iBookingManagerEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIReservationManager() {
		return iReservationManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIReservationManager__CreateReservation__Booking_Date_Date_long_long() {
		return iReservationManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIReservationManager__GetReservation__long() {
		return iReservationManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIReservationManager__GetNonCheckedInReservation__Booking() {
		return iReservationManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIReservationManager__CheckInReservation__long() {
		return iReservationManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIReservationManager__CheckOutReservation__Reservation() {
		return iReservationManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIReservationManager__GetCurrentReservationByRoomNumber__int() {
		return iReservationManagerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotelManager() {
		return hotelManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotelManagerProvides() {
		return hotelManagerProvidesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotelStaff() {
		return hotelStaffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotelStaffProvides() {
		return hotelStaffProvidesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIRoomTypeManager() {
		return iRoomTypeManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomTypeManager__GetRoomTypes() {
		return iRoomTypeManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getICustomerManager() {
		return iCustomerManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomerManager__GetCustomerByIdNumber__String() {
		return iCustomerManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomerManager__GetCustomersByName__String() {
		return iCustomerManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomerManager__GetCustomer__long() {
		return iCustomerManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomerManager__CreateCustomer__String_String() {
		return iCustomerManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomerManager__SetPaymentDetailsForCustomer__Customer_String_String_String_String_int_int() {
		return iCustomerManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomerManager__GetPaymentDetailsByCustomer__Customer() {
		return iCustomerManagerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelServiceFactory getHotelServiceFactory() {
		return (HotelServiceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		hotelReceptionistEClass = createEClass(HOTEL_RECEPTIONIST);

		iRoomManagerEClass = createEClass(IROOM_MANAGER);
		createEOperation(iRoomManagerEClass, IROOM_MANAGER___GET_AVAILABLE_ROOMS__DATE_DATE_ELIST);
		createEOperation(iRoomManagerEClass, IROOM_MANAGER___GET_ROOM_OCCUPANCY__DATE_DATE);

		iBookingManagerEClass = createEClass(IBOOKING_MANAGER);
		createEOperation(iBookingManagerEClass, IBOOKING_MANAGER___CREATE_BOOKING);
		createEOperation(iBookingManagerEClass, IBOOKING_MANAGER___GET_BOOKING_BY_NUMBER__LONG);
		createEOperation(iBookingManagerEClass, IBOOKING_MANAGER___DELETE_BOOKING__BOOKING);
		createEOperation(iBookingManagerEClass, IBOOKING_MANAGER___GET_BOOKINGS_BY_CUSTOMER__CUSTOMER);
		createEOperation(iBookingManagerEClass, IBOOKING_MANAGER___SET_BOOKING_CUSTOMER__BOOKING_CUSTOMER);
		createEOperation(iBookingManagerEClass, IBOOKING_MANAGER___IS_BILL_PAID_IN_FULL__BOOKING);
		createEOperation(iBookingManagerEClass, IBOOKING_MANAGER___GET_BILL__BOOKING);
		createEOperation(iBookingManagerEClass, IBOOKING_MANAGER___GET_BOOKING_BY_RESERVATION__RESERVATION_BOOKING);

		iReservationManagerEClass = createEClass(IRESERVATION_MANAGER);
		createEOperation(iReservationManagerEClass, IRESERVATION_MANAGER___CREATE_RESERVATION__BOOKING_DATE_DATE_LONG_LONG);
		createEOperation(iReservationManagerEClass, IRESERVATION_MANAGER___GET_RESERVATION__LONG);
		createEOperation(iReservationManagerEClass, IRESERVATION_MANAGER___GET_NON_CHECKED_IN_RESERVATION__BOOKING);
		createEOperation(iReservationManagerEClass, IRESERVATION_MANAGER___CHECK_IN_RESERVATION__LONG);
		createEOperation(iReservationManagerEClass, IRESERVATION_MANAGER___CHECK_OUT_RESERVATION__RESERVATION);
		createEOperation(iReservationManagerEClass, IRESERVATION_MANAGER___GET_CURRENT_RESERVATION_BY_ROOM_NUMBER__INT);

		hotelManagerEClass = createEClass(HOTEL_MANAGER);

		hotelManagerProvidesEClass = createEClass(HOTEL_MANAGER_PROVIDES);

		hotelStaffEClass = createEClass(HOTEL_STAFF);

		hotelStaffProvidesEClass = createEClass(HOTEL_STAFF_PROVIDES);

		iRoomTypeManagerEClass = createEClass(IROOM_TYPE_MANAGER);
		createEOperation(iRoomTypeManagerEClass, IROOM_TYPE_MANAGER___GET_ROOM_TYPES);

		iCustomerManagerEClass = createEClass(ICUSTOMER_MANAGER);
		createEOperation(iCustomerManagerEClass, ICUSTOMER_MANAGER___GET_CUSTOMER_BY_ID_NUMBER__STRING);
		createEOperation(iCustomerManagerEClass, ICUSTOMER_MANAGER___GET_CUSTOMERS_BY_NAME__STRING);
		createEOperation(iCustomerManagerEClass, ICUSTOMER_MANAGER___GET_CUSTOMER__LONG);
		createEOperation(iCustomerManagerEClass, ICUSTOMER_MANAGER___CREATE_CUSTOMER__STRING_STRING);
		createEOperation(iCustomerManagerEClass, ICUSTOMER_MANAGER___SET_PAYMENT_DETAILS_FOR_CUSTOMER__CUSTOMER_STRING_STRING_STRING_STRING_INT_INT);
		createEOperation(iCustomerManagerEClass, ICUSTOMER_MANAGER___GET_PAYMENT_DETAILS_BY_CUSTOMER__CUSTOMER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		HotelSystemPackage theHotelSystemPackage = (HotelSystemPackage)EPackage.Registry.INSTANCE.getEPackage(HotelSystemPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(hotelReceptionistEClass, HotelReceptionist.class, "HotelReceptionist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iRoomManagerEClass, IRoomManager.class, "IRoomManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getIRoomManager__GetAvailableRooms__Date_Date_EList(), theHotelSystemPackage.getRoom(), "getAvailableRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fromDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "toDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelSystemPackage.getRoomType(), "roomTypeIds", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomManager__GetRoomOccupancy__Date_Date(), ecorePackage.getEMap(), "getRoomOccupancy", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fromDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "toDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iBookingManagerEClass, IBookingManager.class, "IBookingManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIBookingManager__CreateBooking(), theHotelSystemPackage.getBooking(), "createBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManager__GetBookingByNumber__long(), theHotelSystemPackage.getBooking(), "getBookingByNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManager__DeleteBooking__Booking(), null, "deleteBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelSystemPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManager__GetBookingsByCustomer__Customer(), ecorePackage.getEEList(), "getBookingsByCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelSystemPackage.getCustomer(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManager__SetBookingCustomer__Booking_Customer(), null, "setBookingCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelSystemPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelSystemPackage.getCustomer(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManager__IsBillPaidInFull__Booking(), ecorePackage.getEBoolean(), "isBillPaidInFull", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelSystemPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManager__GetBill__Booking(), theHotelSystemPackage.getBill(), "getBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelSystemPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManager__GetBookingByReservation__Reservation_Booking(), null, "getBookingByReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelSystemPackage.getReservation(), "reservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelSystemPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iReservationManagerEClass, IReservationManager.class, "IReservationManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIReservationManager__CreateReservation__Booking_Date_Date_long_long(), ecorePackage.getEBoolean(), "createReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelSystemPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fromDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "toDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "roomId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "costCategoryId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIReservationManager__GetReservation__long(), theHotelSystemPackage.getReservation(), "getReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "reservationId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIReservationManager__GetNonCheckedInReservation__Booking(), theHotelSystemPackage.getReservation(), "getNonCheckedInReservation", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelSystemPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIReservationManager__CheckInReservation__long(), ecorePackage.getEBoolean(), "checkInReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "reservationId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIReservationManager__CheckOutReservation__Reservation(), ecorePackage.getEBoolean(), "checkOutReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelSystemPackage.getReservation(), "reservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIReservationManager__GetCurrentReservationByRoomNumber__int(), theHotelSystemPackage.getReservation(), "getCurrentReservationByRoomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(hotelManagerEClass, HotelManager.class, "HotelManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hotelManagerProvidesEClass, HotelManagerProvides.class, "HotelManagerProvides", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hotelStaffEClass, HotelStaff.class, "HotelStaff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hotelStaffProvidesEClass, HotelStaffProvides.class, "HotelStaffProvides", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iRoomTypeManagerEClass, IRoomTypeManager.class, "IRoomTypeManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIRoomTypeManager__GetRoomTypes(), theHotelSystemPackage.getRoomType(), "getRoomTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iCustomerManagerEClass, ICustomerManager.class, "ICustomerManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getICustomerManager__GetCustomerByIdNumber__String(), ecorePackage.getELong(), "getCustomerByIdNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "idNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getICustomerManager__GetCustomersByName__String(), theHotelSystemPackage.getCustomer(), "getCustomersByName", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getICustomerManager__GetCustomer__long(), theHotelSystemPackage.getCustomer(), "getCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "customerId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getICustomerManager__CreateCustomer__String_String(), theHotelSystemPackage.getCustomer(), "createCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "idNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getICustomerManager__SetPaymentDetailsForCustomer__Customer_String_String_String_String_int_int(), ecorePackage.getELong(), "setPaymentDetailsForCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelSystemPackage.getCustomer(), "customerId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccvNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expireMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expireYear", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getICustomerManager__GetPaymentDetailsByCustomer__Customer(), theHotelSystemPackage.getPaymentDetails(), "getPaymentDetailsByCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelSystemPackage.getCustomer(), "customerId", 1, 1, IS_UNIQUE, !IS_ORDERED);
	}

} //HotelServicePackageImpl
