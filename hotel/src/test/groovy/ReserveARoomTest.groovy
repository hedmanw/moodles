import util.EArrayList
import model.HotelCore.Room
import model.HotelCore.RoomType
import model.HotelService.HotelServiceFactory
import model.HotelService.RoomManager
import model.HotelService.RoomTypeManager
import spock.lang.Specification

/**
 * Created by emmawestman on 14-12-12.
 */
class ReserveARoomTest extends Specification {
    RoomManager roomManager
    RoomTypeManager roomTypeManager

    def setup() {
        roomManager = HotelServiceFactory.eINSTANCE.createRoomManager()
        roomTypeManager = HotelServiceFactory.eINSTANCE.createRoomTypeManager()
    }

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
