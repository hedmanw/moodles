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
        a = roomTypeManager.createSleepRoom("A", 10, 2)
        b = roomTypeManager.createSleepRoom("B", 20, 2)
        one = roomManager.createRoom(1, this.a)
        two = roomManager.createRoom(2, this.b)
    }

    def "create a single reservation"() {
        when:
        def booking = bookingManager.createBooking()
        def reservation = reservationManager.createReservation(booking, today, tomorrow, one, a)

        then:
        booking.getReservations().size() == 1
        booking.getReservations().get(0) == reservation
        booking.getReservations().size() == 1
    }

    def "make two reservations on a booking"() {
        when:
        def booking = bookingManager.createBooking()
        def res1 = reservationManager.createReservation(booking, today, tomorrow, one, a)
        def res2 = reservationManager.createReservation(booking, today, tomorrow, two, b)

        then:
        booking.getReservations().size() == 2
        booking.getReservations().get(0) == res1
        booking.getReservations().get(1) == res2
    }

    def "make two non-overlapping reservations for the same room"() {
        when:
        def booking1 = bookingManager.createBooking()
        def res1 = reservationManager.createReservation(booking1, baseStart, baseEnd, one, a)
        def booking2 = bookingManager.createBooking()
        def res2 = reservationManager.createReservation(booking2, secondStart, secondEnd, one, a)

        then:
        booking1.getReservations().size() == 1
        booking1.getReservations().get(0) == res1
        booking2.getReservations().size() == 1
        booking2.getReservations().get(0) == res2

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
        def duplicate = reservationManager.createReservation(booking, today, tomorrow, one, a)

        then:
        duplicate == null
        booking.getReservations().size() == 1
        booking.getReservations().get(0) == res
    }

    def "room is blocked regardless of cost category"() {
        when:
        def booking = bookingManager.createBooking()
        def res = reservationManager.createReservation(booking, today, tomorrow, one, a)
        def duplicate = reservationManager.createReservation(booking, today, tomorrow, one, b)

        then:
        res != null
        duplicate == null
    }

    def "make a reservation that overlaps with another reservation"() {
        when:
        def booking = bookingManager.createBooking()
        def res = reservationManager.createReservation(booking, baseStart, baseEnd, one, a)
        def duplicate = reservationManager.createReservation(booking, secondStart, secondEnd, one, a)

        then:
        res != null
        duplicate == null

        where:
        baseStart << [today, today, tomorrow]
        baseEnd << [tomorrow, tomorrow+1, tomorrow+1]
        secondStart << [today, tomorrow, today]
        secondEnd << [tomorrow, tomorrow+1, tomorrow]
    }

    def "silly dates throw"() {
        when:
        def booking = bookingManager.createBooking()
        reservationManager.createReservation(booking, tomorrow, today, one, a)

        then:
        thrown(IllegalArgumentException)
    }

    def "getCurrentReservation throws when none match"() {
        setup:
        roomManager.createRoom(1337, roomTypeManager.getAllRoomTypes().get(0))

        expect:
        reservationManager.getCurrentReservationByRoomNumber(500) == null
        reservationManager.getCurrentReservationByRoomNumber(1337) == null
    }

    def "getCurrentReservation returns correct reservation"() {
        setup:
        Booking past = bookingManager.createBooking()
        bookingManager.allBookings.add(past)
        Booking current = bookingManager.createBooking()
        bookingManager.allBookings.add(current)
        Booking future = bookingManager.createBooking()
        bookingManager.allBookings.add(future)

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
