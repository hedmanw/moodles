/**
 */
package HotelSystem.impl;

import HotelSystem.HotelSystemPackage;
import HotelSystem.Room;
import HotelSystem.RoomManager;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link HotelSystem.impl.RoomManagerImpl#getRoom <em>Room</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomManagerImpl extends MinimalEObjectImpl.Container implements RoomManager {
	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> room;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelSystemPackage.Literals.ROOM_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRoom() {
		if (room == null) {
			room = new EObjectResolvingEList<Room>(Room.class, this, HotelSystemPackage.ROOM_MANAGER__ROOM);
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getAvailableRooms(Date fromDate, Date toDate, EList roomTypeIds) {
		EList<Room> matching  = new EObjectResolvingEList<>(Room.class, this, HotelSystemPackage.ROOM_MANAGER__ROOM);
		for (Room room : getRoom()) {
			matching.add(room);
		}
		return matching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getRoomOccupancy(Date fromDate, Date toDate) {
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
			case HotelSystemPackage.ROOM_MANAGER__ROOM:
				return getRoom();
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
			case HotelSystemPackage.ROOM_MANAGER__ROOM:
				getRoom().clear();
				getRoom().addAll((Collection<? extends Room>)newValue);
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
			case HotelSystemPackage.ROOM_MANAGER__ROOM:
				getRoom().clear();
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
			case HotelSystemPackage.ROOM_MANAGER__ROOM:
				return room != null && !room.isEmpty();
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
			case HotelSystemPackage.ROOM_MANAGER___GET_AVAILABLE_ROOMS__DATE_DATE_ELIST:
				return getAvailableRooms((Date)arguments.get(0), (Date)arguments.get(1), (EList)arguments.get(2));
			case HotelSystemPackage.ROOM_MANAGER___GET_ROOM_OCCUPANCY__DATE_DATE:
				return getRoomOccupancy((Date)arguments.get(0), (Date)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomManagerImpl
