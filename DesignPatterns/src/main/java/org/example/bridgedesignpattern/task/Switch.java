package org.example.bridgedesignpattern.task;

public class Switch {
    private IElectricalEquipment equipment;

    public void setElectricalEquipment(IElectricalEquipment equipment){
        this.equipment = equipment;
    }
    public IElectricalEquipment getElectricalEquipment(){
        return equipment;
    }
    public void on(){
        System.out.print("Switch is on. ");
        equipment.powerOn();
        System.out.println();
    }
    public void off(){
        System.out.print("Switch is off. ");
        equipment.powerOff();
        System.out.println();
    }
}
