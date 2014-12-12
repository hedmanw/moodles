/**
 */
package se.chalmers.mdsd1415.group11.model.HotelService.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import se.chalmers.mdsd1415.group11.model.HotelService.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HotelServiceFactoryImpl extends EFactoryImpl implements HotelServiceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HotelServiceFactory init() {
		try {
			HotelServiceFactory theHotelServiceFactory = (HotelServiceFactory)EPackage.Registry.INSTANCE.getEFactory(HotelServicePackage.eNS_URI);
			if (theHotelServiceFactory != null) {
				return theHotelServiceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HotelServiceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelServiceFactoryImpl() {
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
			case HotelServicePackage.SYSTEM_USER: return createSystemUser();
			case HotelServicePackage.ROOM_MANAGER: return createRoomManager();
			case HotelServicePackage.ROOM_TYPE_MANAGER: return createRoomTypeManager();
			case HotelServicePackage.RESERVATION_MANAGER: return createReservationManager();
			case HotelServicePackage.BOOKING_MANAGER: return createBookingManager();
			case HotelServicePackage.CUSTOMER_MANAGER: return createCustomerManager();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUser createSystemUser() {
		SystemUserImpl systemUser = new SystemUserImpl();
		return systemUser;
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
	public RoomTypeManager createRoomTypeManager() {
		RoomTypeManagerImpl roomTypeManager = new RoomTypeManagerImpl();
		return roomTypeManager;
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
	public BookingManager createBookingManager() {
		BookingManagerImpl bookingManager = new BookingManagerImpl();
		return bookingManager;
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
	public HotelServicePackage getHotelServicePackage() {
		return (HotelServicePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HotelServicePackage getPackage() {
		return HotelServicePackage.eINSTANCE;
	}

} //HotelServiceFactoryImpl
