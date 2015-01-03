/**
 */
package hotelCore;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hotelCore.Reservation#getTab <em>Tab</em>}</li>
 *   <li>{@link hotelCore.Reservation#getKeyCards <em>Key Cards</em>}</li>
 *   <li>{@link hotelCore.Reservation#getScheduledEvents <em>Scheduled Events</em>}</li>
 *   <li>{@link hotelCore.Reservation#getRoom <em>Room</em>}</li>
 *   <li>{@link hotelCore.Reservation#getCostCategory <em>Cost Category</em>}</li>
 *   <li>{@link hotelCore.Reservation#getCheckedIn <em>Checked In</em>}</li>
 *   <li>{@link hotelCore.Reservation#getCheckedOut <em>Checked Out</em>}</li>
 *   <li>{@link hotelCore.Reservation#getStartDay <em>Start Day</em>}</li>
 *   <li>{@link hotelCore.Reservation#getEndDay <em>End Day</em>}</li>
 *   <li>{@link hotelCore.Reservation#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link hotelCore.Reservation#getNumberOfGuests <em>Number Of Guests</em>}</li>
 * </ul>
 * </p>
 *
 * @see hotelCore.HotelCorePackage#getReservation()
 * @model
 * @generated
 */
public interface Reservation extends EObject {
	/**
	 * Returns the value of the '<em><b>Tab</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab</em>' reference.
	 * @see #setTab(Tab)
	 * @see hotelCore.HotelCorePackage#getReservation_Tab()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Tab getTab();

	/**
	 * Sets the value of the '{@link hotelCore.Reservation#getTab <em>Tab</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tab</em>' reference.
	 * @see #getTab()
	 * @generated
	 */
	void setTab(Tab value);

	/**
	 * Returns the value of the '<em><b>Key Cards</b></em>' reference list.
	 * The list contents are of type {@link hotelCore.KeyCard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Cards</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Cards</em>' reference list.
	 * @see hotelCore.HotelCorePackage#getReservation_KeyCards()
	 * @model ordered="false"
	 * @generated
	 */
	EList<KeyCard> getKeyCards();

	/**
	 * Returns the value of the '<em><b>Scheduled Events</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Events</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Events</em>' reference.
	 * @see #setScheduledEvents(ScheduledEvents)
	 * @see hotelCore.HotelCorePackage#getReservation_ScheduledEvents()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ScheduledEvents getScheduledEvents();

	/**
	 * Sets the value of the '{@link hotelCore.Reservation#getScheduledEvents <em>Scheduled Events</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Events</em>' reference.
	 * @see #getScheduledEvents()
	 * @generated
	 */
	void setScheduledEvents(ScheduledEvents value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see hotelCore.HotelCorePackage#getReservation_Room()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link hotelCore.Reservation#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Cost Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Category</em>' reference.
	 * @see #setCostCategory(RoomType)
	 * @see hotelCore.HotelCorePackage#getReservation_CostCategory()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomType getCostCategory();

	/**
	 * Sets the value of the '{@link hotelCore.Reservation#getCostCategory <em>Cost Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Category</em>' reference.
	 * @see #getCostCategory()
	 * @generated
	 */
	void setCostCategory(RoomType value);

	/**
	 * Returns the value of the '<em><b>Checked In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checked In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checked In</em>' attribute.
	 * @see #setCheckedIn(Date)
	 * @see hotelCore.HotelCorePackage#getReservation_CheckedIn()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getCheckedIn();

	/**
	 * Sets the value of the '{@link hotelCore.Reservation#getCheckedIn <em>Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checked In</em>' attribute.
	 * @see #getCheckedIn()
	 * @generated
	 */
	void setCheckedIn(Date value);

	/**
	 * Returns the value of the '<em><b>Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checked Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checked Out</em>' attribute.
	 * @see #setCheckedOut(Date)
	 * @see hotelCore.HotelCorePackage#getReservation_CheckedOut()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getCheckedOut();

	/**
	 * Sets the value of the '{@link hotelCore.Reservation#getCheckedOut <em>Checked Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checked Out</em>' attribute.
	 * @see #getCheckedOut()
	 * @generated
	 */
	void setCheckedOut(Date value);

	/**
	 * Returns the value of the '<em><b>Start Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Day</em>' attribute.
	 * @see #setStartDay(Date)
	 * @see hotelCore.HotelCorePackage#getReservation_StartDay()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getStartDay();

	/**
	 * Sets the value of the '{@link hotelCore.Reservation#getStartDay <em>Start Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Day</em>' attribute.
	 * @see #getStartDay()
	 * @generated
	 */
	void setStartDay(Date value);

	/**
	 * Returns the value of the '<em><b>End Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Day</em>' attribute.
	 * @see #setEndDay(Date)
	 * @see hotelCore.HotelCorePackage#getReservation_EndDay()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getEndDay();

	/**
	 * Sets the value of the '{@link hotelCore.Reservation#getEndDay <em>End Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Day</em>' attribute.
	 * @see #getEndDay()
	 * @generated
	 */
	void setEndDay(Date value);

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible</em>' attribute.
	 * @see #setResponsible(String)
	 * @see hotelCore.HotelCorePackage#getReservation_Responsible()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getResponsible();

	/**
	 * Sets the value of the '{@link hotelCore.Reservation#getResponsible <em>Responsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' attribute.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Guests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Guests</em>' attribute.
	 * @see #setNumberOfGuests(int)
	 * @see hotelCore.HotelCorePackage#getReservation_NumberOfGuests()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfGuests();

	/**
	 * Sets the value of the '{@link hotelCore.Reservation#getNumberOfGuests <em>Number Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Guests</em>' attribute.
	 * @see #getNumberOfGuests()
	 * @generated
	 */
	void setNumberOfGuests(int value);

} // Reservation
