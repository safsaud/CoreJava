package com.corejava.oops.encapsulation;

public class TestEncapsulation {

    public static void main(String[] args) {

        TestEncapsulation testEncapsulation=new TestEncapsulation();
        AndroidPhone androidPhone=testEncapsulation.populatePhoneValues();

        System.out.println("Brand:"+androidPhone.getBrand());
        System.out.println("Height:"+androidPhone.getHeight());
        System.out.println("Width:"+androidPhone.getWidth());
        System.out.println("OS:"+androidPhone.getOS());
        System.out.println("Price:"+androidPhone.getPrice());


    }

    /** Populate values for Android phone*/

    public AndroidPhone populatePhoneValues(){
        AndroidPhone androidPhone=new AndroidPhone();
        androidPhone.setBrand("Samsung");
        androidPhone.setHeight(6f);
        androidPhone.setOS("Android");
        androidPhone.setPrice(10000f);

        return androidPhone;

    }
}
