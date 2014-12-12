/**
 */
package se.chalmers.mdsd1415.group11.model.HotelService;

import org.eclipse.emf.ecore.EFactory;
import se.chalmers.mdsd1415.group11.model.HotelService.impl.HotelServiceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see HotelServicePackage
 * @generated
 */
public interface HotelServiceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HotelServiceFactory eINSTANCE = HotelServiceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System User</em>'.
	 * @generated
	 */
	SystemUser createSystemUser();

	/**
	 * Returns a new object of class '<em>Room Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Manager</em>'.
	 * @generated
	 */
	RoomManager createRoomManager();

	/**
	 * Returns a new object of class '<em>Room Type Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Type Manager</em>'.
	 * @generated
	 */
	RoomTypeManager createRoomTypeManager();

	/**
	 * Returns a new object of class '<em>Reservation Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reservation Manager</em>'.
	 * @generated
	 */
	ReservationManager createReservationManager();

	/**
	 * Returns a new object of class '<em>Booking Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking Manager</em>'.
	 * @generated
	 */
	BookingManager createBookingManager();

	/**
	 * Returns a new object of class '<em>Customer Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Manager</em>'.
	 * @generated
	 */
	CustomerManager createCustomerManager();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HotelServicePackage getHotelServicePackage();

} //HotelServiceFactory
