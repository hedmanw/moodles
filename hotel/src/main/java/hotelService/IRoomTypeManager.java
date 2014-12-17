/**
 */
package hotelService;

import hotelCore.RoomType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IRoom Type Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see hotelService.HotelServicePackage#getIRoomTypeManager()
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
	 * @model required="true" ordered="false" nameRequired="true" nameOrdered="false" costPerNightRequired="true" costPerNightOrdered="false" numberOfBedsRequired="true" numberOfBedsOrdered="false"
	 * @generated
	 */
	RoomType createSleepRoom(String name, double costPerNight, int numberOfBeds);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameRequired="true" nameOrdered="false" maxPeopleRequired="true" maxPeopleOrdered="false" costRequired="true" costOrdered="false"
	 * @generated
	 */
	RoomType createConferenceRoom(String name, int maxPeople, double cost);

} // IRoomTypeManager
