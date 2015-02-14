package me.wwsun;


import java.util.Hashtable;

/**
 * Created by Weiwei on 2015/2/14.
 */
public class Bank {

    private Hashtable rates = new Hashtable();

    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), new Integer(rate));
    }

    int rate(String from, String to) {
        if (from.equals(to)) return 1;
        Integer rate = (Integer) rates.get(new Pair(from, to));
        return rate.intValue();
    }

    /**
     *
     * @param source
     * @param to target currency
     * @return sum with the specified currency
     */
    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

}
