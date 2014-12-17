/**
 */
package hotelService;

import hotelCore.Customer;
import hotelCore.PaymentDetails;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ICustomer Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see hotelService.HotelServicePackage#getICustomerManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ICustomerManager extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" idNumberDataType="org.eclipse.uml2.types.String" idNumberRequired="true" idNumberOrdered="false"
	 * @generated
	 */
	Customer getCustomerByIdNumber(String idNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	EList<Customer> getCustomersByName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" idNumberDataType="org.eclipse.uml2.types.String" idNumberRequired="true" idNumberOrdered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	Customer createCustomer(String idNumber, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" customerRequired="true" customerOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvNumberDataType="org.eclipse.uml2.types.String" ccvNumberRequired="true" ccvNumberOrdered="false" expireMonthRequired="true" expireMonthOrdered="false" expireYearRequired="true" expireYearOrdered="false"
	 * @generated
	 */
	PaymentDetails setPaymentDetailsForCustomer(Customer customer, String firstName, String lastName, String ccNumber, String ccvNumber, int expireMonth, int expireYear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" customerIdRequired="true" customerIdOrdered="false"
	 * @generated
	 */
	PaymentDetails getPaymentDetailsByCustomer(Customer customerId);

} // ICustomerManager
