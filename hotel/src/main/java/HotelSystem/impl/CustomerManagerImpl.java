/**
 */
package HotelSystem.impl;

import HotelSystem.Customer;
import HotelSystem.CustomerManager;
import HotelSystem.HotelSystemPackage;
import HotelSystem.PaymentDetails;

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
 *   <li>{@link HotelSystem.impl.CustomerManagerImpl#getCustomer <em>Customer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomerManagerImpl extends MinimalEObjectImpl.Container implements CustomerManager {
	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> customer;

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
		return HotelSystemPackage.Literals.CUSTOMER_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customer> getCustomer() {
		if (customer == null) {
			customer = new EObjectResolvingEList<Customer>(Customer.class, this, HotelSystemPackage.CUSTOMER_MANAGER__CUSTOMER);
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCustomerByIdNumber(String idNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	 * @generated
	 */
	public Customer createCustomer(String idNumber, String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long setPaymentDetailsForCustomer(Customer customerId, String firstName, String lastName, String ccNumber, String ccvNumber, int expireMonth, int expireYear) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case HotelSystemPackage.CUSTOMER_MANAGER__CUSTOMER:
				return getCustomer();
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
			case HotelSystemPackage.CUSTOMER_MANAGER__CUSTOMER:
				getCustomer().clear();
				getCustomer().addAll((Collection<? extends Customer>)newValue);
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
			case HotelSystemPackage.CUSTOMER_MANAGER__CUSTOMER:
				getCustomer().clear();
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
			case HotelSystemPackage.CUSTOMER_MANAGER__CUSTOMER:
				return customer != null && !customer.isEmpty();
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
			case HotelSystemPackage.CUSTOMER_MANAGER___GET_CUSTOMER_BY_ID_NUMBER__STRING:
				return getCustomerByIdNumber((String)arguments.get(0));
			case HotelSystemPackage.CUSTOMER_MANAGER___GET_CUSTOMERS_BY_NAME__STRING:
				return getCustomersByName((String)arguments.get(0));
			case HotelSystemPackage.CUSTOMER_MANAGER___GET_CUSTOMER__LONG:
				return getCustomer((Long)arguments.get(0));
			case HotelSystemPackage.CUSTOMER_MANAGER___CREATE_CUSTOMER__STRING_STRING:
				return createCustomer((String)arguments.get(0), (String)arguments.get(1));
			case HotelSystemPackage.CUSTOMER_MANAGER___SET_PAYMENT_DETAILS_FOR_CUSTOMER__CUSTOMER_STRING_STRING_STRING_STRING_INT_INT:
				return setPaymentDetailsForCustomer((Customer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (Integer)arguments.get(5), (Integer)arguments.get(6));
			case HotelSystemPackage.CUSTOMER_MANAGER___GET_PAYMENT_DETAILS_BY_CUSTOMER__CUSTOMER:
				return getPaymentDetailsByCustomer((Customer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CustomerManagerImpl
