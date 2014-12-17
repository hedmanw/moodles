/**
 */
package hotelCore.impl;

import bankingService.BankingServicePackage;
import bankingService.impl.BankingServicePackageImpl;
import hotelCore.Bill;
import hotelCore.Booking;
import hotelCore.ConferenceRoom;
import hotelCore.Customer;
import hotelCore.Equipment;
import hotelCore.Hotel;
import hotelCore.HotelCoreFactory;
import hotelCore.HotelCorePackage;
import hotelCore.KeyCard;
import hotelCore.PaymentDetails;
import hotelCore.Reservation;
import hotelCore.Room;
import hotelCore.RoomType;
import hotelCore.ScheduledEvents;
import hotelCore.SleepRoom;
import hotelCore.Tab;

import hotelService.HotelServicePackage;

import hotelService.impl.HotelServicePackageImpl;

import keyCardService.KeyCardServicePackage;
import keyCardService.impl.KeyCardServicePackageImpl;
import org.eclipse.emf.ecore.EAttribute;
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
public class HotelCorePackageImpl extends EPackageImpl implements HotelCorePackage {
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
	 * @see hotelCore.HotelCorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HotelCorePackageImpl() {
		super(eNS_URI, HotelCoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HotelCorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HotelCorePackage init() {
		if (isInited) return (HotelCorePackage)EPackage.Registry.INSTANCE.getEPackage(HotelCorePackage.eNS_URI);

		// Obtain or create and register package
		HotelCorePackageImpl theHotelCorePackage = (HotelCorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HotelCorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HotelCorePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		HotelServicePackageImpl theHotelServicePackage = (HotelServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HotelServicePackage.eNS_URI) instanceof HotelServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HotelServicePackage.eNS_URI) : HotelServicePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		KeyCardServicePackageImpl theKeyCardServicePackage = (KeyCardServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KeyCardServicePackage.eNS_URI) instanceof KeyCardServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KeyCardServicePackage.eNS_URI) : KeyCardServicePackage.eINSTANCE);
		BankingServicePackageImpl theBankingServicePackage = (BankingServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BankingServicePackage.eNS_URI) instanceof BankingServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BankingServicePackage.eNS_URI) : BankingServicePackage.eINSTANCE);

		// Create package meta-data objects
		theHotelCorePackage.createPackageContents();
		theHotelServicePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theKeyCardServicePackage.createPackageContents();
		theBankingServicePackage.createPackageContents();

		// Initialize created meta-data
		theHotelCorePackage.initializePackageContents();
		theHotelServicePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theKeyCardServicePackage.initializePackageContents();
		theBankingServicePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHotelCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HotelCorePackage.eNS_URI, theHotelCorePackage);
		return theHotelCorePackage;
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
	public EOperation getTab__AddItemToTab__String_double() {
		return tabEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTab__GetTotalCost() {
		return tabEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTab__RemoveTabItem__String() {
		return tabEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTab__GetAll() {
		return tabEClass.getEOperations().get(3);
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
	public EOperation getKeyCard__GetID() {
		return keyCardEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyCard__SetID__int() {
		return keyCardEClass.getEOperations().get(1);
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
	public EOperation getEquipment__GetName() {
		return equipmentEClass.getEOperations().get(0);
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
	public EAttribute getRoomType_Name() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomType__GetCostPerNight() {
		return roomTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomType__SetCostPerNight__double() {
		return roomTypeEClass.getEOperations().get(1);
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
	public EAttribute getRoom_Housekept() {
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
	public EOperation getRoom__GetRoomType() {
		return roomEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoom__AddRoomType__RoomType() {
		return roomEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoom__RemoveRoomType__RoomType() {
		return roomEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoom__AddEquipmentToRoom__String() {
		return roomEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoom__RemoveEquipmentItem__String() {
		return roomEClass.getEOperations().get(4);
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
	public EOperation getScheduledEvents__AddEvent__String_long() {
		return scheduledEventsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScheduledEvents__GetEvents() {
		return scheduledEventsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScheduledEvents__UpdateEvent__String_long() {
		return scheduledEventsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScheduledEvents__DeleteEvent__String() {
		return scheduledEventsEClass.getEOperations().get(3);
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
	public EOperation getBill__AddToBill__double() {
		return billEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBill__IsPaid() {
		return billEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBill__RemoveFromBill__double() {
		return billEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBill__LeftToPay() {
		return billEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBill__Pay__double() {
		return billEClass.getEOperations().get(4);
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
	public EOperation getSleepRoom__GetNbrOfBeds() {
		return sleepRoomEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSleepRoom__SetNbrOfBeds__int() {
		return sleepRoomEClass.getEOperations().get(1);
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
	public EOperation getCustomer__GetId() {
		return customerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__SetId__String() {
		return customerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__GetName() {
		return customerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__SetName__String() {
		return customerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__GetLoyaltyPoints() {
		return customerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__AddLoyaltyPoints__int() {
		return customerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__RemoveLoyaltyPoints__int() {
		return customerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__GetPaymentDetails() {
		return customerEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__SetPaymentDetails__PaymentDetails() {
		return customerEClass.getEOperations().get(8);
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
	public EOperation getPaymentDetails__GetCcNumber() {
		return paymentDetailsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentDetails__SetCcNumber__String() {
		return paymentDetailsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentDetails__GetCcV() {
		return paymentDetailsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentDetails__SetCcv__String() {
		return paymentDetailsEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentDetails__GetExpiryMonth() {
		return paymentDetailsEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentDetails__SetExpiryMonth__int() {
		return paymentDetailsEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentDetails__SetExpiryYear__int() {
		return paymentDetailsEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentDetails__GetExpiryYear() {
		return paymentDetailsEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentDetails__GetFirstName() {
		return paymentDetailsEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentDetails__SetFirstName__String() {
		return paymentDetailsEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentDetails__SetLastName__String() {
		return paymentDetailsEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentDetails__GetLastName() {
		return paymentDetailsEClass.getEOperations().get(11);
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
	public EAttribute getReservation_NumberOfGuests() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservation__GetResponsible() {
		return reservationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservation__SetResponsible__String() {
		return reservationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservation__GetNumberOfGuests() {
		return reservationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservation__SetNumberOfGuests__int() {
		return reservationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservation__GetRoom() {
		return reservationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservation__SetRoom__Room() {
		return reservationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservation__GetCostCategory() {
		return reservationEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservation__AddCostCategory__RoomType() {
		return reservationEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservation__GetEvents() {
		return reservationEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservation__RemoveAllEvents() {
		return reservationEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservation__GetKeyCards() {
		return reservationEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservation__AddKeyCard__KeyCard() {
		return reservationEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservation__RemoveKeyCard__KeyCard() {
		return reservationEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservation__RemoveCostCategory__RoomType() {
		return reservationEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservation__GetTab() {
		return reservationEClass.getEOperations().get(14);
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
	public EReference getBooking_Reservations() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_BookingUUID() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__AddReservation__Reservation() {
		return bookingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__RemoveReservation__Reservation() {
		return bookingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__GetCustomer() {
		return bookingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__GetBill() {
		return bookingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__SetCustomer__Customer() {
		return bookingEClass.getEOperations().get(4);
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
	public EOperation getConferenceRoom__GetNbrOfPeople() {
		return conferenceRoomEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelCoreFactory getHotelCoreFactory() {
		return (HotelCoreFactory)getEFactoryInstance();
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
		createEOperation(tabEClass, TAB___ADD_ITEM_TO_TAB__STRING_DOUBLE);
		createEOperation(tabEClass, TAB___GET_TOTAL_COST);
		createEOperation(tabEClass, TAB___REMOVE_TAB_ITEM__STRING);
		createEOperation(tabEClass, TAB___GET_ALL);

		keyCardEClass = createEClass(KEY_CARD);
		createEAttribute(keyCardEClass, KEY_CARD__KEY_CARD_ID);
		createEOperation(keyCardEClass, KEY_CARD___GET_ID);
		createEOperation(keyCardEClass, KEY_CARD___SET_ID__INT);

		equipmentEClass = createEClass(EQUIPMENT);
		createEAttribute(equipmentEClass, EQUIPMENT__NAME);
		createEOperation(equipmentEClass, EQUIPMENT___GET_NAME);

		roomTypeEClass = createEClass(ROOM_TYPE);
		createEAttribute(roomTypeEClass, ROOM_TYPE__COST_PER_NIGHT);
		createEAttribute(roomTypeEClass, ROOM_TYPE__NAME);
		createEOperation(roomTypeEClass, ROOM_TYPE___GET_COST_PER_NIGHT);
		createEOperation(roomTypeEClass, ROOM_TYPE___SET_COST_PER_NIGHT__DOUBLE);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__ROOM_NUMBER);
		createEReference(roomEClass, ROOM__ROOM_TYPE);
		createEAttribute(roomEClass, ROOM__HOUSEKEPT);
		createEReference(roomEClass, ROOM__EQUIPMENT);
		createEOperation(roomEClass, ROOM___GET_ROOM_TYPE);
		createEOperation(roomEClass, ROOM___ADD_ROOM_TYPE__ROOMTYPE);
		createEOperation(roomEClass, ROOM___REMOVE_ROOM_TYPE__ROOMTYPE);
		createEOperation(roomEClass, ROOM___ADD_EQUIPMENT_TO_ROOM__STRING);
		createEOperation(roomEClass, ROOM___REMOVE_EQUIPMENT_ITEM__STRING);

		scheduledEventsEClass = createEClass(SCHEDULED_EVENTS);
		createEAttribute(scheduledEventsEClass, SCHEDULED_EVENTS__EVENTS);
		createEOperation(scheduledEventsEClass, SCHEDULED_EVENTS___ADD_EVENT__STRING_LONG);
		createEOperation(scheduledEventsEClass, SCHEDULED_EVENTS___GET_EVENTS);
		createEOperation(scheduledEventsEClass, SCHEDULED_EVENTS___UPDATE_EVENT__STRING_LONG);
		createEOperation(scheduledEventsEClass, SCHEDULED_EVENTS___DELETE_EVENT__STRING);

		billEClass = createEClass(BILL);
		createEAttribute(billEClass, BILL__PAID);
		createEAttribute(billEClass, BILL__GRAND_TOTAL);
		createEOperation(billEClass, BILL___ADD_TO_BILL__DOUBLE);
		createEOperation(billEClass, BILL___IS_PAID);
		createEOperation(billEClass, BILL___REMOVE_FROM_BILL__DOUBLE);
		createEOperation(billEClass, BILL___LEFT_TO_PAY);
		createEOperation(billEClass, BILL___PAY__DOUBLE);

		sleepRoomEClass = createEClass(SLEEP_ROOM);
		createEAttribute(sleepRoomEClass, SLEEP_ROOM__NBR_OF_BEDS);
		createEOperation(sleepRoomEClass, SLEEP_ROOM___GET_NBR_OF_BEDS);
		createEOperation(sleepRoomEClass, SLEEP_ROOM___SET_NBR_OF_BEDS__INT);

		customerEClass = createEClass(CUSTOMER);
		createEAttribute(customerEClass, CUSTOMER__ID);
		createEAttribute(customerEClass, CUSTOMER__NAME);
		createEReference(customerEClass, CUSTOMER__PAYMENT_DETAILS);
		createEAttribute(customerEClass, CUSTOMER__LOYALTY_POINTS);
		createEOperation(customerEClass, CUSTOMER___GET_ID);
		createEOperation(customerEClass, CUSTOMER___SET_ID__STRING);
		createEOperation(customerEClass, CUSTOMER___GET_NAME);
		createEOperation(customerEClass, CUSTOMER___SET_NAME__STRING);
		createEOperation(customerEClass, CUSTOMER___GET_LOYALTY_POINTS);
		createEOperation(customerEClass, CUSTOMER___ADD_LOYALTY_POINTS__INT);
		createEOperation(customerEClass, CUSTOMER___REMOVE_LOYALTY_POINTS__INT);
		createEOperation(customerEClass, CUSTOMER___GET_PAYMENT_DETAILS);
		createEOperation(customerEClass, CUSTOMER___SET_PAYMENT_DETAILS__PAYMENTDETAILS);

		paymentDetailsEClass = createEClass(PAYMENT_DETAILS);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__CC_NUMBER);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__CCV);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__EXPIRY_MONTH);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__EXPIRY_YEAR);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__FIRST_NAME);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__LAST_NAME);
		createEOperation(paymentDetailsEClass, PAYMENT_DETAILS___GET_CC_NUMBER);
		createEOperation(paymentDetailsEClass, PAYMENT_DETAILS___SET_CC_NUMBER__STRING);
		createEOperation(paymentDetailsEClass, PAYMENT_DETAILS___GET_CC_V);
		createEOperation(paymentDetailsEClass, PAYMENT_DETAILS___SET_CCV__STRING);
		createEOperation(paymentDetailsEClass, PAYMENT_DETAILS___GET_EXPIRY_MONTH);
		createEOperation(paymentDetailsEClass, PAYMENT_DETAILS___SET_EXPIRY_MONTH__INT);
		createEOperation(paymentDetailsEClass, PAYMENT_DETAILS___SET_EXPIRY_YEAR__INT);
		createEOperation(paymentDetailsEClass, PAYMENT_DETAILS___GET_EXPIRY_YEAR);
		createEOperation(paymentDetailsEClass, PAYMENT_DETAILS___GET_FIRST_NAME);
		createEOperation(paymentDetailsEClass, PAYMENT_DETAILS___SET_FIRST_NAME__STRING);
		createEOperation(paymentDetailsEClass, PAYMENT_DETAILS___SET_LAST_NAME__STRING);
		createEOperation(paymentDetailsEClass, PAYMENT_DETAILS___GET_LAST_NAME);

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
		createEAttribute(reservationEClass, RESERVATION__NUMBER_OF_GUESTS);
		createEOperation(reservationEClass, RESERVATION___GET_RESPONSIBLE);
		createEOperation(reservationEClass, RESERVATION___SET_RESPONSIBLE__STRING);
		createEOperation(reservationEClass, RESERVATION___GET_NUMBER_OF_GUESTS);
		createEOperation(reservationEClass, RESERVATION___SET_NUMBER_OF_GUESTS__INT);
		createEOperation(reservationEClass, RESERVATION___GET_ROOM);
		createEOperation(reservationEClass, RESERVATION___SET_ROOM__ROOM);
		createEOperation(reservationEClass, RESERVATION___GET_COST_CATEGORY);
		createEOperation(reservationEClass, RESERVATION___ADD_COST_CATEGORY__ROOMTYPE);
		createEOperation(reservationEClass, RESERVATION___GET_EVENTS);
		createEOperation(reservationEClass, RESERVATION___REMOVE_ALL_EVENTS);
		createEOperation(reservationEClass, RESERVATION___GET_KEY_CARDS);
		createEOperation(reservationEClass, RESERVATION___ADD_KEY_CARD__KEYCARD);
		createEOperation(reservationEClass, RESERVATION___REMOVE_KEY_CARD__KEYCARD);
		createEOperation(reservationEClass, RESERVATION___REMOVE_COST_CATEGORY__ROOMTYPE);
		createEOperation(reservationEClass, RESERVATION___GET_TAB);

		bookingEClass = createEClass(BOOKING);
		createEReference(bookingEClass, BOOKING__BILL);
		createEReference(bookingEClass, BOOKING__CUSTOMER);
		createEReference(bookingEClass, BOOKING__RESERVATIONS);
		createEAttribute(bookingEClass, BOOKING__BOOKING_UUID);
		createEOperation(bookingEClass, BOOKING___ADD_RESERVATION__RESERVATION);
		createEOperation(bookingEClass, BOOKING___REMOVE_RESERVATION__RESERVATION);
		createEOperation(bookingEClass, BOOKING___GET_CUSTOMER);
		createEOperation(bookingEClass, BOOKING___GET_BILL);
		createEOperation(bookingEClass, BOOKING___SET_CUSTOMER__CUSTOMER);

		conferenceRoomEClass = createEClass(CONFERENCE_ROOM);
		createEAttribute(conferenceRoomEClass, CONFERENCE_ROOM__MAX_NBR_OF_PEOPLE);
		createEOperation(conferenceRoomEClass, CONFERENCE_ROOM___GET_NBR_OF_PEOPLE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sleepRoomEClass.getESuperTypes().add(this.getRoomType());
		conferenceRoomEClass.getESuperTypes().add(this.getRoomType());

		// Initialize classes, features, and operations; add parameters
		initEClass(hotelEClass, Hotel.class, "Hotel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tabEClass, Tab.class, "Tab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTab_TabItems(), ecorePackage.getEMap(), "tabItems", null, 1, 1, Tab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getTab__AddItemToTab__String_double(), null, "addItemToTab", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "item", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "cost", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getTab__GetTotalCost(), ecorePackage.getEDouble(), "getTotalCost", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getTab__RemoveTabItem__String(), null, "removeTabItem", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "itemName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getTab__GetAll(), null, "getAll", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(keyCardEClass, KeyCard.class, "KeyCard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyCard_KeyCardID(), ecorePackage.getEInt(), "keyCardID", null, 1, 1, KeyCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getKeyCard__GetID(), ecorePackage.getEInt(), "getID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getKeyCard__SetID__int(), null, "setID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "keyCardID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(equipmentEClass, Equipment.class, "Equipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEquipment_Name(), ecorePackage.getEString(), "name", null, 1, 1, Equipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getEquipment__GetName(), ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomTypeEClass, RoomType.class, "RoomType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomType_CostPerNight(), ecorePackage.getEDouble(), "costPerNight", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_Name(), ecorePackage.getEString(), "name", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getRoomType__GetCostPerNight(), ecorePackage.getEDouble(), "getCostPerNight", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomType__SetCostPerNight__double(), null, "setCostPerNight", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "cost", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_RoomNumber(), ecorePackage.getEInt(), "roomNumber", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_RoomType(), this.getRoomType(), null, "roomType", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Housekept(), ecorePackage.getEBoolean(), "housekept", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_Equipment(), this.getEquipment(), null, "equipment", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getRoom__GetRoomType(), this.getRoomType(), "getRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoom__AddRoomType__RoomType(), null, "addRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoom__RemoveRoomType__RoomType(), null, "removeRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoom__AddEquipmentToRoom__String(), null, "addEquipmentToRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "item", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoom__RemoveEquipmentItem__String(), null, "removeEquipmentItem", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "itemName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(scheduledEventsEClass, ScheduledEvents.class, "ScheduledEvents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScheduledEvents_Events(), ecorePackage.getEMap(), "events", null, 1, 1, ScheduledEvents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getScheduledEvents__AddEvent__String_long(), null, "addEvent", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "eventName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timestamp", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getScheduledEvents__GetEvents(), ecorePackage.getEMap(), "getEvents", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getScheduledEvents__UpdateEvent__String_long(), null, "updateEvent", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "eventName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "timestamp", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getScheduledEvents__DeleteEvent__String(), null, "deleteEvent", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "eventName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(billEClass, Bill.class, "Bill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBill_Paid(), ecorePackage.getEDouble(), "paid", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_GrandTotal(), ecorePackage.getEDouble(), "grandTotal", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getBill__AddToBill__double(), null, "addToBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "cost", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBill__IsPaid(), ecorePackage.getEBoolean(), "isPaid", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBill__RemoveFromBill__double(), null, "removeFromBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "cost", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBill__LeftToPay(), ecorePackage.getEDouble(), "leftToPay", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBill__Pay__double(), null, "pay", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "cost", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(sleepRoomEClass, SleepRoom.class, "SleepRoom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSleepRoom_NbrOfBeds(), ecorePackage.getEInt(), "nbrOfBeds", null, 1, 1, SleepRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getSleepRoom__GetNbrOfBeds(), ecorePackage.getEInt(), "getNbrOfBeds", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getSleepRoom__SetNbrOfBeds__int(), null, "setNbrOfBeds", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nbrOfBeds", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomer_Id(), ecorePackage.getEString(), "id", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_Name(), ecorePackage.getEString(), "name", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCustomer_PaymentDetails(), this.getPaymentDetails(), null, "paymentDetails", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_LoyaltyPoints(), ecorePackage.getEInt(), "loyaltyPoints", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getCustomer__GetId(), ecorePackage.getEString(), "getId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCustomer__SetId__String(), null, "setId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomer__GetName(), ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCustomer__SetName__String(), null, "setName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomer__GetLoyaltyPoints(), ecorePackage.getEInt(), "getLoyaltyPoints", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCustomer__AddLoyaltyPoints__int(), null, "addLoyaltyPoints", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "points", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCustomer__RemoveLoyaltyPoints__int(), null, "removeLoyaltyPoints", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "points", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomer__GetPaymentDetails(), this.getPaymentDetails(), "getPaymentDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCustomer__SetPaymentDetails__PaymentDetails(), null, "setPaymentDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPaymentDetails(), "paymentDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(paymentDetailsEClass, PaymentDetails.class, "PaymentDetails", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentDetails_CcNumber(), ecorePackage.getEString(), "ccNumber", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentDetails_Ccv(), ecorePackage.getEString(), "ccv", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentDetails_ExpiryMonth(), ecorePackage.getEInt(), "expiryMonth", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentDetails_ExpiryYear(), ecorePackage.getEInt(), "expiryYear", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentDetails_FirstName(), ecorePackage.getEString(), "firstName", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentDetails_LastName(), ecorePackage.getEString(), "lastName", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getPaymentDetails__GetCcNumber(), ecorePackage.getEString(), "getCcNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPaymentDetails__SetCcNumber__String(), null, "setCcNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPaymentDetails__GetCcV(), ecorePackage.getEString(), "getCcV", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPaymentDetails__SetCcv__String(), null, "setCcv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPaymentDetails__GetExpiryMonth(), ecorePackage.getEInt(), "getExpiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPaymentDetails__SetExpiryMonth__int(), null, "setExpiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "month", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPaymentDetails__SetExpiryYear__int(), null, "setExpiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "month", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPaymentDetails__GetExpiryYear(), ecorePackage.getEInt(), "getExpiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPaymentDetails__GetFirstName(), ecorePackage.getEString(), "getFirstName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPaymentDetails__SetFirstName__String(), null, "setFirstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fname", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPaymentDetails__SetLastName__String(), null, "setLastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lname", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPaymentDetails__GetLastName(), ecorePackage.getEString(), "getLastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(reservationEClass, Reservation.class, "Reservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReservation_Tab(), this.getTab(), null, "tab", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReservation_KeyCard(), this.getKeyCard(), null, "keyCard", null, 0, -1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReservation_ScheduledEvents(), this.getScheduledEvents(), null, "scheduledEvents", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReservation_Room(), this.getRoom(), null, "room", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReservation_CostCategory(), this.getRoomType(), null, "costCategory", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservation_CheckedIn(), ecorePackage.getEDate(), "checkedIn", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservation_CheckedOut(), ecorePackage.getEDate(), "checkedOut", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservation_StartDay(), ecorePackage.getEDate(), "startDay", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservation_EndDay(), ecorePackage.getEDate(), "endDay", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservation_Responsible(), ecorePackage.getEString(), "responsible", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservation_NumberOfGuests(), ecorePackage.getEInt(), "numberOfGuests", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getReservation__GetResponsible(), ecorePackage.getEString(), "getResponsible", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReservation__SetResponsible__String(), null, "setResponsible", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "responsible", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReservation__GetNumberOfGuests(), ecorePackage.getEInt(), "getNumberOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReservation__SetNumberOfGuests__int(), null, "setNumberOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "number", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReservation__GetRoom(), this.getRoom(), "getRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReservation__SetRoom__Room(), null, "setRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "newRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReservation__GetCostCategory(), this.getRoomType(), "getCostCategory", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReservation__AddCostCategory__RoomType(), null, "addCostCategory", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomType(), "costCategory", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReservation__GetEvents(), this.getScheduledEvents(), "getEvents", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReservation__RemoveAllEvents(), null, "removeAllEvents", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReservation__GetKeyCards(), this.getKeyCard(), "getKeyCards", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReservation__AddKeyCard__KeyCard(), null, "addKeyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getKeyCard(), "keyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReservation__RemoveKeyCard__KeyCard(), null, "removeKeyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getKeyCard(), "keyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReservation__RemoveCostCategory__RoomType(), null, "removeCostCategory", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomType(), "costCategory", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReservation__GetTab(), this.getTab(), "getTab", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookingEClass, Booking.class, "Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooking_Bill(), this.getBill(), null, "bill", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_Customer(), this.getCustomer(), null, "customer", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_Reservations(), this.getReservation(), null, "reservations", null, 1, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_BookingUUID(), ecorePackage.getEString(), "bookingUUID", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getBooking__AddReservation__Reservation(), null, "addReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getReservation(), "reservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooking__RemoveReservation__Reservation(), null, "removeReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getReservation(), "reservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBooking__GetCustomer(), this.getCustomer(), "getCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBooking__GetBill(), this.getBill(), "getBill", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooking__SetCustomer__Customer(), null, "setCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCustomer(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(conferenceRoomEClass, ConferenceRoom.class, "ConferenceRoom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConferenceRoom_MaxNbrOfPeople(), ecorePackage.getEInt(), "maxNbrOfPeople", null, 1, 1, ConferenceRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getConferenceRoom__GetNbrOfPeople(), ecorePackage.getEInt(), "getNbrOfPeople", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //HotelCorePackageImpl
