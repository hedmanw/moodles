/**
 */
package HotelSystem.impl;

import HotelSystem.HotelSystemPackage;
import HotelSystem.PaymentDetails;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link HotelSystem.impl.PaymentDetailsImpl#getCcNumber <em>Cc Number</em>}</li>
 *   <li>{@link HotelSystem.impl.PaymentDetailsImpl#getCcv <em>Ccv</em>}</li>
 *   <li>{@link HotelSystem.impl.PaymentDetailsImpl#getExpiryMonth <em>Expiry Month</em>}</li>
 *   <li>{@link HotelSystem.impl.PaymentDetailsImpl#getExpiryYear <em>Expiry Year</em>}</li>
 *   <li>{@link HotelSystem.impl.PaymentDetailsImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link HotelSystem.impl.PaymentDetailsImpl#getLastName <em>Last Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PaymentDetailsImpl extends MinimalEObjectImpl.Container implements PaymentDetails {
	/**
	 * The default value of the '{@link #getCcNumber() <em>Cc Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcNumber() <em>Cc Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcNumber()
	 * @generated
	 * @ordered
	 */
	protected String ccNumber = CC_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcv() <em>Ccv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcv()
	 * @generated
	 * @ordered
	 */
	protected static final String CCV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcv() <em>Ccv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcv()
	 * @generated
	 * @ordered
	 */
	protected String ccv = CCV_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpiryMonth() <em>Expiry Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryMonth()
	 * @generated
	 * @ordered
	 */
	protected static final int EXPIRY_MONTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExpiryMonth() <em>Expiry Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryMonth()
	 * @generated
	 * @ordered
	 */
	protected int expiryMonth = EXPIRY_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpiryYear() <em>Expiry Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryYear()
	 * @generated
	 * @ordered
	 */
	protected static final int EXPIRY_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExpiryYear() <em>Expiry Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryYear()
	 * @generated
	 * @ordered
	 */
	protected int expiryYear = EXPIRY_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelSystemPackage.Literals.PAYMENT_DETAILS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCcNumber() {
		return ccNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCcNumber(String newCcNumber) {
		String oldCcNumber = ccNumber;
		ccNumber = newCcNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelSystemPackage.PAYMENT_DETAILS__CC_NUMBER, oldCcNumber, ccNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCcv() {
		return ccv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCcv(String newCcv) {
		String oldCcv = ccv;
		ccv = newCcv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelSystemPackage.PAYMENT_DETAILS__CCV, oldCcv, ccv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExpiryMonth() {
		return expiryMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpiryMonth(int newExpiryMonth) {
		int oldExpiryMonth = expiryMonth;
		expiryMonth = newExpiryMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelSystemPackage.PAYMENT_DETAILS__EXPIRY_MONTH, oldExpiryMonth, expiryMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExpiryYear() {
		return expiryYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpiryYear(int newExpiryYear) {
		int oldExpiryYear = expiryYear;
		expiryYear = newExpiryYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelSystemPackage.PAYMENT_DETAILS__EXPIRY_YEAR, oldExpiryYear, expiryYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelSystemPackage.PAYMENT_DETAILS__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelSystemPackage.PAYMENT_DETAILS__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCcV() {
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
			case HotelSystemPackage.PAYMENT_DETAILS__CC_NUMBER:
				return getCcNumber();
			case HotelSystemPackage.PAYMENT_DETAILS__CCV:
				return getCcv();
			case HotelSystemPackage.PAYMENT_DETAILS__EXPIRY_MONTH:
				return getExpiryMonth();
			case HotelSystemPackage.PAYMENT_DETAILS__EXPIRY_YEAR:
				return getExpiryYear();
			case HotelSystemPackage.PAYMENT_DETAILS__FIRST_NAME:
				return getFirstName();
			case HotelSystemPackage.PAYMENT_DETAILS__LAST_NAME:
				return getLastName();
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
			case HotelSystemPackage.PAYMENT_DETAILS__CC_NUMBER:
				setCcNumber((String)newValue);
				return;
			case HotelSystemPackage.PAYMENT_DETAILS__CCV:
				setCcv((String)newValue);
				return;
			case HotelSystemPackage.PAYMENT_DETAILS__EXPIRY_MONTH:
				setExpiryMonth((Integer)newValue);
				return;
			case HotelSystemPackage.PAYMENT_DETAILS__EXPIRY_YEAR:
				setExpiryYear((Integer)newValue);
				return;
			case HotelSystemPackage.PAYMENT_DETAILS__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case HotelSystemPackage.PAYMENT_DETAILS__LAST_NAME:
				setLastName((String)newValue);
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
			case HotelSystemPackage.PAYMENT_DETAILS__CC_NUMBER:
				setCcNumber(CC_NUMBER_EDEFAULT);
				return;
			case HotelSystemPackage.PAYMENT_DETAILS__CCV:
				setCcv(CCV_EDEFAULT);
				return;
			case HotelSystemPackage.PAYMENT_DETAILS__EXPIRY_MONTH:
				setExpiryMonth(EXPIRY_MONTH_EDEFAULT);
				return;
			case HotelSystemPackage.PAYMENT_DETAILS__EXPIRY_YEAR:
				setExpiryYear(EXPIRY_YEAR_EDEFAULT);
				return;
			case HotelSystemPackage.PAYMENT_DETAILS__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case HotelSystemPackage.PAYMENT_DETAILS__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
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
			case HotelSystemPackage.PAYMENT_DETAILS__CC_NUMBER:
				return CC_NUMBER_EDEFAULT == null ? ccNumber != null : !CC_NUMBER_EDEFAULT.equals(ccNumber);
			case HotelSystemPackage.PAYMENT_DETAILS__CCV:
				return CCV_EDEFAULT == null ? ccv != null : !CCV_EDEFAULT.equals(ccv);
			case HotelSystemPackage.PAYMENT_DETAILS__EXPIRY_MONTH:
				return expiryMonth != EXPIRY_MONTH_EDEFAULT;
			case HotelSystemPackage.PAYMENT_DETAILS__EXPIRY_YEAR:
				return expiryYear != EXPIRY_YEAR_EDEFAULT;
			case HotelSystemPackage.PAYMENT_DETAILS__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case HotelSystemPackage.PAYMENT_DETAILS__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
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
			case HotelSystemPackage.PAYMENT_DETAILS___GET_CC_V:
				return getCcV();
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
		result.append(" (ccNumber: ");
		result.append(ccNumber);
		result.append(", ccv: ");
		result.append(ccv);
		result.append(", expiryMonth: ");
		result.append(expiryMonth);
		result.append(", expiryYear: ");
		result.append(expiryYear);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(')');
		return result.toString();
	}

} //PaymentDetailsImpl