package me.wwsun;

/**
 * Created by Weiwei on 2015/2/14.
 */
public class Franc extends Money {

    Franc(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    String currency() {
        return currency;
    }

}
