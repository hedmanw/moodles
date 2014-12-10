/**
 */
package model.HotelService;

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
	 * @model required="true" many="false" ordered="false" fromDateRequired="true" fromDateOrdered="false" toDateRequired="true" toDateOrdered="false" roomTypeIdsRequired="true" roomTypeIdsMany="false" roomTypeIdsOrdered="false"
	 * @generated
	 */
	EList getAvailableRooms(Date fromDate, Date toDate, EList roomTypeIds);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" fromDateRequired="true" fromDateOrdered="false" toDateRequired="true" toDateOrdered="false"
	 * @generated
	 */
	Map getRoomOccupancy(Date fromDate, Date toDate);

} // IRoomManager
