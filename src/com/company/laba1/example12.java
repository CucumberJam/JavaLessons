package com.company.laba1;

import java.util.Scanner;

public class example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the year if your birth? ");
        int year = in.nextInt();
        int A, B;
        A = 2021;
        B = A - year;
        System.out.printf("You are %d \n", B);
    }
}

