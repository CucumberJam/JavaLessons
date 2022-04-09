package com.company.laba4;

import java.util.Scanner;

public class example7_01_not_working {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a X:");
        int X = in.nextInt();
        System.out.print("Input a Y:");
        int Y = in.nextInt();
        int array [][] = new int[X][Y];

        for (int i =0; i < Y; i++) {
            if (i % 2 == 0) {
                for(int j = 0; j< X; j++){
                    array [i][j] = i;
                }

            }
            else{
                for(int j= X -1; j>=0; j--){
                    array[j][i] = i +1;
                    array [i][j] = i;
                }
            }
        }
        for (int k = 0; k<X; k++){
            for (int v = 0; v < Y; v++)
                System.out.print(array[k][v] + "\t");
            System.out.println();
        }




    }
}
