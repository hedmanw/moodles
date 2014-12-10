/**
 */
package model.HotelService;

import HotelSystem.Booking;
import HotelSystem.Reservation;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IReservation Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see model.HotelService.HotelServicePackage#getIReservationManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IReservationManager extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false" fromDateRequired="true" fromDateOrdered="false" toDateRequired="true" toDateOrdered="false" roomIdRequired="true" roomIdOrdered="false" costCategoryIdRequired="true" costCategoryIdOrdered="false"
	 * @generated
	 */
	boolean createReservation(Booking booking, Date fromDate, Date toDate, long roomId, long costCategoryId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" reservationIdRequired="true" reservationIdOrdered="false"
	 * @generated
	 */
	Reservation getReservation(long reservationId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model reservationIdRequired="true" reservationIdOrdered="false" responsibleDataType="org.eclipse.uml2.types.String" responsibleRequired="true" responsibleOrdered="false"
	 * @generated
	 */
	void setResponsibleForReservation(long reservationId, String responsible);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" many="false" ordered="false" bookingIdRequired="true" bookingIdOrdered="false"
	 * @generated
	 */
	EList getNonCheckedInReservation(long bookingId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model reservationIdRequired="true" reservationIdOrdered="false" guestsRequired="true" guestsOrdered="false"
	 * @generated
	 */
	void setNumberOfGuestsForReservation(long reservationId, int guests);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" reservationIdRequired="true" reservationIdOrdered="false"
	 * @generated
	 */
	boolean checkInReservation(long reservationId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" reservationRequired="true" reservationOrdered="false"
	 * @generated
	 */
	boolean checkOutReservation(Reservation reservation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	Reservation getCurrentReservationByRoomNumber(int roomNumber);

} // IReservationManager
