package com.company.laba3;

import java.util.Scanner;

public class example1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number from 1 to 7 please: ");
        int i = in.nextInt();
        if (i <= 7 && i >= 1){
            i--;
            String week_days [] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Sunday", "Saturday"};
            System.out.println("The ["+i+"] is the number of " + week_days[i]);
        }
        else{
            System.out.print("Sorry, it's not suitable number for days of week, try another time.");
        }
    }
}
