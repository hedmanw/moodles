/**
 */
package HotelSystem.impl;

import HotelSystem.HotelSystemPackage;
import HotelSystem.RoomType;
import HotelSystem.RoomTypeManager;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Type Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link HotelSystem.impl.RoomTypeManagerImpl#getRoomType <em>Room Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomTypeManagerImpl extends MinimalEObjectImpl.Container implements RoomTypeManager {
	/**
	 * The cached value of the '{@link #getRoomType() <em>Room Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomType()
	 * @generated
	 * @ordered
	 */
	protected EList roomType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomTypeManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HotelSystemPackage.Literals.ROOM_TYPE_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRoomType() {
		if (roomType == null) {
			roomType = new EObjectResolvingEList(RoomType.class, this, HotelSystemPackage.ROOM_TYPE_MANAGER__ROOM_TYPE);
		}
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRoomTypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelSystemPackage.ROOM_TYPE_MANAGER__ROOM_TYPE:
				return getRoomType();
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
			case HotelSystemPackage.ROOM_TYPE_MANAGER__ROOM_TYPE:
				getRoomType().clear();
				getRoomType().addAll((Collection)newValue);
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
			case HotelSystemPackage.ROOM_TYPE_MANAGER__ROOM_TYPE:
				getRoomType().clear();
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
			case HotelSystemPackage.ROOM_TYPE_MANAGER__ROOM_TYPE:
				return roomType != null && !roomType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoomTypeManagerImpl
