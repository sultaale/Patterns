package com.sultaale.patterns.command.v2;

public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light l) {
        light = l;
    }

    @Override
    public void undo() {
        light.off();
    }

    public void execute() {
        light.on();
    }
}
