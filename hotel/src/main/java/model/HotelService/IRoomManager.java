/**
 */
package model.HotelService;

import HotelSystem.Room;
import HotelSystem.RoomType;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IRoom Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see model.HotelService.HotelServicePackage#getIRoomManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IRoomManager extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" fromDateRequired="true" fromDateOrdered="false" toDateRequired="true" toDateOrdered="false" roomTypeIdsMany="true" roomTypeIdsOrdered="false"
	 * @generated
	 */
	EList<Room> getAvailableRooms(Date fromDate, Date toDate, EList<RoomType> roomTypeIds);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" fromDateRequired="true" fromDateOrdered="false" toDateRequired="true" toDateOrdered="false"
	 * @generated
	 */
	Map getRoomOccupancy(Date fromDate, Date toDate);

} // IRoomManager
