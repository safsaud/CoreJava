package com.corejava.oops.abstraction;

public class BankEmployee implements BankInterface {


    @Override
    public Bank displayAccountDetails(int accountId) {
        /* it actually makes Db calls and sets values**/

        Bank bank=new Bank();
        bank.setCustomerAccountId(accountId);
        bank.setCustomerAddress("Bangalore");
        bank.setCustomerName("Safer");
        bank.setMobileNo(9886346635l);

        return bank;
    }
}
