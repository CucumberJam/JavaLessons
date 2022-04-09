package com.company.laba7;

public class FifthSub2Class extends FifthSuperClass{
    private char r;

    FifthSub2Class(String k, char q) {
        super(k);
        r = q;
    }
    @Override
    public String toString() {
        String nameClass;
        nameClass = "Sub2" + "\n" +
                "Class name: " + this.getClass().getSimpleName() + "\n" +
                "doc = " + this.getDoc() + "\n" +
                "symbol: + " + this.getR();
        return nameClass;
    }

    void setR(char h){
        r = h;
    }
    public char getR() {
        return r;
    }
}
