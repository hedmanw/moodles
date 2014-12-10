package se.chalmers.mdsd1415.group11;

import HotelSystem.Bill;
import HotelSystem.HotelSystemFactory;
import HotelSystem.impl.BillImpl;
import HotelSystem.impl.HotelSystemFactoryImpl;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Bill bill = HotelSystemFactory.eINSTANCE.createBill();
        bill.addToBill(5);
        assertEquals(5, bill.getGrandTotal());
    }
}
