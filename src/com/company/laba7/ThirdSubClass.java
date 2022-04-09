package com.company.laba7;

public class ThirdSubClass extends ThirdSuperClass{
    public char a;
    ThirdSubClass(int m, char t) {
        super(m);
        a = t;
    }

    public void setK(int i, char t){
        a = t;
        k = i;
    }
    public char getA(){
        return a;
    }
    @Override
    public String toString() {
        String subClassName;
        subClassName = "Sub-super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " peremennaya public int = " + this.getK() +
                " Symbols peremennaya: " + this.getA();

        return subClassName;
    }

}
