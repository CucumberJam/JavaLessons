package com.company.laba5;

import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int min1 = in.nextInt();
        System.out.print("Input another one: ");
        int max1 = in.nextInt();
        SixthClass sixthClass1 = new SixthClass();
        sixthClass1.getMinMax(min1, max1);              // значения присваиваются с помощью метода

        System.out.print("\n");
        System.out.print("Input a number: ");
        int min2 = in.nextInt();
        System.out.print("Input another one: ");
        int max2 = in.nextInt();
        SixthClass sixthClass2 = new SixthClass(min2, max2); // значения присваиваются с помощью конструктора

        sixthClass2.Comparison(sixthClass1);   // значения объектов сравниваются и отбираются с помощью метода

        System.out.print("\n");
        System.out.print("Input a number: ");
        int min3 = in.nextInt();
        System.out.print("Input another one: ");
        int max3 = in.nextInt();
        SixthClass sixthClass3 = new SixthClass(min3, max3);

        SixthClass sixthClass4 = new SixthClass(sixthClass2, sixthClass3); // значения объектов сравниваются и отбираются с помощью конструктора
        System.out.print(sixthClass4);

    }
}


