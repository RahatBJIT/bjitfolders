package org.example.bridgedesignpattern.task;

public class Light implements IElectricalEquipment{


    @Override
    public void powerOn() {
        System.out.println("Light turned on");
    }

    @Override
    public void powerOff() {
        System.out.println("Light turned off");

    }
}
