package me.wwsun;

/**
 * Created by Weiwei on 2015/2/14.
 */
public class Dollar {
    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
