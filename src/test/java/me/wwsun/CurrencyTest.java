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
 * 08-10: Common times
 * 07: Compare Francs with Dollars
 * Todo: Currency?
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
        Money five = Money.dollar(5);

        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    public void testFrancMultiplication() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));

        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));

        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    public void testDifferentClassEquality() {
        assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
    }

}
