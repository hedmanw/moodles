package model.HotelCore.impl

import model.HotelCore.Reservation
import model.HotelService.ReservationManager
import model.HotelService.impl.ReservationManagerImpl
import spock.lang.Specification

/**
 * Created by Oskar on 14-12-12.
 */
class CheckOutTest extends Specification {

    ReservationManager reservationManager
    Reservation reservation = new ReservationImpl()

    def setup() {
        reservationManager = new ReservationManagerImpl()
    }

    def "CheckOutReservation"() {
        reservation.checkedIn = 5
        reservationManager.reservation.add(reservation)

        expect:
        reservation.checkedOut == 0

        when:
        reservationManager.checkOutReservation(reservation)

        then:
        reservation.checkedOut > 0

        when:
        reservation.checkedOut = 0
        reservation.checkedIn = 0
        reservationManager.checkOutReservation(reservation)

        then:
        reservation.checkedOut == 0
    }

    def "GetCurrentReservationByRoomNumber"() {
        when:
        def room = new RoomImpl()
        room.roomNumber = 234
        reservation.room = room
        reservationManager.reservation.add(reservation)

        then:
        reservation == reservationManager.getCurrentReservationByRoomNumber(234)
    }
}
