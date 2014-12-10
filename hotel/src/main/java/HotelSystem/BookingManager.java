/**
 */
package HotelSystem;

import model.HotelService.IBookingManager;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link HotelSystem.BookingManager#getBooking <em>Booking</em>}</li>
 * </ul>
 * </p>
 *
 * @see HotelSystem.HotelSystemPackage#getBookingManager()
 * @model
 * @generated
 */
public interface BookingManager extends IBookingManager {
	/**
	 * Returns the value of the '<em><b>Booking</b></em>' reference list.
	 * The list contents are of type {@link HotelSystem.Booking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking</em>' reference list.
	 * @see HotelSystem.HotelSystemPackage#getBookingManager_Booking()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Booking> getBooking();

} // BookingManager
