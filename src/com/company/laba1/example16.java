package com.company.laba1;

import java.util.Scanner;

public class example16 {
    static int square(int D){
        return D*D;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int A = in.nextInt();
        int B, C, D;
        B = A - 1;
        C = A + 1;
        D = A + B + C;
        System.out.printf(" %d, %d, %d, \n", B, A, C);
        System.out.println(square(D));
    }
}

