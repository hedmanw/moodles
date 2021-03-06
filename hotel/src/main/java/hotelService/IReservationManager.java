/**
 */
package hotelService;

import hotelCore.Booking;
import hotelCore.Reservation;
import hotelCore.Room;
import hotelCore.RoomType;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IReservation Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see hotelService.HotelServicePackage#getIReservationManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IReservationManager extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false" fromDateRequired="true" fromDateOrdered="false" toDateRequired="true" toDateOrdered="false" roomRequired="true" roomOrdered="false" costCategoryRequired="true" costCategoryOrdered="false"
	 * @generated
	 */
	Reservation createReservation(Booking booking, Date fromDate, Date toDate, Room room, RoomType costCategory);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	EList<Reservation> getNonCheckedInReservation(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" reservationRequired="true" reservationOrdered="false" responsibleRequired="true" responsibleOrdered="false" numberOfGuestsRequired="true" numberOfGuestsOrdered="false" numberOfKeyCardsRequired="true" numberOfKeyCardsOrdered="false"
	 * @generated
	 */
	boolean checkInReservation(Reservation reservation, String responsible, int numberOfGuests, int numberOfKeyCards);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model reservationRequired="true" reservationOrdered="false"
	 * @generated
	 */
	void checkOutReservation(Reservation reservation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	Reservation getCurrentReservationByRoomNumber(int roomNumber);

} // IReservationManager
