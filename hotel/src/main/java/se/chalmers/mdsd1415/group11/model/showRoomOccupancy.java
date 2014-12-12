/**
 */
package se.chalmers.mdsd1415.group11.model;

import se.chalmers.mdsd1415.group11.model.HotelService.IRoomManager;
import se.chalmers.mdsd1415.group11.model.HotelService.SystemUser;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>show Room Occupancy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link showRoomOccupancy#getU <em>U</em>}</li>
 *   <li>{@link showRoomOccupancy#getRm <em>Rm</em>}</li>
 * </ul>
 * </p>
 *
 * @see ModelPackage#getshowRoomOccupancy()
 * @model
 * @generated
 */
public interface showRoomOccupancy extends EObject {
	/**
	 * Returns the value of the '<em><b>U</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>U</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>U</em>' reference.
	 * @see #setU(se.chalmers.mdsd1415.group11.model.HotelService.SystemUser)
	 * @see ModelPackage#getshowRoomOccupancy_U()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SystemUser getU();

	/**
	 * Sets the value of the '{@link showRoomOccupancy#getU <em>U</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>U</em>' reference.
	 * @see #getU()
	 * @generated
	 */
	void setU(SystemUser value);

	/**
	 * Returns the value of the '<em><b>Rm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rm</em>' reference.
	 * @see #setRm(se.chalmers.mdsd1415.group11.model.HotelService.IRoomManager)
	 * @see ModelPackage#getshowRoomOccupancy_Rm()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IRoomManager getRm();

	/**
	 * Sets the value of the '{@link showRoomOccupancy#getRm <em>Rm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rm</em>' reference.
	 * @see #getRm()
	 * @generated
	 */
	void setRm(IRoomManager value);

} // showRoomOccupancy
