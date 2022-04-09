package com.company.acmtimus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1820 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt(); // количество котлет
        int k = in.nextInt(); // предельное количество котлет на сковороду
        int time;

        if( n >= k){
            if((2*n)%k ==0){
                time = (2*n)/k;
                out.println(time);
                out.flush();
            }
            else{
                time = (2*n)/k+1;
                out.println(time);
                out.flush();
            }
        }
        else {
            time = 2;
            out.println(time);
            out.flush();

        }
    }
}
