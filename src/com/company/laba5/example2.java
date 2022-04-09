package com.company.laba5;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a letter or symbol: ");
        String A = in.next();
        char A1 = A.charAt(0);
        System.out.print("Input another letter or symbol: ");
        String B = in.next();
        char B1 = B.charAt(0);

        SecondClass secondClass = new SecondClass();

        secondClass.method(A1, B1);
    }
}
