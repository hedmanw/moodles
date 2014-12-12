/**
 */
package model.HotelService.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

import model.HotelCore.HotelCoreFactory;
import model.HotelCore.Room;
import model.HotelCore.RoomType;

import model.HotelService.HotelServicePackage;
import model.HotelService.RoomManager;

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
 *   <li>{@link model.HotelService.impl.RoomManagerImpl#getAllRooms <em>All Rooms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomManagerImpl extends MinimalEObjectImpl.Container implements RoomManager {
	/**
	 * The cached value of the '{@link #getAllRooms() <em>All Rooms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> allRooms;
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
		return HotelServicePackage.Literals.ROOM_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getAllRooms() {
		if (allRooms == null) {
			allRooms = new EObjectResolvingEList<Room>(Room.class, this, HotelServicePackage.ROOM_MANAGER__ALL_ROOMS);
		}
		return allRooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Room> getAvailableRooms(Date fromDate, Date toDate, EList<RoomType> roomTypes) {
		EList<Room> matching  = new EObjectResolvingEList<>(Room.class, this, HotelServicePackage.ROOM_MANAGER__ALL_ROOMS);
		for (Room room : getAllRooms()) {
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
	 * @generated NOT
	 */
	public Room createRoom(int roomNumber, RoomType roomType) {
		Room room = HotelCoreFactory.eINSTANCE.createRoom();
		room.setRoomNumber(roomNumber);
		room.setRoomType(roomType);
		getAllRooms().add(room);
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelServicePackage.ROOM_MANAGER__ALL_ROOMS:
				return getAllRooms();
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
			case HotelServicePackage.ROOM_MANAGER__ALL_ROOMS:
				getAllRooms().clear();
				getAllRooms().addAll((Collection<? extends Room>)newValue);
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
			case HotelServicePackage.ROOM_MANAGER__ALL_ROOMS:
				getAllRooms().clear();
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
			case HotelServicePackage.ROOM_MANAGER__ALL_ROOMS:
				return allRooms != null && !allRooms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HotelServicePackage.ROOM_MANAGER___GET_AVAILABLE_ROOMS__DATE_DATE_ELIST:
				return getAvailableRooms((Date)arguments.get(0), (Date)arguments.get(1), (EList<RoomType>)arguments.get(2));
			case HotelServicePackage.ROOM_MANAGER___GET_ROOM_OCCUPANCY__DATE_DATE:
				return getRoomOccupancy((Date) arguments.get(0), (Date) arguments.get(1));
			case HotelServicePackage.ROOM_MANAGER___CREATE_ROOM__INT_ROOMTYPE:
				return createRoom((Integer) arguments.get(0), (RoomType) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomManagerImpl
