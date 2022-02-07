package com.ifmo.programming.model;

import com.ifmo.programming.exeption.ReceiveExeption;
import com.ifmo.programming.utility.PersonAbstract;

public class SendTelegram {
    public SendTelegram() {
    }

    public static void receiveLetter(PersonAbstract sender, PersonAbstract recipiend) throws ReceiveExeption {
        if (Math.random() < 0.3){
            throw new ReceiveExeption("Телеграмма не была доставлена "+ recipiend.getName());
        }
        else {
            System.out.printf(recipiend.getName() + " получил телеграмму от " + sender.getName()+"%n%n");
        }
    }

    public static void sendLetter(PersonAbstract sender, PersonAbstract recipiend) throws ReceiveExeption {
        System.out.println(sender.getName() + " отправил телеграмму " + recipiend.getName() + " -> ");
        SendTelegram.receiveLetter(sender, recipiend);

    }
    public void notsendLetter(PersonAbstract sender){
        System.out.println(sender.getName()+" решил не отправлять " + telegram.name);
    }
    Telegram telegram = new Telegram("телеграмма");
    public class Telegram {
        private String name;
        public Telegram(String name) {
            this.name = name;
        }

    }
}
