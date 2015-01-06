/**
 */
package hotelCore;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tab</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hotelCore.Tab#getTabItems <em>Tab Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see hotelCore.HotelCorePackage#getTab()
 * @model
 * @generated
 */
public interface Tab extends EObject {
	/**
	 * Returns the value of the '<em><b>Tab Items</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Double},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab Items</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab Items</em>' map.
	 * @see hotelCore.HotelCorePackage#getTab_TabItems()
	 * @model mapType="hotelCore.TabItem<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EDoubleObject>" ordered="false"
	 * @generated
	 */
	EMap<String, Double> getTabItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	double getTotalCost();


} // Tab
