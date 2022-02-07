package com.ifmo.programming.utility;

public enum BusinessSuccess {
    UNSUCCESSFUL("неуспешный"),
    MIDDLE("среднеуспешный"),
    SUCCESSFUL("успешный"),
    RICH("очень успешный"),
    TOP("самый успешный");

    public String title;

    BusinessSuccess(String title){
        this.title = title;
    }
}
