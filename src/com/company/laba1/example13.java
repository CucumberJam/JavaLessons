package com.company.laba1;

import java.util.Scanner;

public class example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = in.nextLine();
        System.out.print("What is the year of your birth? ");
        int year = in.nextInt();
        int A, age;
        A = 2021;
        age = A - year;
        System.out.printf("Your name: %s, your age: %d \n", name, age);
    }
}
