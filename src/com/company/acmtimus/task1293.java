package com.company.acmtimus;


import java.io.PrintWriter;
import java.util.Scanner;

public class task1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int x = a*b*c*2;

        out.println(x);
        out.flush();

    }
}
