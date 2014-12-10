/**
 */
package HotelSystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conference Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link HotelSystem.ConferenceRoom#getMaxNbrOfPeople <em>Max Nbr Of People</em>}</li>
 * </ul>
 * </p>
 *
 * @see HotelSystem.HotelSystemPackage#getConferenceRoom()
 * @model
 * @generated
 */
public interface ConferenceRoom extends RoomType {
	/**
	 * Returns the value of the '<em><b>Max Nbr Of People</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Nbr Of People</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Nbr Of People</em>' attribute.
	 * @see #setMaxNbrOfPeople(int)
	 * @see HotelSystem.HotelSystemPackage#getConferenceRoom_MaxNbrOfPeople()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getMaxNbrOfPeople();

	/**
	 * Sets the value of the '{@link HotelSystem.ConferenceRoom#getMaxNbrOfPeople <em>Max Nbr Of People</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Nbr Of People</em>' attribute.
	 * @see #getMaxNbrOfPeople()
	 * @generated
	 */
	void setMaxNbrOfPeople(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	int getNbrOfPeople();

} // ConferenceRoom
