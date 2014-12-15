/**
 */
package hotelService.impl;

import hotelCore.Customer;
import hotelCore.HotelCoreFactory;
import hotelCore.PaymentDetails;

import hotelService.CustomerManager;
import hotelService.HotelServicePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hotelService.impl.CustomerManagerImpl#getAllCustomers <em>All Customers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomerManagerImpl extends MinimalEObjectImpl.Container implements CustomerManager {
	/**
	 * The cached value of the '{@link #getAllCustomers() <em>All Customers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllCustomers()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> allCustomers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelServicePackage.Literals.CUSTOMER_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customer> getAllCustomers() {
		if (allCustomers == null) {
			allCustomers = new EObjectResolvingEList<Customer>(Customer.class, this, HotelServicePackage.CUSTOMER_MANAGER__ALL_CUSTOMERS);
		}
		return allCustomers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Customer getCustomerByIdNumber(String idNumber) {
		for (Customer allCustomer : allCustomers) {
			if (allCustomer.getId().equals(idNumber)) {
				return allCustomer;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customer> getCustomersByName(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer(long customerId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Customer createCustomer(String idNumber, String name) {
		Customer customer = HotelCoreFactory.eINSTANCE.createCustomer();
		customer.setName(name);
		customer.setId(idNumber);
		getAllCustomers().add(customer);
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PaymentDetails setPaymentDetailsForCustomer(Customer customer, String firstName, String lastName, String ccNumber, String ccvNumber, int expireMonth, int expireYear) {
		PaymentDetails pd = HotelCoreFactory.eINSTANCE.createPaymentDetails();
		pd.setFirstName(firstName);
		pd.setLastName(lastName);
		pd.setCcNumber(ccNumber);
		pd.setCcv(ccvNumber);
		pd.setExpiryMonth(expireMonth);
		pd.setExpiryYear(expireYear);
		customer.setPaymentDetails(pd);
		return pd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentDetails getPaymentDetailsByCustomer(Customer customerId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelServicePackage.CUSTOMER_MANAGER__ALL_CUSTOMERS:
				return getAllCustomers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HotelServicePackage.CUSTOMER_MANAGER__ALL_CUSTOMERS:
				getAllCustomers().clear();
				getAllCustomers().addAll((Collection<? extends Customer>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HotelServicePackage.CUSTOMER_MANAGER__ALL_CUSTOMERS:
				getAllCustomers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HotelServicePackage.CUSTOMER_MANAGER__ALL_CUSTOMERS:
				return allCustomers != null && !allCustomers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HotelServicePackage.CUSTOMER_MANAGER___GET_CUSTOMER_BY_ID_NUMBER__STRING:
				return getCustomerByIdNumber((String)arguments.get(0));
			case HotelServicePackage.CUSTOMER_MANAGER___GET_CUSTOMERS_BY_NAME__STRING:
				return getCustomersByName((String)arguments.get(0));
			case HotelServicePackage.CUSTOMER_MANAGER___GET_CUSTOMER__LONG:
				return getCustomer((Long)arguments.get(0));
			case HotelServicePackage.CUSTOMER_MANAGER___CREATE_CUSTOMER__STRING_STRING:
				return createCustomer((String)arguments.get(0), (String)arguments.get(1));
			case HotelServicePackage.CUSTOMER_MANAGER___SET_PAYMENT_DETAILS_FOR_CUSTOMER__CUSTOMER_STRING_STRING_STRING_STRING_INT_INT:
				return setPaymentDetailsForCustomer((Customer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (Integer)arguments.get(5), (Integer)arguments.get(6));
			case HotelServicePackage.CUSTOMER_MANAGER___GET_PAYMENT_DETAILS_BY_CUSTOMER__CUSTOMER:
				return getPaymentDetailsByCustomer((Customer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CustomerManagerImpl
