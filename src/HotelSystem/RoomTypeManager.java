/**
 */
package HotelSystem;

import model.HotelService.IRoomTypeManager;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Type Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link HotelSystem.RoomTypeManager#getRoomType <em>Room Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see HotelSystem.HotelSystemPackage#getRoomTypeManager()
 * @model
 * @generated
 */
public interface RoomTypeManager extends IRoomTypeManager {
	/**
	 * Returns the value of the '<em><b>Room Type</b></em>' reference list.
	 * The list contents are of type {@link HotelSystem.RoomType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type</em>' reference list.
	 * @see HotelSystem.HotelSystemPackage#getRoomTypeManager_RoomType()
	 * @model type="HotelSystem.RoomType" ordered="false"
	 * @generated
	 */
	EList getRoomType();

} // RoomTypeManager
