package com.corejava.oops.com.corejava.oops.abstraction;

public class TestAbstraction {

    public static void main(String[] args) {
        /** Bank employee fecthing account details   **/

        BankEmployee bankEmployee = new BankEmployee();
        Bank accountDetails=bankEmployee.displayAccountDetails(10020000);
        System.out.println("Bank account details being shown to Bank Employee are \n"+accountDetails.toString());

        /** Bank Manager fecthing account details   **/

        BankManager bankManager = new BankManager();
        Bank accountDetailsToManager=bankManager.displayAccountDetails(10020000);
        System.out.println("Bank account details being shown to Bank Manager are \n"+accountDetailsToManager.toString());

    }
}
