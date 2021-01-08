package com.cybertek.tests.Homeworks.assignment14_oop;

public class Q12_CameraPhone extends Q12_Phone{
    int imageSize;
    int memorySize;

    public Q12_CameraPhone(int imageSize, int memorySize) {
        this.imageSize = imageSize;
        this.memorySize = memorySize;
    }

    public int numPictures(){
        return memorySize*1000/imageSize;
    }
}
