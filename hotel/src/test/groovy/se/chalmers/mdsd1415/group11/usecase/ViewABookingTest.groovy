package se.chalmers.mdsd1415.group11.usecase


import bankingService.CustomerProvides
import hotelCore.Customer
import hotelCore.Room
import se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires
import se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires
import se.chalmers.mdsd1415.group11.HotelBaseSpecification

public class ViewABookingTest extends HotelBaseSpecification {
    def booking
    def bank = CustomerRequires.instance()

    def setup() {
        AdministratorRequires.instance().addCreditCard("1123", "123", 1, 16, "Robert Cecil", "Martin")
    }

    def "success scenario"() {
        setup:
        bank.isCreditCardValid("1123", "123", 1, 16, "Robert Cecil", "Martin") >> true
        def roomType = roomTypeManager.createSleepRoom("double room", 1000, 2)
        Room room = roomManager.createRoom(1, roomType)
        Customer bookingOwner = customerManager.createCustomer("1", "Robert C. Martin")
        customerManager.setPaymentDetailsForCustomer(bookingOwner, "Robert Cecil", "Martin", "1123", "123", 1, 16)
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
