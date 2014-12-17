package se.chalmers.mdsd1415.group11.usecase

import hotelCore.Booking
import hotelCore.Reservation
import hotelCore.Room
import hotelCore.RoomType
import hotelService.RoomManager
import hotelService.RoomTypeManager
import se.chalmers.mdsd1415.group11.HotelBaseSpecification
import datastructs.EArrayList

/**
 * Created by emmawestman on 14-12-12.
 */
class ReserveARoomTest extends HotelBaseSpecification {

    Booking booking
    Room room
    RoomType roomType


    def  setup() {
        roomType = roomTypeManager.createSleepRoom("Double room", 1000, 2)
        room = roomManager.createRoom(1, roomType)
        booking = bookingManager.createBooking()
    }


    def "success scenario"() {

        when:
        def searchCriteria = new EArrayList<RoomType>()
        searchCriteria.add(roomType)
        def availableRooms = roomManager.getAvailableRooms(today, tomorrow, searchCriteria)

        then:
        availableRooms.size() == 1
        availableRooms.get(0) == room

        when:
        Reservation reservation = reservationManager.createReservation(booking, today, tomorrow, availableRooms.get(0), roomType)

        then:
        reservation.getStartDay() == today
        reservation.getEndDay()  == tomorrow
        reservation.getRoom() == room
        reservation.getRoom().getRoomType() == roomType
        booking.getReservations().size() == 1
        booking.getReservations().get(0) == reservation
        booking.getBill().getGrandTotal() == 1000
    }

    def "no rooms available"() {
        setup:
        def searchCriteria = new EArrayList<RoomType>()
        searchCriteria.add(roomType)
        def availableRooms = roomManager.getAvailableRooms(today, tomorrow, searchCriteria)
        Reservation reservation = reservationManager.createReservation(booking, today, tomorrow, availableRooms.get(0), roomType)
        bookingManager.allBookings.add(booking)

        expect:
        roomManager.getAvailableRooms(today, tomorrow, searchCriteria).isEmpty()
    }

    def "conference room"() {
        setup:
        RoomType roomType2 = roomTypeManager.createConferenceRoom("room 1", 50, 1000)
        Room room2 = roomManager.createRoom(4, roomType2)
        Booking booking2 = bookingManager.createBooking()
        def searchCriteria2 = new EArrayList<RoomType>()
        searchCriteria2.add(roomType2)
        def availableRooms = roomManager.getAvailableRooms(today, tomorrow, searchCriteria2)
        bookingManager.allBookings.add(booking2)

        when:
        Reservation reservation2 = reservationManager.createReservation(booking2, today, tomorrow, availableRooms.get(0), roomType2)

        then:
        reservation2.getStartDay() == today
        reservation2.getEndDay()  == tomorrow
        reservation2.getRoom() == room2
        reservation2.getRoom().getRoomType() == roomType2
        booking2.getReservations().size() == 1
        booking2.getReservations().get(0) == reservation2
        booking2.getBill().getGrandTotal() == 1000
    }

    def "no room with desired room type"() {
        setup:
        def searchCriteria = new EArrayList<RoomType>()
        searchCriteria.add(roomType)
        def availableRooms = roomManager.getAvailableRooms(today, tomorrow, searchCriteria)
        Reservation reservation = reservationManager.createReservation(booking, today, tomorrow, availableRooms.get(0), roomType)
        bookingManager.allBookings.add(booking)
        roomManager.createRoom(2, roomTypeManager.createSleepRoom("Suite", 10000, 2))

        expect:
        roomManager.getAvailableRooms(today, tomorrow, new EArrayList<RoomType>()).size() == 1
    }
}
