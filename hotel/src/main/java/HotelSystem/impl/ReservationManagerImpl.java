/**
 */
package HotelSystem.impl;

import HotelSystem.Booking;
import HotelSystem.HotelSystemPackage;
import HotelSystem.Reservation;
import HotelSystem.ReservationManager;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reservation Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link HotelSystem.impl.ReservationManagerImpl#getReservation <em>Reservation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReservationManagerImpl extends MinimalEObjectImpl.Container implements ReservationManager {
	/**
	 * The cached value of the '{@link #getReservation() <em>Reservation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservation()
	 * @generated
	 * @ordered
	 */
	protected EList<Reservation> reservation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReservationManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelSystemPackage.Literals.RESERVATION_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reservation> getReservation() {
		if (reservation == null) {
			reservation = new EObjectResolvingEList<Reservation>(Reservation.class, this, HotelSystemPackage.RESERVATION_MANAGER__RESERVATION);
		}
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean createReservation(Booking booking, Date fromDate, Date toDate, long roomId, long costCategoryId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservation getReservation(long reservationId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reservation> getNonCheckedInReservation(Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkInReservation(long reservationId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkOutReservation(Reservation reservation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservation getCurrentReservationByRoomNumber(int roomNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelSystemPackage.RESERVATION_MANAGER__RESERVATION:
				return getReservation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HotelSystemPackage.RESERVATION_MANAGER__RESERVATION:
				getReservation().clear();
				getReservation().addAll((Collection<? extends Reservation>)newValue);
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
			case HotelSystemPackage.RESERVATION_MANAGER__RESERVATION:
				getReservation().clear();
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
			case HotelSystemPackage.RESERVATION_MANAGER__RESERVATION:
				return reservation != null && !reservation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HotelSystemPackage.RESERVATION_MANAGER___CREATE_RESERVATION__BOOKING_DATE_DATE_LONG_LONG:
				return createReservation((Booking)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2), (Long)arguments.get(3), (Long)arguments.get(4));
			case HotelSystemPackage.RESERVATION_MANAGER___GET_RESERVATION__LONG:
				return getReservation((Long)arguments.get(0));
			case HotelSystemPackage.RESERVATION_MANAGER___GET_NON_CHECKED_IN_RESERVATION__BOOKING:
				return getNonCheckedInReservation((Booking)arguments.get(0));
			case HotelSystemPackage.RESERVATION_MANAGER___CHECK_IN_RESERVATION__LONG:
				return checkInReservation((Long)arguments.get(0));
			case HotelSystemPackage.RESERVATION_MANAGER___CHECK_OUT_RESERVATION__RESERVATION:
				return checkOutReservation((Reservation)arguments.get(0));
			case HotelSystemPackage.RESERVATION_MANAGER___GET_CURRENT_RESERVATION_BY_ROOM_NUMBER__INT:
				return getCurrentReservationByRoomNumber((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReservationManagerImpl
