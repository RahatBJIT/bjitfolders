package org.example.bridgedesignpattern.task;

public class Fan implements IElectricalEquipment{
    @Override
    public void powerOn() {
        System.out.println("Fan Turned On");
    }

    @Override
    public void powerOff() {
        System.out.println("Fan Turned Off");

    }
}
