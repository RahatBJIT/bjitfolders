package org.example.bridgedesignpattern.task;

public class BridgeDesignPattern {
    public static void main(String[] args) {
        IElectricalEquipment fan = new Fan();
        IElectricalEquipment light = new Light();

        Switch fancySwitch = new FancySwitch();
        Switch normalSwitch = new NormalSwitch();

        fancySwitch.setElectricalEquipment(fan);
        fancySwitch.on();
        fancySwitch.off();

        fancySwitch.setElectricalEquipment(light);
        fancySwitch.on();
        fancySwitch.off();

        normalSwitch.setElectricalEquipment(light);
        normalSwitch.on();
        normalSwitch.off();

    }
}
