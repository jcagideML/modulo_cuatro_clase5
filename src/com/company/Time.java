package com.company;

import java.util.Calendar;

public class Time {

    private long startTime;
    private long stopTime;

    public void start() {

        this.startTime = Calendar.getInstance().getTimeInMillis();
    }

    public void stop() {

        this.stopTime = Calendar.getInstance().getTimeInMillis();
    }

    public long elapsedTime() {
        if (startTime != 0 & stopTime != 0) {
            return stopTime - startTime;
        }
        return 0;
    }
}
