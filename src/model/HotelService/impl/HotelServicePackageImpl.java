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
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;

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
	public EClass getIBookingManager() {
		return iBookingManagerEClass;
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
	public EClass getICustomerManager() {
		return iCustomerManagerEClass;
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

		iBookingManagerEClass = createEClass(IBOOKING_MANAGER);

		iReservationManagerEClass = createEClass(IRESERVATION_MANAGER);

		hotelManagerEClass = createEClass(HOTEL_MANAGER);

		hotelManagerProvidesEClass = createEClass(HOTEL_MANAGER_PROVIDES);

		hotelStaffEClass = createEClass(HOTEL_STAFF);

		hotelStaffProvidesEClass = createEClass(HOTEL_STAFF_PROVIDES);

		iRoomTypeManagerEClass = createEClass(IROOM_TYPE_MANAGER);

		iCustomerManagerEClass = createEClass(ICUSTOMER_MANAGER);
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

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(hotelReceptionistEClass, HotelReceptionist.class, "HotelReceptionist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iRoomManagerEClass, IRoomManager.class, "IRoomManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(iRoomManagerEClass, ecorePackage.getEEList(), "getAvailableRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fromDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "toDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEEList(), "roomTypeIds", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iRoomManagerEClass, ecorePackage.getEMap(), "getRoomOccupancy", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fromDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "toDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iBookingManagerEClass, IBookingManager.class, "IBookingManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iBookingManagerEClass, ecorePackage.getELong(), "createBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iBookingManagerEClass, theHotelSystemPackage.getBooking(), "getBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iBookingManagerEClass, null, "deleteBooking");
		addEParameter(op, ecorePackage.getELong(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iBookingManagerEClass, ecorePackage.getEEList(), "getBookingsByCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "customerId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iBookingManagerEClass, null, "setBookingCustomer");
		addEParameter(op, ecorePackage.getELong(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "customerId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iBookingManagerEClass, ecorePackage.getEBoolean(), "isBillPaidInFull", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iBookingManagerEClass, theHotelSystemPackage.getBill(), "getBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iBookingManagerEClass, null, "getBookingByReservation");
		addEParameter(op, theHotelSystemPackage.getReservation(), "reservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelSystemPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iReservationManagerEClass, IReservationManager.class, "IReservationManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iReservationManagerEClass, ecorePackage.getEBoolean(), "createReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelSystemPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fromDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "toDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "roomId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "costCategoryId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iReservationManagerEClass, theHotelSystemPackage.getReservation(), "getReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "reservationId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iReservationManagerEClass, null, "setResponsibleForReservation");
		addEParameter(op, ecorePackage.getELong(), "reservationId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "responsible", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iReservationManagerEClass, ecorePackage.getEEList(), "getNonCheckedInReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iReservationManagerEClass, null, "setNumberOfGuestsForReservation");
		addEParameter(op, ecorePackage.getELong(), "reservationId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "guests", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iReservationManagerEClass, ecorePackage.getEBoolean(), "checkInReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "reservationId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iReservationManagerEClass, ecorePackage.getEBoolean(), "checkOutReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theHotelSystemPackage.getReservation(), "reservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iReservationManagerEClass, theHotelSystemPackage.getReservation(), "getCurrentReservationByRoomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(hotelManagerEClass, HotelManager.class, "HotelManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hotelManagerProvidesEClass, HotelManagerProvides.class, "HotelManagerProvides", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hotelStaffEClass, HotelStaff.class, "HotelStaff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hotelStaffProvidesEClass, HotelStaffProvides.class, "HotelStaffProvides", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iRoomTypeManagerEClass, IRoomTypeManager.class, "IRoomTypeManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iRoomTypeManagerEClass, ecorePackage.getEEList(), "getRoomTypes", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iCustomerManagerEClass, ICustomerManager.class, "ICustomerManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iCustomerManagerEClass, ecorePackage.getELong(), "getCustomerByIdNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "idNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iCustomerManagerEClass, ecorePackage.getEEList(), "getCustomersByName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iCustomerManagerEClass, theHotelSystemPackage.getCustomer(), "getCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "customerId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iCustomerManagerEClass, ecorePackage.getELong(), "createCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "idNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iCustomerManagerEClass, ecorePackage.getELong(), "setPaymentDetailsForCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "customerId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccvNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expireMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expireYear", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iCustomerManagerEClass, theHotelSystemPackage.getPaymentDetails(), "getPaymentDetailsByCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "customerId", 1, 1, IS_UNIQUE, !IS_ORDERED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EOperation addEOperation(EClass owner, EClassifier type, String name, int lowerBound, int upperBound, boolean isUnique, boolean isOrdered) {
		EOperation o = addEOperation(owner, type, name, lowerBound, upperBound);
		o.setUnique(isUnique);
		o.setOrdered(isOrdered);
		return o;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EParameter addEParameter(EOperation owner, EClassifier type, String name, int lowerBound, int upperBound, boolean isUnique, boolean isOrdered) {
		EParameter p = ecoreFactory.createEParameter();
		p.setEType(type);
		p.setName(name);
		p.setLowerBound(lowerBound);
		p.setUpperBound(upperBound);
		p.setUnique(isUnique);
		p.setOrdered(isOrdered);
		owner.getEParameters().add(p);
		return p;
	}
	
} //HotelServicePackageImpl
