package hotelService.impl

import hotelCore.Room
import hotelCore.RoomType
import se.chalmers.mdsd1415.group11.HotelBaseSpecification
import spock.lang.Shared

/**
 * Created by wilhelm 2014-12-12.
 */
class ReservationManagerImplTest extends HotelBaseSpecification {
    @Shared
    Date today = new Date()
    @Shared
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

    def "make two non-overlapping reservations for the same room"() {
        when:
        def booking1 = bookingManager.createBooking()
        def res1 = reservationManager.createReservation(booking1, today, tomorrow, one, a)
        def booking2 = bookingManager.createBooking()
        def res2 = reservationManager.createReservation(booking2, tomorrow+1, tomorrow+3, one, a)

        then:
        booking1.getReservation().size() == 1
        booking1.getReservation().get(0) == res1
        booking2.getReservation().size() == 1
        booking2.getReservation().get(0) == res2
        bookingManager.allBookings.size() == 2
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
        when:
        def booking = bookingManager.createBooking()
        reservationManager.createReservation(booking, baseStart, baseEnd, one, a)
        reservationManager.createReservation(booking, secondStart, secondEnd, one, a)

        then:
        thrown(IllegalArgumentException)

        where:
        baseStart << [today, today, tomorrow]
        baseEnd << [tomorrow, tomorrow+1, tomorrow+1]
        secondStart << [today, tomorrow, today]
        secondEnd << [tomorrow, tomorrow+1, tomorrow]
    }

    def "silly dates thow"() {
        when:
        def booking = bookingManager.createBooking()
        reservationManager.createReservation(booking, tomorrow, today, one, a)

        then:
        thrown(IllegalArgumentException)
    }
}
