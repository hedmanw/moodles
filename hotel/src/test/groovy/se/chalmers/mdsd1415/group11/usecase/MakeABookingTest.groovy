package se.chalmers.mdsd1415.group11.usecase

import hotelCore.Customer
import hotelCore.Room
import hotelCore.RoomType
import hotelService.BookingManager
import hotelService.CustomerManager
import hotelService.RoomManager
import se.chalmers.mdsd1415.group11.HotelBaseSpecification

/**
 * Created by emmawestman on 14-12-15.
 */
class MakeABookingTest extends HotelBaseSpecification {

    def "success scenario"() {

        setup:
        def roomType = roomTypeManager.createRoomType("double room", 1000)
        Room room = roomManager.createRoom(1, roomType)
        Room room2 = roomManager.createRoom(2, roomType)
        Customer bookingOwner = customerManager.createCustomer("1", "Customer")

                when:
        def booking = bookingManager.createBooking()
        reservationManager.createReservation(booking, today, tomorrow, room, roomType)
        reservationManager.createReservation(booking, today, tomorrow, room2, roomType)

        then:
        booking.getBill().getGrandTotal() == 2000

        when:
        def customer = customerManager.getCustomerByIdNumber("1")

        then:
        customer == bookingOwner

        when:
        booking.setCustomer(customer)

        then:
        true
        //TODO check credit card
        booking.getBill().getGrandTotal() == 2000




    }

}
