/**
 */
package model.HotelService;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.HotelService.HotelServicePackage
 * @generated
 */
public interface HotelServiceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HotelServiceFactory eINSTANCE = model.HotelService.impl.HotelServiceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hotel Receptionist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hotel Receptionist</em>'.
	 * @generated
	 */
	HotelReceptionist createHotelReceptionist();

	/**
	 * Returns a new object of class '<em>Hotel Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hotel Manager</em>'.
	 * @generated
	 */
	HotelManager createHotelManager();

	/**
	 * Returns a new object of class '<em>Hotel Staff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hotel Staff</em>'.
	 * @generated
	 */
	HotelStaff createHotelStaff();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HotelServicePackage getHotelServicePackage();

} //HotelServiceFactory
