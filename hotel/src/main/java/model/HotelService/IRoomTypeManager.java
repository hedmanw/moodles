/**
 */
package model.HotelService;

import HotelSystem.RoomType;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IRoom Type Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see model.HotelService.HotelServicePackage#getIRoomTypeManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IRoomTypeManager extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<RoomType> getRoomTypes();

} // IRoomTypeManager
