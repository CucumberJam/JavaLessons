package com.company.laba7;

public class SecondSuperClass {
    private String i;

    public SecondSuperClass(String iEx) {
        this.i = iEx;
    }

    public void setI(String i) {
        this.i = i;
    }

    public void setting() {
        i = "WTF";
    }

    public String getI(){
        return i;
    }

    public int getIlong(){
        return i.length();
    }

}