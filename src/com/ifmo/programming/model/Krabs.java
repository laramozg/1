package com.ifmo.programming.model;

import com.ifmo.programming.errors.OutOfMoneyError;
import com.ifmo.programming.utility.*;

public class Krabs extends PersonAbstract implements ActionsEveryDay,HaveFunInterface{
    private int money =  79000000;
    public Krabs(String name,BusinessSuccess success){
        super(name, success);
    }

    @Override
    public void assleep() {
        System.out.printf(getName()+ " поспал%n");
    }

    @Override
    public void wakeAp() {
        System.out.println(getName()+ " проснулся");
    }

    @Override
    public void swim() {
        System.out.printf(getName()+ " искупался в бассейне%n%n");
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
    public void dinner(PersonAbstract person, PersonAbstract person2) {
        if (person.getBusinessSuccess().equals(person2.getBusinessSuccess())){
            System.out.println(getName() + " поужинал с друзьями");
        }
        else{
            System.out.println(getName() + " поужинал с " + person.getName() + " и " + person2.getName());
        }
    }

    @Override
    public void lunch() {
        System.out.printf(getName() + " пообедал%n%n");
    }

    @Override
    public void meet(PersonAbstract person1,PersonAbstract person2) {
        System.out.println(getName() + " встретился с " + person1.getName() + " и " + person2.getName());
    }

    @Override
    public void talk(String people) {
        System.out.println(getName() + " ничего не сказал " + people);
    }


    @Override
    public void goTo(Locatoin locatoin) {
        if (locatoin == Locatoin.RESTAURANT) {
            System.out.println(getName() + " пошёл в " + locatoin.place + ": ");
            lunch();
        }
        if (locatoin == Locatoin.HOTEL) {
            System.out.println(getName() + " пошёл в " + locatoin.place + ": ");
            assleep();
            swim();
        }
        if (locatoin == Locatoin.THEATHE) {
            System.out.println(getName() + " пошёл в " + locatoin.place + ": ");
            haveFun();
        }

    }

    public void understand(){
        System.out.print(getName()+ " надеется: ");
    };
    public void knew(){
        System.out.print(getName()+ " знал: ");
    };

    @Override
    public void haveFun() {
        class RottenApple{
            String appels = "гнилые яблоки";
            void throwAppels(){
                System.out.println("В театре можно швырять в актёров "+ appels + ". ");
            }
        }
        RottenApple rottenApple = new RottenApple();
        rottenApple.throwAppels();
        System.out.printf("Можно веселиться.%n%n");
    }
}
