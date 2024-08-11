package com.sultaale.patterns.command.v2;

public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH)
            ceilingFan.high();
        else if (prevSpeed == CeilingFan.LOW)
            ceilingFan.low();
        else  if (prevSpeed == CeilingFan.MEDIUM)
            ceilingFan.medium();
        else if (prevSpeed == CeilingFan.OFF)
            ceilingFan.off();
    }

    public CeilingFanOffCommand(CeilingFan cf) {
        ceilingFan = cf;
    }

    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }
}
