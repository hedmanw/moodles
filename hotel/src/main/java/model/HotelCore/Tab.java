/**
 */
package model.HotelCore;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tab</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.HotelCore.Tab#getTabItems <em>Tab Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.HotelCore.HotelCorePackage#getTab()
 * @model
 * @generated
 */
public interface Tab extends EObject {
	/**
	 * Returns the value of the '<em><b>Tab Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab Items</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab Items</em>' attribute.
	 * @see #setTabItems(Map)
	 * @see model.HotelCore.HotelCorePackage#getTab_TabItems()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Map getTabItems();

	/**
	 * Sets the value of the '{@link model.HotelCore.Tab#getTabItems <em>Tab Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tab Items</em>' attribute.
	 * @see #getTabItems()
	 * @generated
	 */
	void setTabItems(Map value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model itemRequired="true" itemOrdered="false" costRequired="true" costOrdered="false"
	 * @generated
	 */
	void addItemToTab(String item, double cost);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	double getTotalCost();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model itemNameRequired="true" itemNameOrdered="false"
	 * @generated
	 */
	void removeTabItem(String itemName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getAll();

} // Tab
