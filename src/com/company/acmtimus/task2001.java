package com.company.acmtimus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task2001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int A1 = in.nextInt();
        int B1 = in.nextInt();
        int A2 = in.nextInt();
        int B2 = in.nextInt();
        int A3 = in.nextInt();
        int B3 = in.nextInt();


        out.println((A1 - A3) + " " + (B1 - B2));
        out.flush();
    }
}
