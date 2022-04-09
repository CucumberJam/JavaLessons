package com.company.laba2;

import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int A = in.nextInt();
        if (A <= 10) {
            if (A >= 5){
                System.out.print("This number is perfect for our requirements");
            }
            else {
                System.out.print("The number is lower than 5.");
            }
        }
        else {
            System.out.print("The number is bigger than 10.");
        }
    }
}
