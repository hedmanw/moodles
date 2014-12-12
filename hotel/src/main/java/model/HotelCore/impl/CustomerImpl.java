/**
 */
package model.HotelCore.impl;

import java.lang.reflect.InvocationTargetException;

import model.HotelCore.Customer;
import model.HotelCore.HotelCorePackage;
import model.HotelCore.PaymentDetails;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.HotelCore.impl.CustomerImpl#getId <em>Id</em>}</li>
 *   <li>{@link model.HotelCore.impl.CustomerImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.HotelCore.impl.CustomerImpl#getPaymentDetails <em>Payment Details</em>}</li>
 *   <li>{@link model.HotelCore.impl.CustomerImpl#getLoyaltyPoints <em>Loyalty Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomerImpl extends MinimalEObjectImpl.Container implements Customer {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPaymentDetails() <em>Payment Details</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentDetails()
	 * @generated
	 * @ordered
	 */
	protected PaymentDetails paymentDetails;

	/**
	 * The default value of the '{@link #getLoyaltyPoints() <em>Loyalty Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoyaltyPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int LOYALTY_POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLoyaltyPoints() <em>Loyalty Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoyaltyPoints()
	 * @generated
	 * @ordered
	 */
	protected int loyaltyPoints = LOYALTY_POINTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelCorePackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelCorePackage.CUSTOMER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelCorePackage.CUSTOMER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentDetails getPaymentDetails() {
		if (paymentDetails != null && paymentDetails.eIsProxy()) {
			InternalEObject oldPaymentDetails = (InternalEObject)paymentDetails;
			paymentDetails = (PaymentDetails)eResolveProxy(oldPaymentDetails);
			if (paymentDetails != oldPaymentDetails) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelCorePackage.CUSTOMER__PAYMENT_DETAILS, oldPaymentDetails, paymentDetails));
			}
		}
		return paymentDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentDetails basicGetPaymentDetails() {
		return paymentDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentDetails(PaymentDetails newPaymentDetails) {
		PaymentDetails oldPaymentDetails = paymentDetails;
		paymentDetails = newPaymentDetails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelCorePackage.CUSTOMER__PAYMENT_DETAILS, oldPaymentDetails, paymentDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLoyaltyPoints() {
		return loyaltyPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoyaltyPoints(int newLoyaltyPoints) {
		int oldLoyaltyPoints = loyaltyPoints;
		loyaltyPoints = newLoyaltyPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelCorePackage.CUSTOMER__LOYALTY_POINTS, oldLoyaltyPoints, loyaltyPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addLoyaltyPoints(int points) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeLoyaltyPoints(int points) {
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
			case HotelCorePackage.CUSTOMER__ID:
				return getId();
			case HotelCorePackage.CUSTOMER__NAME:
				return getName();
			case HotelCorePackage.CUSTOMER__PAYMENT_DETAILS:
				if (resolve) return getPaymentDetails();
				return basicGetPaymentDetails();
			case HotelCorePackage.CUSTOMER__LOYALTY_POINTS:
				return getLoyaltyPoints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HotelCorePackage.CUSTOMER__ID:
				setId((String)newValue);
				return;
			case HotelCorePackage.CUSTOMER__NAME:
				setName((String)newValue);
				return;
			case HotelCorePackage.CUSTOMER__PAYMENT_DETAILS:
				setPaymentDetails((PaymentDetails)newValue);
				return;
			case HotelCorePackage.CUSTOMER__LOYALTY_POINTS:
				setLoyaltyPoints((Integer)newValue);
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
			case HotelCorePackage.CUSTOMER__ID:
				setId(ID_EDEFAULT);
				return;
			case HotelCorePackage.CUSTOMER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HotelCorePackage.CUSTOMER__PAYMENT_DETAILS:
				setPaymentDetails((PaymentDetails)null);
				return;
			case HotelCorePackage.CUSTOMER__LOYALTY_POINTS:
				setLoyaltyPoints(LOYALTY_POINTS_EDEFAULT);
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
			case HotelCorePackage.CUSTOMER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case HotelCorePackage.CUSTOMER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HotelCorePackage.CUSTOMER__PAYMENT_DETAILS:
				return paymentDetails != null;
			case HotelCorePackage.CUSTOMER__LOYALTY_POINTS:
				return loyaltyPoints != LOYALTY_POINTS_EDEFAULT;
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
			case HotelCorePackage.CUSTOMER___ADD_LOYALTY_POINTS__INT:
				addLoyaltyPoints((Integer)arguments.get(0));
				return null;
			case HotelCorePackage.CUSTOMER___REMOVE_LOYALTY_POINTS__INT:
				removeLoyaltyPoints((Integer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", loyaltyPoints: ");
		result.append(loyaltyPoints);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
