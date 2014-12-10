/**
 */
package HotelSystem;

import model.HotelService.ICustomerManager;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link HotelSystem.CustomerManager#getCustomer <em>Customer</em>}</li>
 * </ul>
 * </p>
 *
 * @see HotelSystem.HotelSystemPackage#getCustomerManager()
 * @model
 * @generated
 */
public interface CustomerManager extends ICustomerManager {
	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference list.
	 * The list contents are of type {@link HotelSystem.Customer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference list.
	 * @see HotelSystem.HotelSystemPackage#getCustomerManager_Customer()
	 * @model type="HotelSystem.Customer" ordered="false"
	 * @generated
	 */
	EList getCustomer();

} // CustomerManager
