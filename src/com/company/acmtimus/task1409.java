package com.company.acmtimus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int A = in.nextInt();
        int B = in.nextInt();

        int C = A+B-1;
        int A2 = C - A;
        int B2 = C - B;

        out.println(A2);
        out.println(B2);
        out.flush();
    }
}
