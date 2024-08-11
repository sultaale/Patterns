package com.sultaale.patterns.command.v2;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl rcontrol = new RemoteControl();

//        Light livingRoomLight = new Light("Living Room");
//        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
//        GarageDoor garageDoor = new GarageDoor();
//        Stereo stereo = new Stereo("Living room");

//        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
//        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
//        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
//        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
//
//        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
//        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
//
//        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
//        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

//        rcontrol.setCommand(0, livingRoomLightOn, livingRoomLightOff);
//        rcontrol.setCommand(1, kitchenLightOn, kitchenLightOff);
//        rcontrol.setCommand(2, ceilingFanOn, ceilingFanOff);
//        rcontrol.setCommand(3, stereoOnWithCD, stereoOff);

        rcontrol.setCommand(0, ceilingFanMedium, ceilingFanOff);
        rcontrol.setCommand(1, ceilingFanHigh, ceilingFanOff);
//        System.out.println(rcontrol);

        rcontrol.onButtonWasPushed(0);
        rcontrol.offButtonWasPushed(0);

        System.out.println(rcontrol);
        rcontrol.undoButtonWasPushed();
        rcontrol.onButtonWasPushed(1);
//        rcontrol.offButtonWasPushed(0);
//        rcontrol.onButtonWasPushed(0);
        System.out.println(rcontrol);
        rcontrol.undoButtonWasPushed();

//        rcontrol.onButtonWasPushed(1);
//        rcontrol.offButtonWasPushed(1);
//        rcontrol.onButtonWasPushed(2);
//        rcontrol.offButtonWasPushed(2);
//        rcontrol.onButtonWasPushed(3);
//        rcontrol.offButtonWasPushed(3);

    }
}
