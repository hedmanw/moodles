/**
 */
package hotelCore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hotelCore.PaymentDetails#getCcNumber <em>Cc Number</em>}</li>
 *   <li>{@link hotelCore.PaymentDetails#getCcv <em>Ccv</em>}</li>
 *   <li>{@link hotelCore.PaymentDetails#getExpiryMonth <em>Expiry Month</em>}</li>
 *   <li>{@link hotelCore.PaymentDetails#getExpiryYear <em>Expiry Year</em>}</li>
 *   <li>{@link hotelCore.PaymentDetails#getFirstName <em>First Name</em>}</li>
 *   <li>{@link hotelCore.PaymentDetails#getLastName <em>Last Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see hotelCore.HotelCorePackage#getPaymentDetails()
 * @model
 * @generated
 */
public interface PaymentDetails extends EObject {
	/**
	 * Returns the value of the '<em><b>Cc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Number</em>' attribute.
	 * @see #setCcNumber(String)
	 * @see hotelCore.HotelCorePackage#getPaymentDetails_CcNumber()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCcNumber();

	/**
	 * Sets the value of the '{@link hotelCore.PaymentDetails#getCcNumber <em>Cc Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Number</em>' attribute.
	 * @see #getCcNumber()
	 * @generated
	 */
	void setCcNumber(String value);

	/**
	 * Returns the value of the '<em><b>Ccv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ccv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ccv</em>' attribute.
	 * @see #setCcv(String)
	 * @see hotelCore.HotelCorePackage#getPaymentDetails_Ccv()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCcv();

	/**
	 * Sets the value of the '{@link hotelCore.PaymentDetails#getCcv <em>Ccv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ccv</em>' attribute.
	 * @see #getCcv()
	 * @generated
	 */
	void setCcv(String value);

	/**
	 * Returns the value of the '<em><b>Expiry Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiry Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiry Month</em>' attribute.
	 * @see #setExpiryMonth(int)
	 * @see hotelCore.HotelCorePackage#getPaymentDetails_ExpiryMonth()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getExpiryMonth();

	/**
	 * Sets the value of the '{@link hotelCore.PaymentDetails#getExpiryMonth <em>Expiry Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry Month</em>' attribute.
	 * @see #getExpiryMonth()
	 * @generated
	 */
	void setExpiryMonth(int value);

	/**
	 * Returns the value of the '<em><b>Expiry Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiry Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiry Year</em>' attribute.
	 * @see #setExpiryYear(int)
	 * @see hotelCore.HotelCorePackage#getPaymentDetails_ExpiryYear()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getExpiryYear();

	/**
	 * Sets the value of the '{@link hotelCore.PaymentDetails#getExpiryYear <em>Expiry Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry Year</em>' attribute.
	 * @see #getExpiryYear()
	 * @generated
	 */
	void setExpiryYear(int value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see hotelCore.HotelCorePackage#getPaymentDetails_FirstName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link hotelCore.PaymentDetails#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see hotelCore.HotelCorePackage#getPaymentDetails_LastName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link hotelCore.PaymentDetails#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	String getCcV();

} // PaymentDetails
