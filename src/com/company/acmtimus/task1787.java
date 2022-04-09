package com.company.acmtimus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1787 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int amount = 1; //    количество машин, успевающих повернуть на «МЕГУ» за установленное время
        int sum = 0;    //    количество машин, не успевающих повернуть на «МЕГУ» за установленное время

        String firstRow = in.nextLine();
        String secondRow = in.nextLine();

        String[] firstRowSplitted = firstRow.split(" ");
        String[] secondRowSplitted = secondRow.split(" ");

        int[] firstRowArray = new int[firstRowSplitted.length];
        int[] secondRowArray = new int[secondRowSplitted.length];

        for (int i = 0; i < firstRowArray.length; i++) {
            firstRowArray[i] = Integer.parseInt(firstRowSplitted[i]);
            amount = amount * firstRowArray[i];
        }
        int k = firstRowArray[0];


        for (int i = 0; i < secondRowArray.length; i++) {
            secondRowArray[i] = Integer.parseInt(secondRowSplitted[i]);
        }

        for (int i : secondRowArray) {
            sum += i;
            if ((sum - k) < 0) sum = 0;
            else sum = sum - k;
        }
        System.out.print(sum);
    }
}

//*  for (int i : secondRowArray) {
//            if (i > k) {
//                sum += i - k;
//                }
//            else if(k>i && sum>0){
//                sum -= k;
//            }
//        }
//        if(sum < 0) sum = 0;
//
//        System.out.println(sum);
//        if(sum == 0){
//            out.print("0");
//        }
//
//    }
//}