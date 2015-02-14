package me.wwsun;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by Weiwei on 2015/2/14.
 *
 * Todo: $5 + 10 CHF = $10 if rate is 2:1
 * 01: 5*2 = $10
 * 04: make amount private
 * 02: Dollar side-effects?
 * Todo: Money rounding?
 * 03: equals
 * Todo: hashCode()
 * Todo: Equal null
 * Todo: Equal object
 * 05: 5 CHF * 2 = 10 CHF
 * Todo: Dollar/Franc duplication
 * 06: Common equals
 * Todo: Common times
 *
 */
public class CurrencyTest extends TestCase {

    /**
     * Create the test case
     * @param testName name of the test case
     */
    public CurrencyTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CurrencyTest.class );
    }

    public void testMultiplication() {
        Dollar five = new Dollar(5);

        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }

    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));

        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));
    }

}
