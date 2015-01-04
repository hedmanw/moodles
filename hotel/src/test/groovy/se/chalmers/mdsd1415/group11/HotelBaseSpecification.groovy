package se.chalmers.mdsd1415.group11

import hotelService.BookingManager
import hotelService.CustomerManager
import hotelService.ManagerSingleton
import hotelService.ReservationManager
import hotelService.RoomManager
import hotelService.RoomTypeManager
import spock.lang.Shared
import spock.lang.Specification

/**
 * Created by wilhelm 2014-12-12.
 */
class HotelBaseSpecification extends Specification {
    RoomManager roomManager
    RoomTypeManager roomTypeManager
    ReservationManager reservationManager
    BookingManager bookingManager
    CustomerManager customerManager
    @Shared
    Date today = new Date()
    @Shared
    Date tomorrow = new Date()+1

    def setup() {
        roomManager = ManagerSingleton.instance.ROOM_MANAGER
        roomTypeManager = ManagerSingleton.instance.ROOM_TYPE_MANAGER
        reservationManager = ManagerSingleton.instance.RESERVATION_MANAGER
        bookingManager = ManagerSingleton.instance.BOOKING_MANAGER
        customerManager = ManagerSingleton.instance.CUSTOMER_MANAGER

        bookingManager.allBookings.clear()
        roomTypeManager.allRoomTypes.clear()
        roomManager.allRooms.clear()
        reservationManager.allReservations.clear()
        customerManager.allCustomers.clear()
    }

    def "this method has to be here..."() {
        expect:
        true
    }
}
