package se.chalmers.mdsd1415.group11

import hotelService.BookingManager
import hotelService.ManagerSingleton
import hotelService.ReservationManager
import hotelService.RoomManager
import hotelService.RoomTypeManager
import spock.lang.Specification

/**
 * Created by wilhelm 2014-12-12.
 */
class HotelBaseSpecification extends Specification {
    RoomManager roomManager
    RoomTypeManager roomTypeManager
    ReservationManager reservationManager
    BookingManager bookingManager

    def setup() {
        roomManager = ManagerSingleton.instance.ROOM_MANAGER
        roomTypeManager = ManagerSingleton.instance.ROOM_TYPE_MANAGER
        reservationManager = ManagerSingleton.instance.RESERVATION_MANAGER
        bookingManager = ManagerSingleton.instance.BOOKING_MANAGER
    }

    def "this method has to be here..."() {
        expect:
        true
    }
}
