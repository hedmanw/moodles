/**
 */
package HotelSystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link HotelSystem.Bill#getPaid <em>Paid</em>}</li>
 *   <li>{@link HotelSystem.Bill#getGrandTotal <em>Grand Total</em>}</li>
 * </ul>
 * </p>
 *
 * @see HotelSystem.HotelSystemPackage#getBill()
 * @model
 * @generated
 */
public interface Bill extends EObject {
	/**
	 * Returns the value of the '<em><b>Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paid</em>' attribute.
	 * @see #setPaid(double)
	 * @see HotelSystem.HotelSystemPackage#getBill_Paid()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getPaid();

	/**
	 * Sets the value of the '{@link HotelSystem.Bill#getPaid <em>Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paid</em>' attribute.
	 * @see #getPaid()
	 * @generated
	 */
	void setPaid(double value);

	/**
	 * Returns the value of the '<em><b>Grand Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grand Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grand Total</em>' attribute.
	 * @see #setGrandTotal(double)
	 * @see HotelSystem.HotelSystemPackage#getBill_GrandTotal()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getGrandTotal();

	/**
	 * Sets the value of the '{@link HotelSystem.Bill#getGrandTotal <em>Grand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grand Total</em>' attribute.
	 * @see #getGrandTotal()
	 * @generated
	 */
	void setGrandTotal(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model costRequired="true" costOrdered="false"
	 * @generated
	 */
	void addToBill(double cost);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	boolean isPaid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model costRequired="true" costOrdered="false"
	 * @generated
	 */
	void removeFromBill(double cost);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double leftToPay();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model costRequired="true" costOrdered="false"
	 * @generated
	 */
	void pay(double cost);

} // Bill
