package com.sultaale.patterns.command.v2;

public class Stereo {
    String roomName;

    public Stereo(String r) {
        roomName = r;
    }

    public void on() {
        System.out.println(roomName + " stereo is On");
    }

    public void setVolume(int i) {
        System.out.println(roomName + "stereo volume set to" + i);
    }

    public void setCD() {
        System.out.println(roomName + "  stereo is set for CD input");
    }

    public void off() {
        System.out.println(roomName + "stereo is Off");
    }
}
