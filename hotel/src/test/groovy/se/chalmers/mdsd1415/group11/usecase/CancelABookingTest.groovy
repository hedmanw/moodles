package se.chalmers.mdsd1415.group11.usecase

import bankingService.BankingSingleton
import bankingService.CustomerProvides
import hotelCore.Booking
import hotelCore.Customer
import hotelCore.Room
import hotelCore.RoomType
import se.chalmers.mdsd1415.group11.HotelBaseSpecification

/**
 * Created by Sofia Edström on 06/01/15.
 */
class CancelABookingTest extends HotelBaseSpecification{
    def bank = Mock(CustomerProvides)
    RoomType roomType
    Customer customer
    Room room



    def setup(){
        BankingSingleton.instance.CUSTOMER_PROVIDES = bank

        roomType = roomTypeManager.createSleepRoom("double room", 1000, 2)
        room = roomManager.createRoom(1, roomType)
        customer = customerManager.createCustomer("1", "Robert C. Martin")
        customerManager.setPaymentDetailsForCustomer(customer, "Robert Cecil", "Martin", "123", "123", 1, 2016)
        bank.isCreditCardValid("123", "123", 1, 2016, "Robert Cecil", "Martin") >> true

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
