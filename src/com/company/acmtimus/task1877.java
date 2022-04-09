package com.company.acmtimus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1877 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int lock1 = in.nextInt();
        int lock2 = in.nextInt();

        if(lock1%2 == 1 && lock2 % 2 == 0) {
            out.println("no");
            out.flush();
        }
        else {
            out.println("yes");
            out.flush();
        }
    }
}
