package se.chalmers.mdsd1415.group11.usecase

import se.chalmers.mdsd1415.group11.HotelBaseSpecification

/**
 * Created by elin on 2014-12-15.
 */
class CheckInTest extends HotelBaseSpecification{
    private roomType = roomTypeManager.createRoomType("Double room", 1000)
    private room = roomManager.createRoom(501, this.roomType)
    def booking = bookingManager.createBooking()
    private reservation = reservationManager.createReservation(booking, today, today+4, room, roomType)

    def setup() {
        def customer = customerManager.createCustomer("123", "Mona")
        booking.setCustomer(customer)

    }

    def "find by customer"() {
        when:
        def customers = customerManager.getCustomersByName("Mona")
        def theBooking = bookingManager.getBookingsByCustomer(customers.get(0)).get(0)
        def theReservation = theBooking.getReservations().get(0)
        reservationManager.checkInReservation(theReservation, "Kim", 2)

        then:
        reservation == theReservation
        reservation.getResponsible() == "Kim"
        reservation.getNumberOfGuests() == 2
        reservation.getCheckedIn() == today
    }

    def "find by bookingNumber"() {
        when:
        def theBooking = bookingManager.getBookingByBookingNumber(booking.getBookingUUID())

        then:
        theBooking == booking
    }

}
