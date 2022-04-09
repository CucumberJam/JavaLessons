package com.company.laba4;

import java.util.Random;
import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number of lines of the array: ");
        int width = in.nextInt();
        System.out.print("Input the number of columns of the array: ");
        int heigh = in.nextInt();
        int sourse[][] = new int[width][heigh];

        int minwidth = width - 1;
        int minheigh = heigh - 1;
        int[][] target = new int[width - 1][heigh - 1];

        Random random = new Random();

        int newX = random.nextInt(minwidth);
        int newY = random.nextInt(minheigh);

        System.out.println("The array is completed: ");
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < heigh; j++) {
                sourse[i][j] = random.nextInt(9);
                System.out.print(sourse[i][j]);
            }
            System.out.println();
        }

        System.out.println("The array after random line and columns were deleted: ");
        for (int i = 0, newi = 0; i< width; i++){
            if (i == newX) {
                continue;
            }
            for (int j= 0,  newj = 0; j< heigh; j++){
                if (j == newY) {
                    continue;
                }
                target[newi][newj] = sourse[i][j];
                System.out.print(target[newi][newj]);
                newj++;
            }
            newi++;
            System.out.println();
        }
        System.out.printf("In the array above mentioned the line %d and column %d were deleted.\n", newX+1, newY+1);
    }
}
