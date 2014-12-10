/**
 */
package HotelSystem;

import model.HotelService.IReservationManager;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservation Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link HotelSystem.ReservationManager#getReservation <em>Reservation</em>}</li>
 * </ul>
 * </p>
 *
 * @see HotelSystem.HotelSystemPackage#getReservationManager()
 * @model
 * @generated
 */
public interface ReservationManager extends IReservationManager {
	/**
	 * Returns the value of the '<em><b>Reservation</b></em>' reference list.
	 * The list contents are of type {@link HotelSystem.Reservation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation</em>' reference list.
	 * @see HotelSystem.HotelSystemPackage#getReservationManager_Reservation()
	 * @model type="HotelSystem.Reservation" ordered="false"
	 * @generated
	 */
	EList getReservation();

} // ReservationManager
