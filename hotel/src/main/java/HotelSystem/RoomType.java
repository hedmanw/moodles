/**
 */
package HotelSystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link HotelSystem.RoomType#getCostPerNight <em>Cost Per Night</em>}</li>
 * </ul>
 * </p>
 *
 * @see HotelSystem.HotelSystemPackage#getRoomType()
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
	 * @see HotelSystem.HotelSystemPackage#getRoomType_CostPerNight()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getCostPerNight();

	/**
	 * Sets the value of the '{@link HotelSystem.RoomType#getCostPerNight <em>Cost Per Night</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Per Night</em>' attribute.
	 * @see #getCostPerNight()
	 * @generated
	 */
	void setCostPerNight(double value);

} // RoomType