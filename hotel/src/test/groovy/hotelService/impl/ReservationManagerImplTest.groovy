package hotelService.impl

import hotelCore.Booking
import hotelCore.Reservation
import hotelCore.Room
import hotelCore.RoomType
import se.chalmers.mdsd1415.group11.HotelBaseSpecification

/**
 * Created by wilhelm 2014-12-12.
 */
class ReservationManagerImplTest extends HotelBaseSpecification {
    RoomType a
    RoomType b
    Room one
    Room two

    def setup() {
        a = roomTypeManager.createRoomType("A", 10)
        b = roomTypeManager.createRoomType("B", 20)
        one = roomManager.createRoom(1, this.a)
        two = roomManager.createRoom(2, this.b)
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
        def res1 = reservationManager.createReservation(booking1, baseStart, baseEnd, one, a)
        def booking2 = bookingManager.createBooking()
        def res2 = reservationManager.createReservation(booking2, secondStart, secondEnd, one, a)

        then:
        booking1.getReservation().size() == 1
        booking1.getReservation().get(0) == res1
        booking2.getReservation().size() == 1
        booking2.getReservation().get(0) == res2
        bookingManager.allBookings.size() == 2

        where:
        baseStart << [today, today, tomorrow]
        baseEnd << [tomorrow, tomorrow+1, tomorrow+1]
        secondStart << [tomorrow+1, today-2, today-1]
        secondEnd << [tomorrow+2, today-1, today]
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

    def "getCurrentReservation throws when none match"() {
        when:
        reservationManager.getCurrentReservationByRoomNumber(1337)

        then:
        thrown(IllegalArgumentException)
    }

    def "getCurrentReservation returns correct reservation"() {
        setup:
        Booking past = bookingManager.createBooking()
        Booking current = bookingManager.createBooking()
        Booking future = bookingManager.createBooking()

        reservationManager.createReservation(future, tomorrow+3, tomorrow+5, one, a)

        def p1 = reservationManager.createReservation(past, today-5, today-3, one, a)
        p1.setCheckedIn(today-5)
        p1.setCheckedOut(today-3)

        def p2 = reservationManager.createReservation(past, today-5, today-3, two, b)
        p2.setCheckedIn(today-5)

        def reservation = reservationManager.createReservation(current, today-1, tomorrow+1, one, a)
        reservation.setCheckedIn(today-1)

        def c2 = reservationManager.createReservation(current, today-1, tomorrow+1, two, b)
        c2.setCheckedIn(today-1)

        expect:
        reservationManager.getCurrentReservationByRoomNumber(1) == reservation
    }
}
