/**
 */
package model;

import model.BankingService.CustomerProvides;
import model.HotelCore.Booking;
import model.HotelCore.Customer;
import model.HotelCore.Reservation;
import model.HotelService.IBookingManager;
import model.HotelService.IReservationManager;
import model.HotelService.SystemUser;
import model.KeyCardService.KeyCardsProvides;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>check Out Success</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.checkOutSuccess#getActor <em>Actor</em>}</li>
 *   <li>{@link model.checkOutSuccess#getKeyCards <em>Key Cards</em>}</li>
 *   <li>{@link model.checkOutSuccess#getR <em>R</em>}</li>
 *   <li>{@link model.checkOutSuccess#getB <em>B</em>}</li>
 *   <li>{@link model.checkOutSuccess#getBank <em>Bank</em>}</li>
 *   <li>{@link model.checkOutSuccess#getC <em>C</em>}</li>
 *   <li>{@link model.checkOutSuccess#getRm <em>Rm</em>}</li>
 *   <li>{@link model.checkOutSuccess#getBm <em>Bm</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getcheckOutSuccess()
 * @model
 * @generated
 */
public interface checkOutSuccess extends EObject {
	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(SystemUser)
	 * @see model.ModelPackage#getcheckOutSuccess_Actor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SystemUser getActor();

	/**
	 * Sets the value of the '{@link model.checkOutSuccess#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(SystemUser value);

	/**
	 * Returns the value of the '<em><b>Key Cards</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Cards</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Cards</em>' reference.
	 * @see #setKeyCards(KeyCardsProvides)
	 * @see model.ModelPackage#getcheckOutSuccess_KeyCards()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	KeyCardsProvides getKeyCards();

	/**
	 * Sets the value of the '{@link model.checkOutSuccess#getKeyCards <em>Key Cards</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Cards</em>' reference.
	 * @see #getKeyCards()
	 * @generated
	 */
	void setKeyCards(KeyCardsProvides value);

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
	 * @see model.ModelPackage#getcheckOutSuccess_R()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Reservation getR();

	/**
	 * Sets the value of the '{@link model.checkOutSuccess#getR <em>R</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' reference.
	 * @see #getR()
	 * @generated
	 */
	void setR(Reservation value);

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
	 * @see model.ModelPackage#getcheckOutSuccess_B()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Booking getB();

	/**
	 * Sets the value of the '{@link model.checkOutSuccess#getB <em>B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' reference.
	 * @see #getB()
	 * @generated
	 */
	void setB(Booking value);

	/**
	 * Returns the value of the '<em><b>Bank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank</em>' reference.
	 * @see #setBank(CustomerProvides)
	 * @see model.ModelPackage#getcheckOutSuccess_Bank()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CustomerProvides getBank();

	/**
	 * Sets the value of the '{@link model.checkOutSuccess#getBank <em>Bank</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bank</em>' reference.
	 * @see #getBank()
	 * @generated
	 */
	void setBank(CustomerProvides value);

	/**
	 * Returns the value of the '<em><b>C</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>C</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C</em>' reference.
	 * @see #setC(Customer)
	 * @see model.ModelPackage#getcheckOutSuccess_C()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Customer getC();

	/**
	 * Sets the value of the '{@link model.checkOutSuccess#getC <em>C</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C</em>' reference.
	 * @see #getC()
	 * @generated
	 */
	void setC(Customer value);

	/**
	 * Returns the value of the '<em><b>Rm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rm</em>' reference.
	 * @see #setRm(IReservationManager)
	 * @see model.ModelPackage#getcheckOutSuccess_Rm()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IReservationManager getRm();

	/**
	 * Sets the value of the '{@link model.checkOutSuccess#getRm <em>Rm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rm</em>' reference.
	 * @see #getRm()
	 * @generated
	 */
	void setRm(IReservationManager value);

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
	 * @see model.ModelPackage#getcheckOutSuccess_Bm()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IBookingManager getBm();

	/**
	 * Sets the value of the '{@link model.checkOutSuccess#getBm <em>Bm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bm</em>' reference.
	 * @see #getBm()
	 * @generated
	 */
	void setBm(IBookingManager value);

} // checkOutSuccess
