package com.ifmo.programming.utility;

public enum Locatoin {
    RESTAURANT("ресторан"),
    HOTEL("гостиница"),
    THEATHE("театр");

    public String place;

    Locatoin(String place){
        this.place = place;
    }
}
