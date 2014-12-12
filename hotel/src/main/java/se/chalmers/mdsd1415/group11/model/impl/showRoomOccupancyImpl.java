/**
 */
package se.chalmers.mdsd1415.group11.model.impl;

import se.chalmers.mdsd1415.group11.model.HotelService.IRoomManager;

import se.chalmers.mdsd1415.group11.model.HotelService.SystemUser;
import se.chalmers.mdsd1415.group11.model.ModelPackage;
import se.chalmers.mdsd1415.group11.model.showRoomOccupancy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>show Room Occupancy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link showRoomOccupancyImpl#getU <em>U</em>}</li>
 *   <li>{@link showRoomOccupancyImpl#getRm <em>Rm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class showRoomOccupancyImpl extends MinimalEObjectImpl.Container implements showRoomOccupancy {
	/**
	 * The cached value of the '{@link #getU() <em>U</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getU()
	 * @generated
	 * @ordered
	 */
	protected SystemUser u;

	/**
	 * The cached value of the '{@link #getRm() <em>Rm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRm()
	 * @generated
	 * @ordered
	 */
	protected IRoomManager rm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected showRoomOccupancyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SHOW_ROOM_OCCUPANCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUser getU() {
		if (u != null && u.eIsProxy()) {
			InternalEObject oldU = (InternalEObject)u;
			u = (SystemUser)eResolveProxy(oldU);
			if (u != oldU) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SHOW_ROOM_OCCUPANCY__U, oldU, u));
			}
		}
		return u;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUser basicGetU() {
		return u;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setU(SystemUser newU) {
		SystemUser oldU = u;
		u = newU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SHOW_ROOM_OCCUPANCY__U, oldU, u));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRoomManager getRm() {
		if (rm != null && rm.eIsProxy()) {
			InternalEObject oldRm = (InternalEObject)rm;
			rm = (IRoomManager)eResolveProxy(oldRm);
			if (rm != oldRm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SHOW_ROOM_OCCUPANCY__RM, oldRm, rm));
			}
		}
		return rm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRoomManager basicGetRm() {
		return rm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRm(IRoomManager newRm) {
		IRoomManager oldRm = rm;
		rm = newRm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SHOW_ROOM_OCCUPANCY__RM, oldRm, rm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.SHOW_ROOM_OCCUPANCY__U:
				if (resolve) return getU();
				return basicGetU();
			case ModelPackage.SHOW_ROOM_OCCUPANCY__RM:
				if (resolve) return getRm();
				return basicGetRm();
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
			case ModelPackage.SHOW_ROOM_OCCUPANCY__U:
				setU((SystemUser)newValue);
				return;
			case ModelPackage.SHOW_ROOM_OCCUPANCY__RM:
				setRm((IRoomManager)newValue);
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
			case ModelPackage.SHOW_ROOM_OCCUPANCY__U:
				setU((SystemUser)null);
				return;
			case ModelPackage.SHOW_ROOM_OCCUPANCY__RM:
				setRm((IRoomManager)null);
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
			case ModelPackage.SHOW_ROOM_OCCUPANCY__U:
				return u != null;
			case ModelPackage.SHOW_ROOM_OCCUPANCY__RM:
				return rm != null;
		}
		return super.eIsSet(featureID);
	}

} //showRoomOccupancyImpl
