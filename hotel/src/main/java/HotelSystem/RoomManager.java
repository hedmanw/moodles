/**
 */
package HotelSystem;

import model.HotelService.IRoomManager;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link HotelSystem.RoomManager#getRoom <em>Room</em>}</li>
 * </ul>
 * </p>
 *
 * @see HotelSystem.HotelSystemPackage#getRoomManager()
 * @model
 * @generated
 */
public interface RoomManager extends IRoomManager {
	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference list.
	 * The list contents are of type {@link HotelSystem.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference list.
	 * @see HotelSystem.HotelSystemPackage#getRoomManager_Room()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Room> getRoom();

} // RoomManager
