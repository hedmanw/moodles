/**
 */
package se.chalmers.mdsd1415.group11.model.HotelService;

import se.chalmers.mdsd1415.group11.model.HotelCore.Booking;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BookingManager#getAllBookings <em>All Bookings</em>}</li>
 * </ul>
 * </p>
 *
 * @see HotelServicePackage#getBookingManager()
 * @model
 * @generated
 */
public interface BookingManager extends IBookingManager {
	/**
	 * Returns the value of the '<em><b>All Bookings</b></em>' reference list.
	 * The list contents are of type {@link se.chalmers.mdsd1415.group11.model.HotelCore.Booking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Bookings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Bookings</em>' reference list.
	 * @see HotelServicePackage#getBookingManager_AllBookings()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Booking> getAllBookings();

} // BookingManager
