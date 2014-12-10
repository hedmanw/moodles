/**
 */
package model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Booking Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking Activity</em>'.
	 * @generated
	 */
	BookingActivity createBookingActivity();

	/**
	 * Returns a new object of class '<em>show Room Occupancy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>show Room Occupancy</em>'.
	 * @generated
	 */
	showRoomOccupancy createshowRoomOccupancy();

	/**
	 * Returns a new object of class '<em>Check In Success</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check In Success</em>'.
	 * @generated
	 */
	CheckInSuccess createCheckInSuccess();

	/**
	 * Returns a new object of class '<em>reserve ARoom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>reserve ARoom</em>'.
	 * @generated
	 */
	reserveARoom createreserveARoom();

	/**
	 * Returns a new object of class '<em>make ABooking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>make ABooking</em>'.
	 * @generated
	 */
	makeABooking createmakeABooking();

	/**
	 * Returns a new object of class '<em>check Out Success</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>check Out Success</em>'.
	 * @generated
	 */
	checkOutSuccess createcheckOutSuccess();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
