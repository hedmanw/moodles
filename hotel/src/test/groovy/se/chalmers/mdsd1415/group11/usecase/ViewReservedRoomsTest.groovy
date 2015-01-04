package se.chalmers.mdsd1415.group11.usecase

import datastructs.EArrayList
import hotelCore.Booking
import hotelCore.Room
import hotelCore.RoomType
import se.chalmers.mdsd1415.group11.HotelBaseSpecification

class ViewReservedRoomsTest extends HotelBaseSpecification {
    RoomType roomType
    Room room1
    Room room2
    Room room3

    def setup() {
        roomType = roomTypeManager.createSleepRoom("Double room", 1000, 2)
        room1 = roomManager.createRoom(1, roomType)
        room2 = roomManager.createRoom(2, roomType)
        room3 = roomManager.createRoom(3, roomType)
    }

    def "no reserved rooms"() {
        expect:
        roomManager.getReservedRooms(from, to).isEmpty()

        where:
        from << [today -1, today, tomorrow]
        to << [today, today, tomorrow+1]
    }

    def "currently reserved rooms"() {
        setup:
        Booking booking = bookingManager.createBooking()
        reservationManager.createReservation(booking, today, tomorrow, room1, roomType)
        bookingManager.allBookings.add(booking)

        expect:
        roomManager.getReservedRooms(today, tomorrow).size() == 1
        roomManager.getReservedRooms(today, tomorrow).get(0) == room1
        roomManager.getAvailableRooms(today, tomorrow, new EArrayList<RoomType>()).size() == 2
    }

    def "future and past reserved rooms"() {
        setup:
        Booking booking = bookingManager.createBooking()
        reservationManager.createReservation(booking, from, to, room1, roomType)
        bookingManager.allBookings.add(booking)

        expect:
        roomManager.getReservedRooms(today, tomorrow).isEmpty()

        where:
        from << [today-2, tomorrow+1]
        to << [today-1, tomorrow+2]
    }
}
