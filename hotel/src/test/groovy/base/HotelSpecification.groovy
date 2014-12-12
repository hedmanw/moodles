package base

import model.HotelService.ReservationManager
import model.HotelService.RoomManager
import model.HotelService.RoomTypeManager
import model.ManagerSingleton
import spock.lang.Specification

/**
 * Created by wilhelm 2014-12-12.
 */
class HotelSpecification extends Specification {
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
