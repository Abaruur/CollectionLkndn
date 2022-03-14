package com.baruur.collections;

import com.baruur.collections.Units;

public class Runnable {
    public static void main(String[] args) {
        Units cambridge = new Units("Cambridge", "Premiere Room", 4, 175.00);
        Units manchester = new Units("Manchester", "Suite", 5, 250.0);

        double total = getPotentialRevenue(cambridge, manchester);
        System.out.println(total);
    }
    private static double getPotentialRevenue(Units units1, Units units2)
    {
        return units1.getRate() + units2.getRate();
    }
}
