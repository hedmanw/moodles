package hotelService.impl

import datastructs.EArrayList
import hotelCore.Room
import hotelCore.RoomType
import se.chalmers.mdsd1415.group11.HotelBaseSpecification

/**
 * Created by wilhelm 2014-12-12.
 */
class RoomManagerImplTest extends HotelBaseSpecification {
    Date today = new Date()
    Date tomorrow = new Date()+1
    RoomType a
    RoomType b
    Room one
    Room two
    def searchCriteria = new EArrayList<RoomType>()

    def setup() {
        a = roomTypeManager.createRoomType("A", 10)
        b = roomTypeManager.createRoomType("B", 20)
        one = roomManager.createRoom(1, this.a)
        two = roomManager.createRoom(2, this.b)
        searchCriteria.add(a)
    }

    def "is empty when there are no rooms in the hotel"() {
        setup:
        roomManager.getAllRooms().clear()

        expect:
        roomManager.getAvailableRooms(today, tomorrow, roomTypeManager.getAllRoomTypes()).isEmpty()
    }

    def "filters on RoomType"() {
        when:
        def results = roomManager.getAvailableRooms(today, tomorrow, searchCriteria)

        then:
        results.size() == 1
        results.get(0).getRoomType() == a
    }

    def "filters on date"() {
        setup:
        def booking = bookingManager.createBooking()
        reservationManager.createReservation(booking, today, tomorrow, one, a)

        when:
        def results = roomManager.getAvailableRooms(today, tomorrow, searchCriteria)

        then:
        results.isEmpty()
    }

    def "filters on multiple RoomType and date"() {

    }

    def "silly dates throw"() {
        when:
        roomManager.getAvailableRooms(tomorrow, today, roomTypeManager.getAllRoomTypes())

        then:
        thrown(IllegalArgumentException)
    }
}
