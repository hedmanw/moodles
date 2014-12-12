/**
 */
package se.chalmers.mdsd1415.group11.model.HotelService;

import java.util.Date;
import se.chalmers.mdsd1415.group11.model.HotelCore.Booking;
import se.chalmers.mdsd1415.group11.model.HotelCore.Reservation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IReservation Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see HotelServicePackage#getIReservationManager()
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
	 * @model ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	EList<Reservation> getNonCheckedInReservation(Booking booking);

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
