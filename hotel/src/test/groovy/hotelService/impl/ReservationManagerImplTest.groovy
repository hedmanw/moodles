package hotelService.impl

import hotelCore.Reservation
import hotelCore.Room
import hotelCore.RoomType
import se.chalmers.mdsd1415.group11.HotelBaseSpecification

/**
 * Created by wilhelm 2014-12-12.
 */
class ReservationManagerImplTest extends HotelBaseSpecification {
    Date today = new Date()
    Date tomorrow = new Date()+1
    RoomType a
    RoomType b
    Room one
    Room two

    def setup() {
        a = roomTypeManager.createRoomType("A", 10)
        b = roomTypeManager.createRoomType("B", 20)
        one = roomManager.createRoom(1, this.a)
        two = roomManager.createRoom(2, this.b)

        bookingManager.allBookings.clear()
    }

    def "create a single reservation"() {
        when:
        def booking = bookingManager.createBooking()
        def reservation = reservationManager.createReservation(booking, today, tomorrow, one, a)

        then:
        booking.getReservation().size() == 1
        booking.getReservation().get(0) == reservation
        bookingManager.allBookings.size() == 1
    }

    def "make two reservations on a booking"() {
        when:
        def booking = bookingManager.createBooking()
        def res1 = reservationManager.createReservation(booking, today, tomorrow, one, a)
        def res2 = reservationManager.createReservation(booking, today, tomorrow, two, b)

        then:
        booking.getReservation().size() == 2
        booking.getReservation().get(0) == res1
        booking.getReservation().get(1) == res2
        bookingManager.allBookings.size() == 1
    }

    def "make the same reservation twice"() {
        when:
        def booking = bookingManager.createBooking()
        def res = reservationManager.createReservation(booking, today, tomorrow, one, a)
        reservationManager.createReservation(booking, today, tomorrow, one, a)

        then:
        thrown(IllegalArgumentException)
        booking.getReservation().size() == 1
        booking.getReservation().get(0) == res
        bookingManager.allBookings.size() == 1
    }

    def "room is blocked regardless of cost category"() {
        when:
        def booking = bookingManager.createBooking()
        reservationManager.createReservation(booking, today, tomorrow, one, a)
        reservationManager.createReservation(booking, today, tomorrow, one, b)

        then:
        thrown(IllegalArgumentException)
    }

    def "make a reservation that overlaps with another reservation"() {

    }

    def "silly dates thow"() {
        when:
        def booking = bookingManager.createBooking()
        def first = reservationManager.createReservation(booking, tomorrow, today, one, a)

        then:
        thrown(IllegalArgumentException)
    }
}
