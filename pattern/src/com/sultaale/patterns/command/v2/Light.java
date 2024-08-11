package com.sultaale.patterns.command.v2;

public class Light {
    String room;

    public Light(String s) {
        room = s;
    }

    public void off() {
        System.out.println("Light in " + room +  " is off");
    }

    public void on() {
        System.out.println("Light in " + room + " is on");
    }
}
