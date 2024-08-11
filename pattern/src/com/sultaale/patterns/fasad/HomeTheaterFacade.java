package com.sultaale.patterns.fasad;

public class HomeTheaterFacade {
    Amplifier amp;
    Tunner tuner;
    StreamingPlayer player;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;
    Projector projector;

    public HomeTheaterFacade(Amplifier amp, Tunner tuner, StreamingPlayer player, TheaterLights lights, PopcornPopper popper, Screen screen, Projector projector) {
        this.amp = amp;
        this.tuner = tuner;
        this.player = player;
        this.lights = lights;
        this.popper = popper;
        this.screen = screen;
        this.projector = projector;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie... ");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setStreamingPlayer(player);
        amp.setVolume(5);
        player.on();
        player.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down... ");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        player.stop();
        player.off();
    }
}
