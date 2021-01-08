package com.cybertek.tests.Homeworks.assignment14_oop;

public class Q11_SavingsAccount extends Q11_BankAccount {
    double interestRate;

    public double getInterestRate(){
        return interestRate;
    }
    public Q11_SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }
}
