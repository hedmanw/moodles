/**
 */
package model.HotelService;

import model.HotelCore.Customer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.HotelService.CustomerManager#getAllCustomers <em>All Customers</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.HotelService.HotelServicePackage#getCustomerManager()
 * @model
 * @generated
 */
public interface CustomerManager extends ICustomerManager {
	/**
	 * Returns the value of the '<em><b>All Customers</b></em>' reference list.
	 * The list contents are of type {@link model.HotelCore.Customer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Customers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Customers</em>' reference list.
	 * @see model.HotelService.HotelServicePackage#getCustomerManager_AllCustomers()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Customer> getAllCustomers();

} // CustomerManager
