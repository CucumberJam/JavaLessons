package com.company.laba4;

import java.util.Scanner;

public class example7_not_working {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number of lines of the array: ");
        int width = in.nextInt();
        System.out.print("Input the number of columns of the array: ");
        int heigh = in.nextInt();
        int ArraySnake [][] = new int[width][heigh];
        int rate = 0;                   //переменная для подсчета использованных значений
        int body = 0;                   //переменная для заполнения элементов массива
        int high = 0;                   //вспомогательная переменная для подсчета строк

        for(int i =0; high < ArraySnake.length; high++){
            for (int j=0; j< ArraySnake.length - rate; j++){
                ArraySnake [i][j] = body;
                System.out.print("#");
                body++;
            }
            if (i< ArraySnake.length-1){
                i++;
            }
            for (int k = width-1; k> rate; k--){
                ArraySnake[k][ArraySnake[i].length-1-rate] = body;
                System.out.print("#");
                body++;
            }
            rate++;

        }

    }
}
