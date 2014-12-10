/**
 */
package model.impl;

import HotelSystem.Booking;
import HotelSystem.Customer;
import HotelSystem.Reservation;

import model.CheckInSuccess;

import model.HotelService.HotelReceptionist;
import model.HotelService.IBookingManager;

import model.KeyCardService.KeyCardsProvides;

import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check In Success</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.CheckInSuccessImpl#getR <em>R</em>}</li>
 *   <li>{@link model.impl.CheckInSuccessImpl#getK <em>K</em>}</li>
 *   <li>{@link model.impl.CheckInSuccessImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link model.impl.CheckInSuccessImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link model.impl.CheckInSuccessImpl#getBm <em>Bm</em>}</li>
 *   <li>{@link model.impl.CheckInSuccessImpl#getB <em>B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckInSuccessImpl extends MinimalEObjectImpl.Container implements CheckInSuccess {
	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected Reservation r;

	/**
	 * The cached value of the '{@link #getK() <em>K</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getK()
	 * @generated
	 * @ordered
	 */
	protected KeyCardsProvides k;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected HotelReceptionist actor;

	/**
	 * The cached value of the '{@link #getBm() <em>Bm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBm()
	 * @generated
	 * @ordered
	 */
	protected IBookingManager bm;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected Booking b;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckInSuccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CHECK_IN_SUCCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservation getR() {
		if (r != null && r.eIsProxy()) {
			InternalEObject oldR = (InternalEObject)r;
			r = (Reservation)eResolveProxy(oldR);
			if (r != oldR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CHECK_IN_SUCCESS__R, oldR, r));
			}
		}
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservation basicGetR() {
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(Reservation newR) {
		Reservation oldR = r;
		r = newR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CHECK_IN_SUCCESS__R, oldR, r));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyCardsProvides getK() {
		if (k != null && k.eIsProxy()) {
			InternalEObject oldK = (InternalEObject)k;
			k = (KeyCardsProvides)eResolveProxy(oldK);
			if (k != oldK) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CHECK_IN_SUCCESS__K, oldK, k));
			}
		}
		return k;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyCardsProvides basicGetK() {
		return k;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setK(KeyCardsProvides newK) {
		KeyCardsProvides oldK = k;
		k = newK;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CHECK_IN_SUCCESS__K, oldK, k));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject)customer;
			customer = (Customer)eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CHECK_IN_SUCCESS__CUSTOMER, oldCustomer, customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(Customer newCustomer) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CHECK_IN_SUCCESS__CUSTOMER, oldCustomer, customer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelReceptionist getActor() {
		if (actor != null && actor.eIsProxy()) {
			InternalEObject oldActor = (InternalEObject)actor;
			actor = (HotelReceptionist)eResolveProxy(oldActor);
			if (actor != oldActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CHECK_IN_SUCCESS__ACTOR, oldActor, actor));
			}
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelReceptionist basicGetActor() {
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(HotelReceptionist newActor) {
		HotelReceptionist oldActor = actor;
		actor = newActor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CHECK_IN_SUCCESS__ACTOR, oldActor, actor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBookingManager getBm() {
		if (bm != null && bm.eIsProxy()) {
			InternalEObject oldBm = (InternalEObject)bm;
			bm = (IBookingManager)eResolveProxy(oldBm);
			if (bm != oldBm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CHECK_IN_SUCCESS__BM, oldBm, bm));
			}
		}
		return bm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBookingManager basicGetBm() {
		return bm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBm(IBookingManager newBm) {
		IBookingManager oldBm = bm;
		bm = newBm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CHECK_IN_SUCCESS__BM, oldBm, bm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking getB() {
		if (b != null && b.eIsProxy()) {
			InternalEObject oldB = (InternalEObject)b;
			b = (Booking)eResolveProxy(oldB);
			if (b != oldB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CHECK_IN_SUCCESS__B, oldB, b));
			}
		}
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking basicGetB() {
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(Booking newB) {
		Booking oldB = b;
		b = newB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CHECK_IN_SUCCESS__B, oldB, b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.CHECK_IN_SUCCESS__R:
				if (resolve) return getR();
				return basicGetR();
			case ModelPackage.CHECK_IN_SUCCESS__K:
				if (resolve) return getK();
				return basicGetK();
			case ModelPackage.CHECK_IN_SUCCESS__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case ModelPackage.CHECK_IN_SUCCESS__ACTOR:
				if (resolve) return getActor();
				return basicGetActor();
			case ModelPackage.CHECK_IN_SUCCESS__BM:
				if (resolve) return getBm();
				return basicGetBm();
			case ModelPackage.CHECK_IN_SUCCESS__B:
				if (resolve) return getB();
				return basicGetB();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.CHECK_IN_SUCCESS__R:
				setR((Reservation)newValue);
				return;
			case ModelPackage.CHECK_IN_SUCCESS__K:
				setK((KeyCardsProvides)newValue);
				return;
			case ModelPackage.CHECK_IN_SUCCESS__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case ModelPackage.CHECK_IN_SUCCESS__ACTOR:
				setActor((HotelReceptionist)newValue);
				return;
			case ModelPackage.CHECK_IN_SUCCESS__BM:
				setBm((IBookingManager)newValue);
				return;
			case ModelPackage.CHECK_IN_SUCCESS__B:
				setB((Booking)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.CHECK_IN_SUCCESS__R:
				setR((Reservation)null);
				return;
			case ModelPackage.CHECK_IN_SUCCESS__K:
				setK((KeyCardsProvides)null);
				return;
			case ModelPackage.CHECK_IN_SUCCESS__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case ModelPackage.CHECK_IN_SUCCESS__ACTOR:
				setActor((HotelReceptionist)null);
				return;
			case ModelPackage.CHECK_IN_SUCCESS__BM:
				setBm((IBookingManager)null);
				return;
			case ModelPackage.CHECK_IN_SUCCESS__B:
				setB((Booking)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.CHECK_IN_SUCCESS__R:
				return r != null;
			case ModelPackage.CHECK_IN_SUCCESS__K:
				return k != null;
			case ModelPackage.CHECK_IN_SUCCESS__CUSTOMER:
				return customer != null;
			case ModelPackage.CHECK_IN_SUCCESS__ACTOR:
				return actor != null;
			case ModelPackage.CHECK_IN_SUCCESS__BM:
				return bm != null;
			case ModelPackage.CHECK_IN_SUCCESS__B:
				return b != null;
		}
		return super.eIsSet(featureID);
	}

} //CheckInSuccessImpl
