package com.cybertek.tests.Homeworks.assignment14_oop;

public class Q2_LameCalculator {

    public int plus(int a, int b) {
        return a+b;
    }
    public int minus(int a, int b) {
        return a-b;
    }
    public int multiply(int a, int b) {
        return a*b;
    }
    public int divide(int a, int b) {
        return a/b;
    }
    public static void main(String[] args) {

        Q2_LameCalculator lc = new Q2_LameCalculator();

        System.out.println(lc.plus(1, 1));
        //returns:2

        System.out.println(lc.minus(1, 1));
        //returns:0

        System.out.println(lc.multiply(2, 1));
        //returns:2

        System.out.println(lc.divide(10, 2));
        //returns:5

    }

}
