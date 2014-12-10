/**
 */
package model.HotelService;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.HotelService.HotelServiceFactory
 * @model kind="package"
 * @generated
 */
public interface HotelServicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HotelService";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///model/HotelService.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model.HotelService";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HotelServicePackage eINSTANCE = model.HotelService.impl.HotelServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link model.HotelService.impl.HotelReceptionistImpl <em>Hotel Receptionist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.impl.HotelReceptionistImpl
	 * @see model.HotelService.impl.HotelServicePackageImpl#getHotelReceptionist()
	 * @generated
	 */
	int HOTEL_RECEPTIONIST = 0;

	/**
	 * The number of structural features of the '<em>Hotel Receptionist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_RECEPTIONIST_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.HotelService.IRoomManager <em>IRoom Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.IRoomManager
	 * @see model.HotelService.impl.HotelServicePackageImpl#getIRoomManager()
	 * @generated
	 */
	int IROOM_MANAGER = 1;

	/**
	 * The number of structural features of the '<em>IRoom Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.HotelService.IBookingManager <em>IBooking Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.IBookingManager
	 * @see model.HotelService.impl.HotelServicePackageImpl#getIBookingManager()
	 * @generated
	 */
	int IBOOKING_MANAGER = 2;

	/**
	 * The number of structural features of the '<em>IBooking Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.HotelService.IReservationManager <em>IReservation Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.IReservationManager
	 * @see model.HotelService.impl.HotelServicePackageImpl#getIReservationManager()
	 * @generated
	 */
	int IRESERVATION_MANAGER = 3;

	/**
	 * The number of structural features of the '<em>IReservation Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESERVATION_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.HotelService.impl.HotelManagerImpl <em>Hotel Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.impl.HotelManagerImpl
	 * @see model.HotelService.impl.HotelServicePackageImpl#getHotelManager()
	 * @generated
	 */
	int HOTEL_MANAGER = 4;

	/**
	 * The number of structural features of the '<em>Hotel Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.HotelService.HotelManagerProvides <em>Hotel Manager Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.HotelManagerProvides
	 * @see model.HotelService.impl.HotelServicePackageImpl#getHotelManagerProvides()
	 * @generated
	 */
	int HOTEL_MANAGER_PROVIDES = 5;

	/**
	 * The number of structural features of the '<em>Hotel Manager Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_MANAGER_PROVIDES_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.HotelService.impl.HotelStaffImpl <em>Hotel Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.impl.HotelStaffImpl
	 * @see model.HotelService.impl.HotelServicePackageImpl#getHotelStaff()
	 * @generated
	 */
	int HOTEL_STAFF = 6;

	/**
	 * The number of structural features of the '<em>Hotel Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_STAFF_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.HotelService.HotelStaffProvides <em>Hotel Staff Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.HotelStaffProvides
	 * @see model.HotelService.impl.HotelServicePackageImpl#getHotelStaffProvides()
	 * @generated
	 */
	int HOTEL_STAFF_PROVIDES = 7;

	/**
	 * The number of structural features of the '<em>Hotel Staff Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_STAFF_PROVIDES_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.HotelService.IRoomTypeManager <em>IRoom Type Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.IRoomTypeManager
	 * @see model.HotelService.impl.HotelServicePackageImpl#getIRoomTypeManager()
	 * @generated
	 */
	int IROOM_TYPE_MANAGER = 8;

	/**
	 * The number of structural features of the '<em>IRoom Type Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_TYPE_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.HotelService.ICustomerManager <em>ICustomer Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.HotelService.ICustomerManager
	 * @see model.HotelService.impl.HotelServicePackageImpl#getICustomerManager()
	 * @generated
	 */
	int ICUSTOMER_MANAGER = 9;

	/**
	 * The number of structural features of the '<em>ICustomer Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMER_MANAGER_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link model.HotelService.HotelReceptionist <em>Hotel Receptionist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Receptionist</em>'.
	 * @see model.HotelService.HotelReceptionist
	 * @generated
	 */
	EClass getHotelReceptionist();

	/**
	 * Returns the meta object for class '{@link model.HotelService.IRoomManager <em>IRoom Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRoom Manager</em>'.
	 * @see model.HotelService.IRoomManager
	 * @generated
	 */
	EClass getIRoomManager();

	/**
	 * Returns the meta object for class '{@link model.HotelService.IBookingManager <em>IBooking Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBooking Manager</em>'.
	 * @see model.HotelService.IBookingManager
	 * @generated
	 */
	EClass getIBookingManager();

	/**
	 * Returns the meta object for class '{@link model.HotelService.IReservationManager <em>IReservation Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IReservation Manager</em>'.
	 * @see model.HotelService.IReservationManager
	 * @generated
	 */
	EClass getIReservationManager();

	/**
	 * Returns the meta object for class '{@link model.HotelService.HotelManager <em>Hotel Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Manager</em>'.
	 * @see model.HotelService.HotelManager
	 * @generated
	 */
	EClass getHotelManager();

	/**
	 * Returns the meta object for class '{@link model.HotelService.HotelManagerProvides <em>Hotel Manager Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Manager Provides</em>'.
	 * @see model.HotelService.HotelManagerProvides
	 * @generated
	 */
	EClass getHotelManagerProvides();

	/**
	 * Returns the meta object for class '{@link model.HotelService.HotelStaff <em>Hotel Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Staff</em>'.
	 * @see model.HotelService.HotelStaff
	 * @generated
	 */
	EClass getHotelStaff();

	/**
	 * Returns the meta object for class '{@link model.HotelService.HotelStaffProvides <em>Hotel Staff Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Staff Provides</em>'.
	 * @see model.HotelService.HotelStaffProvides
	 * @generated
	 */
	EClass getHotelStaffProvides();

	/**
	 * Returns the meta object for class '{@link model.HotelService.IRoomTypeManager <em>IRoom Type Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRoom Type Manager</em>'.
	 * @see model.HotelService.IRoomTypeManager
	 * @generated
	 */
	EClass getIRoomTypeManager();

	/**
	 * Returns the meta object for class '{@link model.HotelService.ICustomerManager <em>ICustomer Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ICustomer Manager</em>'.
	 * @see model.HotelService.ICustomerManager
	 * @generated
	 */
	EClass getICustomerManager();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HotelServiceFactory getHotelServiceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.HotelService.impl.HotelReceptionistImpl <em>Hotel Receptionist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.impl.HotelReceptionistImpl
		 * @see model.HotelService.impl.HotelServicePackageImpl#getHotelReceptionist()
		 * @generated
		 */
		EClass HOTEL_RECEPTIONIST = eINSTANCE.getHotelReceptionist();

		/**
		 * The meta object literal for the '{@link model.HotelService.IRoomManager <em>IRoom Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.IRoomManager
		 * @see model.HotelService.impl.HotelServicePackageImpl#getIRoomManager()
		 * @generated
		 */
		EClass IROOM_MANAGER = eINSTANCE.getIRoomManager();

		/**
		 * The meta object literal for the '{@link model.HotelService.IBookingManager <em>IBooking Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.IBookingManager
		 * @see model.HotelService.impl.HotelServicePackageImpl#getIBookingManager()
		 * @generated
		 */
		EClass IBOOKING_MANAGER = eINSTANCE.getIBookingManager();

		/**
		 * The meta object literal for the '{@link model.HotelService.IReservationManager <em>IReservation Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.IReservationManager
		 * @see model.HotelService.impl.HotelServicePackageImpl#getIReservationManager()
		 * @generated
		 */
		EClass IRESERVATION_MANAGER = eINSTANCE.getIReservationManager();

		/**
		 * The meta object literal for the '{@link model.HotelService.impl.HotelManagerImpl <em>Hotel Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.impl.HotelManagerImpl
		 * @see model.HotelService.impl.HotelServicePackageImpl#getHotelManager()
		 * @generated
		 */
		EClass HOTEL_MANAGER = eINSTANCE.getHotelManager();

		/**
		 * The meta object literal for the '{@link model.HotelService.HotelManagerProvides <em>Hotel Manager Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.HotelManagerProvides
		 * @see model.HotelService.impl.HotelServicePackageImpl#getHotelManagerProvides()
		 * @generated
		 */
		EClass HOTEL_MANAGER_PROVIDES = eINSTANCE.getHotelManagerProvides();

		/**
		 * The meta object literal for the '{@link model.HotelService.impl.HotelStaffImpl <em>Hotel Staff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.impl.HotelStaffImpl
		 * @see model.HotelService.impl.HotelServicePackageImpl#getHotelStaff()
		 * @generated
		 */
		EClass HOTEL_STAFF = eINSTANCE.getHotelStaff();

		/**
		 * The meta object literal for the '{@link model.HotelService.HotelStaffProvides <em>Hotel Staff Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.HotelStaffProvides
		 * @see model.HotelService.impl.HotelServicePackageImpl#getHotelStaffProvides()
		 * @generated
		 */
		EClass HOTEL_STAFF_PROVIDES = eINSTANCE.getHotelStaffProvides();

		/**
		 * The meta object literal for the '{@link model.HotelService.IRoomTypeManager <em>IRoom Type Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.IRoomTypeManager
		 * @see model.HotelService.impl.HotelServicePackageImpl#getIRoomTypeManager()
		 * @generated
		 */
		EClass IROOM_TYPE_MANAGER = eINSTANCE.getIRoomTypeManager();

		/**
		 * The meta object literal for the '{@link model.HotelService.ICustomerManager <em>ICustomer Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.HotelService.ICustomerManager
		 * @see model.HotelService.impl.HotelServicePackageImpl#getICustomerManager()
		 * @generated
		 */
		EClass ICUSTOMER_MANAGER = eINSTANCE.getICustomerManager();

	}

} //HotelServicePackage
