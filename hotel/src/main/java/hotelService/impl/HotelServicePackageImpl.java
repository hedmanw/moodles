/**
 */
package hotelService.impl;

import hotelCore.HotelCorePackage;

import hotelCore.impl.HotelCorePackageImpl;

import hotelService.BookingManager;
import hotelService.CustomerManager;
import hotelService.ExternalUser;
import hotelService.HotelManager;
import hotelService.HotelReceptionist;
import hotelService.HotelServiceFactory;
import hotelService.HotelServicePackage;
import hotelService.HotelStaff;
import hotelService.IBookingManager;
import hotelService.ICustomerManager;
import hotelService.IReservationManager;
import hotelService.IRoomManager;
import hotelService.IRoomTypeManager;
import hotelService.ReservationManager;
import hotelService.RoomManager;
import hotelService.RoomTypeManager;
import hotelService.SystemUser;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	private EClass systemUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalUserEClass = null;

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
	private EClass hotelReceptionistEClass = null;

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
	private EClass iRoomManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomManagerEClass = null;

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
	private EClass roomTypeManagerEClass = null;

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
	private EClass reservationManagerEClass = null;

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
	private EClass bookingManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iCustomerManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerManagerEClass = null;

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
	 * @see hotelService.HotelServicePackage#eNS_URI
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
		HotelCorePackageImpl theHotelCorePackage = (HotelCorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HotelCorePackage.eNS_URI) instanceof HotelCorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HotelCorePackage.eNS_URI) : HotelCorePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theHotelServicePackage.createPackageContents();
		theHotelCorePackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theHotelServicePackage.initializePackageContents();
		theHotelCorePackage.initializePackageContents();
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
	public EClass getSystemUser() {
		return systemUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalUser() {
		return externalUserEClass;
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
	public EClass getHotelReceptionist() {
		return hotelReceptionistEClass;
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
	public EOperation getIRoomManager__CreateRoom__int_RoomType() {
		return iRoomManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomManager() {
		return roomManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomManager_AllRooms() {
		return (EReference)roomManagerEClass.getEStructuralFeatures().get(0);
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
	public EOperation getIRoomTypeManager__CreateRoomType__String_double() {
		return iRoomTypeManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomTypeManager() {
		return roomTypeManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomTypeManager_AllRoomTypes() {
		return (EReference)roomTypeManagerEClass.getEStructuralFeatures().get(0);
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
	public EOperation getIReservationManager__CreateReservation__Booking_Date_Date_Room_RoomType() {
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
	public EClass getReservationManager() {
		return reservationManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservationManager_AllReservations() {
		return (EReference)reservationManagerEClass.getEStructuralFeatures().get(0);
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
	public EOperation getIBookingManager__GetBookingByBookingNumber__int() {
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
	public EOperation getIBookingManager__GetBookingByReservation__Reservation() {
		return iBookingManagerEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookingManager__MakePaymentIfAllReservationsCheckedOut__Booking() {
		return iBookingManagerEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingManager() {
		return bookingManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingManager_AllBookings() {
		return (EReference)bookingManagerEClass.getEStructuralFeatures().get(0);
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
	public EClass getCustomerManager() {
		return customerManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerManager_AllCustomers() {
		return (EReference)customerManagerEClass.getEStructuralFeatures().get(0);
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
		systemUserEClass = createEClass(SYSTEM_USER);

		externalUserEClass = createEClass(EXTERNAL_USER);

		hotelStaffEClass = createEClass(HOTEL_STAFF);

		hotelReceptionistEClass = createEClass(HOTEL_RECEPTIONIST);

		hotelManagerEClass = createEClass(HOTEL_MANAGER);

		iRoomManagerEClass = createEClass(IROOM_MANAGER);
		createEOperation(iRoomManagerEClass, IROOM_MANAGER___GET_AVAILABLE_ROOMS__DATE_DATE_ELIST);
		createEOperation(iRoomManagerEClass, IROOM_MANAGER___GET_ROOM_OCCUPANCY__DATE_DATE);
		createEOperation(iRoomManagerEClass, IROOM_MANAGER___CREATE_ROOM__INT_ROOMTYPE);

		roomManagerEClass = createEClass(ROOM_MANAGER);
		createEReference(roomManagerEClass, ROOM_MANAGER__ALL_ROOMS);

		iRoomTypeManagerEClass = createEClass(IROOM_TYPE_MANAGER);
		createEOperation(iRoomTypeManagerEClass, IROOM_TYPE_MANAGER___GET_ROOM_TYPES);
		createEOperation(iRoomTypeManagerEClass, IROOM_TYPE_MANAGER___CREATE_ROOM_TYPE__STRING_DOUBLE);

		roomTypeManagerEClass = createEClass(ROOM_TYPE_MANAGER);
		createEReference(roomTypeManagerEClass, ROOM_TYPE_MANAGER__ALL_ROOM_TYPES);

		iReservationManagerEClass = createEClass(IRESERVATION_MANAGER);
		createEOperation(iReservationManagerEClass, IRESERVATION_MANAGER___CREATE_RESERVATION__BOOKING_DATE_DATE_ROOM_ROOMTYPE);
		createEOperation(iReservationManagerEClass, IRESERVATION_MANAGER___GET_RESERVATION__LONG);
		createEOperation(iReservationManagerEClass, IRESERVATION_MANAGER___GET_NON_CHECKED_IN_RESERVATION__BOOKING);
		createEOperation(iReservationManagerEClass, IRESERVATION_MANAGER___CHECK_IN_RESERVATION__LONG);
		createEOperation(iReservationManagerEClass, IRESERVATION_MANAGER___CHECK_OUT_RESERVATION__RESERVATION);
		createEOperation(iReservationManagerEClass, IRESERVATION_MANAGER___GET_CURRENT_RESERVATION_BY_ROOM_NUMBER__INT);

		reservationManagerEClass = createEClass(RESERVATION_MANAGER);
		createEReference(reservationManagerEClass, RESERVATION_MANAGER__ALL_RESERVATIONS);

		iBookingManagerEClass = createEClass(IBOOKING_MANAGER);
		createEOperation(iBookingManagerEClass, IBOOKING_MANAGER___CREATE_BOOKING);
		createEOperation(iBookingManagerEClass, IBOOKING_MANAGER___GET_BOOKING_BY_BOOKING_NUMBER__INT);
		createEOperation(iBookingManagerEClass, IBOOKING_MANAGER___DELETE_BOOKING__BOOKING);
		createEOperation(iBookingManagerEClass, IBOOKING_MANAGER___GET_BOOKINGS_BY_CUSTOMER__CUSTOMER);
		createEOperation(iBookingManagerEClass, IBOOKING_MANAGER___SET_BOOKING_CUSTOMER__BOOKING_CUSTOMER);
		createEOperation(iBookingManagerEClass, IBOOKING_MANAGER___IS_BILL_PAID_IN_FULL__BOOKING);
		createEOperation(iBookingManagerEClass, IBOOKING_MANAGER___GET_BILL__BOOKING);
		createEOperation(iBookingManagerEClass, IBOOKING_MANAGER___GET_BOOKING_BY_RESERVATION__RESERVATION);
		createEOperation(iBookingManagerEClass, IBOOKING_MANAGER___MAKE_PAYMENT_IF_ALL_RESERVATIONS_CHECKED_OUT__BOOKING);

		bookingManagerEClass = createEClass(BOOKING_MANAGER);
		createEReference(bookingManagerEClass, BOOKING_MANAGER__ALL_BOOKINGS);

		iCustomerManagerEClass = createEClass(ICUSTOMER_MANAGER);
		createEOperation(iCustomerManagerEClass, ICUSTOMER_MANAGER___GET_CUSTOMER_BY_ID_NUMBER__STRING);
		createEOperation(iCustomerManagerEClass, ICUSTOMER_MANAGER___GET_CUSTOMERS_BY_NAME__STRING);
		createEOperation(iCustomerManagerEClass, ICUSTOMER_MANAGER___GET_CUSTOMER__LONG);
		createEOperation(iCustomerManagerEClass, ICUSTOMER_MANAGER___CREATE_CUSTOMER__STRING_STRING);
		createEOperation(iCustomerManagerEClass, ICUSTOMER_MANAGER___SET_PAYMENT_DETAILS_FOR_CUSTOMER__CUSTOMER_STRING_STRING_STRING_STRING_INT_INT);
		createEOperation(iCustomerManagerEClass, ICUSTOMER_MANAGER___GET_PAYMENT_DETAILS_BY_CUSTOMER__CUSTOMER);

		customerManagerEClass = createEClass(CUSTOMER_MANAGER);
		createEReference(customerManagerEClass, CUSTOMER_MANAGER__ALL_CUSTOMERS);
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
		HotelCorePackage theHotelCorePackage = (HotelCorePackage)EPackage.Registry.INSTANCE.getEPackage(HotelCorePackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		roomManagerEClass.getESuperTypes().add(this.getIRoomManager());
		roomTypeManagerEClass.getESuperTypes().add(this.getIRoomTypeManager());
		reservationManagerEClass.getESuperTypes().add(this.getIReservationManager());
		bookingManagerEClass.getESuperTypes().add(this.getIBookingManager());
		customerManagerEClass.getESuperTypes().add(this.getICustomerManager());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemUserEClass, SystemUser.class, "SystemUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalUserEClass, ExternalUser.class, "ExternalUser", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hotelStaffEClass, HotelStaff.class, "HotelStaff", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hotelReceptionistEClass, HotelReceptionist.class, "HotelReceptionist", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hotelManagerEClass, HotelManager.class, "HotelManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iRoomManagerEClass, IRoomManager.class, "IRoomManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getIRoomManager__GetAvailableRooms__Date_Date_EList(), theHotelCorePackage.getRoom(), "getAvailableRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fromDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "toDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelCorePackage.getRoomType(), "roomTypeIds", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomManager__GetRoomOccupancy__Date_Date(), ecorePackage.getEMap(), "getRoomOccupancy", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fromDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "toDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomManager__CreateRoom__int_RoomType(), theHotelCorePackage.getRoom(), "createRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelCorePackage.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomManagerEClass, RoomManager.class, "RoomManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomManager_AllRooms(), theHotelCorePackage.getRoom(), null, "allRooms", null, 0, -1, RoomManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iRoomTypeManagerEClass, IRoomTypeManager.class, "IRoomTypeManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIRoomTypeManager__GetRoomTypes(), theHotelCorePackage.getRoomType(), "getRoomTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomTypeManager__CreateRoomType__String_double(), theHotelCorePackage.getRoomType(), "createRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "costPerNight", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomTypeManagerEClass, RoomTypeManager.class, "RoomTypeManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomTypeManager_AllRoomTypes(), theHotelCorePackage.getRoomType(), null, "allRoomTypes", null, 0, -1, RoomTypeManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iReservationManagerEClass, IReservationManager.class, "IReservationManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIReservationManager__CreateReservation__Booking_Date_Date_Room_RoomType(), theHotelCorePackage.getReservation(), "createReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelCorePackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fromDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "toDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelCorePackage.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelCorePackage.getRoomType(), "costCategory", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIReservationManager__GetReservation__long(), theHotelCorePackage.getReservation(), "getReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "reservationId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIReservationManager__GetNonCheckedInReservation__Booking(), theHotelCorePackage.getReservation(), "getNonCheckedInReservation", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelCorePackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIReservationManager__CheckInReservation__long(), ecorePackage.getEBoolean(), "checkInReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "reservationId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIReservationManager__CheckOutReservation__Reservation(), null, "checkOutReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelCorePackage.getReservation(), "reservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIReservationManager__GetCurrentReservationByRoomNumber__int(), theHotelCorePackage.getReservation(), "getCurrentReservationByRoomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(reservationManagerEClass, ReservationManager.class, "ReservationManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReservationManager_AllReservations(), theHotelCorePackage.getReservation(), null, "allReservations", null, 0, -1, ReservationManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iBookingManagerEClass, IBookingManager.class, "IBookingManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIBookingManager__CreateBooking(), theHotelCorePackage.getBooking(), "createBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManager__GetBookingByBookingNumber__int(), theHotelCorePackage.getBooking(), "getBookingByBookingNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManager__DeleteBooking__Booking(), null, "deleteBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelCorePackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManager__GetBookingsByCustomer__Customer(), theHotelCorePackage.getBooking(), "getBookingsByCustomer", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelCorePackage.getCustomer(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManager__SetBookingCustomer__Booking_Customer(), null, "setBookingCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelCorePackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelCorePackage.getCustomer(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManager__IsBillPaidInFull__Booking(), ecorePackage.getEBoolean(), "isBillPaidInFull", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelCorePackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManager__GetBill__Booking(), theHotelCorePackage.getBill(), "getBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelCorePackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManager__GetBookingByReservation__Reservation(), theHotelCorePackage.getBooking(), "getBookingByReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelCorePackage.getReservation(), "reservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookingManager__MakePaymentIfAllReservationsCheckedOut__Booking(), null, "makePaymentIfAllReservationsCheckedOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelCorePackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookingManagerEClass, BookingManager.class, "BookingManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBookingManager_AllBookings(), theHotelCorePackage.getBooking(), null, "allBookings", null, 0, -1, BookingManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iCustomerManagerEClass, ICustomerManager.class, "ICustomerManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getICustomerManager__GetCustomerByIdNumber__String(), ecorePackage.getELong(), "getCustomerByIdNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "idNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getICustomerManager__GetCustomersByName__String(), theHotelCorePackage.getCustomer(), "getCustomersByName", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getICustomerManager__GetCustomer__long(), theHotelCorePackage.getCustomer(), "getCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "customerId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getICustomerManager__CreateCustomer__String_String(), theHotelCorePackage.getCustomer(), "createCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "idNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getICustomerManager__SetPaymentDetailsForCustomer__Customer_String_String_String_String_int_int(), ecorePackage.getELong(), "setPaymentDetailsForCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelCorePackage.getCustomer(), "customerId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccvNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expireMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expireYear", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getICustomerManager__GetPaymentDetailsByCustomer__Customer(), theHotelCorePackage.getPaymentDetails(), "getPaymentDetailsByCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelCorePackage.getCustomer(), "customerId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(customerManagerEClass, CustomerManager.class, "CustomerManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerManager_AllCustomers(), theHotelCorePackage.getCustomer(), null, "allCustomers", null, 0, -1, CustomerManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //HotelServicePackageImpl
