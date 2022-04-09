package com.company.laba8;

import java.util.Scanner;

public class example3_perfomance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a size of massive: ");
        int size = in.nextInt();
        example3 Ex3 = new example3(size);

        System.out.println("Input a first number of massive: ");
        int number = in.nextInt();
        Ex3.setArray(number);
    }
}
