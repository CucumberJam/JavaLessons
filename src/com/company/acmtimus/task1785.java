package com.company.acmtimus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1785 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int A = in.nextInt();
        if (A >= 1 && A <= 4){
            out.print("few");
            out.flush();
        }
        else if (A >= 5 && A <= 9){
            out.print("several");
            out.flush();
        }
        else if (A >= 10 && A <= 19){
            out.print("pack");
            out.flush();
        }
        else if (A >= 20 && A <= 49){
            out.print("lots");
            out.flush();
        }
        else if (A >= 50 && A <= 99){
            out.print("horde");
            out.flush();
        }
        else if (A >= 100 && A <= 249){
            out.print("throng");
            out.flush();
        }
        else if (A >= 250 && A <= 499){
            out.print("swarm");
            out.flush();
        }
        else if (A >= 500 && A <= 999){
            out.print("zounds");
            out.flush();
        }
        else if (A >= 1000 && A <= 2000){
            out.print("legion");
            out.flush();
        }
    }
}

