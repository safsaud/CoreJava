package com.corejava.oops.encapsulation;

public class AndroidPhone {

    private float height;
    private float width;
    private String brand;
    private String OS;
    private float price;

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public String getBrand() {
        return brand;
    }

    public String getOS() {
        return OS;
    }

    public float getPrice() {
        return price;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}


