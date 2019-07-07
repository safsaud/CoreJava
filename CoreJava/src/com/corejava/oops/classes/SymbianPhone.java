package com.corejava.oops.classes;

public class SymbianPhone {

    private float height;
    private float width;
    private String brand;
    private String OS;
    private float price;

    /*Parameterised Constructor */
    public SymbianPhone(float height, float width, String brand, String OS, float price) {
        this.height = height;
        this.width = width;
        this.brand = brand;
        this.OS = OS;
        this.price = price;
    }

    /* Default Constructor  */
    public SymbianPhone() {
    }

    @Override
    public String toString() {
        return "SymbianPhone{" +
                "height=" + height +
                ", width=" + width +
                ", brand='" + brand + '\'' +
                ", OS='" + OS + '\'' +
                ", price=" + price +
                '}';
    }


}
