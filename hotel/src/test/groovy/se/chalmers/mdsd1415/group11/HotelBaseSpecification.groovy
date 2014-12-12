package se.chalmers.mdsd1415.group11

import se.chalmers.mdsd1415.group11.model.HotelService.ReservationManager
import se.chalmers.mdsd1415.group11.model.HotelService.RoomManager
import se.chalmers.mdsd1415.group11.model.HotelService.RoomTypeManager
import se.chalmers.mdsd1415.group11.model.ManagerSingleton
import spock.lang.Specification

/**
 * Created by wilhelm 2014-12-12.
 */
class HotelBaseSpecification extends Specification {
    RoomManager roomManager
    RoomTypeManager roomTypeManager
    ReservationManager reservationManager

    def setup() {
        roomManager = ManagerSingleton.instance.ROOM_MANAGER
        roomTypeManager = ManagerSingleton.instance.ROOM_TYPE_MANAGER
        reservationManager = ManagerSingleton.instance.RESERVATION_MANAGER
    }

    def "this method has to be here..."() {
        expect:
        true
    }
}
