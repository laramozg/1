package com.ifmo.programming.model;

import com.ifmo.programming.errors.OutOfMoneyError;
import com.ifmo.programming.utility.Locatoin;
import com.ifmo.programming.utility.PersonAbstract;

public class Superfild extends PersonAbstract {
    private int money = 5000000;
    public Superfild(String name){
        super(name);}
    public void hug(PersonAbstract person){
        if (getName().equals(person.getName())){
            System.out.println(getName() + " обнял сам себя");
        }
        else {
            System.out.println(getName()+ " обнял " + person.getName());
        }
    }
    public void collide(PersonAbstract person){
        if (getName().equals(person.getName())){
            System.out.println(getName() + " не может сталкнуться с самим собой!");
        }
        else {
            System.out.println(getName() + " столкнулся с " + person.getName());
        }
    }

    @Override
    public void meet(PersonAbstract person1,PersonAbstract person2) {
        System.out.println(getName() + " встретился с " + person1 + " и " + person2);
    }

    @Override
    public void talk(String people) {
        System.out.println(getName() + " завизжал своим отвратительным голосом ");
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
    public void goTo(Locatoin locatoin) {
        if (locatoin == Locatoin.HOTEL){
            System.out.println(getName() + " появился в " + Locatoin.HOTEL.place);
        }
    }

    public static class Clother {
        static boolean stick = true;
        static boolean jacket = true;
        static boolean pants = true;
        static boolean hat = true;
        public static void wear(PersonAbstract person) {
            System.out.println(person.getName() + " выглядит: черный пиджак- " + jacket + ", черный брюки- " + pants + ", черная высокая шляпа- " + hat + ", палка в руках- " + stick);
        }
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof Superfild){
            if (this.hashCode() == o.hashCode()) {
                return true;
            }
        }
        return false;
    }
}
