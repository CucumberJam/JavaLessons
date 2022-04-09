package com.company.laba4;

import java.util.Random;
import java.util.Scanner;

public class example7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Input the number of columns of the array: ");
        int width = console.nextInt();
        System.out.print("Input the number of lines of the array: ");
        int height = console.nextInt();

        int[][] array1 = new int[height][width];
        int count = 0;

        for (int i = 0; i < height; i++) {
            if(i % 2 == 0) {
                for(int j = 0; j < width; j++) {
                    array1[i][j] = count;
                    count++;
                }
            } else {
                for(int j = width-1; j >= 0; j--) {
                    array1[i][j] = count;
                    count++;
                }
            }
        }

        System.out.print("This is snake: " + "\n");

        for (int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                System.out.printf("\t%d", array1[i][j]);
            }
            System.out.print('\n');
        }
    }
}
