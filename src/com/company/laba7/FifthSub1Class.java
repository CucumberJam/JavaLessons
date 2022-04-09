package com.company.laba7;

public class FifthSub1Class extends FifthSuperClass{
    private int g;

    FifthSub1Class(String k, int h) {
        super(k);
        g = h;
    }

    @Override
    public String toString() {
        String nameClass;
        nameClass = "Sub1" + "\n" +
                "Class name: " + this.getClass().getSimpleName() + "\n" +
                "doc = " + this.getDoc()+ "\n" +
                "number:  " + this.getG();
        return nameClass;
    }

    void setG(int h){
        g = h;
    }
    public int getG() {
        return g;
    }
}
