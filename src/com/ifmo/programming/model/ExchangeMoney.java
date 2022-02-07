package com.ifmo.programming.model;

import com.ifmo.programming.utility.PersonAbstract;

public class ExchangeMoney {
    private ExchangeMoney() {}
    public static void reseiveMoney(PersonAbstract recipiend,PersonAbstract recipiend1) {
        recipiend1.betterBusinessSuccess();
        recipiend.betterBusinessSuccess();
    }
    public static void giveMoney(PersonAbstract giver, PersonAbstract recipiend, PersonAbstract recipiend1, int profit) {
        System.out.println(giver.getName() + " дал " + recipiend.getName() + " и " + recipiend1.getName() + " " + profit);
        ExchangeMoney.reseiveMoney(recipiend,recipiend1);
        giver.worseBusinessSuccess();
        giver.haveMoney(-profit);
        recipiend.haveMoney(profit/2);
        recipiend1.haveMoney(profit/2);
    }
    public static void willGiveMoney(PersonAbstract giver, PersonAbstract recipiend, PersonAbstract recipiend1, int profit) {
        System.out.println(giver.getName() + " даст " + recipiend.getName() + " и " + recipiend1.getName() + " " + profit);
    }
}



