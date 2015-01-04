package se.chalmers.mdsd1415.group11.model.HotelCore.impl

import hotelCore.Bill
import hotelCore.HotelCoreFactory
import spock.lang.Specification

/**
 * Created by wilhelm on 12/10/14.
 */
class BillImplTest extends Specification {
    Bill bill;

    def setup() {
        bill = HotelCoreFactory.eINSTANCE.createBill()
    }

    def "GetPaid"() {
        when:
        bill.pay(5)

        then:
        bill.getPaid() == 5

        when:
        bill.pay(0)

        then:
        bill.getPaid() == 5
    }

    def "SetPaid"() {
        when:
        bill.setPaid(cash)

        then:
        bill.getPaid() == cash

        where:
        cash << [0d, 1d, 2d, 899.5d, 1000d, 50000.5d]
    }

    def "GetGrandTotal"() {
        expect:
        bill.getGrandTotal() == 0

        when:
        bill.addToBill(500)

        then:
        bill.getGrandTotal() == 500
    }

    def "SetGrandTotal"() {
        when:
        bill.setGrandTotal(500)

        then:
        bill.getGrandTotal() == 500
    }

    def "AddToBill"() {
        when:
        bill.addToBill(50)

        then:
        bill.getGrandTotal() == 50

        when:
        bill.addToBill(50)

        then:
        bill.getGrandTotal() == 100
    }

    def "IsPaid"() {
        when:
        bill.addToBill(50)

        then:
        !bill.isPaid()

        when:
        bill.pay(50)

        then:
        bill.isPaid()
    }

    def "RemoveFromBill"() {
        when:
        bill.setGrandTotal(100)
        bill.removeFromBill(20)

        then:
        bill.getGrandTotal() == 80
    }

    def "LeftToPay"() {
        expect:
        bill.leftToPay() == 0

        when:
        bill.setGrandTotal(100)

        then:
        bill.leftToPay() == 100

        when:
        bill.pay(20)

        then:
        bill.leftToPay() == 80

        when:
        bill.pay(80)

        then:
        bill.leftToPay() == 0
        bill.isPaid()
    }

    def "Pay"() {
        when:
        bill.pay(20)

        then:
        bill.getPaid() == 20

        when:
        bill.pay(20)

        then:
        bill.getPaid() == 40
    }
}
