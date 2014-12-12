/**
 */
package se.chalmers.mdsd1415.group11.model.HotelCore.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import se.chalmers.mdsd1415.group11.model.HotelCore.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HotelCoreFactoryImpl extends EFactoryImpl implements HotelCoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HotelCoreFactory init() {
		try {
			HotelCoreFactory theHotelCoreFactory = (HotelCoreFactory)EPackage.Registry.INSTANCE.getEFactory(HotelCorePackage.eNS_URI);
			if (theHotelCoreFactory != null) {
				return theHotelCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HotelCoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelCoreFactoryImpl() {
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
			case HotelCorePackage.HOTEL: return createHotel();
			case HotelCorePackage.TAB: return createTab();
			case HotelCorePackage.KEY_CARD: return createKeyCard();
			case HotelCorePackage.EQUIPMENT: return createEquipment();
			case HotelCorePackage.ROOM_TYPE: return createRoomType();
			case HotelCorePackage.ROOM: return createRoom();
			case HotelCorePackage.SCHEDULED_EVENTS: return createScheduledEvents();
			case HotelCorePackage.BILL: return createBill();
			case HotelCorePackage.SLEEP_ROOM: return createSleepRoom();
			case HotelCorePackage.CUSTOMER: return createCustomer();
			case HotelCorePackage.PAYMENT_DETAILS: return createPaymentDetails();
			case HotelCorePackage.RESERVATION: return createReservation();
			case HotelCorePackage.BOOKING: return createBooking();
			case HotelCorePackage.CONFERENCE_ROOM: return createConferenceRoom();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public HotelCorePackage getHotelCorePackage() {
		return (HotelCorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HotelCorePackage getPackage() {
		return HotelCorePackage.eINSTANCE;
	}

} //HotelCoreFactoryImpl
