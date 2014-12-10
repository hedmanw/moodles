/**
 */
package model.HotelService.util;

import model.HotelService.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see model.HotelService.HotelServicePackage
 * @generated
 */
public class HotelServiceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HotelServicePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelServiceSwitch() {
		if (modelPackage == null) {
			modelPackage = HotelServicePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case HotelServicePackage.HOTEL_RECEPTIONIST: {
				HotelReceptionist hotelReceptionist = (HotelReceptionist)theEObject;
				T result = caseHotelReceptionist(hotelReceptionist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelServicePackage.IROOM_MANAGER: {
				IRoomManager iRoomManager = (IRoomManager)theEObject;
				T result = caseIRoomManager(iRoomManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelServicePackage.IBOOKING_MANAGER: {
				IBookingManager iBookingManager = (IBookingManager)theEObject;
				T result = caseIBookingManager(iBookingManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelServicePackage.IRESERVATION_MANAGER: {
				IReservationManager iReservationManager = (IReservationManager)theEObject;
				T result = caseIReservationManager(iReservationManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelServicePackage.HOTEL_MANAGER: {
				HotelManager hotelManager = (HotelManager)theEObject;
				T result = caseHotelManager(hotelManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelServicePackage.HOTEL_MANAGER_PROVIDES: {
				HotelManagerProvides hotelManagerProvides = (HotelManagerProvides)theEObject;
				T result = caseHotelManagerProvides(hotelManagerProvides);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelServicePackage.HOTEL_STAFF: {
				HotelStaff hotelStaff = (HotelStaff)theEObject;
				T result = caseHotelStaff(hotelStaff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelServicePackage.HOTEL_STAFF_PROVIDES: {
				HotelStaffProvides hotelStaffProvides = (HotelStaffProvides)theEObject;
				T result = caseHotelStaffProvides(hotelStaffProvides);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelServicePackage.IROOM_TYPE_MANAGER: {
				IRoomTypeManager iRoomTypeManager = (IRoomTypeManager)theEObject;
				T result = caseIRoomTypeManager(iRoomTypeManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HotelServicePackage.ICUSTOMER_MANAGER: {
				ICustomerManager iCustomerManager = (ICustomerManager)theEObject;
				T result = caseICustomerManager(iCustomerManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotel Receptionist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotel Receptionist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotelReceptionist(HotelReceptionist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRoom Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRoom Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRoomManager(IRoomManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBooking Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBooking Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBookingManager(IBookingManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IReservation Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IReservation Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIReservationManager(IReservationManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotel Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotel Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotelManager(HotelManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotel Manager Provides</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotel Manager Provides</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotelManagerProvides(HotelManagerProvides object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotel Staff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotel Staff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotelStaff(HotelStaff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotel Staff Provides</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotel Staff Provides</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotelStaffProvides(HotelStaffProvides object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRoom Type Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRoom Type Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRoomTypeManager(IRoomTypeManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ICustomer Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ICustomer Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseICustomerManager(ICustomerManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //HotelServiceSwitch
