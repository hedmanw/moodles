package se.chalmers.mdsd1415.group11.usecase


import bankingService.CustomerProvides
import datastructs.EArrayList
import hotelCore.Customer
import hotelCore.Room
import hotelCore.RoomType
import se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires
import se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires
import se.chalmers.mdsd1415.group11.HotelBaseSpecification

/**
 * Created by emmawestman on 14-12-15.
 */
class MakeABookingTest extends HotelBaseSpecification {

    def bank = CustomerRequires.instance()
    RoomType roomType
    Customer customer

    def setup() {
        AdministratorRequires.instance().addCreditCard("1123", "123", 1, 16, "Robert Cecil", "Martin")
        AdministratorRequires.instance().addCreditCard("11456", "456", 1, 16, "Jonathan", "Hedman")
        AdministratorRequires.instance().makeDeposit("11456", "456", 1, 16, "Jonathan", "Hedman", 30000000);
        AdministratorRequires.instance().makeDeposit("1123", "123", 1, 16, "Robert Cecil", "Martin", 30000000);

        roomType = roomTypeManager.createSleepRoom("double room", 1000, 2)
        customer = customerManager.createCustomer("2", "Jonathan Hedman")
        customerManager.setPaymentDetailsForCustomer(customer, "Jonathan", "Hedman", "11456", "456", 1, 16)

    }

    def "success scenario with new customer"() {
        setup:
        Room room = roomManager.createRoom(1, roomType)
        Room room2 = roomManager.createRoom(2, roomType)
        Customer bookingOwner = customerManager.createCustomer("1", "Robert C. Martin")
        customerManager.setPaymentDetailsForCustomer(bookingOwner, "Robert Cecil", "Martin", "1123", "123", 1, 16)

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

    def "success scenario with existing customer"() {
        setup:
        bank.isCreditCardValid(customer.paymentDetails.ccNumber, customer.paymentDetails.ccv, customer.paymentDetails.expiryMonth,
            customer.paymentDetails.expiryYear, customer.paymentDetails.firstName, customer.paymentDetails.lastName)
        Room room = roomManager.createRoom(1, roomType)
        Room room2 = roomManager.createRoom(2, roomType)

        when: "Reservations are made for the booking..."
        def booking = bookingManager.createBooking()
        reservationManager.createReservation(booking, today, tomorrow, room, roomType)
        reservationManager.createReservation(booking, today, tomorrow, room2, roomType)

        then: "...the preliminary bill is correct"
        booking.getBill().getGrandTotal() == 2000

        when: "The customer is searched by ID and added to the booking..."
        def customer2 = customerManager.getCustomerByIdNumber("2")
        booking.setCustomer(customer2)

        then: "...the bill is still correct"
        customer2 ==  customer
        booking.getBill().getGrandTotal() == 2000

        expect: "Booking UUID unique, rooms valid, payment valid"
        bookingManager.confirmBooking(booking)
    }

    def "Multiple bookings fail"(){
        setup:
        bank.isCreditCardValid("1123", "123", 1, 16, "Robert Cecil", "Martin")
        bank.isCreditCardValid("11456", "456", 1, 16, "Jonathan", "Hedman")
        Room room = roomManager.createRoom(1, roomType)
        Room room2 = roomManager.createRoom(2, roomType)
        Customer bookingOwner = customerManager.createCustomer("1", "Robert C. Martin")
        customerManager.setPaymentDetailsForCustomer(bookingOwner, "Robert Cecil", "Martin", "1123", "123", 1, 16)

        when: "When two bookings are made simultaneously, it's first come first serve"
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
        thrown(IllegalArgumentException)
        bookingStatus
        !bookingFailedStatus
    }

    def "no rooms available"(){
        expect: roomManager.getAvailableRooms(today, tomorrow, new EArrayList<RoomType>()).size() == 0
    }

}
