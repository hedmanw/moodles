/**
 */
package hotelService;

import hotelCore.Room;
import hotelCore.RoomType;

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
 * @see hotelService.HotelServicePackage#getIRoomManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IRoomManager extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" fromDateRequired="true" fromDateOrdered="false" toDateRequired="true" toDateOrdered="false" roomTypesMany="true" roomTypesOrdered="false"
	 * @generated
	 */
	EList<Room> getAvailableRooms(Date fromDate, Date toDate, EList<RoomType> roomTypes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" fromDateRequired="true" fromDateOrdered="false" toDateRequired="true" toDateOrdered="false"
	 * @generated
	 */
	Map getRoomOccupancy(Date fromDate, Date toDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNumberRequired="true" roomNumberOrdered="false" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	Room createRoom(int roomNumber, RoomType roomType);

} // IRoomManager
