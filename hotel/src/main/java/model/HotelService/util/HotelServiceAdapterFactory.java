/**
 */
package model.HotelService.util;

import model.HotelService.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see model.HotelService.HotelServicePackage
 * @generated
 */
public class HotelServiceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HotelServicePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelServiceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HotelServicePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HotelServiceSwitch<Adapter> modelSwitch =
		new HotelServiceSwitch<Adapter>() {
			@Override
			public Adapter caseSystemUser(SystemUser object) {
				return createSystemUserAdapter();
			}
			@Override
			public Adapter caseExternalUser(ExternalUser object) {
				return createExternalUserAdapter();
			}
			@Override
			public Adapter caseHotelStaff(HotelStaff object) {
				return createHotelStaffAdapter();
			}
			@Override
			public Adapter caseHotelReceptionist(HotelReceptionist object) {
				return createHotelReceptionistAdapter();
			}
			@Override
			public Adapter caseHotelManager(HotelManager object) {
				return createHotelManagerAdapter();
			}
			@Override
			public Adapter caseIRoomManager(IRoomManager object) {
				return createIRoomManagerAdapter();
			}
			@Override
			public Adapter caseRoomManager(RoomManager object) {
				return createRoomManagerAdapter();
			}
			@Override
			public Adapter caseIRoomTypeManager(IRoomTypeManager object) {
				return createIRoomTypeManagerAdapter();
			}
			@Override
			public Adapter caseRoomTypeManager(RoomTypeManager object) {
				return createRoomTypeManagerAdapter();
			}
			@Override
			public Adapter caseIReservationManager(IReservationManager object) {
				return createIReservationManagerAdapter();
			}
			@Override
			public Adapter caseReservationManager(ReservationManager object) {
				return createReservationManagerAdapter();
			}
			@Override
			public Adapter caseIBookingManager(IBookingManager object) {
				return createIBookingManagerAdapter();
			}
			@Override
			public Adapter caseBookingManager(BookingManager object) {
				return createBookingManagerAdapter();
			}
			@Override
			public Adapter caseICustomerManager(ICustomerManager object) {
				return createICustomerManagerAdapter();
			}
			@Override
			public Adapter caseCustomerManager(CustomerManager object) {
				return createCustomerManagerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link model.HotelService.SystemUser <em>System User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.HotelService.SystemUser
	 * @generated
	 */
	public Adapter createSystemUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.HotelService.ExternalUser <em>External User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.HotelService.ExternalUser
	 * @generated
	 */
	public Adapter createExternalUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.HotelService.HotelReceptionist <em>Hotel Receptionist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.HotelService.HotelReceptionist
	 * @generated
	 */
	public Adapter createHotelReceptionistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.HotelService.IRoomManager <em>IRoom Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.HotelService.IRoomManager
	 * @generated
	 */
	public Adapter createIRoomManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.HotelService.RoomManager <em>Room Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.HotelService.RoomManager
	 * @generated
	 */
	public Adapter createRoomManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.HotelService.IBookingManager <em>IBooking Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.HotelService.IBookingManager
	 * @generated
	 */
	public Adapter createIBookingManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.HotelService.BookingManager <em>Booking Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.HotelService.BookingManager
	 * @generated
	 */
	public Adapter createBookingManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.HotelService.IReservationManager <em>IReservation Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.HotelService.IReservationManager
	 * @generated
	 */
	public Adapter createIReservationManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.HotelService.ReservationManager <em>Reservation Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.HotelService.ReservationManager
	 * @generated
	 */
	public Adapter createReservationManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.HotelService.HotelManager <em>Hotel Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.HotelService.HotelManager
	 * @generated
	 */
	public Adapter createHotelManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.HotelService.HotelStaff <em>Hotel Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.HotelService.HotelStaff
	 * @generated
	 */
	public Adapter createHotelStaffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.HotelService.IRoomTypeManager <em>IRoom Type Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.HotelService.IRoomTypeManager
	 * @generated
	 */
	public Adapter createIRoomTypeManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.HotelService.RoomTypeManager <em>Room Type Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.HotelService.RoomTypeManager
	 * @generated
	 */
	public Adapter createRoomTypeManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.HotelService.ICustomerManager <em>ICustomer Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.HotelService.ICustomerManager
	 * @generated
	 */
	public Adapter createICustomerManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.HotelService.CustomerManager <em>Customer Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.HotelService.CustomerManager
	 * @generated
	 */
	public Adapter createCustomerManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HotelServiceAdapterFactory
