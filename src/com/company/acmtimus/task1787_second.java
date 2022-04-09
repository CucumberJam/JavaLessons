package com.company.acmtimus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1787_second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int amount = 1; //    количество машин, успевающих повернуть на «МЕГУ» за установленное время
        int sum = 0;    //    количество машин, не успевающих повернуть на «МЕГУ» за установленное время

        String firstRow = in.nextLine();
        String secondRow = in.nextLine();

        String[] firstRowSplitted = firstRow.split(" ");
        String[] secondRowSplitted = secondRow.split(" ");

        int [] firstRowArray = new int[firstRowSplitted.length];
        int [] secondRowArray = new int[secondRowSplitted.length];

        for (int i = 0; i < firstRowArray.length; i++){
            firstRowArray[i] = Integer.parseInt(firstRowSplitted[i]);
            amount = amount * firstRowArray[i];
        }


        for (int i= 0; i< secondRowArray.length; i++){
            secondRowArray[i] = Integer.parseInt(secondRowSplitted[i]);
            sum += secondRowArray[i];
        }

        if(sum > amount){
            out.print(sum - amount);
        }
        else {
            out.print("0");
        }
        out.flush();

    }
}
