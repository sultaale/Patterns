package com.sultaale.patterns.command.macro;

public class Light {
    String room;

    public Light(String room) {
        this.room = room;
    }

    void on() {
        System.out.println("Light is On");
    }

    public void off() {
        System.out.println(room + " light is off");
    }
}
