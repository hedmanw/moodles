/**
 */
package HotelSystem.impl;

import HotelSystem.ConferenceRoom;
import HotelSystem.HotelSystemPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conference Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link HotelSystem.impl.ConferenceRoomImpl#getMaxNbrOfPeople <em>Max Nbr Of People</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConferenceRoomImpl extends RoomTypeImpl implements ConferenceRoom {
	/**
	 * The default value of the '{@link #getMaxNbrOfPeople() <em>Max Nbr Of People</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNbrOfPeople()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_NBR_OF_PEOPLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxNbrOfPeople() <em>Max Nbr Of People</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNbrOfPeople()
	 * @generated
	 * @ordered
	 */
	protected int maxNbrOfPeople = MAX_NBR_OF_PEOPLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConferenceRoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HotelSystemPackage.Literals.CONFERENCE_ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxNbrOfPeople() {
		return maxNbrOfPeople;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNbrOfPeople(int newMaxNbrOfPeople) {
		int oldMaxNbrOfPeople = maxNbrOfPeople;
		maxNbrOfPeople = newMaxNbrOfPeople;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelSystemPackage.CONFERENCE_ROOM__MAX_NBR_OF_PEOPLE, oldMaxNbrOfPeople, maxNbrOfPeople));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbrOfPeople() {
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
			case HotelSystemPackage.CONFERENCE_ROOM__MAX_NBR_OF_PEOPLE:
				return new Integer(getMaxNbrOfPeople());
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
			case HotelSystemPackage.CONFERENCE_ROOM__MAX_NBR_OF_PEOPLE:
				setMaxNbrOfPeople(((Integer)newValue).intValue());
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
			case HotelSystemPackage.CONFERENCE_ROOM__MAX_NBR_OF_PEOPLE:
				setMaxNbrOfPeople(MAX_NBR_OF_PEOPLE_EDEFAULT);
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
			case HotelSystemPackage.CONFERENCE_ROOM__MAX_NBR_OF_PEOPLE:
				return maxNbrOfPeople != MAX_NBR_OF_PEOPLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (maxNbrOfPeople: ");
		result.append(maxNbrOfPeople);
		result.append(')');
		return result.toString();
	}

} //ConferenceRoomImpl
