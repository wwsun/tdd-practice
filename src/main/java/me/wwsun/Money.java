package me.wwsun;

/**
 * Created by Weiwei on 2015/2/14.
 */
public class Money {
    protected int amount;

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount && getClass().equals(money.getClass());
    }
}
