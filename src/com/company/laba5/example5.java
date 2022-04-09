package com.company.laba5;

import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number please: ");
        int N = in.nextInt();
        FifthClass fifthClass = new FifthClass();
        fifthClass.setNumber();
        fifthClass.setNumber(N);
        FifthClass fifthClass2 = new FifthClass(N);
    }
}
