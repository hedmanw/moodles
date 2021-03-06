/**
 */
package hotelService.impl;

import datastructs.EArrayList;
import hotelCore.Booking;
import hotelCore.Customer;
import hotelCore.Reservation;
import hotelCore.*;
import hotelService.BookingManager;
import hotelService.HotelServicePackage;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;

import hotelService.RoomUnavailableException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires;

import javax.xml.soap.SOAPException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hotelService.impl.BookingManagerImpl#getAllBookings <em>All Bookings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingManagerImpl extends MinimalEObjectImpl.Container implements BookingManager {
    /**
     * The cached value of the '{@link #getAllBookings() <em>All Bookings</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAllBookings()
     * @generated
     * @ordered
     */
    protected EList<Booking> allBookings;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BookingManagerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return HotelServicePackage.Literals.BOOKING_MANAGER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Booking> getAllBookings() {
        if (allBookings == null) {
            allBookings = new EObjectResolvingEList<Booking>(Booking.class, this, HotelServicePackage.BOOKING_MANAGER__ALL_BOOKINGS);
        }
        return allBookings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public Booking createBooking() {
        return HotelCoreFactory.eINSTANCE.createBooking();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public Booking getBookingByBookingNumber(String bookingNumber) {
        for (Booking b : getAllBookings()) {
            if (b.getBookingUUID().equals(bookingNumber)) {
                return b;
            }
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void deleteBooking(Booking booking) {
        if(getBookingByBookingNumber(booking.getBookingUUID()) != null){
            int index = getAllBookings().indexOf(booking);
            getAllBookings().remove(index);
        }else{
            throw new NullPointerException("The booking does not exist");
        }

    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public EList<Booking> getBookingsByCustomer(Customer customer) {
        EList<Booking> bs = new EArrayList<>();
        for (Booking b : getAllBookings()) {
            if (b.getCustomer().equals(customer)) {
                bs.add(b);
            }
        }
        return bs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void setBookingCustomer(Booking booking, Customer customer) {
        booking.setCustomer(customer);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isBillPaidInFull(Booking booking) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public Booking getBookingByReservation(Reservation reservation) {
        for (Booking b : allBookings) {
            for (Reservation r : b.getReservations()) {
                if (r.equals(reservation)) {
                    return b;
                }
            }
        }
        throw new IllegalArgumentException("The reservation is not associated with any booking.");
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void makePaymentIfAllReservationsCheckedOut(Booking booking) {
        if (allReservationsCheckedOut(booking)) {
            makePayment(booking);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public boolean confirmBooking(Booking booking) throws RoomUnavailableException {
        for (Booking existingBooking : allBookings) {
            if (existingBooking.getBookingUUID().equals(booking.getBookingUUID())) {
                throw new IllegalArgumentException("Tried to confirm duplicate booking number.");
            }
        }
        for(Reservation r : booking.getReservations()){
            for (Booking b : allBookings) {
                for (Reservation r2 : b.getReservations()) {
                    if(r.getRoom().getRoomNumber() == r2.getRoom().getRoomNumber()) {
                        if (datesOverlap(r.getStartDay(), r.getEndDay(), r2.getStartDay(), r2.getEndDay())) {
                            throw new RoomUnavailableException();
                        }
                    }
                }
            }
        }
        Customer customer = booking.getCustomer();
        if (customer != null) {
            PaymentDetails p = customer.getPaymentDetails();
            try {
                if (CustomerRequires.instance().isCreditCardValid(p.getCcNumber(), p.getCcv(),
                        p.getExpiryMonth(), p.getExpiryYear(), p.getFirstName(), p.getLastName())) {
                    getAllBookings().add(booking);
                    return true;
                }
            } catch (SOAPException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    private boolean datesOverlap(Date fromDate, Date toDate, Date baseStart, Date baseEnd) {
        return !(baseEnd.before(fromDate) || baseStart.after(toDate));
    }

    private boolean makePayment(Booking booking) {
        Bill bill = booking.getBill();
        Customer customer = booking.getCustomer();

        customer.setLoyaltyPoints((int) (customer.getLoyaltyPoints() + bill.getGrandTotal()));

        PaymentDetails pd = customer.getPaymentDetails();
        boolean success = false;
        try {
            success = CustomerRequires.instance().makePayment(pd.getCcNumber(), pd.getCcv(), pd.getExpiryMonth(),
                    pd.getExpiryYear(), pd.getFirstName(), pd.getLastName(), bill.getGrandTotal());
        } catch (SOAPException e) {
            e.printStackTrace();
        }
        if (success) {
            bill.pay(bill.getGrandTotal());
        }
        return success;
    }

    private boolean allReservationsCheckedOut(Booking booking) {
        for (Reservation r : booking.getReservations()) {
            if (r.getCheckedOut() == null) {
                return false;
            }
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case HotelServicePackage.BOOKING_MANAGER__ALL_BOOKINGS:
                return getAllBookings();
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
            case HotelServicePackage.BOOKING_MANAGER__ALL_BOOKINGS:
                getAllBookings().clear();
                getAllBookings().addAll((Collection<? extends Booking>)newValue);
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
            case HotelServicePackage.BOOKING_MANAGER__ALL_BOOKINGS:
                getAllBookings().clear();
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
            case HotelServicePackage.BOOKING_MANAGER__ALL_BOOKINGS:
                return allBookings != null && !allBookings.isEmpty();
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
            case HotelServicePackage.BOOKING_MANAGER___CREATE_BOOKING:
                return createBooking();
            case HotelServicePackage.BOOKING_MANAGER___GET_BOOKING_BY_BOOKING_NUMBER__STRING:
                return getBookingByBookingNumber((String)arguments.get(0));
            case HotelServicePackage.BOOKING_MANAGER___DELETE_BOOKING__BOOKING:
                deleteBooking((Booking)arguments.get(0));
                return null;
            case HotelServicePackage.BOOKING_MANAGER___GET_BOOKINGS_BY_CUSTOMER__CUSTOMER:
                return getBookingsByCustomer((Customer)arguments.get(0));
            case HotelServicePackage.BOOKING_MANAGER___SET_BOOKING_CUSTOMER__BOOKING_CUSTOMER:
                setBookingCustomer((Booking)arguments.get(0), (Customer)arguments.get(1));
                return null;
            case HotelServicePackage.BOOKING_MANAGER___IS_BILL_PAID_IN_FULL__BOOKING:
                return isBillPaidInFull((Booking)arguments.get(0));
            case HotelServicePackage.BOOKING_MANAGER___GET_BOOKING_BY_RESERVATION__RESERVATION:
                return getBookingByReservation((Reservation)arguments.get(0));
            case HotelServicePackage.BOOKING_MANAGER___MAKE_PAYMENT_IF_ALL_RESERVATIONS_CHECKED_OUT__BOOKING:
                makePaymentIfAllReservationsCheckedOut((Booking)arguments.get(0));
                return null;
        }
        return super.eInvoke(operationID, arguments);
    }

} //BookingManagerImpl
