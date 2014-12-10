package HotelSystem.impl

import HotelSystem.HotelSystemFactory
import spock.lang.Specification

/**
 * Created by wilhelm on 12/10/14.
 */
class BillImplTest extends Specification {
    def bill = HotelSystemFactory.eINSTANCE.createBill();

    def "GetPaid"() {
        when:
        bill.pay(5)

        then:
        bill.paid == 5
    }

    def "SetPaid"() {

    }

    def "GetGrandTotal"() {

    }

    def "SetGrandTotal"() {

    }

    def "AddToBill"() {

    }

    def "IsPaid"() {

    }

    def "RemoveFromBill"() {

    }

    def "LeftToPay"() {

    }

    def "Pay"() {

    }
}
