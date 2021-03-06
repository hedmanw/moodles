/**
 */
package hotelService;

import hotelCore.RoomType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Type Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hotelService.RoomTypeManager#getAllRoomTypes <em>All Room Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see hotelService.HotelServicePackage#getRoomTypeManager()
 * @model
 * @generated
 */
public interface RoomTypeManager extends IRoomTypeManager {
	/**
	 * Returns the value of the '<em><b>All Room Types</b></em>' reference list.
	 * The list contents are of type {@link hotelCore.RoomType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Room Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Room Types</em>' reference list.
	 * @see hotelService.HotelServicePackage#getRoomTypeManager_AllRoomTypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RoomType> getAllRoomTypes();

} // RoomTypeManager
