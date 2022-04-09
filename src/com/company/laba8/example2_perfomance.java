package com.company.laba8;

import java.util.Scanner;

public class example2_perfomance {
    public static void main(String[] args) {
        example2 Ex = new example2();
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number to convert it to binary system: ");
        int number = in.nextInt();
        System.out.print("This number in binary system: ");
        Ex.binar(number);
    }
}
