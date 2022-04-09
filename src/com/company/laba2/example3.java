package com.company.laba2;

import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int X = in.nextInt();
        if (X%4 == 0) {
            if (X >= 10){
                System.out.print("This number is suitable.");
            }
            else {
                System.out.print("Number is lower than 10.");
            }
        }
        else {
            System.out.print("Number isn't divisible by 4.");
        }

    }
}
