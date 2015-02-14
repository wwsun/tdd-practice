package me.wwsun;


/**
 * Created by Weiwei on 2015/2/14.
 */
public class Bank {

    /**
     *
     * @param source
     * @param to target currency
     * @return sum with the specified currency
     */
    Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
