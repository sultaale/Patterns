package com.sultaale.patterns.command.macro;

public class TV {
    String room;

    public TV(String room) {
        this.room = room;
    }

    void on() {
        System.out.println(room + " TV is on");
        System.out.println(room + " TV channel is set for DVD");
    }

    public void off() {
        System.out.println(room + " tv is off");
    }
}
