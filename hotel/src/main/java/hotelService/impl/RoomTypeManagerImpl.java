/**
 */
package hotelService.impl;

import hotelCore.ConferenceRoom;
import hotelCore.HotelCoreFactory;
import hotelCore.RoomType;

import hotelCore.SleepRoom;
import hotelService.HotelServicePackage;
import hotelService.RoomTypeManager;

import java.lang.reflect.InvocationTargetException;

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
 *   <li>{@link hotelService.impl.RoomTypeManagerImpl#getAllRoomTypes <em>All Room Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomTypeManagerImpl extends MinimalEObjectImpl.Container implements RoomTypeManager {
	/**
	 * The cached value of the '{@link #getAllRoomTypes() <em>All Room Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllRoomTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomType> allRoomTypes;

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
	@Override
	protected EClass eStaticClass() {
		return HotelServicePackage.Literals.ROOM_TYPE_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomType> getAllRoomTypes() {
		if (allRoomTypes == null) {
			allRoomTypes = new EObjectResolvingEList<RoomType>(RoomType.class, this, HotelServicePackage.ROOM_TYPE_MANAGER__ALL_ROOM_TYPES);
		}
		return allRoomTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomType> getRoomTypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RoomType createSleepRoom(String name, double costPerNight, int numberOfBeds) {
		for (RoomType roomType : allRoomTypes) {
			if (roomType.getName().equals(name)) {
				throw new IllegalArgumentException("Room type name already exists");
			}
		}
		SleepRoom sleepRoom = HotelCoreFactory.eINSTANCE.createSleepRoom();
		sleepRoom.setNbrOfBeds(numberOfBeds);
		sleepRoom.setName(name);
		sleepRoom.setCostPerNight(costPerNight);
		getAllRoomTypes().add(sleepRoom);
		return sleepRoom;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RoomType createConferenceRoom(String name, int maxPeople, double cost) {
		for (RoomType roomType : allRoomTypes) {
			if (roomType.getName().equals(name)) {
				throw new IllegalArgumentException("Room type name already exists");
			}
		}
		ConferenceRoom conferenceRoom = HotelCoreFactory.eINSTANCE.createConferenceRoom();
		conferenceRoom.setMaxNbrOfPeople(maxPeople);
		conferenceRoom.setCostPerNight(cost);
		getAllRoomTypes().add(conferenceRoom);
		return conferenceRoom;
	}

	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelServicePackage.ROOM_TYPE_MANAGER__ALL_ROOM_TYPES:
				return getAllRoomTypes();
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
			case HotelServicePackage.ROOM_TYPE_MANAGER__ALL_ROOM_TYPES:
				getAllRoomTypes().clear();
				getAllRoomTypes().addAll((Collection<? extends RoomType>)newValue);
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
			case HotelServicePackage.ROOM_TYPE_MANAGER__ALL_ROOM_TYPES:
				getAllRoomTypes().clear();
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
			case HotelServicePackage.ROOM_TYPE_MANAGER__ALL_ROOM_TYPES:
				return allRoomTypes != null && !allRoomTypes.isEmpty();
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
			case HotelServicePackage.ROOM_TYPE_MANAGER___GET_ROOM_TYPES:
				return getRoomTypes();
			case HotelServicePackage.ROOM_TYPE_MANAGER___CREATE_SLEEP_ROOM__STRING_DOUBLE_INT:
				return createSleepRoom((String)arguments.get(0), (Double)arguments.get(1), (Integer)arguments.get(2));
			case HotelServicePackage.ROOM_TYPE_MANAGER___CREATE_CONFERENCE_ROOM__STRING_INT_DOUBLE:
				return createConferenceRoom((String)arguments.get(0), (Integer)arguments.get(1), (Double)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomTypeManagerImpl
