package com.company.laba3;

import java.util.Objects;
import java.util.Scanner;

public class example2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the name of the day of the week: ");
        String week_days = in.nextLine();
        if (Objects.equals(week_days, "Monday") || Objects.equals(week_days, "monday")){
            System.out.printf("%s is 1 day of the week \n", week_days);
        }
        else if (Objects.equals(week_days, "Tuesday") || Objects.equals(week_days, "tuesday")){
            System.out.printf("%s is 2 day of the week \n", week_days);
        }
        else if (Objects.equals(week_days, "Wednesday") || Objects.equals(week_days, "wednesday")){
            System.out.printf("%s is 3 day of the week \n", week_days);
        }
        else if (Objects.equals(week_days, "Thursday") || Objects.equals(week_days, "thursday")){
            System.out.printf("%s is 4 day of the week \n", week_days);
        }
        else if (Objects.equals(week_days, "Friday") || Objects.equals(week_days, "friday")){
            System.out.printf("%s is 5 day of the week \n", week_days);
        }
        else if (Objects.equals(week_days, "Sunday") || Objects.equals(week_days, "sunday")){
            System.out.printf("%s is 6 day of the week \n", week_days);
        }
        else if (Objects.equals(week_days, "Saturday") || Objects.equals(week_days, "saturday")){
            System.out.printf("%s is 7 day of the week \n", week_days);
        }
        else {
            System.out.print("Sorry, this name doesn't correspond to any of existing days of week.");
        }
    }

}
