package com.company.laba2;

import java.util.Scanner;

public class example1 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input any number: ");
            int A = in.nextInt();
            if (A%3 == 0) {
                System.out.println("The number is divisible by three.");
            }
            else {
                System.out.println("Sorry, the number you have entered is not divisible be three.");
            }

    }
}
