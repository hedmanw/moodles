/**
 */
package se.chalmers.mdsd1415.group11.model.HotelCore.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import se.chalmers.mdsd1415.group11.model.HotelCore.HotelCorePackage;
import se.chalmers.mdsd1415.group11.model.HotelCore.ScheduledEvents;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduled Events</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ScheduledEventsImpl#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScheduledEventsImpl extends MinimalEObjectImpl.Container implements ScheduledEvents {
	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected Map events;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduledEventsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelCorePackage.Literals.SCHEDULED_EVENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getEvents() {
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvents(Map newEvents) {
		Map oldEvents = events;
		events = newEvents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelCorePackage.SCHEDULED_EVENTS__EVENTS, oldEvents, events));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addEvent(String eventName, long timestamp) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateEvent(String eventName, long timestamp) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteEvent(String eventName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelCorePackage.SCHEDULED_EVENTS__EVENTS:
				return getEvents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HotelCorePackage.SCHEDULED_EVENTS__EVENTS:
				setEvents((Map)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HotelCorePackage.SCHEDULED_EVENTS__EVENTS:
				setEvents((Map)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HotelCorePackage.SCHEDULED_EVENTS__EVENTS:
				return events != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HotelCorePackage.SCHEDULED_EVENTS___ADD_EVENT__STRING_LONG:
				addEvent((String)arguments.get(0), (Long)arguments.get(1));
				return null;
			case HotelCorePackage.SCHEDULED_EVENTS___UPDATE_EVENT__STRING_LONG:
				updateEvent((String)arguments.get(0), (Long)arguments.get(1));
				return null;
			case HotelCorePackage.SCHEDULED_EVENTS___DELETE_EVENT__STRING:
				deleteEvent((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (events: ");
		result.append(events);
		result.append(')');
		return result.toString();
	}

} //ScheduledEventsImpl
