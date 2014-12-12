/**
 */
package model;

import model.BankingService.CustomerProvides;
import model.HotelCore.Booking;
import model.HotelCore.Customer;
import model.HotelCore.PaymentDetails;
import model.HotelService.IBookingManager;
import model.HotelService.ICustomerManager;
import model.HotelService.SystemUser;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>make ABooking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.makeABooking#getR <em>R</em>}</li>
 *   <li>{@link model.makeABooking#getB <em>B</em>}</li>
 *   <li>{@link model.makeABooking#getC <em>C</em>}</li>
 *   <li>{@link model.makeABooking#getPd <em>Pd</em>}</li>
 *   <li>{@link model.makeABooking#getBank <em>Bank</em>}</li>
 *   <li>{@link model.makeABooking#getBm <em>Bm</em>}</li>
 *   <li>{@link model.makeABooking#getCm <em>Cm</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getmakeABooking()
 * @model
 * @generated
 */
public interface makeABooking extends EObject {
	/**
	 * Returns the value of the '<em><b>R</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' reference.
	 * @see #setR(SystemUser)
	 * @see model.ModelPackage#getmakeABooking_R()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SystemUser getR();

	/**
	 * Sets the value of the '{@link model.makeABooking#getR <em>R</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' reference.
	 * @see #getR()
	 * @generated
	 */
	void setR(SystemUser value);

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
	 * @see model.ModelPackage#getmakeABooking_B()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Booking getB();

	/**
	 * Sets the value of the '{@link model.makeABooking#getB <em>B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' reference.
	 * @see #getB()
	 * @generated
	 */
	void setB(Booking value);

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
	 * @see model.ModelPackage#getmakeABooking_C()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Customer getC();

	/**
	 * Sets the value of the '{@link model.makeABooking#getC <em>C</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C</em>' reference.
	 * @see #getC()
	 * @generated
	 */
	void setC(Customer value);

	/**
	 * Returns the value of the '<em><b>Pd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pd</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pd</em>' reference.
	 * @see #setPd(PaymentDetails)
	 * @see model.ModelPackage#getmakeABooking_Pd()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PaymentDetails getPd();

	/**
	 * Sets the value of the '{@link model.makeABooking#getPd <em>Pd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pd</em>' reference.
	 * @see #getPd()
	 * @generated
	 */
	void setPd(PaymentDetails value);

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
	 * @see model.ModelPackage#getmakeABooking_Bank()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CustomerProvides getBank();

	/**
	 * Sets the value of the '{@link model.makeABooking#getBank <em>Bank</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bank</em>' reference.
	 * @see #getBank()
	 * @generated
	 */
	void setBank(CustomerProvides value);

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
	 * @see model.ModelPackage#getmakeABooking_Bm()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IBookingManager getBm();

	/**
	 * Sets the value of the '{@link model.makeABooking#getBm <em>Bm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bm</em>' reference.
	 * @see #getBm()
	 * @generated
	 */
	void setBm(IBookingManager value);

	/**
	 * Returns the value of the '<em><b>Cm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cm</em>' reference.
	 * @see #setCm(ICustomerManager)
	 * @see model.ModelPackage#getmakeABooking_Cm()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ICustomerManager getCm();

	/**
	 * Sets the value of the '{@link model.makeABooking#getCm <em>Cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cm</em>' reference.
	 * @see #getCm()
	 * @generated
	 */
	void setCm(ICustomerManager value);

} // makeABooking
