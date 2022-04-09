package com.company.laba5;

import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a symbol: ");
        String ch = in.next();
        char ch1 = ch.charAt(0);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        FourthClass fourthClass = new FourthClass();
        fourthClass.C = ch1;
        fourthClass.I = num;
        System.out.print(fourthClass.volume());
    }
}
