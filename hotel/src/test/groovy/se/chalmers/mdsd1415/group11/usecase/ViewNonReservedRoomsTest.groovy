package se.chalmers.mdsd1415.group11.usecase

import bankingService.BankingSingleton
import bankingService.CustomerProvides
import datastructs.EArrayList
import hotelCore.Customer
import hotelCore.Room
import hotelCore.RoomType
import org.eclipse.emf.common.util.EList
import se.chalmers.mdsd1415.group11.HotelBaseSpecification

/**
 * Created by Hanna on 14-12-17.
 */
class ViewNonReservedRoomsTest  extends HotelBaseSpecification {
    def bank = Mock(CustomerProvides)

    def setup() {
        BankingSingleton.instance.CUSTOMER_PROVIDES = bank
    }

    def "success scenario"() {
        setup:
        bank.isCreditCardValid("123", "123", 1, 2016, "Robert Cecil", "Martin") >> true
        def roomType = roomTypeManager.createSleepRoom("double room", 1000, 2)
        Room room = roomManager.createRoom(1, roomType)
        Room room2 = roomManager.createRoom(2, roomType)
        Customer bookingOwner = customerManager.createCustomer("1", "Robert C. Martin")
        customerManager.setPaymentDetailsForCustomer(bookingOwner, "Robert Cecil", "Martin", "123", "123", 1, 2016)

        when:
        def booking = bookingManager.createBooking()
        reservationManager.createReservation(booking, today, tomorrow, room, roomType)
        def customer = customerManager.getCustomerByIdNumber("1")
        booking.setCustomer(customer)
        EList<RoomType> roomList = new EArrayList<>()
        roomList.add(roomType)

        then:
        bookingManager.confirmBooking(booking)
        roomManager.getAvailableRooms(today,tomorrow,roomList).size()==1


    }

}
