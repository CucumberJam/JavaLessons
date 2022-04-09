package com.company.laba3;

import java.util.Scanner;

public class example3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an amount of sequence: ");
        int Size = in.nextInt();
        int prev, next, sum;
        prev = next = 1;
        int i = 2;
        System.out.printf("The size of sequence is %s \n", + Size);
        System.out.printf(" This is Fibonacci sequence: %s, %s, \n", + prev, next);
        while (i< Size){
            sum = prev + next;
            prev = next;
            next = sum;
            System.out.print(sum + " ");
            i++;
        }
    }
}
