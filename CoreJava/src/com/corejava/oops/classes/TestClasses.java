package com.corejava.oops.classes;

public class TestClasses {

    public static void main(String[] args) {

        //assume database call
//Calling default Constructor
        SymbianPhone symbianPhone = new SymbianPhone();
        System.out.println(symbianPhone.toString());

        System.out.println("**********************************");
        //Calling parameterised Constructor
        SymbianPhone symbianPhone1= new SymbianPhone(5f,3f,"Nokia","Symbian",3000);

        System.out.println(symbianPhone1.toString());
    }
}
