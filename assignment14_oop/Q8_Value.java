package com.cybertek.tests.Homeworks.assignment14_oop;

public class Q8_Value {
    private boolean modified = false;
    public int val;

    public Q8_Value(int v) {
        val = v;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int st) {
        val = st;
        modified = true;
    }

    public boolean wasModified() {
        return modified;
    }
}