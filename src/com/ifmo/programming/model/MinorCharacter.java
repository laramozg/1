package com.ifmo.programming.model;

import com.ifmo.programming.errors.OutOfMoneyError;
import com.ifmo.programming.utility.Locatoin;
import com.ifmo.programming.utility.PersonAbstract;
import com.ifmo.programming.utility.BusinessSuccess;
import com.ifmo.programming.utility.RunInterface;

public class MinorCharacter extends PersonAbstract implements RunInterface {
    public int money;
    public MinorCharacter(String name, BusinessSuccess success){
        super(name, success);
    }
    @Override
    public int haveMoney(int profit) throws OutOfMoneyError {
        money += profit;
        if (money < 0){
            throw new OutOfMoneyError(getName() + "разорился. Деньги закончились! ");
        }
        return money;
    }

    @Override
    public void meet(PersonAbstract person1,PersonAbstract person2) {
        System.out.println(getName() + " встретился с " + person1 + " и " + person2);
    }

    @Override
    public void talk(String people) {
        System.out.println(getName() + " ничего не сказал " + people);
    }


    @Override
    public void goTo(Locatoin locatoin) {
        if (locatoin == Locatoin.THEATHE) {
            System.out.println(getName() + " пошёл в " + locatoin.place + ": ");
        }
    }

    @Override
    public void escape() {
        if (getBusinessSuccess() != BusinessSuccess.UNSUCCESSFUL.title) {
            System.out.println(getName() + " хочет удрать со всеми деньгами");
        }
    }
}

