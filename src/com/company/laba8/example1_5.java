package com.company.laba8;

public class example1_5 {
    public static int fib(int x){
        if(x== 0){
            return 0;
        }else if (x==1){
            return 1;
        } else {
            return fib(x-2) + fib(x-1);
        }
    }

}
