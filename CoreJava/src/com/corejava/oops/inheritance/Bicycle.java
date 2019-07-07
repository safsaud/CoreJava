package com.corejava.oops.inheritance;

public class Bicycle {

    protected int speed;
    protected int gear;

    public Bicycle() {
    }

    public Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    public void applyBrake(int decrement){
        speed -=decrement;
    }

    public void speeedUp(int increment){
        speed+= increment;
    }

    @Override
    public String toString() {
        return "Bicycle" +
                "speed=" + speed +
                ", gear=" + gear ;
    }
}

