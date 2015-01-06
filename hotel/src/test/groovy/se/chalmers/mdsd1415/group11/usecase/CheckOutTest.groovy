package se.chalmers.mdsd1415.group11.usecase


import bankingService.CustomerProvides
import se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires
import se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires
import se.chalmers.mdsd1415.group11.HotelBaseSpecification

/**
 * Created by Oskar on 14-12-12.
 */
class CheckOutTest extends HotelBaseSpecification {

    def setup() {
        def roomType = roomTypeManager.createSleepRoom("Double room", 1000, 2)
        def room = roomManager.createRoom(501, roomType)
        def booking = bookingManager.createBooking()
        def customer = customerManager.createCustomer("123456789", "herp derp")
        AdministratorRequires.instance().addCreditCard("1187123498762345", "345", 12, 15, "herp", "derp")
        AdministratorRequires.instance().makeDeposit("1187123498762345", "345", 12, 15, "herp", "derp", 100000000)
        customerManager.setPaymentDetailsForCustomer(customer, "herp", "derp", "0987123498762345", "345", 12, 15)
        booking.setCustomer(customer)
        def reservation = reservationManager.createReservation(booking, today-3, today+1, room, roomType)
        bookingManager.allBookings.add(booking)
        reservation.setCheckedIn(today-3)
    }

    def "success scenario"() {
        when:
        def reservation = reservationManager.getCurrentReservationByRoomNumber(501)
        def bill = bookingManager.getBookingByReservation(reservation).getBill()

        then:
        reservation.getRoom().getRoomNumber() == 501
        !bill.isPaid()

        when:
        reservationManager.checkOutReservation(reservation)

        then:
        reservation.checkedOut != null
        bill.isPaid()
    }

    def "check out is too late"() {
        setup:
        def reservation = reservationManager.getCurrentReservationByRoomNumber(501)

        when:
        reservation.endDay = day
        def currentCost = reservation.getTab().getTotalCost()
        reservationManager.checkOutReservation(reservation)

        then:
        currentCost < reservation.getTab().getTotalCost()

        where:
        day << [today-1, today-2]
    }
}
