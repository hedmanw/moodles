/**
 */
package se.chalmers.mdsd1415.group11.model;

import se.chalmers.mdsd1415.group11.model.BankingService.CustomerProvides;
import se.chalmers.mdsd1415.group11.model.HotelCore.Booking;
import se.chalmers.mdsd1415.group11.model.HotelCore.Customer;
import se.chalmers.mdsd1415.group11.model.HotelCore.PaymentDetails;
import se.chalmers.mdsd1415.group11.model.HotelService.IBookingManager;
import se.chalmers.mdsd1415.group11.model.HotelService.ICustomerManager;
import se.chalmers.mdsd1415.group11.model.HotelService.SystemUser;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>make ABooking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link makeABooking#getR <em>R</em>}</li>
 *   <li>{@link makeABooking#getB <em>B</em>}</li>
 *   <li>{@link makeABooking#getC <em>C</em>}</li>
 *   <li>{@link makeABooking#getPd <em>Pd</em>}</li>
 *   <li>{@link makeABooking#getBank <em>Bank</em>}</li>
 *   <li>{@link makeABooking#getBm <em>Bm</em>}</li>
 *   <li>{@link makeABooking#getCm <em>Cm</em>}</li>
 * </ul>
 * </p>
 *
 * @see ModelPackage#getmakeABooking()
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
	 * @see #setR(se.chalmers.mdsd1415.group11.model.HotelService.SystemUser)
	 * @see ModelPackage#getmakeABooking_R()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SystemUser getR();

	/**
	 * Sets the value of the '{@link makeABooking#getR <em>R</em>}' reference.
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
	 * @see #setB(se.chalmers.mdsd1415.group11.model.HotelCore.Booking)
	 * @see ModelPackage#getmakeABooking_B()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Booking getB();

	/**
	 * Sets the value of the '{@link makeABooking#getB <em>B</em>}' reference.
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
	 * @see #setC(se.chalmers.mdsd1415.group11.model.HotelCore.Customer)
	 * @see ModelPackage#getmakeABooking_C()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Customer getC();

	/**
	 * Sets the value of the '{@link makeABooking#getC <em>C</em>}' reference.
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
	 * @see #setPd(se.chalmers.mdsd1415.group11.model.HotelCore.PaymentDetails)
	 * @see ModelPackage#getmakeABooking_Pd()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PaymentDetails getPd();

	/**
	 * Sets the value of the '{@link makeABooking#getPd <em>Pd</em>}' reference.
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
	 * @see #setBank(se.chalmers.mdsd1415.group11.model.BankingService.CustomerProvides)
	 * @see ModelPackage#getmakeABooking_Bank()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CustomerProvides getBank();

	/**
	 * Sets the value of the '{@link makeABooking#getBank <em>Bank</em>}' reference.
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
	 * @see #setBm(se.chalmers.mdsd1415.group11.model.HotelService.IBookingManager)
	 * @see ModelPackage#getmakeABooking_Bm()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IBookingManager getBm();

	/**
	 * Sets the value of the '{@link makeABooking#getBm <em>Bm</em>}' reference.
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
	 * @see #setCm(se.chalmers.mdsd1415.group11.model.HotelService.ICustomerManager)
	 * @see ModelPackage#getmakeABooking_Cm()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ICustomerManager getCm();

	/**
	 * Sets the value of the '{@link makeABooking#getCm <em>Cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cm</em>' reference.
	 * @see #getCm()
	 * @generated
	 */
	void setCm(ICustomerManager value);

} // makeABooking
