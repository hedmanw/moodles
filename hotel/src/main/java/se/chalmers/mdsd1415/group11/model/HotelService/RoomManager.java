/**
 */
package se.chalmers.mdsd1415.group11.model.HotelService;

import se.chalmers.mdsd1415.group11.model.HotelCore.Room;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RoomManager#getAllRooms <em>All Rooms</em>}</li>
 * </ul>
 * </p>
 *
 * @see HotelServicePackage#getRoomManager()
 * @model
 * @generated
 */
public interface RoomManager extends IRoomManager {
	/**
	 * Returns the value of the '<em><b>All Rooms</b></em>' reference list.
	 * The list contents are of type {@link se.chalmers.mdsd1415.group11.model.HotelCore.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Rooms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Rooms</em>' reference list.
	 * @see HotelServicePackage#getRoomManager_AllRooms()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Room> getAllRooms();

} // RoomManager
