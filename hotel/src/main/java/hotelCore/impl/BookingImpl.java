/**
 */
package hotelCore.impl;

import hotelCore.Bill;
import hotelCore.Booking;
import hotelCore.Customer;
import hotelCore.HotelCorePackage;
import hotelCore.Reservation;
import java.util.Collection;
import java.util.UUID;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hotelCore.impl.BookingImpl#getBill <em>Bill</em>}</li>
 *   <li>{@link hotelCore.impl.BookingImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link hotelCore.impl.BookingImpl#getReservations <em>Reservations</em>}</li>
 *   <li>{@link hotelCore.impl.BookingImpl#getBookingUUID <em>Booking UUID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingImpl extends MinimalEObjectImpl.Container implements Booking {
	/**
	 * The cached value of the '{@link #getBill() <em>Bill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBill()
	 * @generated
	 * @ordered
	 */
	protected Bill bill;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * The cached value of the '{@link #getReservations() <em>Reservations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservations()
	 * @generated
	 * @ordered
	 */
	protected EList<Reservation> reservations;

	/**
	 * The default value of the '{@link #getBookingUUID() <em>Booking UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingUUID()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOKING_UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBookingUUID() <em>Booking UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingUUID()
	 * @generated
	 * @ordered
	 */
	protected String bookingUUID = BOOKING_UUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BookingImpl() {
		super();
        setBookingUUID(UUID.randomUUID().toString());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelCorePackage.Literals.BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Bill getBill() {
		if (bill == null) {
			bill = HotelCoreFactoryImpl.eINSTANCE.createBill();
		}
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill basicGetBill() {
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBill(Bill newBill) {
		Bill oldBill = bill;
		bill = newBill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelCorePackage.BOOKING__BILL, oldBill, bill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject)customer;
			customer = (Customer)eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelCorePackage.BOOKING__CUSTOMER, oldCustomer, customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(Customer newCustomer) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelCorePackage.BOOKING__CUSTOMER, oldCustomer, customer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reservation> getReservations() {
		if (reservations == null) {
			reservations = new EObjectResolvingEList<Reservation>(Reservation.class, this, HotelCorePackage.BOOKING__RESERVATIONS);
		}
		return reservations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBookingUUID() {
		return bookingUUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingUUID(String newBookingUUID) {
		String oldBookingUUID = bookingUUID;
		bookingUUID = newBookingUUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelCorePackage.BOOKING__BOOKING_UUID, oldBookingUUID, bookingUUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelCorePackage.BOOKING__BILL:
				if (resolve) return getBill();
				return basicGetBill();
			case HotelCorePackage.BOOKING__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case HotelCorePackage.BOOKING__RESERVATIONS:
				return getReservations();
			case HotelCorePackage.BOOKING__BOOKING_UUID:
				return getBookingUUID();
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
			case HotelCorePackage.BOOKING__BILL:
				setBill((Bill)newValue);
				return;
			case HotelCorePackage.BOOKING__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case HotelCorePackage.BOOKING__RESERVATIONS:
				getReservations().clear();
				getReservations().addAll((Collection<? extends Reservation>)newValue);
				return;
			case HotelCorePackage.BOOKING__BOOKING_UUID:
				setBookingUUID((String)newValue);
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
			case HotelCorePackage.BOOKING__BILL:
				setBill((Bill)null);
				return;
			case HotelCorePackage.BOOKING__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case HotelCorePackage.BOOKING__RESERVATIONS:
				getReservations().clear();
				return;
			case HotelCorePackage.BOOKING__BOOKING_UUID:
				setBookingUUID(BOOKING_UUID_EDEFAULT);
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
			case HotelCorePackage.BOOKING__BILL:
				return bill != null;
			case HotelCorePackage.BOOKING__CUSTOMER:
				return customer != null;
			case HotelCorePackage.BOOKING__RESERVATIONS:
				return reservations != null && !reservations.isEmpty();
			case HotelCorePackage.BOOKING__BOOKING_UUID:
				return BOOKING_UUID_EDEFAULT == null ? bookingUUID != null : !BOOKING_UUID_EDEFAULT.equals(bookingUUID);
		}
		return super.eIsSet(featureID);
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
		result.append(" (bookingUUID: ");
		result.append(bookingUUID);
		result.append(')');
		return result.toString();
	}

} //BookingImpl
