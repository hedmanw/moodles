package se.chalmers.mdsd1415.group11.usecase

import bankingService.BankingSingleton
import bankingService.CustomerProvides
import hotelCore.Customer
import hotelCore.Room
import se.chalmers.mdsd1415.group11.HotelBaseSpecification

/**
 * Created by emmawestman on 14-12-15.
 */
class MakeABookingTest extends HotelBaseSpecification {
    def bank = Mock(CustomerProvides)

    def setup() {
        BankingSingleton.instance.CUSTOMER_PROVIDES = bank
    }

    def "success scenario"() {
        setup:
        bank.isCreditCardValid("123", "123", 1, 2016, "Robert Cecil", "Martin") >> true
        def roomType = roomTypeManager.createRoomType("double room", 1000)
        Room room = roomManager.createRoom(1, roomType)
        Room room2 = roomManager.createRoom(2, roomType)
        Customer bookingOwner = customerManager.createCustomer("1", "Robert C. Martin")

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
        bank.isCreditCardValid("123", "123", 1, 2016, "Robert Cecil", "Martin")
        booking.getBill().getGrandTotal() == 2000
    }
}
