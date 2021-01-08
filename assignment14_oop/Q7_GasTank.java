package com.cybertek.tests.Homeworks.assignment14_oop;

public class Q7_GasTank {

    double amount = 0;
    double capacity;

    public Q7_GasTank(double capacity) {
        this.capacity = capacity;
    }

    public void addGas(double gas) {
        amount+=gas;
        if(amount>capacity)
            amount=capacity;
    }

    public void useGas(double useGas) {
        amount-=useGas;
        if(amount<0)
            amount=0;
    }

    public boolean isEmpty(){
        if (amount<0.1)
            return true;
        else
            return false;
    }

    public boolean isFull(){
        if (amount>capacity-0.1)
            return true;
        else
            return false;
    }

    public double getGasLevel(){
        return amount;
    }

    public double fillUp(){
        double a = capacity-amount;
        amount = capacity;
        return a;
    }






}
