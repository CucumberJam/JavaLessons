package com.company.laba3;

import java.util.Scanner;

public class example2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the name of the day of the week: ");
        String week_days = in.nextLine();
        switch (week_days){
            case "Monday" :
            case "monday" :
                System.out.printf("%s is 1 day of the week \n", week_days);
                break;
            case "Tuesday" :
            case "tuesday" :
                System.out.printf("%s is 2 day of the week \n", week_days);
                break;
            case "Wednesday" :
            case "wednesday" :
                System.out.printf("%s is 3 day of the week \n", week_days);
                break;
            case "Thursday" :
            case "thursday" :
                System.out.printf("%s is 4 day of the week \n", week_days);
                break;
            case "Friday" :
            case "friday" :
                System.out.printf("%s is 5 day of the week \n", week_days);
                break;
            case "Sunday" :
            case "sunday" :
                System.out.printf("%s is 6 day of the week \n", week_days);
                break;
            case "Saturday" :
            case "saturday" :
                System.out.printf("%s is 7 day of the week \n", week_days);
                break;
            default:
                System.out.print("Sorry, this name doesn't correspond to any of existing days of week.");
        }
    }
}
