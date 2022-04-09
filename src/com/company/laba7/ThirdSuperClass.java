package com.company.laba7;

public class ThirdSuperClass {
    public int k;

    public void setK(int i){
        k = i;
    }
    public int getK(){ return k;}
    ThirdSuperClass(int m){
        k = m;
    }


    @Override
    public String toString() {
        String superClassName;
        superClassName = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " peremennaya public int = " + this.getK();
        return superClassName;
    }
}
