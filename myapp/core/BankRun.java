package myapp.core;

import java.util.LinkedList;

public class BankRun {

    public static void main(String[] args) {
        BankAccount acct = new BankAccount();
        System.out.printf("name: %s\n", acct.getName());
        System.out.printf("acctId: %s\n", acct.getAcctId());
        System.out.printf("balance: %f\n", acct.getBalance());


    }
    
}

