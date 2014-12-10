/**
 */
package HotelSystem.impl;

import HotelSystem.HotelSystemPackage;
import HotelSystem.SleepRoom;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sleep Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link HotelSystem.impl.SleepRoomImpl#getNbrOfBeds <em>Nbr Of Beds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SleepRoomImpl extends RoomTypeImpl implements SleepRoom {
	/**
	 * The default value of the '{@link #getNbrOfBeds() <em>Nbr Of Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbrOfBeds()
	 * @generated
	 * @ordered
	 */
	protected static final int NBR_OF_BEDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbrOfBeds() <em>Nbr Of Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbrOfBeds()
	 * @generated
	 * @ordered
	 */
	protected int nbrOfBeds = NBR_OF_BEDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SleepRoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HotelSystemPackage.Literals.SLEEP_ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbrOfBeds() {
		return nbrOfBeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbrOfBeds(int newNbrOfBeds) {
		int oldNbrOfBeds = nbrOfBeds;
		nbrOfBeds = newNbrOfBeds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelSystemPackage.SLEEP_ROOM__NBR_OF_BEDS, oldNbrOfBeds, nbrOfBeds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelSystemPackage.SLEEP_ROOM__NBR_OF_BEDS:
				return new Integer(getNbrOfBeds());
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
			case HotelSystemPackage.SLEEP_ROOM__NBR_OF_BEDS:
				setNbrOfBeds(((Integer)newValue).intValue());
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
			case HotelSystemPackage.SLEEP_ROOM__NBR_OF_BEDS:
				setNbrOfBeds(NBR_OF_BEDS_EDEFAULT);
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
			case HotelSystemPackage.SLEEP_ROOM__NBR_OF_BEDS:
				return nbrOfBeds != NBR_OF_BEDS_EDEFAULT;
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
		result.append(" (nbrOfBeds: ");
		result.append(nbrOfBeds);
		result.append(')');
		return result.toString();
	}

} //SleepRoomImpl
