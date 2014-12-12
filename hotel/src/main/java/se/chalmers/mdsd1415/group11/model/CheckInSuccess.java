/**
 */
package se.chalmers.mdsd1415.group11.model;

import se.chalmers.mdsd1415.group11.model.HotelCore.Booking;
import se.chalmers.mdsd1415.group11.model.HotelCore.Customer;
import se.chalmers.mdsd1415.group11.model.HotelCore.Reservation;
import se.chalmers.mdsd1415.group11.model.HotelService.IBookingManager;
import se.chalmers.mdsd1415.group11.model.HotelService.SystemUser;
import se.chalmers.mdsd1415.group11.model.KeyCardService.KeyCardsProvides;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check In Success</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CheckInSuccess#getR <em>R</em>}</li>
 *   <li>{@link CheckInSuccess#getK <em>K</em>}</li>
 *   <li>{@link CheckInSuccess#getCustomer <em>Customer</em>}</li>
 *   <li>{@link CheckInSuccess#getActor <em>Actor</em>}</li>
 *   <li>{@link CheckInSuccess#getBm <em>Bm</em>}</li>
 *   <li>{@link CheckInSuccess#getB <em>B</em>}</li>
 * </ul>
 * </p>
 *
 * @see ModelPackage#getCheckInSuccess()
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
	 * @see #setR(se.chalmers.mdsd1415.group11.model.HotelCore.Reservation)
	 * @see ModelPackage#getCheckInSuccess_R()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Reservation getR();

	/**
	 * Sets the value of the '{@link CheckInSuccess#getR <em>R</em>}' reference.
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
	 * @see #setK(se.chalmers.mdsd1415.group11.model.KeyCardService.KeyCardsProvides)
	 * @see ModelPackage#getCheckInSuccess_K()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	KeyCardsProvides getK();

	/**
	 * Sets the value of the '{@link CheckInSuccess#getK <em>K</em>}' reference.
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
	 * @see #setCustomer(se.chalmers.mdsd1415.group11.model.HotelCore.Customer)
	 * @see ModelPackage#getCheckInSuccess_Customer()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link CheckInSuccess#getCustomer <em>Customer</em>}' reference.
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
	 * @see #setActor(se.chalmers.mdsd1415.group11.model.HotelService.SystemUser)
	 * @see ModelPackage#getCheckInSuccess_Actor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SystemUser getActor();

	/**
	 * Sets the value of the '{@link CheckInSuccess#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(SystemUser value);

	/**
	 * Returns the value of the '<em><b>Bm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bm</em>' reference.
	 * @see #setBm(se.chalmers.mdsd1415.group11.model.HotelService.IBookingManager)
	 * @see ModelPackage#getCheckInSuccess_Bm()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IBookingManager getBm();

	/**
	 * Sets the value of the '{@link CheckInSuccess#getBm <em>Bm</em>}' reference.
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
	 * @see #setB(se.chalmers.mdsd1415.group11.model.HotelCore.Booking)
	 * @see ModelPackage#getCheckInSuccess_B()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Booking getB();

	/**
	 * Sets the value of the '{@link CheckInSuccess#getB <em>B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' reference.
	 * @see #getB()
	 * @generated
	 */
	void setB(Booking value);

} // CheckInSuccess
