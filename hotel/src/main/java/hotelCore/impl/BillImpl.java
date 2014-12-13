/**
 */
package hotelCore.impl;

import hotelCore.Bill;
import hotelCore.HotelCorePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hotelCore.impl.BillImpl#getPaid <em>Paid</em>}</li>
 *   <li>{@link hotelCore.impl.BillImpl#getGrandTotal <em>Grand Total</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BillImpl extends MinimalEObjectImpl.Container implements Bill {
	/**
	 * The default value of the '{@link #getPaid() <em>Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaid()
	 * @generated
	 * @ordered
	 */
	protected static final double PAID_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPaid() <em>Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaid()
	 * @generated
	 * @ordered
	 */
	protected double paid = PAID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrandTotal() <em>Grand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrandTotal()
	 * @generated
	 * @ordered
	 */
	protected static final double GRAND_TOTAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getGrandTotal() <em>Grand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrandTotal()
	 * @generated
	 * @ordered
	 */
	protected double grandTotal = GRAND_TOTAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelCorePackage.Literals.BILL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPaid() {
		return paid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaid(double newPaid) {
		double oldPaid = paid;
		paid = newPaid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelCorePackage.BILL__PAID, oldPaid, paid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGrandTotal() {
		return grandTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrandTotal(double newGrandTotal) {
		double oldGrandTotal = grandTotal;
		grandTotal = newGrandTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelCorePackage.BILL__GRAND_TOTAL, oldGrandTotal, grandTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addToBill(double cost) {
		this.grandTotal += cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isPaid() {
		return paid >= grandTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeFromBill(double cost) {
		grandTotal -= cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double leftToPay() {
		return grandTotal-paid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void pay(double cost) {
		paid += cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelCorePackage.BILL__PAID:
				return getPaid();
			case HotelCorePackage.BILL__GRAND_TOTAL:
				return getGrandTotal();
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
			case HotelCorePackage.BILL__PAID:
				setPaid((Double)newValue);
				return;
			case HotelCorePackage.BILL__GRAND_TOTAL:
				setGrandTotal((Double)newValue);
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
			case HotelCorePackage.BILL__PAID:
				setPaid(PAID_EDEFAULT);
				return;
			case HotelCorePackage.BILL__GRAND_TOTAL:
				setGrandTotal(GRAND_TOTAL_EDEFAULT);
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
			case HotelCorePackage.BILL__PAID:
				return paid != PAID_EDEFAULT;
			case HotelCorePackage.BILL__GRAND_TOTAL:
				return grandTotal != GRAND_TOTAL_EDEFAULT;
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
			case HotelCorePackage.BILL___ADD_TO_BILL__DOUBLE:
				addToBill((Double)arguments.get(0));
				return null;
			case HotelCorePackage.BILL___IS_PAID:
				return isPaid();
			case HotelCorePackage.BILL___REMOVE_FROM_BILL__DOUBLE:
				removeFromBill((Double)arguments.get(0));
				return null;
			case HotelCorePackage.BILL___LEFT_TO_PAY:
				return leftToPay();
			case HotelCorePackage.BILL___PAY__DOUBLE:
				pay((Double)arguments.get(0));
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
		result.append(" (paid: ");
		result.append(paid);
		result.append(", grandTotal: ");
		result.append(grandTotal);
		result.append(')');
		return result.toString();
	}

} //BillImpl
