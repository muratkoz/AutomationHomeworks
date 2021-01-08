package com.cybertek.tests.Homeworks.assignment14_oop;

public class Q5_TV {

    private int channel=1;
    private int volumeLevel=1;
    boolean on = false;
    private String brand = "undefined";

    public Q5_TV() {
        System.out.println("Creating TV object using no Args- constructor");
    }

    public Q5_TV(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if(channel>0 && channel<=120)
            this.channel = channel;
        else
            System.out.println("ERROR: TV is either OFF or invalid Channel");
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if(channel>=1 && channel<=7 && on )
            this.volumeLevel = volumeLevel;
        else
            System.out.println("ERROR: TV is either OFF or invalid Volume level");

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void channelUp(){
        setChannel(channel++);
    }

    public void channelDown(){
        setChannel(channel--);
    }

    public void VolumeUp(){
        setVolumeLevel(volumeLevel++);
    }

    public void VolumeDown(){
        setVolumeLevel(volumeLevel--);
    }

    public boolean isOn(){
        return on;
    }
    public void turnOn(){
        if(on)
            System.out.println("TV is already ON");
        else
            on=true;
    }
    public void turnOff(){
        if(!on)
            System.out.println("TV is already OFF");
        else
            on=false;
    }
    








}


