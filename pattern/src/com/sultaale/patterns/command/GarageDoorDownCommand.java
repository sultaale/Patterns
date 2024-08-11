package com.sultaale.patterns.command;

public class GarageDoorDownCommand implements Command{
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor gr) {
        garageDoor = gr;
    }

    public void execute() {
        garageDoor.down();
    }
}
