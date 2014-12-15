/**
 */
package hotelService;

import hotelCore.Bill;
import hotelCore.Booking;
import hotelCore.Customer;
import hotelCore.Reservation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBooking Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see hotelService.HotelServicePackage#getIBookingManager()
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
	 * @model required="true" ordered="false" bookingNumberRequired="true" bookingNumberOrdered="false"
	 * @generated
	 */
	Booking getBookingByBookingNumber(String bookingNumber);

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
	 * @model ordered="false" customerRequired="true" customerOrdered="false"
	 * @generated
	 */
	EList<Booking> getBookingsByCustomer(Customer customer);

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
	 * @model required="true" ordered="false" reservationRequired="true" reservationOrdered="false"
	 * @generated
	 */
	Booking getBookingByReservation(Reservation reservation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void makePaymentIfAllReservationsCheckedOut(Booking booking);

} // IBookingManager
