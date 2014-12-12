/**
 */
package model.impl;

import model.BankingService.BankingServicePackage;

import model.BankingService.impl.BankingServicePackageImpl;

import model.BookingActivity;
import model.CheckInSuccess;

import model.HotelCore.HotelCorePackage;
import model.HotelCore.impl.HotelCorePackageImpl;
import model.HotelService.HotelServicePackage;

import model.HotelService.impl.HotelServicePackageImpl;

import model.KeyCardService.KeyCardServicePackage;

import model.KeyCardService.impl.KeyCardServicePackageImpl;

import model.ModelFactory;
import model.ModelPackage;
import model.checkOutSuccess;
import model.makeABooking;
import model.reserveARoom;
import model.showRoomOccupancy;

import org.eclipse.emf.ecore.EClass;
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
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass showRoomOccupancyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkInSuccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reserveARoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass makeABookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkOutSuccessEClass = null;

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
	 * @see model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		HotelCorePackageImpl theHotelCorePackage = (HotelCorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HotelCorePackage.eNS_URI) instanceof HotelCorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HotelCorePackage.eNS_URI) : HotelCorePackage.eINSTANCE);
		BankingServicePackageImpl theBankingServicePackage = (BankingServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BankingServicePackage.eNS_URI) instanceof BankingServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BankingServicePackage.eNS_URI) : BankingServicePackage.eINSTANCE);
		KeyCardServicePackageImpl theKeyCardServicePackage = (KeyCardServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KeyCardServicePackage.eNS_URI) instanceof KeyCardServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KeyCardServicePackage.eNS_URI) : KeyCardServicePackage.eINSTANCE);
		HotelServicePackageImpl theHotelServicePackage = (HotelServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HotelServicePackage.eNS_URI) instanceof HotelServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HotelServicePackage.eNS_URI) : HotelServicePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theModelPackage.createPackageContents();
		theHotelCorePackage.createPackageContents();
		theBankingServicePackage.createPackageContents();
		theKeyCardServicePackage.createPackageContents();
		theHotelServicePackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();
		theHotelCorePackage.initializePackageContents();
		theBankingServicePackage.initializePackageContents();
		theKeyCardServicePackage.initializePackageContents();
		theHotelServicePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingActivity() {
		return bookingActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getshowRoomOccupancy() {
		return showRoomOccupancyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getshowRoomOccupancy_U() {
		return (EReference)showRoomOccupancyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getshowRoomOccupancy_Rm() {
		return (EReference)showRoomOccupancyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckInSuccess() {
		return checkInSuccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckInSuccess_R() {
		return (EReference)checkInSuccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckInSuccess_K() {
		return (EReference)checkInSuccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckInSuccess_Customer() {
		return (EReference)checkInSuccessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckInSuccess_Actor() {
		return (EReference)checkInSuccessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckInSuccess_Bm() {
		return (EReference)checkInSuccessEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckInSuccess_B() {
		return (EReference)checkInSuccessEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getreserveARoom() {
		return reserveARoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getreserveARoom_R() {
		return (EReference)reserveARoomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getreserveARoom_Reservation() {
		return (EReference)reserveARoomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getreserveARoom_Booking() {
		return (EReference)reserveARoomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getreserveARoom_RoomManager() {
		return (EReference)reserveARoomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getreserveARoom_ReservationManager() {
		return (EReference)reserveARoomEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getreserveARoom_BookingManager() {
		return (EReference)reserveARoomEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmakeABooking() {
		return makeABookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmakeABooking_R() {
		return (EReference)makeABookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmakeABooking_B() {
		return (EReference)makeABookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmakeABooking_C() {
		return (EReference)makeABookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmakeABooking_Pd() {
		return (EReference)makeABookingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmakeABooking_Bank() {
		return (EReference)makeABookingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmakeABooking_Bm() {
		return (EReference)makeABookingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmakeABooking_Cm() {
		return (EReference)makeABookingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcheckOutSuccess() {
		return checkOutSuccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcheckOutSuccess_Actor() {
		return (EReference)checkOutSuccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcheckOutSuccess_KeyCards() {
		return (EReference)checkOutSuccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcheckOutSuccess_R() {
		return (EReference)checkOutSuccessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcheckOutSuccess_B() {
		return (EReference)checkOutSuccessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcheckOutSuccess_Bank() {
		return (EReference)checkOutSuccessEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcheckOutSuccess_C() {
		return (EReference)checkOutSuccessEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcheckOutSuccess_Rm() {
		return (EReference)checkOutSuccessEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcheckOutSuccess_Bm() {
		return (EReference)checkOutSuccessEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
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
		bookingActivityEClass = createEClass(BOOKING_ACTIVITY);

		showRoomOccupancyEClass = createEClass(SHOW_ROOM_OCCUPANCY);
		createEReference(showRoomOccupancyEClass, SHOW_ROOM_OCCUPANCY__U);
		createEReference(showRoomOccupancyEClass, SHOW_ROOM_OCCUPANCY__RM);

		checkInSuccessEClass = createEClass(CHECK_IN_SUCCESS);
		createEReference(checkInSuccessEClass, CHECK_IN_SUCCESS__R);
		createEReference(checkInSuccessEClass, CHECK_IN_SUCCESS__K);
		createEReference(checkInSuccessEClass, CHECK_IN_SUCCESS__CUSTOMER);
		createEReference(checkInSuccessEClass, CHECK_IN_SUCCESS__ACTOR);
		createEReference(checkInSuccessEClass, CHECK_IN_SUCCESS__BM);
		createEReference(checkInSuccessEClass, CHECK_IN_SUCCESS__B);

		reserveARoomEClass = createEClass(RESERVE_AROOM);
		createEReference(reserveARoomEClass, RESERVE_AROOM__R);
		createEReference(reserveARoomEClass, RESERVE_AROOM__RESERVATION);
		createEReference(reserveARoomEClass, RESERVE_AROOM__BOOKING);
		createEReference(reserveARoomEClass, RESERVE_AROOM__ROOM_MANAGER);
		createEReference(reserveARoomEClass, RESERVE_AROOM__RESERVATION_MANAGER);
		createEReference(reserveARoomEClass, RESERVE_AROOM__BOOKING_MANAGER);

		makeABookingEClass = createEClass(MAKE_ABOOKING);
		createEReference(makeABookingEClass, MAKE_ABOOKING__R);
		createEReference(makeABookingEClass, MAKE_ABOOKING__B);
		createEReference(makeABookingEClass, MAKE_ABOOKING__C);
		createEReference(makeABookingEClass, MAKE_ABOOKING__PD);
		createEReference(makeABookingEClass, MAKE_ABOOKING__BANK);
		createEReference(makeABookingEClass, MAKE_ABOOKING__BM);
		createEReference(makeABookingEClass, MAKE_ABOOKING__CM);

		checkOutSuccessEClass = createEClass(CHECK_OUT_SUCCESS);
		createEReference(checkOutSuccessEClass, CHECK_OUT_SUCCESS__ACTOR);
		createEReference(checkOutSuccessEClass, CHECK_OUT_SUCCESS__KEY_CARDS);
		createEReference(checkOutSuccessEClass, CHECK_OUT_SUCCESS__R);
		createEReference(checkOutSuccessEClass, CHECK_OUT_SUCCESS__B);
		createEReference(checkOutSuccessEClass, CHECK_OUT_SUCCESS__BANK);
		createEReference(checkOutSuccessEClass, CHECK_OUT_SUCCESS__C);
		createEReference(checkOutSuccessEClass, CHECK_OUT_SUCCESS__RM);
		createEReference(checkOutSuccessEClass, CHECK_OUT_SUCCESS__BM);
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
		BankingServicePackage theBankingServicePackage = (BankingServicePackage)EPackage.Registry.INSTANCE.getEPackage(BankingServicePackage.eNS_URI);
		KeyCardServicePackage theKeyCardServicePackage = (KeyCardServicePackage)EPackage.Registry.INSTANCE.getEPackage(KeyCardServicePackage.eNS_URI);
		HotelServicePackage theHotelServicePackage = (HotelServicePackage)EPackage.Registry.INSTANCE.getEPackage(HotelServicePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theHotelCorePackage);
		getESubpackages().add(theBankingServicePackage);
		getESubpackages().add(theKeyCardServicePackage);
		getESubpackages().add(theHotelServicePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(bookingActivityEClass, BookingActivity.class, "BookingActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(showRoomOccupancyEClass, showRoomOccupancy.class, "showRoomOccupancy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getshowRoomOccupancy_U(), theHotelServicePackage.getSystemUser(), null, "u", null, 1, 1, showRoomOccupancy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getshowRoomOccupancy_Rm(), theHotelServicePackage.getIRoomManager(), null, "rm", null, 1, 1, showRoomOccupancy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(checkInSuccessEClass, CheckInSuccess.class, "CheckInSuccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCheckInSuccess_R(), theHotelCorePackage.getReservation(), null, "r", null, 1, 1, CheckInSuccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCheckInSuccess_K(), theKeyCardServicePackage.getKeyCardsProvides(), null, "k", null, 1, 1, CheckInSuccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCheckInSuccess_Customer(), theHotelCorePackage.getCustomer(), null, "customer", null, 1, 1, CheckInSuccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCheckInSuccess_Actor(), theHotelServicePackage.getSystemUser(), null, "actor", null, 1, 1, CheckInSuccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCheckInSuccess_Bm(), theHotelServicePackage.getIBookingManager(), null, "bm", null, 1, 1, CheckInSuccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCheckInSuccess_B(), theHotelCorePackage.getBooking(), null, "b", null, 1, 1, CheckInSuccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(reserveARoomEClass, reserveARoom.class, "reserveARoom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getreserveARoom_R(), theHotelServicePackage.getSystemUser(), null, "r", null, 1, 1, reserveARoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getreserveARoom_Reservation(), theHotelCorePackage.getReservation(), null, "reservation", null, 1, 1, reserveARoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getreserveARoom_Booking(), theHotelCorePackage.getBooking(), null, "booking", null, 1, 1, reserveARoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getreserveARoom_RoomManager(), theHotelServicePackage.getIRoomManager(), null, "roomManager", null, 1, 1, reserveARoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getreserveARoom_ReservationManager(), theHotelServicePackage.getIReservationManager(), null, "reservationManager", null, 1, 1, reserveARoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getreserveARoom_BookingManager(), theHotelServicePackage.getIBookingManager(), null, "bookingManager", null, 1, 1, reserveARoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(makeABookingEClass, makeABooking.class, "makeABooking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getmakeABooking_R(), theHotelServicePackage.getSystemUser(), null, "r", null, 1, 1, makeABooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getmakeABooking_B(), theHotelCorePackage.getBooking(), null, "b", null, 1, 1, makeABooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getmakeABooking_C(), theHotelCorePackage.getCustomer(), null, "c", null, 1, 1, makeABooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getmakeABooking_Pd(), theHotelCorePackage.getPaymentDetails(), null, "pd", null, 1, 1, makeABooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getmakeABooking_Bank(), theBankingServicePackage.getCustomerProvides(), null, "bank", null, 1, 1, makeABooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getmakeABooking_Bm(), theHotelServicePackage.getIBookingManager(), null, "bm", null, 1, 1, makeABooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getmakeABooking_Cm(), theHotelServicePackage.getICustomerManager(), null, "cm", null, 1, 1, makeABooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(checkOutSuccessEClass, checkOutSuccess.class, "checkOutSuccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getcheckOutSuccess_Actor(), theHotelServicePackage.getSystemUser(), null, "actor", null, 1, 1, checkOutSuccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getcheckOutSuccess_KeyCards(), theKeyCardServicePackage.getKeyCardsProvides(), null, "keyCards", null, 1, 1, checkOutSuccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getcheckOutSuccess_R(), theHotelCorePackage.getReservation(), null, "r", null, 1, 1, checkOutSuccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getcheckOutSuccess_B(), theHotelCorePackage.getBooking(), null, "b", null, 1, 1, checkOutSuccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getcheckOutSuccess_Bank(), theBankingServicePackage.getCustomerProvides(), null, "bank", null, 1, 1, checkOutSuccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getcheckOutSuccess_C(), theHotelCorePackage.getCustomer(), null, "c", null, 1, 1, checkOutSuccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getcheckOutSuccess_Rm(), theHotelServicePackage.getIReservationManager(), null, "rm", null, 1, 1, checkOutSuccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getcheckOutSuccess_Bm(), theHotelServicePackage.getIBookingManager(), null, "bm", null, 1, 1, checkOutSuccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl
