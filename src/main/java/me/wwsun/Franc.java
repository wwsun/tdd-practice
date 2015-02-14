package me.wwsun;

/**
 * Created by Weiwei on 2015/2/14.
 */
public class Franc extends Money {

    Franc(int amount, String currency) {
        super(amount, currency);
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }
}
