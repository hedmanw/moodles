package se.chalmers.mdsd1415.group11.usecase

import datastructs.EArrayList
import hotelCore.Booking
import hotelCore.Reservation
import hotelCore.SleepRoom
import keyCardService.KeyCardSingleton
import keyCardService.KeyCardsProvides
import org.eclipse.emf.common.util.EList
import se.chalmers.mdsd1415.group11.HotelBaseSpecification

/**
 * Created by elin on 2014-12-15.
 */
class CheckInTest extends HotelBaseSpecification{
    def roomType
    def room
    Booking booking
    Reservation reservation
    def keyCards = Mock(KeyCardsProvides)

    def setup() {
        roomType = roomTypeManager.createSleepRoom("Double room", 1000, 2)
        room = roomManager.createRoom(501, roomType)
        booking = bookingManager.createBooking()
        reservation = reservationManager.createReservation(booking, today, today + 4, room, roomType)
        def customer = customerManager.createCustomer("123", "Mona")
        booking.setCustomer(customer)
        bookingManager.getAllBookings().add(booking)
        KeyCardSingleton.instance.KEY_CARDS_PROVIDES = keyCards
    }

    def "find by customer"() {
        setup:
        EList<Integer> keyCardIDs = new EArrayList<>()
        keyCardIDs.addAll([1,2])
        keyCards.assignCardsToReservation(reservation, 2) >> keyCardIDs
        reservation.getRoom().setHousekept(true)

        when:
        def customers = customerManager.getCustomersByName("Mona")
        def theBooking = bookingManager.getBookingsByCustomer(customers.get(0)).get(0)
        def theReservation = theBooking.getReservations().get(0)
        theReservation.getRoom().isHousekept()
        reservationManager.getCurrentReservationByRoomNumber(theReservation.getRoom().getRoomNumber()) == null
        reservationManager.checkInReservation(theReservation, "Kim", 2, 2)


        then:
        reservation == theReservation
        reservation.getResponsible() == "Kim"
        reservation.getNumberOfGuests() == 2
        ((SleepRoom)theReservation.getRoom().getRoomType()).getNbrOfBeds() >= theReservation.getNumberOfGuests()
        reservation.getKeyCards().get(0).getKeyCardID() == keyCardIDs.get(0)
        reservation.getKeyCards().get(1).getKeyCardID() == keyCardIDs.get(1)
        reservation.getCheckedIn() != 0
    }

    def "find by bookingNumber"() {
        when:
        def theBooking = bookingManager.getBookingByBookingNumber(booking.getBookingUUID())

        then:
        theBooking == booking
    }

    def "several customers found"() {
        setup:
        def customer2 = customerManager.createCustomer("125", "Mona")
        booking.setCustomer(customer2)

        expect:
        customerManager.getCustomersByName("Mona").size() == 2
    }

    def "no customer found"() {
        expect:
        customerManager.getCustomersByName("Mon").isEmpty()

    }

    def "no booking number found"() {
        expect:
        bookingManager.getBookingByBookingNumber("hihi") == null

    }

    def "no booking found"() {
        setup:
        def customer = customerManager.createCustomer("124", "Cecilia")

        expect:
        bookingManager.getBookingsByCustomer(customer).isEmpty()
    }

    def "room not available"() {
        setup:
        def oldBooking = bookingManager.createBooking()
        def oldReservation = reservationManager.createReservation(oldBooking, today-2, today-1, room, roomType)
        def customer = customerManager.createCustomer("1234", "Rutger")
        oldBooking.setCustomer(customer)
        bookingManager.getAllBookings().add(oldBooking)
        oldReservation.setCheckedIn(today-2)
        
        when:
        def customers = customerManager.getCustomersByName("Mona")
        def theBooking = bookingManager.getBookingsByCustomer(customers.get(0)).get(0)
        def theReservation = theBooking.getReservations().get(0)
        def housekept = theReservation.getRoom().isHousekept()
        def currentReservation = reservationManager.getCurrentReservationByRoomNumber(theReservation.getRoom().getRoomNumber())
        
        then:
        !housekept
        currentReservation != null
    }
    
    def "more guests than beds"() {
        setup:
        EList<Integer> keyCardIDs = new EArrayList<>()
        keyCardIDs.addAll([1,2])
        keyCards.assignCardsToReservation(reservation, 2) >> keyCardIDs

        expect:
        !reservationManager.checkInReservation(reservation, "My", 3, 2)
    }

}
