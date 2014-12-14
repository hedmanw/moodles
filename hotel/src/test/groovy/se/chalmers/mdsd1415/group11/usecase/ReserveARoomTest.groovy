package se.chalmers.mdsd1415.group11.usecase

import hotelCore.Room
import hotelCore.RoomType
import se.chalmers.mdsd1415.group11.HotelBaseSpecification
import datastructs.EArrayList

/**
 * Created by emmawestman on 14-12-12.
 */
class ReserveARoomTest extends HotelBaseSpecification {

    def "success scenario"() {
        setup:
        RoomType roomType = roomTypeManager.createRoomType("Double room", 1000)
        Room room = roomManager.createRoom(1, roomType)

        when:
        def searchCriteria = new EArrayList<RoomType>()
        searchCriteria.add(roomType)
        def availableRooms = roomManager.getAvailableRooms(today, tomorrow, searchCriteria)

        then:
        availableRooms.size() == 1
    }
}
