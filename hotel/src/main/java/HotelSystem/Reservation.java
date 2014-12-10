/**
 */
package HotelSystem;

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
 *   <li>{@link HotelSystem.Reservation#getTab <em>Tab</em>}</li>
 *   <li>{@link HotelSystem.Reservation#getKeyCard <em>Key Card</em>}</li>
 *   <li>{@link HotelSystem.Reservation#getScheduledEvents <em>Scheduled Events</em>}</li>
 *   <li>{@link HotelSystem.Reservation#getRoom <em>Room</em>}</li>
 *   <li>{@link HotelSystem.Reservation#getCostCategory <em>Cost Category</em>}</li>
 *   <li>{@link HotelSystem.Reservation#getCheckedIn <em>Checked In</em>}</li>
 *   <li>{@link HotelSystem.Reservation#getCheckedOut <em>Checked Out</em>}</li>
 *   <li>{@link HotelSystem.Reservation#getStartDay <em>Start Day</em>}</li>
 *   <li>{@link HotelSystem.Reservation#getEndDay <em>End Day</em>}</li>
 *   <li>{@link HotelSystem.Reservation#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link HotelSystem.Reservation#getNbrOfGuests <em>Nbr Of Guests</em>}</li>
 * </ul>
 * </p>
 *
 * @see HotelSystem.HotelSystemPackage#getReservation()
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
	 * @see HotelSystem.HotelSystemPackage#getReservation_Tab()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Tab getTab();

	/**
	 * Sets the value of the '{@link HotelSystem.Reservation#getTab <em>Tab</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tab</em>' reference.
	 * @see #getTab()
	 * @generated
	 */
	void setTab(Tab value);

	/**
	 * Returns the value of the '<em><b>Key Card</b></em>' reference list.
	 * The list contents are of type {@link HotelSystem.KeyCard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Card</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Card</em>' reference list.
	 * @see HotelSystem.HotelSystemPackage#getReservation_KeyCard()
	 * @model ordered="false"
	 * @generated
	 */
	EList<KeyCard> getKeyCard();

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
	 * @see HotelSystem.HotelSystemPackage#getReservation_ScheduledEvents()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ScheduledEvents getScheduledEvents();

	/**
	 * Sets the value of the '{@link HotelSystem.Reservation#getScheduledEvents <em>Scheduled Events</em>}' reference.
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
	 * @see HotelSystem.HotelSystemPackage#getReservation_Room()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link HotelSystem.Reservation#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Cost Category</b></em>' reference list.
	 * The list contents are of type {@link HotelSystem.RoomType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Category</em>' reference list.
	 * @see HotelSystem.HotelSystemPackage#getReservation_CostCategory()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<RoomType> getCostCategory();

	/**
	 * Returns the value of the '<em><b>Checked In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checked In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checked In</em>' attribute.
	 * @see #setCheckedIn(long)
	 * @see HotelSystem.HotelSystemPackage#getReservation_CheckedIn()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getCheckedIn();

	/**
	 * Sets the value of the '{@link HotelSystem.Reservation#getCheckedIn <em>Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checked In</em>' attribute.
	 * @see #getCheckedIn()
	 * @generated
	 */
	void setCheckedIn(long value);

	/**
	 * Returns the value of the '<em><b>Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checked Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checked Out</em>' attribute.
	 * @see #setCheckedOut(long)
	 * @see HotelSystem.HotelSystemPackage#getReservation_CheckedOut()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getCheckedOut();

	/**
	 * Sets the value of the '{@link HotelSystem.Reservation#getCheckedOut <em>Checked Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checked Out</em>' attribute.
	 * @see #getCheckedOut()
	 * @generated
	 */
	void setCheckedOut(long value);

	/**
	 * Returns the value of the '<em><b>Start Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Day</em>' attribute.
	 * @see #setStartDay(long)
	 * @see HotelSystem.HotelSystemPackage#getReservation_StartDay()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getStartDay();

	/**
	 * Sets the value of the '{@link HotelSystem.Reservation#getStartDay <em>Start Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Day</em>' attribute.
	 * @see #getStartDay()
	 * @generated
	 */
	void setStartDay(long value);

	/**
	 * Returns the value of the '<em><b>End Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Day</em>' attribute.
	 * @see #setEndDay(long)
	 * @see HotelSystem.HotelSystemPackage#getReservation_EndDay()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getEndDay();

	/**
	 * Sets the value of the '{@link HotelSystem.Reservation#getEndDay <em>End Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Day</em>' attribute.
	 * @see #getEndDay()
	 * @generated
	 */
	void setEndDay(long value);

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
	 * @see HotelSystem.HotelSystemPackage#getReservation_Responsible()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getResponsible();

	/**
	 * Sets the value of the '{@link HotelSystem.Reservation#getResponsible <em>Responsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' attribute.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(String value);

	/**
	 * Returns the value of the '<em><b>Nbr Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nbr Of Guests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nbr Of Guests</em>' attribute.
	 * @see #setNbrOfGuests(int)
	 * @see HotelSystem.HotelSystemPackage#getReservation_NbrOfGuests()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getNbrOfGuests();

	/**
	 * Sets the value of the '{@link HotelSystem.Reservation#getNbrOfGuests <em>Nbr Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nbr Of Guests</em>' attribute.
	 * @see #getNbrOfGuests()
	 * @generated
	 */
	void setNbrOfGuests(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model costCategoryRequired="true" costCategoryOrdered="false"
	 * @generated
	 */
	void addCostCategory(RoomType costCategory);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	ScheduledEvents getEvents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeAllEvents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	KeyCard getKeyCards();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyCardRequired="true" keyCardOrdered="false"
	 * @generated
	 */
	void addKeyCard(KeyCard keyCard);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyCardRequired="true" keyCardOrdered="false"
	 * @generated
	 */
	void removeKeyCard(KeyCard keyCard);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model costCategoryRequired="true" costCategoryOrdered="false"
	 * @generated
	 */
	void removeCostCategory(RoomType costCategory);

} // Reservation
