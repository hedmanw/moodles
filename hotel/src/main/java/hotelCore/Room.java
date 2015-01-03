/**
 */
package hotelCore;

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
 *   <li>{@link hotelCore.Room#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link hotelCore.Room#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link hotelCore.Room#isHousekept <em>Housekept</em>}</li>
 *   <li>{@link hotelCore.Room#getEquipment <em>Equipment</em>}</li>
 * </ul>
 * </p>
 *
 * @see hotelCore.HotelCorePackage#getRoom()
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
	 * @see hotelCore.HotelCorePackage#getRoom_RoomNumber()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getRoomNumber();

	/**
	 * Sets the value of the '{@link hotelCore.Room#getRoomNumber <em>Room Number</em>}' attribute.
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
	 * @see hotelCore.HotelCorePackage#getRoom_RoomType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomType getRoomType();

	/**
	 * Sets the value of the '{@link hotelCore.Room#getRoomType <em>Room Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type</em>' reference.
	 * @see #getRoomType()
	 * @generated
	 */
	void setRoomType(RoomType value);

	/**
	 * Returns the value of the '<em><b>Housekept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Housekept</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Housekept</em>' attribute.
	 * @see #setHousekept(boolean)
	 * @see hotelCore.HotelCorePackage#getRoom_Housekept()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isHousekept();

	/**
	 * Sets the value of the '{@link hotelCore.Room#isHousekept <em>Housekept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Housekept</em>' attribute.
	 * @see #isHousekept()
	 * @generated
	 */
	void setHousekept(boolean value);

	/**
	 * Returns the value of the '<em><b>Equipment</b></em>' reference list.
	 * The list contents are of type {@link hotelCore.Equipment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment</em>' reference list.
	 * @see hotelCore.HotelCorePackage#getRoom_Equipment()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Equipment> getEquipment();

} // Room
