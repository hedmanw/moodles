package se.chalmers.mdsd1415.group11.usecase

import se.chalmers.mdsd1415.group11.HotelBaseSpecification
import se.chalmers.mdsd1415.group11.model.HotelCore.HotelCoreFactory
import se.chalmers.mdsd1415.group11.model.HotelCore.Reservation
import spock.lang.Ignore

/**
 * Created by Oskar on 14-12-12.
 */
@Ignore
class CheckOutTest extends HotelBaseSpecification {
    Reservation reservation = HotelCoreFactory.eINSTANCE.createReservation()

    def "CheckOutReservation"() {
        reservation.checkedIn = 5
        reservationManager.getAllReservations().add(reservation)

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
        def room = HotelCoreFactory.eINSTANCE.createRoom()
        room.roomNumber = 234
        reservation.room = room
        reservationManager.getAllReservations().add(reservation)

        then:
        reservation == reservationManager.getCurrentReservationByRoomNumber(234)
    }
}
