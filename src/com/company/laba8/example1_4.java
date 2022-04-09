package com.company.laba8;

public class example1_4 {
    public static int fact(int x){
        int result;
        if(x==1) return 1;
        else {
            result = x*fact(x-1);
            return result;
        }
    }
}
