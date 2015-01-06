package se.chalmers.mdsd1415.group11.usecase

import hotelCore.Booking
import hotelCore.Reservation
import se.chalmers.mdsd1415.group11.HotelBaseSpecification

/**
 * Created by Julia on 15-01-06.
 */
class TabTest extends HotelBaseSpecification {
    def roomType
    def room
    Booking booking
    Reservation reservation

    def setup() {
        roomType = roomTypeManager.createSleepRoom("Double room", 1000, 2)
        room = roomManager.createRoom(501, roomType)
        booking = bookingManager.createBooking()
        reservation = reservationManager.createReservation(booking, today, today + 4, room, roomType)
    }

    def "add item to tab"() {
        setup:
        def tabItemName = "Vodka"
        double tabItemCost = 14.6

        when: "item is added to tab for the reservation"
        reservation.getTab().getTabItems().put(tabItemName,tabItemCost)

        then: "...item is added to tab"
        reservation.getTab().getTabItems().get(0).getKey().equalsIgnoreCase("Vodka")
        reservation.getTab().getTabItems().get(0).getValue() == 14.6
    }

    def "remove item from tab"() {
        setup:
        def tabItemName = "Vodka"
        double tabItemCost = 14.6
        reservation.getTab().getTabItems().put(tabItemName,tabItemCost)

        when: "item is removed from tab for the reservation"
        reservation.getTab().getTabItems().remove(0)

        then: "...item is removed from tab"
        reservation.getTab().getTabItems().size() == 0
    }

}
