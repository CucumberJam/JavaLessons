package com.company.laba8;

public class example1_1 {
    public static void m(int x){
        System.out.println("x= " + x);
        if((2*x+1) < 20){
            m(2*x+1);
        }
    }
}
