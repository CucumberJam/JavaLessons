package com.company.laba3;

import java.util.Scanner;

public class example4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input one number: ");
        int A = in.nextInt();
        System.out.print("Input another number: ");
        int B = in.nextInt();
        for (; A < B;) {
            System.out.printf("From lowest to highest: %d, %d \n", A, B);
            System.out.printf("From highest to lowest: %d, %d \n", B, A);
            break;
        }
        for (; A > B;) {
            System.out.printf("From lowest to highest: %d, %d \n", B, A);
            System.out.printf("From highest to lowest: %d, %d \n", A, B);
            break;
        }
    }
}
