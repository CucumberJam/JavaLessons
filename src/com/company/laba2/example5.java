package com.company.laba2;

import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number in order to detect how many thousands it has: ");
        int A = in.nextInt();
        int B;
        if (A > 1000){
            B = A / 1000;
            B = Math.round(B);
            System.out.print(B + " thousands.");
            }
        else {
            System.out.print("This number hasn't thousands.");
        }
    }
}

