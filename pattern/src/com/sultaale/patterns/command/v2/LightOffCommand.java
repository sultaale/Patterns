package com.sultaale.patterns.command.v2;

public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light l) {
        light = l;
    }

    @Override
    public void undo() {
        light.on();
    }

    public void execute() {
        light.off();
    }
}
