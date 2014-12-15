/**
 */
package hotelService.impl;

import hotelCore.Bill;
import hotelCore.Booking;
import hotelCore.Customer;
import hotelCore.Reservation;
import hotelCore.*;

import hotelService.BookingManager;
import hotelService.HotelServicePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hotelService.impl.BookingManagerImpl#getAllBookings <em>All Bookings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingManagerImpl extends MinimalEObjectImpl.Container implements BookingManager {
	/**
	 * The cached value of the '{@link #getAllBookings() <em>All Bookings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<Booking> allBookings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelServicePackage.Literals.BOOKING_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getAllBookings() {
		if (allBookings == null) {
			allBookings = new EObjectResolvingEList<Booking>(Booking.class, this, HotelServicePackage.BOOKING_MANAGER__ALL_BOOKINGS);
		}
		return allBookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Booking createBooking() {
		Booking booking = HotelCoreFactory.eINSTANCE.createBooking();
		getAllBookings().add(booking);
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking getBookingByBookingNumber(int bookingNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteBooking(Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getBookingsByCustomer(Customer customer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingCustomer(Booking booking, Customer customer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBillPaidInFull(Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill getBill(Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking getBookingByReservation(Reservation reservation) {
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
			case HotelServicePackage.BOOKING_MANAGER__ALL_BOOKINGS:
				return getAllBookings();
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
			case HotelServicePackage.BOOKING_MANAGER__ALL_BOOKINGS:
				getAllBookings().clear();
				getAllBookings().addAll((Collection<? extends Booking>)newValue);
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
			case HotelServicePackage.BOOKING_MANAGER__ALL_BOOKINGS:
				getAllBookings().clear();
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
			case HotelServicePackage.BOOKING_MANAGER__ALL_BOOKINGS:
				return allBookings != null && !allBookings.isEmpty();
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
			case HotelServicePackage.BOOKING_MANAGER___CREATE_BOOKING:
				return createBooking();
			case HotelServicePackage.BOOKING_MANAGER___GET_BOOKING_BY_BOOKING_NUMBER__INT:
				return getBookingByBookingNumber((Integer)arguments.get(0));
			case HotelServicePackage.BOOKING_MANAGER___DELETE_BOOKING__BOOKING:
				deleteBooking((Booking)arguments.get(0));
				return null;
			case HotelServicePackage.BOOKING_MANAGER___GET_BOOKINGS_BY_CUSTOMER__CUSTOMER:
				return getBookingsByCustomer((Customer)arguments.get(0));
			case HotelServicePackage.BOOKING_MANAGER___SET_BOOKING_CUSTOMER__BOOKING_CUSTOMER:
				setBookingCustomer((Booking)arguments.get(0), (Customer)arguments.get(1));
				return null;
			case HotelServicePackage.BOOKING_MANAGER___IS_BILL_PAID_IN_FULL__BOOKING:
				return isBillPaidInFull((Booking)arguments.get(0));
			case HotelServicePackage.BOOKING_MANAGER___GET_BILL__BOOKING:
				return getBill((Booking)arguments.get(0));
			case HotelServicePackage.BOOKING_MANAGER___GET_BOOKING_BY_RESERVATION__RESERVATION:
				return getBookingByReservation((Reservation)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingManagerImpl
