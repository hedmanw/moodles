package se.chalmers.mdsd1415.group11.usecase

import hotelService.CustomerManager
import hotelService.ManagerSingleton
import se.chalmers.mdsd1415.group11.HotelBaseSpecification

/**
 * Created by Oskar on 14-12-12.
 */
class CheckOutTest extends HotelBaseSpecification {
    def setup() {
        def bookingManager = ManagerSingleton.instance.BOOKING_MANAGER
        def roomType = roomTypeManager.createRoomType("Double room", 1000)
        def room = roomManager.createRoom(501, roomType)
        def booking = bookingManager.createBooking()
        def reservation = reservationManager.createReservation(booking, today-3, today+1, room, roomType)
        reservation.setCheckedIn(today-3)
    }

    def "success scenario"() {
        when:
        def reservation = reservationManager.getCurrentReservationByRoomNumber(501)

        then:
        reservation.getRoom().getRoomNumber() == 501

        when:
        reservationManager.checkOutReservation(reservation)

        then:
        reservation.checkedOut != null

    }
}
