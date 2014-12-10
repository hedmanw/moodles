/**
 */
package model;

import HotelSystem.Booking;
import HotelSystem.Customer;
import HotelSystem.Reservation;

import model.HotelService.HotelReceptionist;
import model.HotelService.IBookingManager;

import model.KeyCardService.KeyCardsProvides;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check In Success</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.CheckInSuccess#getR <em>R</em>}</li>
 *   <li>{@link model.CheckInSuccess#getK <em>K</em>}</li>
 *   <li>{@link model.CheckInSuccess#getCustomer <em>Customer</em>}</li>
 *   <li>{@link model.CheckInSuccess#getActor <em>Actor</em>}</li>
 *   <li>{@link model.CheckInSuccess#getBm <em>Bm</em>}</li>
 *   <li>{@link model.CheckInSuccess#getB <em>B</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getCheckInSuccess()
 * @model
 * @generated
 */
public interface CheckInSuccess extends EObject {
	/**
	 * Returns the value of the '<em><b>R</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' reference.
	 * @see #setR(Reservation)
	 * @see model.ModelPackage#getCheckInSuccess_R()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Reservation getR();

	/**
	 * Sets the value of the '{@link model.CheckInSuccess#getR <em>R</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' reference.
	 * @see #getR()
	 * @generated
	 */
	void setR(Reservation value);

	/**
	 * Returns the value of the '<em><b>K</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>K</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>K</em>' reference.
	 * @see #setK(KeyCardsProvides)
	 * @see model.ModelPackage#getCheckInSuccess_K()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	KeyCardsProvides getK();

	/**
	 * Sets the value of the '{@link model.CheckInSuccess#getK <em>K</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>K</em>' reference.
	 * @see #getK()
	 * @generated
	 */
	void setK(KeyCardsProvides value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see model.ModelPackage#getCheckInSuccess_Customer()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link model.CheckInSuccess#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(HotelReceptionist)
	 * @see model.ModelPackage#getCheckInSuccess_Actor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	HotelReceptionist getActor();

	/**
	 * Sets the value of the '{@link model.CheckInSuccess#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(HotelReceptionist value);

	/**
	 * Returns the value of the '<em><b>Bm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bm</em>' reference.
	 * @see #setBm(IBookingManager)
	 * @see model.ModelPackage#getCheckInSuccess_Bm()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IBookingManager getBm();

	/**
	 * Sets the value of the '{@link model.CheckInSuccess#getBm <em>Bm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bm</em>' reference.
	 * @see #getBm()
	 * @generated
	 */
	void setBm(IBookingManager value);

	/**
	 * Returns the value of the '<em><b>B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' reference.
	 * @see #setB(Booking)
	 * @see model.ModelPackage#getCheckInSuccess_B()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Booking getB();

	/**
	 * Sets the value of the '{@link model.CheckInSuccess#getB <em>B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' reference.
	 * @see #getB()
	 * @generated
	 */
	void setB(Booking value);

} // CheckInSuccess
