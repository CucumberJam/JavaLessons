package com.company.acmtimus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task2012 {
    public static void main(String[] args) {
        int A = 12;
        int time = 240;
        int timepertask = 45;

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int B = in.nextInt();
        if (1> B || B > 11){
            out.print("wrong number");
            out.flush();
        }
        else if(1<= B && B <= 11) {
            int C = A - B;
            if (C * timepertask <= time) {
                out.print("YES");
                out.flush();
            }
            if (C * timepertask > time) {
                out.print("NO");
                out.flush();
            }
        }
    }
}
