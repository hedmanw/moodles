/**
 */
package HotelSystem.impl;

import HotelSystem.Bill;
import HotelSystem.Booking;
import HotelSystem.BookingManager;
import HotelSystem.ConferenceRoom;
import HotelSystem.Customer;
import HotelSystem.CustomerManager;
import HotelSystem.Equipment;
import HotelSystem.Hotel;
import HotelSystem.HotelSystemFactory;
import HotelSystem.HotelSystemPackage;
import HotelSystem.KeyCard;
import HotelSystem.PaymentDetails;
import HotelSystem.PaymentMethod;
import HotelSystem.Reservation;
import HotelSystem.ReservationManager;
import HotelSystem.Room;
import HotelSystem.RoomManager;
import HotelSystem.RoomType;
import HotelSystem.RoomTypeManager;
import HotelSystem.ScheduledEvents;
import HotelSystem.SleepRoom;
import HotelSystem.Tab;

import model.BankingService.BankingServicePackage;

import model.BankingService.impl.BankingServicePackageImpl;

import model.HotelService.HotelServicePackage;

import model.HotelService.impl.HotelServicePackageImpl;

import model.KeyCardService.KeyCardServicePackage;

import model.KeyCardService.impl.KeyCardServicePackageImpl;

import model.ModelPackage;

import model.impl.ModelPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
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
public class HotelSystemPackageImpl extends EPackageImpl implements HotelSystemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyCardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduledEventsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sleepRoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conferenceRoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerManagerEClass = null;

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
	private EClass bookingManagerEClass = null;

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
	private EClass reservationManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paymentMethodEEnum = null;

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
	 * @see HotelSystem.HotelSystemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HotelSystemPackageImpl() {
		super(eNS_URI, HotelSystemFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HotelSystemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HotelSystemPackage init() {
		if (isInited) return (HotelSystemPackage)EPackage.Registry.INSTANCE.getEPackage(HotelSystemPackage.eNS_URI);

		// Obtain or create and register package
		HotelSystemPackageImpl theHotelSystemPackage = (HotelSystemPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HotelSystemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HotelSystemPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		BankingServicePackageImpl theBankingServicePackage = (BankingServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BankingServicePackage.eNS_URI) instanceof BankingServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BankingServicePackage.eNS_URI) : BankingServicePackage.eINSTANCE);
		KeyCardServicePackageImpl theKeyCardServicePackage = (KeyCardServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KeyCardServicePackage.eNS_URI) instanceof KeyCardServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KeyCardServicePackage.eNS_URI) : KeyCardServicePackage.eINSTANCE);
		HotelServicePackageImpl theHotelServicePackage = (HotelServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HotelServicePackage.eNS_URI) instanceof HotelServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HotelServicePackage.eNS_URI) : HotelServicePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theHotelSystemPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theBankingServicePackage.createPackageContents();
		theKeyCardServicePackage.createPackageContents();
		theHotelServicePackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theHotelSystemPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theBankingServicePackage.initializePackageContents();
		theKeyCardServicePackage.initializePackageContents();
		theHotelServicePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHotelSystemPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HotelSystemPackage.eNS_URI, theHotelSystemPackage);
		return theHotelSystemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotel() {
		return hotelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTab() {
		return tabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTab_TabItems() {
		return (EAttribute)tabEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyCard() {
		return keyCardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyCard_KeyCardID() {
		return (EAttribute)keyCardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquipment() {
		return equipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEquipment_Name() {
		return (EAttribute)equipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomType() {
		return roomTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_CostPerNight() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_RoomNumber() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_RoomType() {
		return (EReference)roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Cleaned() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Equipment() {
		return (EReference)roomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScheduledEvents() {
		return scheduledEventsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduledEvents_Events() {
		return (EAttribute)scheduledEventsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBill() {
		return billEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBill_Paid() {
		return (EAttribute)billEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBill_GrandTotal() {
		return (EAttribute)billEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSleepRoom() {
		return sleepRoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSleepRoom_NbrOfBeds() {
		return (EAttribute)sleepRoomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomer() {
		return customerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Id() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Name() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomer_PaymentDetails() {
		return (EReference)customerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_LoyaltyPoints() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentDetails() {
		return paymentDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentDetails_CcNumber() {
		return (EAttribute)paymentDetailsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentDetails_Ccv() {
		return (EAttribute)paymentDetailsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentDetails_ExpiryMonth() {
		return (EAttribute)paymentDetailsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentDetails_ExpiryYear() {
		return (EAttribute)paymentDetailsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentDetails_FirstName() {
		return (EAttribute)paymentDetailsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentDetails_LastName() {
		return (EAttribute)paymentDetailsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservation() {
		return reservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservation_Tab() {
		return (EReference)reservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservation_KeyCard() {
		return (EReference)reservationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservation_ScheduledEvents() {
		return (EReference)reservationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservation_Room() {
		return (EReference)reservationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservation_CostCategory() {
		return (EReference)reservationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_CheckedIn() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_CheckedOut() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_StartDay() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_EndDay() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_Responsible() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_NbrOfGuests() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooking() {
		return bookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_Bill() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_Customer() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_Reservation() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_BookingNbr() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConferenceRoom() {
		return conferenceRoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConferenceRoom_MaxNbrOfPeople() {
		return (EAttribute)conferenceRoomEClass.getEStructuralFeatures().get(0);
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
	public EReference getCustomerManager_Customer() {
		return (EReference)customerManagerEClass.getEStructuralFeatures().get(0);
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
	public EReference getRoomTypeManager_RoomType() {
		return (EReference)roomTypeManagerEClass.getEStructuralFeatures().get(0);
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
	public EReference getBookingManager_Booking() {
		return (EReference)bookingManagerEClass.getEStructuralFeatures().get(0);
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
	public EReference getRoomManager_Room() {
		return (EReference)roomManagerEClass.getEStructuralFeatures().get(0);
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
	public EReference getReservationManager_Reservation() {
		return (EReference)reservationManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPaymentMethod() {
		return paymentMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelSystemFactory getHotelSystemFactory() {
		return (HotelSystemFactory)getEFactoryInstance();
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
		hotelEClass = createEClass(HOTEL);

		tabEClass = createEClass(TAB);
		createEAttribute(tabEClass, TAB__TAB_ITEMS);

		keyCardEClass = createEClass(KEY_CARD);
		createEAttribute(keyCardEClass, KEY_CARD__KEY_CARD_ID);

		equipmentEClass = createEClass(EQUIPMENT);
		createEAttribute(equipmentEClass, EQUIPMENT__NAME);

		roomTypeEClass = createEClass(ROOM_TYPE);
		createEAttribute(roomTypeEClass, ROOM_TYPE__COST_PER_NIGHT);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__ROOM_NUMBER);
		createEReference(roomEClass, ROOM__ROOM_TYPE);
		createEAttribute(roomEClass, ROOM__CLEANED);
		createEReference(roomEClass, ROOM__EQUIPMENT);

		scheduledEventsEClass = createEClass(SCHEDULED_EVENTS);
		createEAttribute(scheduledEventsEClass, SCHEDULED_EVENTS__EVENTS);

		billEClass = createEClass(BILL);
		createEAttribute(billEClass, BILL__PAID);
		createEAttribute(billEClass, BILL__GRAND_TOTAL);

		sleepRoomEClass = createEClass(SLEEP_ROOM);
		createEAttribute(sleepRoomEClass, SLEEP_ROOM__NBR_OF_BEDS);

		customerEClass = createEClass(CUSTOMER);
		createEAttribute(customerEClass, CUSTOMER__ID);
		createEAttribute(customerEClass, CUSTOMER__NAME);
		createEReference(customerEClass, CUSTOMER__PAYMENT_DETAILS);
		createEAttribute(customerEClass, CUSTOMER__LOYALTY_POINTS);

		paymentDetailsEClass = createEClass(PAYMENT_DETAILS);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__CC_NUMBER);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__CCV);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__EXPIRY_MONTH);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__EXPIRY_YEAR);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__FIRST_NAME);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__LAST_NAME);

		reservationEClass = createEClass(RESERVATION);
		createEReference(reservationEClass, RESERVATION__TAB);
		createEReference(reservationEClass, RESERVATION__KEY_CARD);
		createEReference(reservationEClass, RESERVATION__SCHEDULED_EVENTS);
		createEReference(reservationEClass, RESERVATION__ROOM);
		createEReference(reservationEClass, RESERVATION__COST_CATEGORY);
		createEAttribute(reservationEClass, RESERVATION__CHECKED_IN);
		createEAttribute(reservationEClass, RESERVATION__CHECKED_OUT);
		createEAttribute(reservationEClass, RESERVATION__START_DAY);
		createEAttribute(reservationEClass, RESERVATION__END_DAY);
		createEAttribute(reservationEClass, RESERVATION__RESPONSIBLE);
		createEAttribute(reservationEClass, RESERVATION__NBR_OF_GUESTS);

		bookingEClass = createEClass(BOOKING);
		createEReference(bookingEClass, BOOKING__BILL);
		createEReference(bookingEClass, BOOKING__CUSTOMER);
		createEReference(bookingEClass, BOOKING__RESERVATION);
		createEAttribute(bookingEClass, BOOKING__BOOKING_NBR);

		conferenceRoomEClass = createEClass(CONFERENCE_ROOM);
		createEAttribute(conferenceRoomEClass, CONFERENCE_ROOM__MAX_NBR_OF_PEOPLE);

		customerManagerEClass = createEClass(CUSTOMER_MANAGER);
		createEReference(customerManagerEClass, CUSTOMER_MANAGER__CUSTOMER);

		roomTypeManagerEClass = createEClass(ROOM_TYPE_MANAGER);
		createEReference(roomTypeManagerEClass, ROOM_TYPE_MANAGER__ROOM_TYPE);

		bookingManagerEClass = createEClass(BOOKING_MANAGER);
		createEReference(bookingManagerEClass, BOOKING_MANAGER__BOOKING);

		roomManagerEClass = createEClass(ROOM_MANAGER);
		createEReference(roomManagerEClass, ROOM_MANAGER__ROOM);

		reservationManagerEClass = createEClass(RESERVATION_MANAGER);
		createEReference(reservationManagerEClass, RESERVATION_MANAGER__RESERVATION);

		// Create enums
		paymentMethodEEnum = createEEnum(PAYMENT_METHOD);
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
		HotelServicePackage theHotelServicePackage = (HotelServicePackage)EPackage.Registry.INSTANCE.getEPackage(HotelServicePackage.eNS_URI);

		// Add supertypes to classes
		sleepRoomEClass.getESuperTypes().add(this.getRoomType());
		conferenceRoomEClass.getESuperTypes().add(this.getRoomType());
		customerManagerEClass.getESuperTypes().add(theHotelServicePackage.getICustomerManager());
		roomTypeManagerEClass.getESuperTypes().add(theHotelServicePackage.getIRoomTypeManager());
		bookingManagerEClass.getESuperTypes().add(theHotelServicePackage.getIBookingManager());
		roomManagerEClass.getESuperTypes().add(theHotelServicePackage.getIRoomManager());
		reservationManagerEClass.getESuperTypes().add(theHotelServicePackage.getIReservationManager());

		// Initialize classes and features; add operations and parameters
		initEClass(hotelEClass, Hotel.class, "Hotel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tabEClass, Tab.class, "Tab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTab_TabItems(), ecorePackage.getEMap(), "tabItems", null, 1, 1, Tab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(tabEClass, null, "addItemToTab");
		addEParameter(op, ecorePackage.getEString(), "item", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "cost", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(tabEClass, ecorePackage.getEDouble(), "getTotalCost", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(tabEClass, null, "removeTabItem");
		addEParameter(op, ecorePackage.getEString(), "itemName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(tabEClass, null, "getAll");

		initEClass(keyCardEClass, KeyCard.class, "KeyCard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyCard_KeyCardID(), ecorePackage.getEInt(), "keyCardID", null, 1, 1, KeyCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(keyCardEClass, ecorePackage.getEInt(), "getID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(keyCardEClass, null, "setID");
		addEParameter(op, ecorePackage.getEInt(), "keyCardID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(equipmentEClass, Equipment.class, "Equipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEquipment_Name(), ecorePackage.getEString(), "name", null, 1, 1, Equipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(equipmentEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomTypeEClass, RoomType.class, "RoomType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomType_CostPerNight(), ecorePackage.getEDouble(), "costPerNight", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(roomTypeEClass, ecorePackage.getEDouble(), "getCostPerNight", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(roomTypeEClass, null, "setCostPerNight");
		addEParameter(op, ecorePackage.getEDouble(), "cost", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_RoomNumber(), ecorePackage.getEInt(), "roomNumber", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_RoomType(), this.getRoomType(), null, "roomType", null, 1, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Cleaned(), ecorePackage.getEBoolean(), "cleaned", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_Equipment(), this.getEquipment(), null, "equipment", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(roomEClass, this.getRoomType(), "getRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(roomEClass, null, "addRoomType");
		addEParameter(op, this.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(roomEClass, null, "removeRoomType");
		addEParameter(op, this.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(roomEClass, ecorePackage.getEEList(), "getEquipment", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(roomEClass, null, "addEquipmentToRoom");
		addEParameter(op, ecorePackage.getEString(), "item", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(roomEClass, null, "removeEquipmentItem");
		addEParameter(op, ecorePackage.getEString(), "itemName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(scheduledEventsEClass, ScheduledEvents.class, "ScheduledEvents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScheduledEvents_Events(), ecorePackage.getEMap(), "events", null, 1, 1, ScheduledEvents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(scheduledEventsEClass, null, "addEvent");
		addEParameter(op, ecorePackage.getEString(), "eventName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timestamp", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(scheduledEventsEClass, ecorePackage.getEMap(), "getEvents", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(scheduledEventsEClass, null, "updateEvent");
		addEParameter(op, ecorePackage.getEString(), "eventName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timestamp", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(scheduledEventsEClass, null, "deleteEvent");
		addEParameter(op, ecorePackage.getEString(), "eventName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(billEClass, Bill.class, "Bill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBill_Paid(), ecorePackage.getEDouble(), "paid", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_GrandTotal(), ecorePackage.getEDouble(), "grandTotal", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(billEClass, null, "addToBill");
		addEParameter(op, ecorePackage.getEDouble(), "cost", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(billEClass, ecorePackage.getEBoolean(), "isPaid", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(billEClass, null, "removeFromBill");
		addEParameter(op, ecorePackage.getEDouble(), "cost", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(billEClass, ecorePackage.getEDouble(), "leftToPay", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(billEClass, null, "pay");
		addEParameter(op, ecorePackage.getEDouble(), "cost", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(sleepRoomEClass, SleepRoom.class, "SleepRoom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSleepRoom_NbrOfBeds(), ecorePackage.getEInt(), "nbrOfBeds", null, 1, 1, SleepRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(sleepRoomEClass, ecorePackage.getEInt(), "getNbrOfBeds", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(sleepRoomEClass, null, "setNbrOfBeds");
		addEParameter(op, ecorePackage.getEInt(), "nbrOfBeds", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomer_Id(), ecorePackage.getEString(), "id", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_Name(), ecorePackage.getEString(), "name", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCustomer_PaymentDetails(), this.getPaymentDetails(), null, "paymentDetails", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_LoyaltyPoints(), ecorePackage.getEInt(), "loyaltyPoints", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(customerEClass, ecorePackage.getEString(), "getId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(customerEClass, null, "setId");
		addEParameter(op, ecorePackage.getEString(), "id", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(customerEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(customerEClass, null, "setName");
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(customerEClass, ecorePackage.getEInt(), "getLoyaltyPoints", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(customerEClass, null, "addLoyaltyPoints");
		addEParameter(op, ecorePackage.getEInt(), "points", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(customerEClass, null, "removeLoyaltyPoints");
		addEParameter(op, ecorePackage.getEInt(), "points", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(customerEClass, this.getPaymentDetails(), "getPaymentDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(customerEClass, null, "setPaymentDetails");
		addEParameter(op, this.getPaymentDetails(), "paymentDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(paymentDetailsEClass, PaymentDetails.class, "PaymentDetails", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentDetails_CcNumber(), ecorePackage.getEString(), "ccNumber", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentDetails_Ccv(), ecorePackage.getEString(), "ccv", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentDetails_ExpiryMonth(), ecorePackage.getEInt(), "expiryMonth", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentDetails_ExpiryYear(), ecorePackage.getEInt(), "expiryYear", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentDetails_FirstName(), ecorePackage.getEString(), "firstName", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentDetails_LastName(), ecorePackage.getEString(), "lastName", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(paymentDetailsEClass, ecorePackage.getEString(), "getCcNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(paymentDetailsEClass, null, "setCcNumber");
		addEParameter(op, ecorePackage.getEString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(paymentDetailsEClass, ecorePackage.getEString(), "getCcV", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(paymentDetailsEClass, null, "setCcv");
		addEParameter(op, ecorePackage.getEString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(paymentDetailsEClass, ecorePackage.getEInt(), "getExpiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(paymentDetailsEClass, null, "setExpiryMonth");
		addEParameter(op, ecorePackage.getEInt(), "month", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(paymentDetailsEClass, null, "setExpiryYear");
		addEParameter(op, ecorePackage.getEInt(), "month", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(paymentDetailsEClass, ecorePackage.getEInt(), "getExpiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(paymentDetailsEClass, ecorePackage.getEString(), "getFirstName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(paymentDetailsEClass, null, "setFirstName");
		addEParameter(op, ecorePackage.getEString(), "fname", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(paymentDetailsEClass, null, "setLastName");
		addEParameter(op, ecorePackage.getEString(), "lname", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(paymentDetailsEClass, ecorePackage.getEString(), "getLastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(reservationEClass, Reservation.class, "Reservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReservation_Tab(), this.getTab(), null, "tab", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReservation_KeyCard(), this.getKeyCard(), null, "keyCard", null, 0, -1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReservation_ScheduledEvents(), this.getScheduledEvents(), null, "scheduledEvents", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReservation_Room(), this.getRoom(), null, "room", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReservation_CostCategory(), this.getRoomType(), null, "costCategory", null, 1, -1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservation_CheckedIn(), ecorePackage.getELong(), "checkedIn", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservation_CheckedOut(), ecorePackage.getELong(), "checkedOut", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservation_StartDay(), ecorePackage.getELong(), "startDay", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservation_EndDay(), ecorePackage.getELong(), "endDay", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservation_Responsible(), ecorePackage.getEString(), "responsible", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservation_NbrOfGuests(), ecorePackage.getEInt(), "nbrOfGuests", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(reservationEClass, ecorePackage.getELong(), "getCheckedIn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(reservationEClass, null, "setCheckedIn");
		addEParameter(op, ecorePackage.getELong(), "timestamp", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(reservationEClass, ecorePackage.getELong(), "getCheckedOut", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(reservationEClass, null, "setCheckedOut");
		addEParameter(op, ecorePackage.getELong(), "timestamp", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(reservationEClass, null, "setStartDay");
		addEParameter(op, ecorePackage.getELong(), "timestamp", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(reservationEClass, ecorePackage.getELong(), "getStartDay", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(reservationEClass, null, "setEndDay");
		addEParameter(op, ecorePackage.getELong(), "timestamp", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(reservationEClass, ecorePackage.getELong(), "getEndDay", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(reservationEClass, ecorePackage.getEString(), "getResponsible", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(reservationEClass, null, "setResponsible");
		addEParameter(op, ecorePackage.getEString(), "responsible", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(reservationEClass, ecorePackage.getEInt(), "getNbrOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(reservationEClass, null, "setNbrOfGuests");
		addEParameter(op, ecorePackage.getEInt(), "number", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(reservationEClass, this.getRoom(), "getRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(reservationEClass, null, "setRoom");
		addEParameter(op, this.getRoom(), "newRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(reservationEClass, this.getRoomType(), "getCostCategory", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(reservationEClass, null, "addCostCategory");
		addEParameter(op, this.getRoomType(), "costCategory", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(reservationEClass, this.getScheduledEvents(), "getEvents", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(reservationEClass, null, "removeAllEvents");

		addEOperation(reservationEClass, this.getKeyCard(), "getKeyCards", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(reservationEClass, null, "addKeyCard");
		addEParameter(op, this.getKeyCard(), "keyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(reservationEClass, null, "removeKeyCard");
		addEParameter(op, this.getKeyCard(), "keyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(reservationEClass, null, "removeCostCategory");
		addEParameter(op, this.getRoomType(), "costCategory", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(reservationEClass, this.getTab(), "getTab", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookingEClass, Booking.class, "Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooking_Bill(), this.getBill(), null, "bill", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_Customer(), this.getCustomer(), null, "customer", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_Reservation(), this.getReservation(), null, "reservation", null, 1, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_BookingNbr(), ecorePackage.getEInt(), "bookingNbr", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(bookingEClass, ecorePackage.getEInt(), "getBookingNbr", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(bookingEClass, this.getReservation(), "getReservations", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(bookingEClass, null, "addReservation");
		addEParameter(op, this.getReservation(), "reservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(bookingEClass, null, "removeReservation");
		addEParameter(op, this.getReservation(), "reservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(bookingEClass, this.getCustomer(), "getCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(bookingEClass, null, "changeCustomer");
		addEParameter(op, this.getCustomer(), "newCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(bookingEClass, this.getBill(), "getBill", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(bookingEClass, null, "setCustomer");
		addEParameter(op, this.getCustomer(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(conferenceRoomEClass, ConferenceRoom.class, "ConferenceRoom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConferenceRoom_MaxNbrOfPeople(), ecorePackage.getEInt(), "maxNbrOfPeople", null, 1, 1, ConferenceRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(conferenceRoomEClass, ecorePackage.getEInt(), "getNbrOfPeople", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(customerManagerEClass, CustomerManager.class, "CustomerManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerManager_Customer(), this.getCustomer(), null, "customer", null, 0, -1, CustomerManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomTypeManagerEClass, RoomTypeManager.class, "RoomTypeManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomTypeManager_RoomType(), this.getRoomType(), null, "roomType", null, 0, -1, RoomTypeManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingManagerEClass, BookingManager.class, "BookingManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBookingManager_Booking(), this.getBooking(), null, "booking", null, 0, -1, BookingManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomManagerEClass, RoomManager.class, "RoomManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomManager_Room(), this.getRoom(), null, "room", null, 0, -1, RoomManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(reservationManagerEClass, ReservationManager.class, "ReservationManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReservationManager_Reservation(), this.getReservation(), null, "reservation", null, 0, -1, ReservationManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(paymentMethodEEnum, PaymentMethod.class, "PaymentMethod");
		addEEnumLiteral(paymentMethodEEnum, PaymentMethod.PREPAID_LITERAL);
		addEEnumLiteral(paymentMethodEEnum, PaymentMethod.PAYONCHECKOUT_LITERAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  ((EEnumLiteral)paymentMethodEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "originalName", "Pre paid"
		   });	
		addAnnotation
		  ((EEnumLiteral)paymentMethodEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "originalName", "Pay on checkout"
		   });
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
	
} //HotelSystemPackageImpl
