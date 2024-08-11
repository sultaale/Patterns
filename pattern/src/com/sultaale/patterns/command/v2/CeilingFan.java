package com.sultaale.patterns.command.v2;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String room;
    int speed;

    public CeilingFan(String r) {
        room = r;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(room + " ceiling fan is on high speed");
    }

    public void medium(){
        speed = MEDIUM;
        System.out.println(room + " ceiling fan is on medium");
    }

    public void low() {
        speed = LOW;
        System.out.println(room + " ceiling fan is on low");
    }

    public void off() {
        speed = OFF;
        System.out.println(room + " ceiling fan is off");
    }

    public void on() {
        System.out.println(room + " ceiling fan is on");
    }


    public int getSpeed() {
        return speed;
    }
}
