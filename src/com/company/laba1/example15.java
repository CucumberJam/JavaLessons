package com.company.laba1;

import java.util.Scanner;

public class example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int A = in.nextInt();
        System.out.print("Input another number: ");
        int B = in.nextInt();
        int C = A + B;
        System.out.printf("Summ of these numbers equals: %d \n", +C);
    }
}
