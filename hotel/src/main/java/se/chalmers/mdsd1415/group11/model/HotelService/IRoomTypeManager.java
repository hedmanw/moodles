/**
 */
package se.chalmers.mdsd1415.group11.model.HotelService;

import se.chalmers.mdsd1415.group11.model.HotelCore.RoomType;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IRoom Type Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see HotelServicePackage#getIRoomTypeManager()
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameRequired="true" nameOrdered="false" costPerNightRequired="true" costPerNightOrdered="false"
	 * @generated
	 */
	RoomType createRoomType(String name, double costPerNight);

} // IRoomTypeManager
