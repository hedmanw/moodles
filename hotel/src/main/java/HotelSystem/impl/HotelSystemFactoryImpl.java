/**
 */
package HotelSystem.impl;

import HotelSystem.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HotelSystemFactoryImpl extends EFactoryImpl implements HotelSystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HotelSystemFactory init() {
		try {
			HotelSystemFactory theHotelSystemFactory = (HotelSystemFactory)EPackage.Registry.INSTANCE.getEFactory(HotelSystemPackage.eNS_URI);
			if (theHotelSystemFactory != null) {
				return theHotelSystemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HotelSystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelSystemFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HotelSystemPackage.HOTEL: return createHotel();
			case HotelSystemPackage.TAB: return createTab();
			case HotelSystemPackage.KEY_CARD: return createKeyCard();
			case HotelSystemPackage.EQUIPMENT: return createEquipment();
			case HotelSystemPackage.ROOM_TYPE: return createRoomType();
			case HotelSystemPackage.ROOM: return createRoom();
			case HotelSystemPackage.SCHEDULED_EVENTS: return createScheduledEvents();
			case HotelSystemPackage.BILL: return createBill();
			case HotelSystemPackage.SLEEP_ROOM: return createSleepRoom();
			case HotelSystemPackage.CUSTOMER: return createCustomer();
			case HotelSystemPackage.PAYMENT_DETAILS: return createPaymentDetails();
			case HotelSystemPackage.RESERVATION: return createReservation();
			case HotelSystemPackage.BOOKING: return createBooking();
			case HotelSystemPackage.CONFERENCE_ROOM: return createConferenceRoom();
			case HotelSystemPackage.CUSTOMER_MANAGER: return createCustomerManager();
			case HotelSystemPackage.ROOM_TYPE_MANAGER: return createRoomTypeManager();
			case HotelSystemPackage.BOOKING_MANAGER: return createBookingManager();
			case HotelSystemPackage.ROOM_MANAGER: return createRoomManager();
			case HotelSystemPackage.RESERVATION_MANAGER: return createReservationManager();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case HotelSystemPackage.PAYMENT_METHOD:
				return createPaymentMethodFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case HotelSystemPackage.PAYMENT_METHOD:
				return convertPaymentMethodToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel createHotel() {
		HotelImpl hotel = new HotelImpl();
		return hotel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tab createTab() {
		TabImpl tab = new TabImpl();
		return tab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyCard createKeyCard() {
		KeyCardImpl keyCard = new KeyCardImpl();
		return keyCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipment createEquipment() {
		EquipmentImpl equipment = new EquipmentImpl();
		return equipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType createRoomType() {
		RoomTypeImpl roomType = new RoomTypeImpl();
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduledEvents createScheduledEvents() {
		ScheduledEventsImpl scheduledEvents = new ScheduledEventsImpl();
		return scheduledEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill createBill() {
		BillImpl bill = new BillImpl();
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SleepRoom createSleepRoom() {
		SleepRoomImpl sleepRoom = new SleepRoomImpl();
		return sleepRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentDetails createPaymentDetails() {
		PaymentDetailsImpl paymentDetails = new PaymentDetailsImpl();
		return paymentDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservation createReservation() {
		ReservationImpl reservation = new ReservationImpl();
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking createBooking() {
		BookingImpl booking = new BookingImpl();
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConferenceRoom createConferenceRoom() {
		ConferenceRoomImpl conferenceRoom = new ConferenceRoomImpl();
		return conferenceRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerManager createCustomerManager() {
		CustomerManagerImpl customerManager = new CustomerManagerImpl();
		return customerManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypeManager createRoomTypeManager() {
		RoomTypeManagerImpl roomTypeManager = new RoomTypeManagerImpl();
		return roomTypeManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingManager createBookingManager() {
		BookingManagerImpl bookingManager = new BookingManagerImpl();
		return bookingManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomManager createRoomManager() {
		RoomManagerImpl roomManager = new RoomManagerImpl();
		return roomManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationManager createReservationManager() {
		ReservationManagerImpl reservationManager = new ReservationManagerImpl();
		return reservationManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMethod createPaymentMethodFromString(EDataType eDataType, String initialValue) {
		PaymentMethod result = PaymentMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelSystemPackage getHotelSystemPackage() {
		return (HotelSystemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HotelSystemPackage getPackage() {
		return HotelSystemPackage.eINSTANCE;
	}

} //HotelSystemFactoryImpl
