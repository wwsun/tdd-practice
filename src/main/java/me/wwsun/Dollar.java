package me.wwsun;


/**
 * Created by Weiwei on 2015/2/14.
 */
public class Dollar extends Money {

    Dollar(int amount) {
        this.amount = amount;
    }

    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

}
