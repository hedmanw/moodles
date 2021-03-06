/**
 */
package hotelCore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hotelCore.Booking#getBill <em>Bill</em>}</li>
 *   <li>{@link hotelCore.Booking#getCustomer <em>Customer</em>}</li>
 *   <li>{@link hotelCore.Booking#getReservations <em>Reservations</em>}</li>
 *   <li>{@link hotelCore.Booking#getBookingUUID <em>Booking UUID</em>}</li>
 * </ul>
 * </p>
 *
 * @see hotelCore.HotelCorePackage#getBooking()
 * @model
 * @generated
 */
public interface Booking extends EObject {
	/**
	 * Returns the value of the '<em><b>Bill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill</em>' reference.
	 * @see #setBill(Bill)
	 * @see hotelCore.HotelCorePackage#getBooking_Bill()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Bill getBill();

	/**
	 * Sets the value of the '{@link hotelCore.Booking#getBill <em>Bill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill</em>' reference.
	 * @see #getBill()
	 * @generated
	 */
	void setBill(Bill value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see hotelCore.HotelCorePackage#getBooking_Customer()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link hotelCore.Booking#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Reservations</b></em>' reference list.
	 * The list contents are of type {@link hotelCore.Reservation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservations</em>' reference list.
	 * @see hotelCore.HotelCorePackage#getBooking_Reservations()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Reservation> getReservations();

	/**
	 * Returns the value of the '<em><b>Booking UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking UUID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking UUID</em>' attribute.
	 * @see #setBookingUUID(String)
	 * @see hotelCore.HotelCorePackage#getBooking_BookingUUID()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getBookingUUID();

	/**
	 * Sets the value of the '{@link hotelCore.Booking#getBookingUUID <em>Booking UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking UUID</em>' attribute.
	 * @see #getBookingUUID()
	 * @generated
	 */
	void setBookingUUID(String value);

} // Booking
