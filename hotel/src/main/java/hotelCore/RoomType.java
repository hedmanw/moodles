/**
 */
package hotelCore;

import java.util.Date;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hotelCore.RoomType#getCostPerNight <em>Cost Per Night</em>}</li>
 *   <li>{@link hotelCore.RoomType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see hotelCore.HotelCorePackage#getRoomType()
 * @model
 * @generated
 */
public interface RoomType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cost Per Night</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Per Night</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Per Night</em>' attribute.
	 * @see #setCostPerNight(double)
	 * @see hotelCore.HotelCorePackage#getRoomType_CostPerNight()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getCostPerNight();

	/**
	 * Sets the value of the '{@link hotelCore.RoomType#getCostPerNight <em>Cost Per Night</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Per Night</em>' attribute.
	 * @see #getCostPerNight()
	 * @generated
	 */
	void setCostPerNight(double value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hotelCore.HotelCorePackage#getRoomType_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hotelCore.RoomType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" startOfStayRequired="true" startOfStayOrdered="false" endOfStayRequired="true" endOfStayOrdered="false"
	 * @generated
	 */
	double getCostForStay(Date startOfStay, Date endOfStay);

} // RoomType
