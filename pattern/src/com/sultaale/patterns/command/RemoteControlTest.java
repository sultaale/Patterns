package com.sultaale.patterns.command;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor gr = new GarageDoor();

        GarageDoorUpCommand open= new GarageDoorUpCommand(gr);
        LightCommand lightOn = new LightCommand(light);

        remote.setCommand(open);
        remote.buttonWasPressed();

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
