/**
 */
package model;

import model.HotelCore.Booking;
import model.HotelCore.Reservation;
import model.HotelService.IBookingManager;
import model.HotelService.IReservationManager;
import model.HotelService.IRoomManager;
import model.HotelService.SystemUser;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>reserve ARoom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.reserveARoom#getR <em>R</em>}</li>
 *   <li>{@link model.reserveARoom#getReservation <em>Reservation</em>}</li>
 *   <li>{@link model.reserveARoom#getBooking <em>Booking</em>}</li>
 *   <li>{@link model.reserveARoom#getRoomManager <em>Room Manager</em>}</li>
 *   <li>{@link model.reserveARoom#getReservationManager <em>Reservation Manager</em>}</li>
 *   <li>{@link model.reserveARoom#getBookingManager <em>Booking Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getreserveARoom()
 * @model
 * @generated
 */
public interface reserveARoom extends EObject {
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
	 * @see model.ModelPackage#getreserveARoom_R()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SystemUser getR();

	/**
	 * Sets the value of the '{@link model.reserveARoom#getR <em>R</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' reference.
	 * @see #getR()
	 * @generated
	 */
	void setR(SystemUser value);

	/**
	 * Returns the value of the '<em><b>Reservation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation</em>' reference.
	 * @see #setReservation(Reservation)
	 * @see model.ModelPackage#getreserveARoom_Reservation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Reservation getReservation();

	/**
	 * Sets the value of the '{@link model.reserveARoom#getReservation <em>Reservation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservation</em>' reference.
	 * @see #getReservation()
	 * @generated
	 */
	void setReservation(Reservation value);

	/**
	 * Returns the value of the '<em><b>Booking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking</em>' reference.
	 * @see #setBooking(Booking)
	 * @see model.ModelPackage#getreserveARoom_Booking()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Booking getBooking();

	/**
	 * Sets the value of the '{@link model.reserveARoom#getBooking <em>Booking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking</em>' reference.
	 * @see #getBooking()
	 * @generated
	 */
	void setBooking(Booking value);

	/**
	 * Returns the value of the '<em><b>Room Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Manager</em>' reference.
	 * @see #setRoomManager(IRoomManager)
	 * @see model.ModelPackage#getreserveARoom_RoomManager()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IRoomManager getRoomManager();

	/**
	 * Sets the value of the '{@link model.reserveARoom#getRoomManager <em>Room Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Manager</em>' reference.
	 * @see #getRoomManager()
	 * @generated
	 */
	void setRoomManager(IRoomManager value);

	/**
	 * Returns the value of the '<em><b>Reservation Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservation Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation Manager</em>' reference.
	 * @see #setReservationManager(IReservationManager)
	 * @see model.ModelPackage#getreserveARoom_ReservationManager()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IReservationManager getReservationManager();

	/**
	 * Sets the value of the '{@link model.reserveARoom#getReservationManager <em>Reservation Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservation Manager</em>' reference.
	 * @see #getReservationManager()
	 * @generated
	 */
	void setReservationManager(IReservationManager value);

	/**
	 * Returns the value of the '<em><b>Booking Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking Manager</em>' reference.
	 * @see #setBookingManager(IBookingManager)
	 * @see model.ModelPackage#getreserveARoom_BookingManager()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IBookingManager getBookingManager();

	/**
	 * Sets the value of the '{@link model.reserveARoom#getBookingManager <em>Booking Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Manager</em>' reference.
	 * @see #getBookingManager()
	 * @generated
	 */
	void setBookingManager(IBookingManager value);

} // reserveARoom
