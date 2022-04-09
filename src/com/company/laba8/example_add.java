package com.company.laba8;

import java.util.Scanner;

public class example_add {
    int amount = 0;
    double middle;
    int sum = 0;
    String Row;
    int[] massiveInt;
    int min;
    int max;


    example_add() {
    }

    public void inputNumbers(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");

        String Row = in.nextLine();
        this.Row = Row;

        String massiveString [] = Row.split(" ");

        int[] massiveInt = new int[massiveString.length];
        this.massiveInt = massiveInt;

        System.out.println("Implementation of method inputNumbers()");
        for (int i = 0; i < massiveInt.length; i++) {
            massiveInt[i] = Integer.parseInt(massiveString[i]);

            System.out.print(" " + massiveInt[i]);
        }

    }

    public void findSum() {
        for (int x : massiveInt){
            if(x% 2 ==0) {
                sum += x;
            }
            this.sum = sum;
        }
        System.out.println();
        System.out.println("Sum of the numbers are: " + sum);
    }

    public void findAmount() {
        this.amount = amount;
        for (int x : massiveInt) {
            if (x % 2 == 0) {
                amount++;
            }
        }
        System.out.println("Amount of the numbers is: " +  amount);

    }

    public void findMiddle(){
        middle = sum / amount;
        System.out.println("The middle number is: " +  middle);
    }

    public void findMin() {
        this.min = min;
        for (int x : massiveInt) {
            if ((x % 2) == 0 && x > 0)
                min = x;
        }
        for (int x : massiveInt) {
            if ((x % 2) == 0 && x > 0){
                if (x < min) {
                    min = x;
                }
            }
        }
        System.out.println();
        System.out.println("The smallest number is: " + min);
    }

    public void findMax() {
        this.max = max;
        for (int x : massiveInt) {
            if ((x % 2) == 0 && x > 0)
                max = x;
        }
        for (int x : massiveInt) {
            if ((x % 2) == 0 && x > 0) {
                if (x > max) {
                    max = x;
                }
            }
        }
        System.out.println();
        System.out.println("The largest number is: " + max);
    }

    public void mixMinMax() {
        int minToMax = min;
        int maxToMin = max;
        for (int i = 0; i<massiveInt.length; i++){
            if(massiveInt[i] == max) massiveInt[i] = minToMax;
        }
        for (int i = 0; i<massiveInt.length; i++){
            if(massiveInt[i] ==min) {
            massiveInt[i] = maxToMin;
            break;
            }
        }
        System.out.println();
        System.out.println("Latest massive after being changed: ");

        for (int x : massiveInt) {
            System.out.print(" " + x);
        }
    }

}
