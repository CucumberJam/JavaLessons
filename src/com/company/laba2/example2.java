package com.company.laba2;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number please: ");
        int A = in.nextInt();
        int B = Math.floorMod(A, 5);
        int C = Math.floorMod(A, 7);
        if (B == 2) {
            if (C == 1) {
                System.out.print("Entered number meet all the requirements.");
            } else {
                System.out.print("You wouldn't get 1 as reminder after dividing number by 7.");
            }
        } else {
            System.out.print("You wouldn't get 2 as reminder after dividing number by 5.");
        }
    }
}

