package me.wwsun;

/**
 * Created by Weiwei on 2015/2/14.
 */
public class Franc extends Money {

    Franc(int amount) {
        this.amount = amount;
    }

    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

}
