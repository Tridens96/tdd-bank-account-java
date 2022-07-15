package org.xpdojo.bank;

public class Account {

    private int balance = 0;
    public void deposit(int i) {
        balance += i;
    }

    public int getBalance() {
        return balance;
    }
}
