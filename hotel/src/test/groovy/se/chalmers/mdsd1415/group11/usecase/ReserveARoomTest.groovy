package se.chalmers.mdsd1415.group11.usecase

import se.chalmers.mdsd1415.group11.HotelBaseSpecification
import se.chalmers.mdsd1415.group11.util.EArrayList
import se.chalmers.mdsd1415.group11.model.HotelCore.Room
import se.chalmers.mdsd1415.group11.model.HotelCore.RoomType

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
        def availableRooms = roomManager.getAvailableRooms(new Date(), new Date()+1, searchCriteria)

        then:
        availableRooms.size() == 1
    }
}
