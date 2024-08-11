package com.sultaale.patterns.fasad;

public class Amplifier {
    public void on() {
        System.out.println("Amplifier on");
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        System.out.println("Amplifier setting Streaming player to Streaming player");
    }

    public void setVolume(int i) {
        System.out.println("Amplifier surround sound on " + i);
    }

    public void off() {
        System.out.println("Amplifier off");
    }
}
