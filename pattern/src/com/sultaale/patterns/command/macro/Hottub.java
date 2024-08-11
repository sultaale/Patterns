package com.sultaale.patterns.command.macro;

public class Hottub {
    String room;

    public Hottub(String room) {
        this.room = room;
    }

    void on() {
        System.out.println("Hottub is heating to a steaming 104 degrees" +
                "\n" + "Hottub is bubbling");
    }

    public void off() {
        System.out.println(room + " hottub is off");
    }
}
