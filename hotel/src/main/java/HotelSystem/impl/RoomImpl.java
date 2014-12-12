/**
 */
package HotelSystem.impl;

import HotelSystem.Equipment;
import HotelSystem.HotelSystemPackage;
import HotelSystem.Room;
import HotelSystem.RoomType;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link HotelSystem.impl.RoomImpl#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link HotelSystem.impl.RoomImpl#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link HotelSystem.impl.RoomImpl#isCleaned <em>Cleaned</em>}</li>
 *   <li>{@link HotelSystem.impl.RoomImpl#getEquipment <em>Equipment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The default value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ROOM_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected int roomNumber = ROOM_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomType() <em>Room Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomType()
	 * @generated
	 * @ordered
	 */
	protected RoomType roomType;

	/**
	 * The default value of the '{@link #isCleaned() <em>Cleaned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCleaned()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLEANED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCleaned() <em>Cleaned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCleaned()
	 * @generated
	 * @ordered
	 */
	protected boolean cleaned = CLEANED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEquipment() <em>Equipment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipment()
	 * @generated
	 * @ordered
	 */
	protected EList<Equipment> equipment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelSystemPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoomNumber() {
		return roomNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomNumber(int newRoomNumber) {
		int oldRoomNumber = roomNumber;
		roomNumber = newRoomNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelSystemPackage.ROOM__ROOM_NUMBER, oldRoomNumber, roomNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType getRoomType() {
		if (roomType != null && roomType.eIsProxy()) {
			InternalEObject oldRoomType = (InternalEObject)roomType;
			roomType = (RoomType)eResolveProxy(oldRoomType);
			if (roomType != oldRoomType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelSystemPackage.ROOM__ROOM_TYPE, oldRoomType, roomType));
			}
		}
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType basicGetRoomType() {
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomType(RoomType newRoomType) {
		RoomType oldRoomType = roomType;
		roomType = newRoomType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelSystemPackage.ROOM__ROOM_TYPE, oldRoomType, roomType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCleaned() {
		return cleaned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCleaned(boolean newCleaned) {
		boolean oldCleaned = cleaned;
		cleaned = newCleaned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelSystemPackage.ROOM__CLEANED, oldCleaned, cleaned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Equipment> getEquipment() {
		if (equipment == null) {
			equipment = new EObjectResolvingEList<Equipment>(Equipment.class, this, HotelSystemPackage.ROOM__EQUIPMENT);
		}
		return equipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRoomType(RoomType roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeRoomType(RoomType roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addEquipmentToRoom(String item) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeEquipmentItem(String itemName) {
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
			case HotelSystemPackage.ROOM__ROOM_NUMBER:
				return getRoomNumber();
			case HotelSystemPackage.ROOM__ROOM_TYPE:
				if (resolve) return getRoomType();
				return basicGetRoomType();
			case HotelSystemPackage.ROOM__CLEANED:
				return isCleaned();
			case HotelSystemPackage.ROOM__EQUIPMENT:
				return getEquipment();
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
			case HotelSystemPackage.ROOM__ROOM_NUMBER:
				setRoomNumber((Integer)newValue);
				return;
			case HotelSystemPackage.ROOM__ROOM_TYPE:
				setRoomType((RoomType)newValue);
				return;
			case HotelSystemPackage.ROOM__CLEANED:
				setCleaned((Boolean)newValue);
				return;
			case HotelSystemPackage.ROOM__EQUIPMENT:
				getEquipment().clear();
				getEquipment().addAll((Collection<? extends Equipment>)newValue);
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
			case HotelSystemPackage.ROOM__ROOM_NUMBER:
				setRoomNumber(ROOM_NUMBER_EDEFAULT);
				return;
			case HotelSystemPackage.ROOM__ROOM_TYPE:
				setRoomType((RoomType)null);
				return;
			case HotelSystemPackage.ROOM__CLEANED:
				setCleaned(CLEANED_EDEFAULT);
				return;
			case HotelSystemPackage.ROOM__EQUIPMENT:
				getEquipment().clear();
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
			case HotelSystemPackage.ROOM__ROOM_NUMBER:
				return roomNumber != ROOM_NUMBER_EDEFAULT;
			case HotelSystemPackage.ROOM__ROOM_TYPE:
				return roomType != null;
			case HotelSystemPackage.ROOM__CLEANED:
				return cleaned != CLEANED_EDEFAULT;
			case HotelSystemPackage.ROOM__EQUIPMENT:
				return equipment != null && !equipment.isEmpty();
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
			case HotelSystemPackage.ROOM___ADD_ROOM_TYPE__ROOMTYPE:
				addRoomType((RoomType)arguments.get(0));
				return null;
			case HotelSystemPackage.ROOM___REMOVE_ROOM_TYPE__ROOMTYPE:
				removeRoomType((RoomType)arguments.get(0));
				return null;
			case HotelSystemPackage.ROOM___ADD_EQUIPMENT_TO_ROOM__STRING:
				addEquipmentToRoom((String)arguments.get(0));
				return null;
			case HotelSystemPackage.ROOM___REMOVE_EQUIPMENT_ITEM__STRING:
				removeEquipmentItem((String)arguments.get(0));
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
		result.append(" (roomNumber: ");
		result.append(roomNumber);
		result.append(", cleaned: ");
		result.append(cleaned);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
