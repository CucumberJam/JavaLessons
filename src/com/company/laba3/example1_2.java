package com.company.laba3;

import java.util.Scanner;

public class example1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number from 1 to 7 please: ");
        int i = in.nextInt();

        switch (i) {
            case 1:
                System.out.println("This is Monday");
                break;
            case 2:
                System.out.println("This is Tuesday");
                break;
            case 3:
                System.out.println("This is Wednesday");
                break;
            case 4:
                System.out.println("This is Thursday");
                break;
            case 5:
                System.out.println("This is Friday");
                break;
            case 6:
                System.out.println("This is Sunday");
                break;
            case 7:
                System.out.println("This is Saturday");
                break;
            default: System.out.println("This number doesn't correspond to the day of the week");
        }
    }
}