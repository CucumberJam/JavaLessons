package com.company.laba1;

import java.util.Scanner;

public class example17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int A = in.nextInt();
        System.out.print("Input second number: ");
        int B = in.nextInt();
        int C = A + B;
        System.out.printf("Sum of %d and %d equals %d \n", A, B, C);
        int D = A - B;
        int D1 = B - A;
        if(A>B){
            System.out.printf("Difference in number is %d \n", D);
        }
        else{
            System.out.printf("Difference in numbers is %d \n", D1);
        }
    }
}
