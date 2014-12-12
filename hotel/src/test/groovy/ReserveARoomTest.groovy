import model.HotelCore.HotelCoreFactory
import model.HotelCore.Room
import model.HotelCore.RoomType
import model.HotelService.HotelServiceFactory
import model.HotelService.RoomManager
import model.HotelService.RoomTypeManager
import spock.lang.Specification

/**
 * Created by emmawestman on 14-12-12.
 */
class ReserveARoomTest extends Specification{
    RoomManager roomManager
    RoomTypeManager roomTypeManager

    def setup() {
        roomManager = HotelServiceFactory.eINSTANCE.createRoomManager()
        roomTypeManager = HotelServiceFactory.eINSTANCE.createRoomTypeManager()
    }

    def "success scenario"() {
        when:
        Room room = HotelCoreFactory.eINSTANCE.createRoom()
        RoomType roomType = HotelCoreFactory.eINSTANCE.createRoomType()
        roomTypeManager.getAllRoomTypes().add(roomType)
        roomType.costPerNight = 1000
        room.roomNumber = 1
        room.roomType = roomType
        roomManager.getAllRooms().add(room)
        //TODO implement get available rooms with search feature
        def availableRooms = roomManager.getAvailableRooms(new Date(), new Date()+1, roomTypeManager.getAllRoomTypes())
        then:
        availableRooms.size() == 1

    }
}
