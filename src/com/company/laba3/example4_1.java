package com.company.laba3;

import java.util.Scanner;

public class example4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int A = in.nextInt();
        System.out.println("Input another number: ");
        int B = in.nextInt();
        while (A < B) {
            System.out.printf("From lowest to highest: %d, %d \n", A, B);
            System.out.printf("From highest to lowest: %d, %d \n", B, A);
            break;
        }
        while (A > B){
            System.out.printf("From lowest to highest: %d, %d \n", B, A);
            System.out.printf("From highest to lowest: %d, %d \n", A, B);
            break;
        }
        while (A == B){
            System.out.print("These numbers are equal");
            break;
        }
    }
}
