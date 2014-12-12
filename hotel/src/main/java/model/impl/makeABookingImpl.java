/**
 */
package model.impl;
import model.BankingService.CustomerProvides;

import model.HotelCore.Booking;
import model.HotelCore.Customer;
import model.HotelCore.PaymentDetails;
import model.HotelService.HotelReceptionist;
import model.HotelService.IBookingManager;
import model.HotelService.ICustomerManager;

import model.HotelService.SystemUser;
import model.ModelPackage;
import model.makeABooking;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>make ABooking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.makeABookingImpl#getR <em>R</em>}</li>
 *   <li>{@link model.impl.makeABookingImpl#getB <em>B</em>}</li>
 *   <li>{@link model.impl.makeABookingImpl#getC <em>C</em>}</li>
 *   <li>{@link model.impl.makeABookingImpl#getPd <em>Pd</em>}</li>
 *   <li>{@link model.impl.makeABookingImpl#getBank <em>Bank</em>}</li>
 *   <li>{@link model.impl.makeABookingImpl#getBm <em>Bm</em>}</li>
 *   <li>{@link model.impl.makeABookingImpl#getCm <em>Cm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class makeABookingImpl extends MinimalEObjectImpl.Container implements makeABooking {
	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected SystemUser r;

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
	 * The cached value of the '{@link #getC() <em>C</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected Customer c;

	/**
	 * The cached value of the '{@link #getPd() <em>Pd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPd()
	 * @generated
	 * @ordered
	 */
	protected PaymentDetails pd;

	/**
	 * The cached value of the '{@link #getBank() <em>Bank</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBank()
	 * @generated
	 * @ordered
	 */
	protected CustomerProvides bank;

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
	 * The cached value of the '{@link #getCm() <em>Cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCm()
	 * @generated
	 * @ordered
	 */
	protected ICustomerManager cm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected makeABookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MAKE_ABOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUser getR() {
		if (r != null && r.eIsProxy()) {
			InternalEObject oldR = (InternalEObject)r;
			r = (SystemUser)eResolveProxy(oldR);
			if (r != oldR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.MAKE_ABOOKING__R, oldR, r));
			}
		}
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUser basicGetR() {
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(SystemUser newR) {
		SystemUser oldR = r;
		r = newR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MAKE_ABOOKING__R, oldR, r));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.MAKE_ABOOKING__B, oldB, b));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MAKE_ABOOKING__B, oldB, b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getC() {
		if (c != null && c.eIsProxy()) {
			InternalEObject oldC = (InternalEObject)c;
			c = (Customer)eResolveProxy(oldC);
			if (c != oldC) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.MAKE_ABOOKING__C, oldC, c));
			}
		}
		return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetC() {
		return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC(Customer newC) {
		Customer oldC = c;
		c = newC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MAKE_ABOOKING__C, oldC, c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentDetails getPd() {
		if (pd != null && pd.eIsProxy()) {
			InternalEObject oldPd = (InternalEObject)pd;
			pd = (PaymentDetails)eResolveProxy(oldPd);
			if (pd != oldPd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.MAKE_ABOOKING__PD, oldPd, pd));
			}
		}
		return pd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentDetails basicGetPd() {
		return pd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPd(PaymentDetails newPd) {
		PaymentDetails oldPd = pd;
		pd = newPd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MAKE_ABOOKING__PD, oldPd, pd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerProvides getBank() {
		if (bank != null && bank.eIsProxy()) {
			InternalEObject oldBank = (InternalEObject)bank;
			bank = (CustomerProvides)eResolveProxy(oldBank);
			if (bank != oldBank) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.MAKE_ABOOKING__BANK, oldBank, bank));
			}
		}
		return bank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerProvides basicGetBank() {
		return bank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBank(CustomerProvides newBank) {
		CustomerProvides oldBank = bank;
		bank = newBank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MAKE_ABOOKING__BANK, oldBank, bank));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.MAKE_ABOOKING__BM, oldBm, bm));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MAKE_ABOOKING__BM, oldBm, bm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICustomerManager getCm() {
		if (cm != null && cm.eIsProxy()) {
			InternalEObject oldCm = (InternalEObject)cm;
			cm = (ICustomerManager)eResolveProxy(oldCm);
			if (cm != oldCm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.MAKE_ABOOKING__CM, oldCm, cm));
			}
		}
		return cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICustomerManager basicGetCm() {
		return cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCm(ICustomerManager newCm) {
		ICustomerManager oldCm = cm;
		cm = newCm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MAKE_ABOOKING__CM, oldCm, cm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.MAKE_ABOOKING__R:
				if (resolve) return getR();
				return basicGetR();
			case ModelPackage.MAKE_ABOOKING__B:
				if (resolve) return getB();
				return basicGetB();
			case ModelPackage.MAKE_ABOOKING__C:
				if (resolve) return getC();
				return basicGetC();
			case ModelPackage.MAKE_ABOOKING__PD:
				if (resolve) return getPd();
				return basicGetPd();
			case ModelPackage.MAKE_ABOOKING__BANK:
				if (resolve) return getBank();
				return basicGetBank();
			case ModelPackage.MAKE_ABOOKING__BM:
				if (resolve) return getBm();
				return basicGetBm();
			case ModelPackage.MAKE_ABOOKING__CM:
				if (resolve) return getCm();
				return basicGetCm();
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
			case ModelPackage.MAKE_ABOOKING__R:
				setR((SystemUser)newValue);
				return;
			case ModelPackage.MAKE_ABOOKING__B:
				setB((Booking)newValue);
				return;
			case ModelPackage.MAKE_ABOOKING__C:
				setC((Customer)newValue);
				return;
			case ModelPackage.MAKE_ABOOKING__PD:
				setPd((PaymentDetails)newValue);
				return;
			case ModelPackage.MAKE_ABOOKING__BANK:
				setBank((CustomerProvides)newValue);
				return;
			case ModelPackage.MAKE_ABOOKING__BM:
				setBm((IBookingManager)newValue);
				return;
			case ModelPackage.MAKE_ABOOKING__CM:
				setCm((ICustomerManager)newValue);
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
			case ModelPackage.MAKE_ABOOKING__R:
				setR((SystemUser)null);
				return;
			case ModelPackage.MAKE_ABOOKING__B:
				setB((Booking)null);
				return;
			case ModelPackage.MAKE_ABOOKING__C:
				setC((Customer)null);
				return;
			case ModelPackage.MAKE_ABOOKING__PD:
				setPd((PaymentDetails)null);
				return;
			case ModelPackage.MAKE_ABOOKING__BANK:
				setBank((CustomerProvides)null);
				return;
			case ModelPackage.MAKE_ABOOKING__BM:
				setBm((IBookingManager)null);
				return;
			case ModelPackage.MAKE_ABOOKING__CM:
				setCm((ICustomerManager)null);
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
			case ModelPackage.MAKE_ABOOKING__R:
				return r != null;
			case ModelPackage.MAKE_ABOOKING__B:
				return b != null;
			case ModelPackage.MAKE_ABOOKING__C:
				return c != null;
			case ModelPackage.MAKE_ABOOKING__PD:
				return pd != null;
			case ModelPackage.MAKE_ABOOKING__BANK:
				return bank != null;
			case ModelPackage.MAKE_ABOOKING__BM:
				return bm != null;
			case ModelPackage.MAKE_ABOOKING__CM:
				return cm != null;
		}
		return super.eIsSet(featureID);
	}

} //makeABookingImpl
