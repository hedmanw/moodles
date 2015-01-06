package se.chalmers.mdsd1415.group11.usecase

import hotelCore.Customer
import hotelCore.Room
import hotelCore.RoomType
import se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires
import se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires
import se.chalmers.mdsd1415.group11.HotelBaseSpecification

/**
 * Created by Sofia Edström on 06/01/15.
 */
class CancelABookingTest extends HotelBaseSpecification{
    RoomType roomType
    Customer customer
    Room room
    def bank = CustomerRequires.instance()



    def setup(){
        roomType = roomTypeManager.createSleepRoom("double room", 1000, 2)
        room = roomManager.createRoom(1, roomType)
        customer = customerManager.createCustomer("1", "Robert C. Martin")
        AdministratorRequires.instance().addCreditCard("1123", "123", 1, 16, "Robert Cecil", "Martin")
        AdministratorRequires.instance().makeDeposit("1123", "123", 1, 16, "Robert Cecil", "Martin", 30000000)
        customerManager.setPaymentDetailsForCustomer(customer, "Robert Cecil", "Martin", "1123", "123", 1, 16)
        bank.isCreditCardValid(customer.paymentDetails.ccNumber, customer.paymentDetails.ccv, customer.paymentDetails.expiryMonth,
                customer.paymentDetails.expiryYear, customer.paymentDetails.firstName, customer.paymentDetails.lastName)

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

        setup:
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
