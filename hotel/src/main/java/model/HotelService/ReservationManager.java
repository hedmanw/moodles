/**
 */
package model.HotelService;

import model.HotelCore.Reservation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservation Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.HotelService.ReservationManager#getAllReservations <em>All Reservations</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.HotelService.HotelServicePackage#getReservationManager()
 * @model
 * @generated
 */
public interface ReservationManager extends IReservationManager {
	/**
	 * Returns the value of the '<em><b>All Reservations</b></em>' reference list.
	 * The list contents are of type {@link model.HotelCore.Reservation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Reservations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Reservations</em>' reference list.
	 * @see model.HotelService.HotelServicePackage#getReservationManager_AllReservations()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Reservation> getAllReservations();

} // ReservationManager
