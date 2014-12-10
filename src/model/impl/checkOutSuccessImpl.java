/**
 */
package model.impl;

import HotelSystem.Booking;
import HotelSystem.Customer;
import HotelSystem.Reservation;

import model.BankingService.CustomerProvides;

import model.HotelService.HotelReceptionist;
import model.HotelService.IBookingManager;
import model.HotelService.IReservationManager;

import model.KeyCardService.KeyCardsProvides;

import model.ModelPackage;
import model.checkOutSuccess;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>check Out Success</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.checkOutSuccessImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link model.impl.checkOutSuccessImpl#getKeyCards <em>Key Cards</em>}</li>
 *   <li>{@link model.impl.checkOutSuccessImpl#getR <em>R</em>}</li>
 *   <li>{@link model.impl.checkOutSuccessImpl#getB <em>B</em>}</li>
 *   <li>{@link model.impl.checkOutSuccessImpl#getBank <em>Bank</em>}</li>
 *   <li>{@link model.impl.checkOutSuccessImpl#getC <em>C</em>}</li>
 *   <li>{@link model.impl.checkOutSuccessImpl#getRm <em>Rm</em>}</li>
 *   <li>{@link model.impl.checkOutSuccessImpl#getBm <em>Bm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class checkOutSuccessImpl extends MinimalEObjectImpl.Container implements checkOutSuccess {
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
	 * The cached value of the '{@link #getKeyCards() <em>Key Cards</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyCards()
	 * @generated
	 * @ordered
	 */
	protected KeyCardsProvides keyCards;

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
	 * The cached value of the '{@link #getB() <em>B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected Booking b;

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
	 * The cached value of the '{@link #getC() <em>C</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected Customer c;

	/**
	 * The cached value of the '{@link #getRm() <em>Rm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRm()
	 * @generated
	 * @ordered
	 */
	protected IReservationManager rm;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected checkOutSuccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CHECK_OUT_SUCCESS;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CHECK_OUT_SUCCESS__ACTOR, oldActor, actor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CHECK_OUT_SUCCESS__ACTOR, oldActor, actor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyCardsProvides getKeyCards() {
		if (keyCards != null && keyCards.eIsProxy()) {
			InternalEObject oldKeyCards = (InternalEObject)keyCards;
			keyCards = (KeyCardsProvides)eResolveProxy(oldKeyCards);
			if (keyCards != oldKeyCards) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CHECK_OUT_SUCCESS__KEY_CARDS, oldKeyCards, keyCards));
			}
		}
		return keyCards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyCardsProvides basicGetKeyCards() {
		return keyCards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyCards(KeyCardsProvides newKeyCards) {
		KeyCardsProvides oldKeyCards = keyCards;
		keyCards = newKeyCards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CHECK_OUT_SUCCESS__KEY_CARDS, oldKeyCards, keyCards));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CHECK_OUT_SUCCESS__R, oldR, r));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CHECK_OUT_SUCCESS__R, oldR, r));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CHECK_OUT_SUCCESS__B, oldB, b));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CHECK_OUT_SUCCESS__B, oldB, b));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CHECK_OUT_SUCCESS__BANK, oldBank, bank));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CHECK_OUT_SUCCESS__BANK, oldBank, bank));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CHECK_OUT_SUCCESS__C, oldC, c));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CHECK_OUT_SUCCESS__C, oldC, c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReservationManager getRm() {
		if (rm != null && rm.eIsProxy()) {
			InternalEObject oldRm = (InternalEObject)rm;
			rm = (IReservationManager)eResolveProxy(oldRm);
			if (rm != oldRm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CHECK_OUT_SUCCESS__RM, oldRm, rm));
			}
		}
		return rm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReservationManager basicGetRm() {
		return rm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRm(IReservationManager newRm) {
		IReservationManager oldRm = rm;
		rm = newRm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CHECK_OUT_SUCCESS__RM, oldRm, rm));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CHECK_OUT_SUCCESS__BM, oldBm, bm));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CHECK_OUT_SUCCESS__BM, oldBm, bm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.CHECK_OUT_SUCCESS__ACTOR:
				if (resolve) return getActor();
				return basicGetActor();
			case ModelPackage.CHECK_OUT_SUCCESS__KEY_CARDS:
				if (resolve) return getKeyCards();
				return basicGetKeyCards();
			case ModelPackage.CHECK_OUT_SUCCESS__R:
				if (resolve) return getR();
				return basicGetR();
			case ModelPackage.CHECK_OUT_SUCCESS__B:
				if (resolve) return getB();
				return basicGetB();
			case ModelPackage.CHECK_OUT_SUCCESS__BANK:
				if (resolve) return getBank();
				return basicGetBank();
			case ModelPackage.CHECK_OUT_SUCCESS__C:
				if (resolve) return getC();
				return basicGetC();
			case ModelPackage.CHECK_OUT_SUCCESS__RM:
				if (resolve) return getRm();
				return basicGetRm();
			case ModelPackage.CHECK_OUT_SUCCESS__BM:
				if (resolve) return getBm();
				return basicGetBm();
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
			case ModelPackage.CHECK_OUT_SUCCESS__ACTOR:
				setActor((HotelReceptionist)newValue);
				return;
			case ModelPackage.CHECK_OUT_SUCCESS__KEY_CARDS:
				setKeyCards((KeyCardsProvides)newValue);
				return;
			case ModelPackage.CHECK_OUT_SUCCESS__R:
				setR((Reservation)newValue);
				return;
			case ModelPackage.CHECK_OUT_SUCCESS__B:
				setB((Booking)newValue);
				return;
			case ModelPackage.CHECK_OUT_SUCCESS__BANK:
				setBank((CustomerProvides)newValue);
				return;
			case ModelPackage.CHECK_OUT_SUCCESS__C:
				setC((Customer)newValue);
				return;
			case ModelPackage.CHECK_OUT_SUCCESS__RM:
				setRm((IReservationManager)newValue);
				return;
			case ModelPackage.CHECK_OUT_SUCCESS__BM:
				setBm((IBookingManager)newValue);
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
			case ModelPackage.CHECK_OUT_SUCCESS__ACTOR:
				setActor((HotelReceptionist)null);
				return;
			case ModelPackage.CHECK_OUT_SUCCESS__KEY_CARDS:
				setKeyCards((KeyCardsProvides)null);
				return;
			case ModelPackage.CHECK_OUT_SUCCESS__R:
				setR((Reservation)null);
				return;
			case ModelPackage.CHECK_OUT_SUCCESS__B:
				setB((Booking)null);
				return;
			case ModelPackage.CHECK_OUT_SUCCESS__BANK:
				setBank((CustomerProvides)null);
				return;
			case ModelPackage.CHECK_OUT_SUCCESS__C:
				setC((Customer)null);
				return;
			case ModelPackage.CHECK_OUT_SUCCESS__RM:
				setRm((IReservationManager)null);
				return;
			case ModelPackage.CHECK_OUT_SUCCESS__BM:
				setBm((IBookingManager)null);
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
			case ModelPackage.CHECK_OUT_SUCCESS__ACTOR:
				return actor != null;
			case ModelPackage.CHECK_OUT_SUCCESS__KEY_CARDS:
				return keyCards != null;
			case ModelPackage.CHECK_OUT_SUCCESS__R:
				return r != null;
			case ModelPackage.CHECK_OUT_SUCCESS__B:
				return b != null;
			case ModelPackage.CHECK_OUT_SUCCESS__BANK:
				return bank != null;
			case ModelPackage.CHECK_OUT_SUCCESS__C:
				return c != null;
			case ModelPackage.CHECK_OUT_SUCCESS__RM:
				return rm != null;
			case ModelPackage.CHECK_OUT_SUCCESS__BM:
				return bm != null;
		}
		return super.eIsSet(featureID);
	}

} //checkOutSuccessImpl
