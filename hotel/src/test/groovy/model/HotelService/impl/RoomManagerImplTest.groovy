package model.HotelService.impl

import base.HotelSpecification
import util.EArrayList
import model.HotelCore.RoomType

/**
 * Created by wilhelm 2014-12-12.
 */
class RoomManagerImplTest extends HotelSpecification {
    Date today = new Date()
    Date tomorrow = new Date()+1

    def "getAvailableRooms is empty when there are no rooms in the hotel"() {
        setup:
        roomManager.getAllRooms().clear()

        expect:
        roomManager.getAvailableRooms(today, tomorrow, roomTypeManager.getAllRoomTypes()).isEmpty()
    }

    def "getAvailableRooms returns the correct RoomType"() {
        setup:
        def a = roomTypeManager.createRoomType("A", 10)
        def b = roomTypeManager.createRoomType("B", 20)
        roomManager.createRoom(1, a)
        roomManager.createRoom(2, b)

        when:
        def searchCriteria = new EArrayList<RoomType>()
        searchCriteria.add(a)
        def results = roomManager.getAvailableRooms(today, tomorrow, searchCriteria)

        then:
        results.size() == 1
        results.get(0).getRoomType() == a
    }

    def "silly dates throw"() {
        when:
        roomManager.getAvailableRooms(tomorrow, today, roomTypeManager.getAllRoomTypes())

        then:
        thrown(IllegalArgumentException)
    }
}
