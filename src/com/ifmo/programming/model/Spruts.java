package com.ifmo.programming.model;

import com.ifmo.programming.errors.OutOfMoneyError;
import com.ifmo.programming.utility.*;

public class Spruts extends PersonAbstract{
    private int money = 100000000;
    public Spruts(String name,BusinessSuccess success) {
        super(name, success);
    }
    public void prudently(){
        System.out.println(getName()+ " действует разумно и осмотрительно");
    }

    @Override
    public int haveMoney(int profit) throws OutOfMoneyError {
        money += profit;
        if (money >=  0){
            return money;
        }
        else {
            throw new OutOfMoneyError(getName() + " разорился. Деньги закончились!");
        }
    }

    @Override
    public void meet(PersonAbstract person1,PersonAbstract person2) {
        System.out.println(getName() + " встретился с " + person1 + " и " + person2);
    }

    @Override
    public void talk(String people) {
        System.out.println(getName() + " что-то сказал " + people);
    }


    @Override
    public void goTo(Locatoin locatoin ) {
        System.out.println(getName() + " пошел в " + locatoin.place);
    }

}