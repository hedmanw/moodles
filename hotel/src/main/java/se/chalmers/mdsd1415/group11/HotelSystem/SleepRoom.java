/**
 */
package HotelSystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sleep Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link HotelSystem.SleepRoom#getNbrOfBeds <em>Nbr Of Beds</em>}</li>
 * </ul>
 * </p>
 *
 * @see HotelSystem.HotelSystemPackage#getSleepRoom()
 * @model
 * @generated
 */
public interface SleepRoom extends RoomType {
	/**
	 * Returns the value of the '<em><b>Nbr Of Beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nbr Of Beds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nbr Of Beds</em>' attribute.
	 * @see #setNbrOfBeds(int)
	 * @see HotelSystem.HotelSystemPackage#getSleepRoom_NbrOfBeds()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getNbrOfBeds();

	/**
	 * Sets the value of the '{@link HotelSystem.SleepRoom#getNbrOfBeds <em>Nbr Of Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nbr Of Beds</em>' attribute.
	 * @see #getNbrOfBeds()
	 * @generated
	 */
	void setNbrOfBeds(int value);

} // SleepRoom
