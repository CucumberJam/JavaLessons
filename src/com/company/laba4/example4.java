package com.company.laba4;

import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a height of the triangle: ");
        int height = in.nextInt();
        System.out.print("The width of the triangle: ");
        int width = in.nextInt();
        int triangle [][] = new int [height][width];

        for(int i = height; i > 0; i--){
            for( int j= i; j > 0; j--)
                System.out.print(".");
            System.out.println();
        }
    }
}
