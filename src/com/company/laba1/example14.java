package com.company.laba1;

import java.util.Scanner;

public class example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input year of your birth: ");
        int year = in.nextInt();
        int currentyear = 2021;
        int age;
        age = currentyear - year;
        System.out.printf("Your age %d \n", age);
    }
}
