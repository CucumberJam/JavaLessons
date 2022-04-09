package com.company.acmtimus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = in.nextInt();;
        int M = in.nextInt();
        int X = N * (M + 1);

        out.println(X);
        out.flush();
     }
}
