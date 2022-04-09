package com.company.laba2;

import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int A = in.nextInt();
        if(A%5 == 2 && A%7 == 1){
            System.out.print("yes");
        }
        else{
            System.out.print("No");
        }
    }
}

