/**
 */
package HotelSystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link HotelSystem.Customer#getId <em>Id</em>}</li>
 *   <li>{@link HotelSystem.Customer#getName <em>Name</em>}</li>
 *   <li>{@link HotelSystem.Customer#getPaymentDetails <em>Payment Details</em>}</li>
 *   <li>{@link HotelSystem.Customer#getLoyaltyPoints <em>Loyalty Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see HotelSystem.HotelSystemPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see HotelSystem.HotelSystemPackage#getCustomer_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link HotelSystem.Customer#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see HotelSystem.HotelSystemPackage#getCustomer_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link HotelSystem.Customer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Payment Details</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Details</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Details</em>' reference.
	 * @see #setPaymentDetails(PaymentDetails)
	 * @see HotelSystem.HotelSystemPackage#getCustomer_PaymentDetails()
	 * @model ordered="false"
	 * @generated
	 */
	PaymentDetails getPaymentDetails();

	/**
	 * Sets the value of the '{@link HotelSystem.Customer#getPaymentDetails <em>Payment Details</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Details</em>' reference.
	 * @see #getPaymentDetails()
	 * @generated
	 */
	void setPaymentDetails(PaymentDetails value);

	/**
	 * Returns the value of the '<em><b>Loyalty Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loyalty Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loyalty Points</em>' attribute.
	 * @see #setLoyaltyPoints(int)
	 * @see HotelSystem.HotelSystemPackage#getCustomer_LoyaltyPoints()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getLoyaltyPoints();

	/**
	 * Sets the value of the '{@link HotelSystem.Customer#getLoyaltyPoints <em>Loyalty Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loyalty Points</em>' attribute.
	 * @see #getLoyaltyPoints()
	 * @generated
	 */
	void setLoyaltyPoints(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pointsRequired="true" pointsOrdered="false"
	 * @generated
	 */
	void addLoyaltyPoints(int points);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pointsRequired="true" pointsOrdered="false"
	 * @generated
	 */
	void removeLoyaltyPoints(int points);

} // Customer
