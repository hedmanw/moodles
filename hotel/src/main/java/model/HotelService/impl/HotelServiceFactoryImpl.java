/**
 */
package model.HotelService.impl;

import model.HotelService.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HotelServiceFactoryImpl extends EFactoryImpl implements HotelServiceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HotelServiceFactory init() {
		try {
			HotelServiceFactory theHotelServiceFactory = (HotelServiceFactory)EPackage.Registry.INSTANCE.getEFactory(HotelServicePackage.eNS_URI);
			if (theHotelServiceFactory != null) {
				return theHotelServiceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HotelServiceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelServiceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HotelServicePackage.HOTEL_RECEPTIONIST: return createHotelReceptionist();
			case HotelServicePackage.HOTEL_MANAGER: return createHotelManager();
			case HotelServicePackage.HOTEL_STAFF: return createHotelStaff();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelReceptionist createHotelReceptionist() {
		HotelReceptionistImpl hotelReceptionist = new HotelReceptionistImpl();
		return hotelReceptionist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelManager createHotelManager() {
		HotelManagerImpl hotelManager = new HotelManagerImpl();
		return hotelManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelStaff createHotelStaff() {
		HotelStaffImpl hotelStaff = new HotelStaffImpl();
		return hotelStaff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelServicePackage getHotelServicePackage() {
		return (HotelServicePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HotelServicePackage getPackage() {
		return HotelServicePackage.eINSTANCE;
	}

} //HotelServiceFactoryImpl
