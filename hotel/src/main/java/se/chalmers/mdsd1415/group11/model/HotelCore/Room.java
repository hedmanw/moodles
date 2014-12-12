/**
 */
package se.chalmers.mdsd1415.group11.model.HotelCore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Room#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link Room#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link Room#isCleaned <em>Cleaned</em>}</li>
 *   <li>{@link Room#getEquipment <em>Equipment</em>}</li>
 * </ul>
 * </p>
 *
 * @see HotelCorePackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Number</em>' attribute.
	 * @see #setRoomNumber(int)
	 * @see HotelCorePackage#getRoom_RoomNumber()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getRoomNumber();

	/**
	 * Sets the value of the '{@link Room#getRoomNumber <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Number</em>' attribute.
	 * @see #getRoomNumber()
	 * @generated
	 */
	void setRoomNumber(int value);

	/**
	 * Returns the value of the '<em><b>Room Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type</em>' reference.
	 * @see #setRoomType(RoomType)
	 * @see HotelCorePackage#getRoom_RoomType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomType getRoomType();

	/**
	 * Sets the value of the '{@link Room#getRoomType <em>Room Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type</em>' reference.
	 * @see #getRoomType()
	 * @generated
	 */
	void setRoomType(RoomType value);

	/**
	 * Returns the value of the '<em><b>Cleaned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cleaned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cleaned</em>' attribute.
	 * @see #setCleaned(boolean)
	 * @see HotelCorePackage#getRoom_Cleaned()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isCleaned();

	/**
	 * Sets the value of the '{@link Room#isCleaned <em>Cleaned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cleaned</em>' attribute.
	 * @see #isCleaned()
	 * @generated
	 */
	void setCleaned(boolean value);

	/**
	 * Returns the value of the '<em><b>Equipment</b></em>' reference list.
	 * The list contents are of type {@link Equipment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment</em>' reference list.
	 * @see HotelCorePackage#getRoom_Equipment()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Equipment> getEquipment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	void addRoomType(RoomType roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	void removeRoomType(RoomType roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model itemRequired="true" itemOrdered="false"
	 * @generated
	 */
	void addEquipmentToRoom(String item);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model itemNameRequired="true" itemNameOrdered="false"
	 * @generated
	 */
	void removeEquipmentItem(String itemName);

} // Room
