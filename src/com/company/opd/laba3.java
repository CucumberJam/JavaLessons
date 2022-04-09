package com.company.opd;

import java.util.Scanner;

public class laba3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int planBudget, currentBudget, realBudget, percentDone;
        float planTime, currentTime, realTime;

        System.out.println("Input planned budget of your project in y.e: ");
        planBudget = in.nextInt();
        if(planBudget < 0) {
            System.out.println("Unaccepted dimension. Please try again.");
            main(args);
        }

        System.out.println("Input set time of your project in month: ");
        planTime = in.nextFloat();
        if(planTime < 0) {
            System.out.println("Unaccepted dimension. Please try again.");
            main(args);
        }

        System.out.println("Input current expenses of the budget: ");
        currentBudget = in.nextInt();
        if(currentBudget < 0) {
            System.out.println("Unaccepted dimension. Please try again.");
            main(args);
        }

        System.out.println("What time has passed since the beginning of the project? ");
        currentTime = in.nextFloat();
        if(currentTime < 0) {
            System.out.println("Unaccepted dimension. Please try again.");
            main(args);
        }

        System.out.println("How much the projected completed in percent? ");
        percentDone = in.nextInt();
        if(percentDone < 0 || percentDone > 100) {
            System.out.println("Unaccepted dimension. Please try again.");
            main(args);
        }
        realTime = (100 * currentTime) / percentDone;

        if(realTime <= planTime){
            System.out.println("There is no delay.");
        } else {
            System.out.printf("There is delay %.1f month.", (realTime - planTime));
        }
        System.out.println();

        realBudget = (100 * currentBudget) / percentDone;

        if (realBudget <= planBudget) System.out.println("There aren't any expenses.");
        else System.out.println("The costs are " + (realBudget - planBudget) + " у. е.");

    }
}
