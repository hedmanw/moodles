import HotelSystem.HotelSystemFactory
import HotelSystem.Room
import HotelSystem.RoomManager
import HotelSystem.RoomType
import HotelSystem.RoomTypeManager
import spock.lang.Specification

/**
 * Created by emmawestman on 14-12-12.
 */
class ReserveARoomTest extends Specification{
    RoomManager roomManager
    RoomTypeManager roomTypeManager

    def setup() {
        roomManager = HotelSystemFactory.eINSTANCE.createRoomManager()
        roomTypeManager = HotelSystemFactory.eINSTANCE.createRoomTypeManager()
    }

    def "success scenario"() {
        when:
        Room room = HotelSystemFactory.eINSTANCE.createRoom()
        RoomType roomType = HotelSystemFactory.eINSTANCE.createRoomType()
        roomTypeManager.roomType.add(roomType)
        roomType.costPerNight = 1000
        room.roomNumber = 1
        room.roomType = roomType
        roomManager.getRoom().add(room)
        //TODO implement get available rooms with search feature
        def availableRooms = roomManager.getAvailableRooms(new Date(), new Date()+1, roomTypeManager.roomType)
        then:
        availableRooms.size() == 1

    }
}
