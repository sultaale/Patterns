package com.sultaale.patterns.command.v2;

public class CeilingFanMediumCommand implements Command{
    CeilingFan ceilingFan;
    int prevSpeed;

    CeilingFanMediumCommand(CeilingFan e) {
        ceilingFan = e;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

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
}
