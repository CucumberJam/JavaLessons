package com.company.laba7;

public class ThirdSubSubClass extends ThirdSubClass{
    public String go;

    ThirdSubSubClass(int m, char t, String c){
        super(m, t);
        go = c;
    }

    public void setK(int i, char t, String l){
        a = t;
        k = i;
        go = l;
    }
    public String getGo(){
        return go;
    }
    @Override
    public String toString() {
        String subSubClassName;
        subSubClassName = "Sub-Sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " peremennaya public int = " + this.getK() +
                " Symbols peremennaya: " + this.getA() +
                " Text: " + this.getGo();

        return subSubClassName;
    }
}
