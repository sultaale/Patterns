package com.sultaale.patterns.fasad;

public class HomeTheaterTestDrive {

    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Projector projector = new Projector();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();
        TheaterLights lights = new TheaterLights();
        StreamingPlayer player = new StreamingPlayer();
        Tunner tuner = new Tunner();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner,player, lights, popper, screen, projector);

        homeTheater.watchMovie("readers of the Lost Ark");
        homeTheater.endMovie();
    }
}
