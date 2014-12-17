package se.chalmers.mdsd1415.group11.usecase

import bankingService.BankingSingleton
import bankingService.CustomerProvides
import hotelCore.impl.TabImpl
import se.chalmers.mdsd1415.group11.HotelBaseSpecification

/**
 * Created by Oskar on 14-12-12.
 */
class CheckOutTest extends HotelBaseSpecification {
    def bank = Mock(CustomerProvides)

    def setup() {
        def roomType = roomTypeManager.createSleepRoom("Double room", 1000, 2)
        def room = roomManager.createRoom(501, roomType)
        def booking = bookingManager.createBooking()
        BankingSingleton.instance.CUSTOMER_PROVIDES = bank
        def customer = customerManager.createCustomer("123456789", "herp derp")
        customerManager.setPaymentDetailsForCustomer(customer, "herp", "derp", "0987123498762345", "345", 12, 15)
        booking.setCustomer(customer)
        def reservation = reservationManager.createReservation(booking, today-3, today+1, room, roomType)
        bookingManager.allBookings.add(booking)
        reservation.setCheckedIn(today-3)
    }

    def "success scenario"() {
        when:
        def reservation = reservationManager.getCurrentReservationByRoomNumber(501)

        then:
        reservation.getRoom().getRoomNumber() == 501

        when:
        reservationManager.checkOutReservation(reservation)

        then:
        reservation.checkedOut != null

    }

    def "no reservation exists"() {
        when:
        def reservation = reservationManager.getCurrentReservationByRoomNumber(500)

        then:
        final IllegalArgumentException exception = thrown()
    }

    def "check out is too late"() {
        setup:
        def reservation = reservationManager.getCurrentReservationByRoomNumber(501)

        when:
        reservation.endDay = day
        reservation.tab = new TabImpl()
        def currentCost = reservation.getTab().getTotalCost()
        reservationManager.checkOutReservation(reservation)

        then:
        currentCost < reservation.getTab().getTotalCost()

        where:
        day << [today-1, today-2]
    }
}
