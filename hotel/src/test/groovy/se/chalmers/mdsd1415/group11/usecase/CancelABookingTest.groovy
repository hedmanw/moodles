package se.chalmers.mdsd1415.group11.usecase

import hotelCore.Customer
import hotelCore.Room
import hotelCore.RoomType
import se.chalmers.mdsd1415.group11.HotelBaseSpecification

/**
 * Created by Sofia Edström on 06/01/15.
 */
class CancelABookingTest extends HotelBaseSpecification{
    RoomType roomType
    Customer customer
    Room room



    def setup(){
        roomType = roomTypeManager.createSleepRoom("double room", 1000, 2)
        room = roomManager.createRoom(1, roomType)
        customer = customerManager.createCustomer("1", "Robert C. Martin")
        customerManager.setPaymentDetailsForCustomer(customer, "Robert Cecil", "Martin", "123", "123", 1, 2016)

    }

    def "success scenario"(){

        setup:
        def booking = bookingManager.createBooking()
        reservationManager.createReservation(booking, today, tomorrow, room, roomType)

        def customer = customerManager.getCustomerByIdNumber("1")
        booking.setCustomer(customer)

        bookingManager.confirmBooking(booking)

        when:
        bookingManager.deleteBooking(booking)

        then:
        bookingManager.getAllBookings().isEmpty() >> true
    }

    def "no such booking exists"(){
        def booking = bookingManager.createBooking()
        reservationManager.createReservation(booking, today, tomorrow, room, roomType)

        def customer = customerManager.getCustomerByIdNumber("1")
        booking.setCustomer(customer)

        when:
        bookingManager.deleteBooking(booking)

        then:
        thrown(NullPointerException)
    }
}
