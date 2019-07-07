package com.corejava.oops.abstraction;

public class BankManager implements BankInterface {

    @Override
    public Bank displayAccountDetails(int accountId) {
        /* it actually makes Db calls and sets values**/

        Bank bank = new Bank();
        bank.setCustomerAccountId(accountId);
        bank.setCustomerAddress("Bangalore");
        bank.setCustomerName("Safer");
        bank.setMobileNo(98863466352l);
        bank.setBankLiquidBalance("1000000$");
        return bank;
    }
}
