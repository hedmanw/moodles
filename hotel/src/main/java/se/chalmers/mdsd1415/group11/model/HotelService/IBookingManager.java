/**
 */
package se.chalmers.mdsd1415.group11.model.HotelService;

import se.chalmers.mdsd1415.group11.model.HotelCore.Bill;
import se.chalmers.mdsd1415.group11.model.HotelCore.Booking;
import se.chalmers.mdsd1415.group11.model.HotelCore.Customer;
import se.chalmers.mdsd1415.group11.model.HotelCore.Reservation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBooking Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see HotelServicePackage#getIBookingManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IBookingManager extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Booking createBooking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIdRequired="true" bookingIdOrdered="false"
	 * @generated
	 */
	Booking getBookingByNumber(long bookingId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void deleteBooking(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" many="false" ordered="false" customerRequired="true" customerOrdered="false"
	 * @generated
	 */
	EList getBookingsByCustomer(Customer customer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false" customerRequired="true" customerOrdered="false"
	 * @generated
	 */
	void setBookingCustomer(Booking booking, Customer customer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	boolean isBillPaidInFull(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	Bill getBill(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model reservationRequired="true" reservationOrdered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void getBookingByReservation(Reservation reservation, Booking booking);

} // IBookingManager
