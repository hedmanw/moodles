/**
 */
package hotelCore.impl;

import hotelCore.HotelCorePackage;
import hotelCore.KeyCard;
import hotelCore.Reservation;
import hotelCore.Room;
import hotelCore.RoomType;
import hotelCore.ScheduledEvents;
import hotelCore.Tab;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reservation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hotelCore.impl.ReservationImpl#getTab <em>Tab</em>}</li>
 *   <li>{@link hotelCore.impl.ReservationImpl#getKeyCard <em>Key Card</em>}</li>
 *   <li>{@link hotelCore.impl.ReservationImpl#getScheduledEvents <em>Scheduled Events</em>}</li>
 *   <li>{@link hotelCore.impl.ReservationImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link hotelCore.impl.ReservationImpl#getCostCategory <em>Cost Category</em>}</li>
 *   <li>{@link hotelCore.impl.ReservationImpl#getCheckedIn <em>Checked In</em>}</li>
 *   <li>{@link hotelCore.impl.ReservationImpl#getCheckedOut <em>Checked Out</em>}</li>
 *   <li>{@link hotelCore.impl.ReservationImpl#getStartDay <em>Start Day</em>}</li>
 *   <li>{@link hotelCore.impl.ReservationImpl#getEndDay <em>End Day</em>}</li>
 *   <li>{@link hotelCore.impl.ReservationImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link hotelCore.impl.ReservationImpl#getNumberOfGuests <em>Number Of Guests</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReservationImpl extends MinimalEObjectImpl.Container implements Reservation {
	/**
	 * The cached value of the '{@link #getTab() <em>Tab</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTab()
	 * @generated
	 * @ordered
	 */
	protected Tab tab;

	/**
	 * The cached value of the '{@link #getKeyCard() <em>Key Card</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyCard()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyCard> keyCard;

	/**
	 * The cached value of the '{@link #getScheduledEvents() <em>Scheduled Events</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledEvents()
	 * @generated
	 * @ordered
	 */
	protected ScheduledEvents scheduledEvents;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected Room room;

	/**
	 * The cached value of the '{@link #getCostCategory() <em>Cost Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostCategory()
	 * @generated
	 * @ordered
	 */
	protected RoomType costCategory;

	/**
	 * The default value of the '{@link #getCheckedIn() <em>Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckedIn()
	 * @generated
	 * @ordered
	 */
	protected static final Date CHECKED_IN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckedIn() <em>Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckedIn()
	 * @generated
	 * @ordered
	 */
	protected Date checkedIn = CHECKED_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckedOut() <em>Checked Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckedOut()
	 * @generated
	 * @ordered
	 */
	protected static final Date CHECKED_OUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckedOut() <em>Checked Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckedOut()
	 * @generated
	 * @ordered
	 */
	protected Date checkedOut = CHECKED_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDay() <em>Start Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDay()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDay() <em>Start Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDay()
	 * @generated
	 * @ordered
	 */
	protected Date startDay = START_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDay() <em>End Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDay()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDay() <em>End Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDay()
	 * @generated
	 * @ordered
	 */
	protected Date endDay = END_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponsible() <em>Responsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSIBLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected String responsible = RESPONSIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfGuests() <em>Number Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfGuests()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_GUESTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfGuests() <em>Number Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfGuests()
	 * @generated
	 * @ordered
	 */
	protected int numberOfGuests = NUMBER_OF_GUESTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelCorePackage.Literals.RESERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tab getTab() {
		if (tab != null && tab.eIsProxy()) {
			InternalEObject oldTab = (InternalEObject)tab;
			tab = (Tab)eResolveProxy(oldTab);
			if (tab != oldTab) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelCorePackage.RESERVATION__TAB, oldTab, tab));
			}
		}
		return tab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tab basicGetTab() {
		return tab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTab(Tab newTab) {
		Tab oldTab = tab;
		tab = newTab;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelCorePackage.RESERVATION__TAB, oldTab, tab));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyCard> getKeyCard() {
		if (keyCard == null) {
			keyCard = new EObjectResolvingEList<KeyCard>(KeyCard.class, this, HotelCorePackage.RESERVATION__KEY_CARD);
		}
		return keyCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduledEvents getScheduledEvents() {
		if (scheduledEvents != null && scheduledEvents.eIsProxy()) {
			InternalEObject oldScheduledEvents = (InternalEObject)scheduledEvents;
			scheduledEvents = (ScheduledEvents)eResolveProxy(oldScheduledEvents);
			if (scheduledEvents != oldScheduledEvents) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelCorePackage.RESERVATION__SCHEDULED_EVENTS, oldScheduledEvents, scheduledEvents));
			}
		}
		return scheduledEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduledEvents basicGetScheduledEvents() {
		return scheduledEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduledEvents(ScheduledEvents newScheduledEvents) {
		ScheduledEvents oldScheduledEvents = scheduledEvents;
		scheduledEvents = newScheduledEvents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelCorePackage.RESERVATION__SCHEDULED_EVENTS, oldScheduledEvents, scheduledEvents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRoom() {
		if (room != null && room.eIsProxy()) {
			InternalEObject oldRoom = (InternalEObject)room;
			room = (Room)eResolveProxy(oldRoom);
			if (room != oldRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelCorePackage.RESERVATION__ROOM, oldRoom, room));
			}
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(Room newRoom) {
		Room oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelCorePackage.RESERVATION__ROOM, oldRoom, room));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType getCostCategory() {
		if (costCategory != null && costCategory.eIsProxy()) {
			InternalEObject oldCostCategory = (InternalEObject)costCategory;
			costCategory = (RoomType)eResolveProxy(oldCostCategory);
			if (costCategory != oldCostCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelCorePackage.RESERVATION__COST_CATEGORY, oldCostCategory, costCategory));
			}
		}
		return costCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType basicGetCostCategory() {
		return costCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostCategory(RoomType newCostCategory) {
		RoomType oldCostCategory = costCategory;
		costCategory = newCostCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelCorePackage.RESERVATION__COST_CATEGORY, oldCostCategory, costCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCheckedIn() {
		return checkedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckedIn(Date newCheckedIn) {
		Date oldCheckedIn = checkedIn;
		checkedIn = newCheckedIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelCorePackage.RESERVATION__CHECKED_IN, oldCheckedIn, checkedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCheckedOut() {
		return checkedOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setCheckedOut(Date newCheckedOut) {
		Date oldCheckedOut = checkedOut;
		checkedOut = newCheckedOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelCorePackage.RESERVATION__CHECKED_OUT, oldCheckedOut, checkedOut));

		if (checkedOut.after(endDay)) {
			int overdueDays = (int) Math.ceil((checkedOut.getTime() - endDay.getTime()) / (1000 * 60 * 60 * 24));
			getTab().getTabItems().put("Overdue check out", overdueDays * room.getRoomType().getCostPerNight());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDay() {
		return startDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDay(Date newStartDay) {
		Date oldStartDay = startDay;
		startDay = newStartDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelCorePackage.RESERVATION__START_DAY, oldStartDay, startDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDay() {
		return endDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDay(Date newEndDay) {
		Date oldEndDay = endDay;
		endDay = newEndDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelCorePackage.RESERVATION__END_DAY, oldEndDay, endDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponsible() {
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsible(String newResponsible) {
		String oldResponsible = responsible;
		responsible = newResponsible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelCorePackage.RESERVATION__RESPONSIBLE, oldResponsible, responsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfGuests() {
		return numberOfGuests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfGuests(int newNumberOfGuests) {
		int oldNumberOfGuests = numberOfGuests;
		numberOfGuests = newNumberOfGuests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelCorePackage.RESERVATION__NUMBER_OF_GUESTS, oldNumberOfGuests, numberOfGuests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addCostCategory(RoomType costCategory) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduledEvents getEvents() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeAllEvents() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyCard getKeyCards() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addKeyCard(KeyCard keyCard) {
		getKeyCard().add(keyCard);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeKeyCard(KeyCard keyCard) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeCostCategory(RoomType costCategory) {
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
			case HotelCorePackage.RESERVATION__TAB:
				if (resolve) return getTab();
				return basicGetTab();
			case HotelCorePackage.RESERVATION__KEY_CARD:
				return getKeyCard();
			case HotelCorePackage.RESERVATION__SCHEDULED_EVENTS:
				if (resolve) return getScheduledEvents();
				return basicGetScheduledEvents();
			case HotelCorePackage.RESERVATION__ROOM:
				if (resolve) return getRoom();
				return basicGetRoom();
			case HotelCorePackage.RESERVATION__COST_CATEGORY:
				if (resolve) return getCostCategory();
				return basicGetCostCategory();
			case HotelCorePackage.RESERVATION__CHECKED_IN:
				return getCheckedIn();
			case HotelCorePackage.RESERVATION__CHECKED_OUT:
				return getCheckedOut();
			case HotelCorePackage.RESERVATION__START_DAY:
				return getStartDay();
			case HotelCorePackage.RESERVATION__END_DAY:
				return getEndDay();
			case HotelCorePackage.RESERVATION__RESPONSIBLE:
				return getResponsible();
			case HotelCorePackage.RESERVATION__NUMBER_OF_GUESTS:
				return getNumberOfGuests();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HotelCorePackage.RESERVATION__TAB:
				setTab((Tab)newValue);
				return;
			case HotelCorePackage.RESERVATION__KEY_CARD:
				getKeyCard().clear();
				getKeyCard().addAll((Collection<? extends KeyCard>)newValue);
				return;
			case HotelCorePackage.RESERVATION__SCHEDULED_EVENTS:
				setScheduledEvents((ScheduledEvents)newValue);
				return;
			case HotelCorePackage.RESERVATION__ROOM:
				setRoom((Room)newValue);
				return;
			case HotelCorePackage.RESERVATION__COST_CATEGORY:
				setCostCategory((RoomType)newValue);
				return;
			case HotelCorePackage.RESERVATION__CHECKED_IN:
				setCheckedIn((Date)newValue);
				return;
			case HotelCorePackage.RESERVATION__CHECKED_OUT:
				setCheckedOut((Date)newValue);
				return;
			case HotelCorePackage.RESERVATION__START_DAY:
				setStartDay((Date)newValue);
				return;
			case HotelCorePackage.RESERVATION__END_DAY:
				setEndDay((Date)newValue);
				return;
			case HotelCorePackage.RESERVATION__RESPONSIBLE:
				setResponsible((String)newValue);
				return;
			case HotelCorePackage.RESERVATION__NUMBER_OF_GUESTS:
				setNumberOfGuests((Integer)newValue);
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
			case HotelCorePackage.RESERVATION__TAB:
				setTab((Tab)null);
				return;
			case HotelCorePackage.RESERVATION__KEY_CARD:
				getKeyCard().clear();
				return;
			case HotelCorePackage.RESERVATION__SCHEDULED_EVENTS:
				setScheduledEvents((ScheduledEvents)null);
				return;
			case HotelCorePackage.RESERVATION__ROOM:
				setRoom((Room)null);
				return;
			case HotelCorePackage.RESERVATION__COST_CATEGORY:
				setCostCategory((RoomType)null);
				return;
			case HotelCorePackage.RESERVATION__CHECKED_IN:
				setCheckedIn(CHECKED_IN_EDEFAULT);
				return;
			case HotelCorePackage.RESERVATION__CHECKED_OUT:
				setCheckedOut(CHECKED_OUT_EDEFAULT);
				return;
			case HotelCorePackage.RESERVATION__START_DAY:
				setStartDay(START_DAY_EDEFAULT);
				return;
			case HotelCorePackage.RESERVATION__END_DAY:
				setEndDay(END_DAY_EDEFAULT);
				return;
			case HotelCorePackage.RESERVATION__RESPONSIBLE:
				setResponsible(RESPONSIBLE_EDEFAULT);
				return;
			case HotelCorePackage.RESERVATION__NUMBER_OF_GUESTS:
				setNumberOfGuests(NUMBER_OF_GUESTS_EDEFAULT);
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
			case HotelCorePackage.RESERVATION__TAB:
				return tab != null;
			case HotelCorePackage.RESERVATION__KEY_CARD:
				return keyCard != null && !keyCard.isEmpty();
			case HotelCorePackage.RESERVATION__SCHEDULED_EVENTS:
				return scheduledEvents != null;
			case HotelCorePackage.RESERVATION__ROOM:
				return room != null;
			case HotelCorePackage.RESERVATION__COST_CATEGORY:
				return costCategory != null;
			case HotelCorePackage.RESERVATION__CHECKED_IN:
				return CHECKED_IN_EDEFAULT == null ? checkedIn != null : !CHECKED_IN_EDEFAULT.equals(checkedIn);
			case HotelCorePackage.RESERVATION__CHECKED_OUT:
				return CHECKED_OUT_EDEFAULT == null ? checkedOut != null : !CHECKED_OUT_EDEFAULT.equals(checkedOut);
			case HotelCorePackage.RESERVATION__START_DAY:
				return START_DAY_EDEFAULT == null ? startDay != null : !START_DAY_EDEFAULT.equals(startDay);
			case HotelCorePackage.RESERVATION__END_DAY:
				return END_DAY_EDEFAULT == null ? endDay != null : !END_DAY_EDEFAULT.equals(endDay);
			case HotelCorePackage.RESERVATION__RESPONSIBLE:
				return RESPONSIBLE_EDEFAULT == null ? responsible != null : !RESPONSIBLE_EDEFAULT.equals(responsible);
			case HotelCorePackage.RESERVATION__NUMBER_OF_GUESTS:
				return numberOfGuests != NUMBER_OF_GUESTS_EDEFAULT;
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
			case HotelCorePackage.RESERVATION___ADD_COST_CATEGORY__ROOMTYPE:
				addCostCategory((RoomType)arguments.get(0));
				return null;
			case HotelCorePackage.RESERVATION___GET_EVENTS:
				return getEvents();
			case HotelCorePackage.RESERVATION___REMOVE_ALL_EVENTS:
				removeAllEvents();
				return null;
			case HotelCorePackage.RESERVATION___GET_KEY_CARDS:
				return getKeyCards();
			case HotelCorePackage.RESERVATION___ADD_KEY_CARD__KEYCARD:
				addKeyCard((KeyCard)arguments.get(0));
				return null;
			case HotelCorePackage.RESERVATION___REMOVE_KEY_CARD__KEYCARD:
				removeKeyCard((KeyCard)arguments.get(0));
				return null;
			case HotelCorePackage.RESERVATION___REMOVE_COST_CATEGORY__ROOMTYPE:
				removeCostCategory((RoomType)arguments.get(0));
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
		result.append(" (checkedIn: ");
		result.append(checkedIn);
		result.append(", checkedOut: ");
		result.append(checkedOut);
		result.append(", startDay: ");
		result.append(startDay);
		result.append(", endDay: ");
		result.append(endDay);
		result.append(", responsible: ");
		result.append(responsible);
		result.append(", numberOfGuests: ");
		result.append(numberOfGuests);
		result.append(')');
		return result.toString();
	}

} //ReservationImpl
