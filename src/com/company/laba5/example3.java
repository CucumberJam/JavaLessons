package com.company.laba5;

import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int K = in.nextInt();
        System.out.println("Input a number: ");
        int M = in.nextInt();

        ThirdClass thirdClass = new ThirdClass();
        thirdClass.setA(K);
        thirdClass.setB(M);
        int sum = thirdClass.getsummAB(K, M);

        System.out.println(thirdClass.getA() + " " + thirdClass.getB(M));
        System.out.println("Sum of them is: " + sum);
    }
}
