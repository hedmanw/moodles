/**
 */
package hotelService.impl;

import datastructs.EArrayList;
import hotelCore.Booking;
import hotelCore.Reservation;
import hotelCore.Room;
import hotelCore.RoomType;
import hotelCore.*;

import hotelService.BookingManager;
import hotelService.HotelServicePackage;
import hotelService.ManagerSingleton;
import hotelService.ReservationManager;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;
import java.util.List;

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
 *   <li>{@link hotelService.impl.ReservationManagerImpl#getAllReservations <em>All Reservations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReservationManagerImpl extends MinimalEObjectImpl.Container implements ReservationManager {
	/**
	 * The cached value of the '{@link #getAllReservations() <em>All Reservations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllReservations()
	 * @generated
	 * @ordered
	 */
	protected EList<Reservation> allReservations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
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
		return HotelServicePackage.Literals.RESERVATION_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reservation> getAllReservations() {
		if (allReservations == null) {
			allReservations = new EObjectResolvingEList<Reservation>(Reservation.class, this, HotelServicePackage.RESERVATION_MANAGER__ALL_RESERVATIONS);
		}
		return allReservations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Reservation createReservation(Booking booking, Date fromDate, Date toDate, Room room, RoomType costCategory) {
		if (toDate.before(fromDate)) {
			throw new IllegalArgumentException("Illegal date range");
		}

		EList<Booking> bookings = new EArrayList<>(ManagerSingleton.getInstance().BOOKING_MANAGER.getAllBookings());
		bookings.add(booking);
		for (Booking b : bookings) {
			for (Reservation r : b.getReservations()) {
				if (r.getRoom().getRoomNumber() == room.getRoomNumber()) {
					if (datesOverlap(fromDate, toDate, r.getStartDay(), r.getEndDay())) {
						throw new IllegalArgumentException("Room is occupied");
					}
				}
			}
		}

		Reservation reservation = HotelCoreFactory.eINSTANCE.createReservation();
		reservation.setCostCategory(costCategory);
		reservation.setStartDay(fromDate);
		reservation.setEndDay(toDate);
		reservation.setRoom(room);
		booking.getReservations().add(reservation);

		int nights = (int) ((toDate.getTime() - fromDate.getTime()) / (24*60*60*1000));
		booking.getBill().addToBill(costCategory.getCostPerNight() * nights);
		return reservation;
	}

	private boolean datesOverlap(Date fromDate, Date toDate, Date baseStart, Date baseEnd) {
		return !(baseEnd.before(fromDate) || baseStart.after(toDate));
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
	public boolean checkInReservation(Reservation reservation, String responsible, int numberOfGuests, int numberOfKeyCards) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean checkInReservation(Reservation reservation, String responsible, int numberOfGuests) {
		reservation.setResponsible(responsible);
		reservation.setNumberOfGuests(numberOfGuests);
		reservation.setCheckedIn(new Date());
		// TODO - should check that there are an acceptable number of guests
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void checkOutReservation(Reservation reservation) {
		returnKeyCard(reservation);
		reservation.setCheckedOut(new Date());
		BookingManager bookingManager = ManagerSingleton.getInstance().BOOKING_MANAGER;
		Booking booking = bookingManager.getBookingByReservation(reservation);
		bookingManager.makePaymentIfAllReservationsCheckedOut(booking);
	}

	private void returnKeyCard(Reservation reservation) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Reservation getCurrentReservationByRoomNumber(int roomNumber) {
		List<Booking> bookings = ManagerSingleton.getInstance().BOOKING_MANAGER.getAllBookings();
		for (Booking booking : bookings) {
			for (Reservation reservation : booking.getReservations()) {
				if (reservation.getRoom().getRoomNumber() == roomNumber && isCurrentlyStaying(reservation)) {
					return reservation;
				}
			}
		}

		throw new IllegalArgumentException("None found");
	}

	private boolean isCurrentlyStaying(Reservation reservation) {
		Date now = new Date();
		if (reservation.getCheckedIn() != null && reservation.getCheckedOut() == null) {
			if (reservation.getStartDay().before(now)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelServicePackage.RESERVATION_MANAGER__ALL_RESERVATIONS:
				return getAllReservations();
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
			case HotelServicePackage.RESERVATION_MANAGER__ALL_RESERVATIONS:
				getAllReservations().clear();
				getAllReservations().addAll((Collection<? extends Reservation>)newValue);
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
			case HotelServicePackage.RESERVATION_MANAGER__ALL_RESERVATIONS:
				getAllReservations().clear();
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
			case HotelServicePackage.RESERVATION_MANAGER__ALL_RESERVATIONS:
				return allReservations != null && !allReservations.isEmpty();
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
			case HotelServicePackage.RESERVATION_MANAGER___CREATE_RESERVATION__BOOKING_DATE_DATE_ROOM_ROOMTYPE:
				return createReservation((Booking)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2), (Room)arguments.get(3), (RoomType)arguments.get(4));
			case HotelServicePackage.RESERVATION_MANAGER___GET_NON_CHECKED_IN_RESERVATION__BOOKING:
				return getNonCheckedInReservation((Booking)arguments.get(0));
			case HotelServicePackage.RESERVATION_MANAGER___CHECK_IN_RESERVATION__RESERVATION_STRING_INT_INT:
				return checkInReservation((Reservation)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case HotelServicePackage.RESERVATION_MANAGER___CHECK_OUT_RESERVATION__RESERVATION:
				checkOutReservation((Reservation)arguments.get(0));
				return null;
			case HotelServicePackage.RESERVATION_MANAGER___GET_CURRENT_RESERVATION_BY_ROOM_NUMBER__INT:
				return getCurrentReservationByRoomNumber((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReservationManagerImpl
