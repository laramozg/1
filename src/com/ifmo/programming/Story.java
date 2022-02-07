package com.ifmo.programming;

import com.ifmo.programming.exeption.ReceiveExeption;
import com.ifmo.programming.model.*;
import com.ifmo.programming.utility.BusinessSuccess;
import com.ifmo.programming.utility.Locatoin;
import com.ifmo.programming.utility.TimeInterface;

public class Story {
    public static void main(String[] args) {
        Krabs krabs = new Krabs("Крабс", BusinessSuccess.SUCCESSFUL);
        Spruts spruts = new Spruts("Спрутс", BusinessSuccess.TOP);
        MinorCharacter julio = new MinorCharacter("Жулио", BusinessSuccess.UNSUCCESSFUL);
        MinorCharacter migga = new MinorCharacter("Мигга", BusinessSuccess.UNSUCCESSFUL);
        Superfild superfild = new Superfild("Суперфильд");
        SendTelegram sendTelegram = new SendTelegram();
        Superfild.Clother clother = new Superfild.Clother();


        System.out.println(spruts);
        System.out.println(migga);
        System.out.println(julio);

        try {
            SendTelegram.sendLetter(spruts,krabs);
        } catch (ReceiveExeption e) {
            e.printStackTrace();
        }
        ExchangeMoney.giveMoney(spruts, migga, julio, 100000);
        krabs.knew();
        spruts.prudently();
        krabs.understand();
        ExchangeMoney.willGiveMoney(spruts, migga, julio, 2000000);
        krabs.talk("Мигге и Жулио");
        krabs.meet(migga,julio);

        julio.escape();

        sendTelegram.notsendLetter(krabs);
        krabs.goTo(Locatoin.RESTAURANT);
        krabs.goTo(Locatoin.HOTEL);
        krabs.meet(migga,julio);
        krabs.dinner(migga,julio);
        migga.goTo(Locatoin.THEATHE);
        julio.goTo(Locatoin.THEATHE);
        krabs.goTo(Locatoin.THEATHE);

        krabs.wakeAp();
        krabs.talk("никому");
        try {
            SendTelegram.sendLetter(krabs,spruts);
        } catch (ReceiveExeption e) {
            e.printStackTrace();
        }
        try {
            SendTelegram.sendLetter(spruts,krabs);
        } catch (ReceiveExeption e) {
            e.printStackTrace();
        }
        TimeInterface time = new TimeInterface() {
            @Override
            public void wait(int time) {
                System.out.println("ожидание " + time + " день");
            }
        };
        time.wait(1);
        krabs.talk("Мигга и Жулио");

        try {
            SendTelegram.sendLetter(krabs,spruts);
        } catch (ReceiveExeption e) {
            e.printStackTrace();
        }
        superfild.goTo(Locatoin.HOTEL);
        clother.wear(superfild);
        superfild.collide(krabs);
        superfild.hug(krabs);
        superfild.talk("-");

    }
}


