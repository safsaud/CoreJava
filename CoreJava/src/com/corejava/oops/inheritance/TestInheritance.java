package com.corejava.oops.inheritance;

public class TestInheritance {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(100,3);
        System.out.println("Bicycle details are:"+bicycle.toString());

        MountainBicycle mountainBicycle = new MountainBicycle(200,5,25);
        System.out.println("Mountain bicycle details are:"+mountainBicycle.toString());

    }
}
