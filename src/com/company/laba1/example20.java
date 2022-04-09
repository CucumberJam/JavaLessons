package com.company.laba1;

import java.util.Scanner;

public class example20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int A = in.nextInt();
        System.out.print("Input another one: ");
        int B = in.nextInt();
        pow(A, B);
    }
    static void pow(int x, int y){
        double z = Math.pow(x,y);
        int z2 = (int)z;
        System.out.print(z2);
    }
}
