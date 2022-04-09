package com.company.laba5;

public class example1 {
    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
        char B = 99;
        System.out.println("The value is: " + firstClass.firstmethod(B));
        System.out.println("The number is: " + firstClass.secondmethod(B));
        firstClass.thirdmethod(B, 8);
    }
}
