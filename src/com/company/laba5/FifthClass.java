package com.company.laba5;

public class FifthClass {
    private int Number;

    public FifthClass(){
        Number = 0;
        System.out.print("This is in constructor without argument: ");
        System.out.println(Number);
    }

    public FifthClass(int i){
        if(i > 100){
            Number = 100;
            System.out.print("This is in constructor with argument: ");
            System.out.println(Number);
        }
        else {
            Number = i;
            System.out.print("This is in constructor with argument: ");
            System.out.println(Number);
        }
    }

    void setNumber() {
        Number = 0;
        System.out.print("This is in method without argument: ");
        System.out.println(Number);
    }

    void setNumber(int number) {
        if(number > 100){
            Number = 100;
            System.out.print("This is in method with argument: ");
            System.out.println(Number);
        }
        else {
            Number = number;
            System.out.print("This is in method with argument: ");
            System.out.println(Number);
        }
    }
}
