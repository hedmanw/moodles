package se.chalmers.mdsd1415.group11.usecase

import hotelCore.Booking
import hotelCore.Reservation
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
        Booking booking = bookingManager.createBooking()

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
}
