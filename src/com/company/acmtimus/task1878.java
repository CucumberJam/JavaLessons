package com.company.acmtimus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1878 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int mashines = in.nextInt();
        int minutes = in.nextInt();
        int arr[] = new int[minutes];

        for(int i = 0; i < minutes; ++i) {
            arr[i] = in.nextInt();
        }

        int m = 0;
        for(int i = 0; i < minutes; ++i) {
            m += arr[i];

            if(m - mashines >= 0) {m -= mashines;}
            else {m = 0;}
        }

        out.println(m);
        out.flush();
    }

}
