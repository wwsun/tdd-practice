package me.wwsun;

/**
 * Created by Weiwei on 2015/2/14.
 */
public interface Expression {
    Money reduce(Bank bank, String to);
}
