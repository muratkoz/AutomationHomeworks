package com.cybertek.tests.Homeworks.assignment14_oop;

public class Q6_ParkingMeter {
    int timeLeft = 0;
    int maxTime;

    public Q6_ParkingMeter( int maxTime){
        this.maxTime = maxTime;
    }

    public boolean add (int add) {
        if(add==25 && timeLeft+30<=maxTime) {
            timeLeft += 30;
            return true;
        }
        return false;
    }

    public void tick(){
        if(timeLeft>0)
            timeLeft--;
    }

    public boolean isExpired () {
        if(timeLeft==0) {
            return true;
        }
        else {
            return false;
        }
    }


}
