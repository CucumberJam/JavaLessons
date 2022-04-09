package com.company.laba1;

import java.util.Scanner;

public class example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What day of the week is today? ");
        String day = in.nextLine();
        System.out.print("What is the current month? ");
        String month = in.nextLine();
        System.out.print("What is the date today? ");
        String date = in.nextLine();
        System.out.printf("Today is: %s, %s, %s \n", day, date, month);

    }
}
