package se.chalmers.mdsd1415.group11.usecase


import bankingService.CustomerProvides
import hotelCore.Customer
import hotelCore.Room
import se.chalmers.mdsd1415.group11.HotelBaseSpecification

/**
 * Created by Hanna on 14-12-17.
 */
public class ViewABookingTest extends HotelBaseSpecification {
    def booking
    def bank = Mock(CustomerProvides)

    def setup() {
        BankingSingleton.instance.CUSTOMER_PROVIDES = bank
    }

    def "success scenario"() {
        setup:
        bank.isCreditCardValid("123", "123", 1, 2016, "Robert Cecil", "Martin") >> true
        def roomType = roomTypeManager.createSleepRoom("double room", 1000, 2)
        Room room = roomManager.createRoom(1, roomType)
        Customer bookingOwner = customerManager.createCustomer("1", "Robert C. Martin")
        customerManager.setPaymentDetailsForCustomer(bookingOwner, "Robert Cecil", "Martin", "123", "123", 1, 2016)
        booking = bookingManager.createBooking()
        def customer = customerManager.getCustomerByIdNumber("1")
        booking.setCustomer(customer)
        def reservation = reservationManager.createReservation(booking, today, tomorrow, room, roomType)

        when:
        bookingManager.confirmBooking(booking)
        def bookingNr = bookingManager.getBookingByBookingNumber(booking.getBookingUUID())

        then:
        bookingNr == booking
        bookingNr.getReservations().get(0) == reservation
    }
}
