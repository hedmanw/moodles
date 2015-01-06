package se.chalmers.mdsd1415.group11.usecase

import bankingService.BankingSingleton
import bankingService.CustomerProvides
import datastructs.EArrayList
import hotelCore.Booking
import hotelCore.Customer
import hotelCore.Reservation
import hotelCore.Room
import hotelCore.RoomType
import org.eclipse.emf.common.util.EList
import se.chalmers.mdsd1415.group11.HotelBaseSpecification

class ViewNonReservedRoomsTest  extends HotelBaseSpecification {
    Booking booking
    Room room
    RoomType roomType
    Room room2
    RoomType roomType2
    Date yesterday

    def setup() {
        roomType = roomTypeManager.createSleepRoom("Double room", 1000, 2)
        room = roomManager.createRoom(1, roomType)
        roomType2 = roomTypeManager.createSleepRoom("Single room", 500, 1)
        room2 = roomManager.createRoom(2, roomType2)
        booking = bookingManager.createBooking()
        yesterday = new Date()-1
    }

    def "success scenario"() {
        when:
        def searchCriteria = new EArrayList<RoomType>()
        searchCriteria.add(roomType)
        def availableRooms = roomManager.getAvailableRooms(today, tomorrow, new EArrayList<RoomType>())

        then:
        availableRooms.size() == 2
        availableRooms.get(0) == room

        when:
        Reservation reservation = reservationManager.createReservation(booking, today, tomorrow, availableRooms.get(0), roomType)
        bookingManager.allBookings.add(booking)
        def availableRooms2 = roomManager.getAvailableRooms(today, tomorrow, new EArrayList<RoomType>())

        then:
        availableRooms2.size() == 1
        availableRooms2.get(0) == room2

    }

    def "Invalid date range"(){
        when:
        def searchCriteria = new EArrayList<RoomType>()
        searchCriteria.add(roomType)
        def availableRooms = roomManager.getAvailableRooms(today, yesterday, new EArrayList<RoomType>())

        then:
        thrown(IllegalArgumentException)

    }

}
