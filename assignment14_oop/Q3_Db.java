package com.cybertek.tests.Homeworks.assignment14_oop;

public class Q3_Db {

    private String data;
    private int yint;

    public void insertData(String data, int yint){
        this.data=data;
        this.yint=yint;
    }

    public void setData(String data){
        this.data=data;
    }
    public void setYint(int yint){
        this.yint=yint;
    }
    public int getYint(){
        return yint;
    }
    public String getData(){
        return data;
    }
    public static void main(String[] args) {

        Q3_Db db = new Q3_Db();
        db.insertData("aaa",123);

        System.out.println(db.getData());//aaa
        System.out.println(db.getYint());//123

        db.setData("zzz");
        db.setYint(200);

        System.out.println(db.getData());//zzz
        System.out.println(db.getYint());//200


    }

}
