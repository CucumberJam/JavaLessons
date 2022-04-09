package com.company.laba7;

public class SecondSubClass extends SecondSuperClass{
    int v;
    public SecondSubClass(String iEx, int v) {
        super(iEx);
        this.v = v;
    }

    @Override
    public void setI(String i) {
        super.setI(i);

    }

    public void nothing(){
       System.out.print("Vot: " + getI() + v);
    }
    public void setV(int v){
        this.v = v;
        System.out.print("number: " + v);
    }


    public int getV() {
        return v;
    }
}
