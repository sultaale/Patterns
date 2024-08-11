package com.sultaale.patterns.fasad;

public class StreamingPlayer {
    public void on() {
        System.out.println("Player on");
    }

    public void play(String movie) {
        System.out.println("Player playing movie " + movie);
    }

    public void stop() {
        System.out.println("Player stopped");
    }

    public void off() {
        System.out.println("Player off");
    }
}
