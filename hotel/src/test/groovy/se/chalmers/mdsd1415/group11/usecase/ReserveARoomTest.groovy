package se.chalmers.mdsd1415.group11.usecase

import groovy.time.TimeCategory
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
        RoomType conferenceRoom = roomTypeManager.createConferenceRoom("Conference Room 1", 50, 1000)
        Room conferenceRoom1 = roomManager.createRoom(101, conferenceRoom)
        Booking booking = bookingManager.createBooking()
        def conferenceSearch = new EArrayList<RoomType>()
        conferenceSearch.add(conferenceRoom)
        def availableRooms = roomManager.getAvailableRooms(today, tomorrow, conferenceSearch)
        bookingManager.allBookings.add(booking)

        when:
        Date rightNow = new Date()

        Date afterAnHour
        use( TimeCategory ) {
            afterAnHour = rightNow + 1.hour
        }

        Reservation reservation = reservationManager.createReservation(booking, rightNow, afterAnHour, availableRooms.get(0), conferenceRoom)

        then:
        reservation.getStartDay() == rightNow
        reservation.getEndDay() == afterAnHour
        reservation.getRoom() == conferenceRoom1
        reservation.getRoom().getRoomType() == conferenceRoom
        booking.getReservations().size() == 1
        booking.getReservations().get(0) == reservation
        booking.getBill().getGrandTotal() == 1000
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
