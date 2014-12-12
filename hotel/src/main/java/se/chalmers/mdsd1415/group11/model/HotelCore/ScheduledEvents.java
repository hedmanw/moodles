/**
 */
package se.chalmers.mdsd1415.group11.model.HotelCore;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduled Events</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ScheduledEvents#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see HotelCorePackage#getScheduledEvents()
 * @model
 * @generated
 */
public interface ScheduledEvents extends EObject {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' attribute.
	 * @see #setEvents(Map)
	 * @see HotelCorePackage#getScheduledEvents_Events()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Map getEvents();

	/**
	 * Sets the value of the '{@link ScheduledEvents#getEvents <em>Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Events</em>' attribute.
	 * @see #getEvents()
	 * @generated
	 */
	void setEvents(Map value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model eventNameRequired="true" eventNameOrdered="false" timestampRequired="true" timestampOrdered="false"
	 * @generated
	 */
	void addEvent(String eventName, long timestamp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model eventNameRequired="true" eventNameOrdered="false" timestampRequired="true" timestampOrdered="false"
	 * @generated
	 */
	void updateEvent(String eventName, long timestamp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model eventNameRequired="true" eventNameOrdered="false"
	 * @generated
	 */
	void deleteEvent(String eventName);

} // ScheduledEvents
