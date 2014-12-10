/**
 */
package model.impl;

import HotelSystem.Booking;
import HotelSystem.Reservation;

import model.HotelService.HotelReceptionist;
import model.HotelService.IBookingManager;
import model.HotelService.IReservationManager;
import model.HotelService.IRoomManager;

import model.ModelPackage;
import model.reserveARoom;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>reserve ARoom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.reserveARoomImpl#getR <em>R</em>}</li>
 *   <li>{@link model.impl.reserveARoomImpl#getReservation <em>Reservation</em>}</li>
 *   <li>{@link model.impl.reserveARoomImpl#getBooking <em>Booking</em>}</li>
 *   <li>{@link model.impl.reserveARoomImpl#getRoomManager <em>Room Manager</em>}</li>
 *   <li>{@link model.impl.reserveARoomImpl#getReservationManager <em>Reservation Manager</em>}</li>
 *   <li>{@link model.impl.reserveARoomImpl#getBookingManager <em>Booking Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class reserveARoomImpl extends MinimalEObjectImpl.Container implements reserveARoom {
	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected HotelReceptionist r;

	/**
	 * The cached value of the '{@link #getReservation() <em>Reservation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservation()
	 * @generated
	 * @ordered
	 */
	protected Reservation reservation;

	/**
	 * The cached value of the '{@link #getBooking() <em>Booking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooking()
	 * @generated
	 * @ordered
	 */
	protected Booking booking;

	/**
	 * The cached value of the '{@link #getRoomManager() <em>Room Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomManager()
	 * @generated
	 * @ordered
	 */
	protected IRoomManager roomManager;

	/**
	 * The cached value of the '{@link #getReservationManager() <em>Reservation Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationManager()
	 * @generated
	 * @ordered
	 */
	protected IReservationManager reservationManager;

	/**
	 * The cached value of the '{@link #getBookingManager() <em>Booking Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingManager()
	 * @generated
	 * @ordered
	 */
	protected IBookingManager bookingManager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected reserveARoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RESERVE_AROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelReceptionist getR() {
		if (r != null && r.eIsProxy()) {
			InternalEObject oldR = (InternalEObject)r;
			r = (HotelReceptionist)eResolveProxy(oldR);
			if (r != oldR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.RESERVE_AROOM__R, oldR, r));
			}
		}
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelReceptionist basicGetR() {
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(HotelReceptionist newR) {
		HotelReceptionist oldR = r;
		r = newR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESERVE_AROOM__R, oldR, r));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservation getReservation() {
		if (reservation != null && reservation.eIsProxy()) {
			InternalEObject oldReservation = (InternalEObject)reservation;
			reservation = (Reservation)eResolveProxy(oldReservation);
			if (reservation != oldReservation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.RESERVE_AROOM__RESERVATION, oldReservation, reservation));
			}
		}
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservation basicGetReservation() {
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservation(Reservation newReservation) {
		Reservation oldReservation = reservation;
		reservation = newReservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESERVE_AROOM__RESERVATION, oldReservation, reservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking getBooking() {
		if (booking != null && booking.eIsProxy()) {
			InternalEObject oldBooking = (InternalEObject)booking;
			booking = (Booking)eResolveProxy(oldBooking);
			if (booking != oldBooking) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.RESERVE_AROOM__BOOKING, oldBooking, booking));
			}
		}
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking basicGetBooking() {
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooking(Booking newBooking) {
		Booking oldBooking = booking;
		booking = newBooking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESERVE_AROOM__BOOKING, oldBooking, booking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRoomManager getRoomManager() {
		if (roomManager != null && roomManager.eIsProxy()) {
			InternalEObject oldRoomManager = (InternalEObject)roomManager;
			roomManager = (IRoomManager)eResolveProxy(oldRoomManager);
			if (roomManager != oldRoomManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.RESERVE_AROOM__ROOM_MANAGER, oldRoomManager, roomManager));
			}
		}
		return roomManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRoomManager basicGetRoomManager() {
		return roomManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomManager(IRoomManager newRoomManager) {
		IRoomManager oldRoomManager = roomManager;
		roomManager = newRoomManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESERVE_AROOM__ROOM_MANAGER, oldRoomManager, roomManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReservationManager getReservationManager() {
		if (reservationManager != null && reservationManager.eIsProxy()) {
			InternalEObject oldReservationManager = (InternalEObject)reservationManager;
			reservationManager = (IReservationManager)eResolveProxy(oldReservationManager);
			if (reservationManager != oldReservationManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.RESERVE_AROOM__RESERVATION_MANAGER, oldReservationManager, reservationManager));
			}
		}
		return reservationManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReservationManager basicGetReservationManager() {
		return reservationManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservationManager(IReservationManager newReservationManager) {
		IReservationManager oldReservationManager = reservationManager;
		reservationManager = newReservationManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESERVE_AROOM__RESERVATION_MANAGER, oldReservationManager, reservationManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBookingManager getBookingManager() {
		if (bookingManager != null && bookingManager.eIsProxy()) {
			InternalEObject oldBookingManager = (InternalEObject)bookingManager;
			bookingManager = (IBookingManager)eResolveProxy(oldBookingManager);
			if (bookingManager != oldBookingManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.RESERVE_AROOM__BOOKING_MANAGER, oldBookingManager, bookingManager));
			}
		}
		return bookingManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBookingManager basicGetBookingManager() {
		return bookingManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingManager(IBookingManager newBookingManager) {
		IBookingManager oldBookingManager = bookingManager;
		bookingManager = newBookingManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESERVE_AROOM__BOOKING_MANAGER, oldBookingManager, bookingManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.RESERVE_AROOM__R:
				if (resolve) return getR();
				return basicGetR();
			case ModelPackage.RESERVE_AROOM__RESERVATION:
				if (resolve) return getReservation();
				return basicGetReservation();
			case ModelPackage.RESERVE_AROOM__BOOKING:
				if (resolve) return getBooking();
				return basicGetBooking();
			case ModelPackage.RESERVE_AROOM__ROOM_MANAGER:
				if (resolve) return getRoomManager();
				return basicGetRoomManager();
			case ModelPackage.RESERVE_AROOM__RESERVATION_MANAGER:
				if (resolve) return getReservationManager();
				return basicGetReservationManager();
			case ModelPackage.RESERVE_AROOM__BOOKING_MANAGER:
				if (resolve) return getBookingManager();
				return basicGetBookingManager();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.RESERVE_AROOM__R:
				setR((HotelReceptionist)newValue);
				return;
			case ModelPackage.RESERVE_AROOM__RESERVATION:
				setReservation((Reservation)newValue);
				return;
			case ModelPackage.RESERVE_AROOM__BOOKING:
				setBooking((Booking)newValue);
				return;
			case ModelPackage.RESERVE_AROOM__ROOM_MANAGER:
				setRoomManager((IRoomManager)newValue);
				return;
			case ModelPackage.RESERVE_AROOM__RESERVATION_MANAGER:
				setReservationManager((IReservationManager)newValue);
				return;
			case ModelPackage.RESERVE_AROOM__BOOKING_MANAGER:
				setBookingManager((IBookingManager)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.RESERVE_AROOM__R:
				setR((HotelReceptionist)null);
				return;
			case ModelPackage.RESERVE_AROOM__RESERVATION:
				setReservation((Reservation)null);
				return;
			case ModelPackage.RESERVE_AROOM__BOOKING:
				setBooking((Booking)null);
				return;
			case ModelPackage.RESERVE_AROOM__ROOM_MANAGER:
				setRoomManager((IRoomManager)null);
				return;
			case ModelPackage.RESERVE_AROOM__RESERVATION_MANAGER:
				setReservationManager((IReservationManager)null);
				return;
			case ModelPackage.RESERVE_AROOM__BOOKING_MANAGER:
				setBookingManager((IBookingManager)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.RESERVE_AROOM__R:
				return r != null;
			case ModelPackage.RESERVE_AROOM__RESERVATION:
				return reservation != null;
			case ModelPackage.RESERVE_AROOM__BOOKING:
				return booking != null;
			case ModelPackage.RESERVE_AROOM__ROOM_MANAGER:
				return roomManager != null;
			case ModelPackage.RESERVE_AROOM__RESERVATION_MANAGER:
				return reservationManager != null;
			case ModelPackage.RESERVE_AROOM__BOOKING_MANAGER:
				return bookingManager != null;
		}
		return super.eIsSet(featureID);
	}

} //reserveARoomImpl
