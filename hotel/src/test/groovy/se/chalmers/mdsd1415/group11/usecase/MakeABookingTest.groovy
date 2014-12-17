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
        customerManager.setPaymentDetailsForCustomer(bookingOwner, "Robert Cecil", "Martin", "123", "123", 1, 2016)

        when: "Reservations are made for the booking..."
        def booking = bookingManager.createBooking()
        reservationManager.createReservation(booking, today, tomorrow, room, roomType)
        reservationManager.createReservation(booking, today, tomorrow, room2, roomType)

        then: "...the preliminary bill is correct"
        booking.getBill().getGrandTotal() == 2000

        when: "The customer is searched by ID and added to the booking..."
        def customer = customerManager.getCustomerByIdNumber("1")
        booking.setCustomer(customer)

        then: "...the bill is still correct"
        customer == bookingOwner
        booking.getBill().getGrandTotal() == 2000

        expect: "Booking UUID unique, rooms valid, payment valid"
        bookingManager.confirmBooking(booking)
    }

    def "Multiple bookings fail"(){
        setup:
        bank.isCreditCardValid("123", "123", 1, 2016, "Robert Cecil", "Martin") >> true
        bank.isCreditCardValid("124", "124", 1, 2016, "Karl", "Hern") >> true
        def roomType = roomTypeManager.createRoomType("double room", 1000)
        Room room = roomManager.createRoom(1, roomType)
        Room room2 = roomManager.createRoom(2, roomType)
        Customer bookingOwner = customerManager.createCustomer("1", "Robert C. Martin")
        customerManager.setPaymentDetailsForCustomer(bookingOwner, "Robert Cecil", "Martin", "123", "123", 1, 2016)
        Customer bookingOwner2 = customerManager.createCustomer("2", "Karl Hern")
        customerManager.setPaymentDetailsForCustomer(bookingOwner2, "Karl", "Hern", "124", "124", 1, 2016)


        when: "Reservations are made for two bookings and are asserted"
        def booking = bookingManager.createBooking()
        reservationManager.createReservation(booking, today, tomorrow, room, roomType)
        reservationManager.createReservation(booking, today, tomorrow, room2, roomType)
        def customer = customerManager.getCustomerByIdNumber("1")
        booking.setCustomer(customer)
        def booking2 = bookingManager.createBooking()
        reservationManager.createReservation(booking2, today, tomorrow, room, roomType)
        def customer2 = customerManager.getCustomerByIdNumber("2")
        booking2.setCustomer(customer2)
        boolean bookingStatus = bookingManager.confirmBooking(booking)
        boolean bookingFailedStatus = bookingManager.confirmBooking(booking2)

        then:
        thrown(RuntimeException)
        bookingStatus
    }

}
