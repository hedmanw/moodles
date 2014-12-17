package se.chalmers.mdsd1415.group11.usecase

import hotelCore.SleepRoom
import se.chalmers.mdsd1415.group11.HotelBaseSpecification

/**
 * Created by elin on 2014-12-15.
 */
class CheckInTest extends HotelBaseSpecification{
    def roomType
    def room
    def booking
    def reservation

    def setup() {
        roomType = roomTypeManager.createSleepRoom("Double room", 1000, 2)
        room = roomManager.createRoom(501, roomType)
        booking = bookingManager.createBooking()
        reservation = reservationManager.createReservation(booking, today, today + 4, room, roomType)
        def customer = customerManager.createCustomer("123", "Mona")
        booking.setCustomer(customer)
        bookingManager.getAllBookings().add(booking)
    }

    def "find by customer"() {
        when:
        def customers = customerManager.getCustomersByName("Mona")
        def theBooking = bookingManager.getBookingsByCustomer(customers.get(0)).get(0)
        def theReservation = theBooking.getReservations().get(0)
        reservationManager.checkInReservation(theReservation, "Kim", 2)
        //TODO key cards

        then:
        reservation == theReservation
        reservation.getResponsible() == "Kim"
        reservation.getNumberOfGuests() == 2
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

    def "more guests than beds"() {
        //TODO guests and beds
    }

}
