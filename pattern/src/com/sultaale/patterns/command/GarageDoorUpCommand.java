package com.sultaale.patterns.command;

public class GarageDoorUpCommand implements Command{
    GarageDoor gDoor;

   public GarageDoorUpCommand(GarageDoor g) {
        gDoor = g;
    }
    @Override
    public void execute() {
        gDoor.up();
    }
}
