package com.company.laba1;

import java.util.Scanner;

public class example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What month are you intrested in? ");
        String month = in.nextLine();
        System.out.print("How many days this month includes? ");
        int amount = in.nextInt();
        System.out.printf("Month %s includes %d days \n", month, amount);
    }
}
