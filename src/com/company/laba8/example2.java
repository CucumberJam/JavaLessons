package com.company.laba8;

public class example2 {
    public static void binar(int x) {
        if((x/2)>0) {
            binar(x / 2);
        }
        System.out.print(x%2);

    }
}
