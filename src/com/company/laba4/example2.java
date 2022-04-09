package com.company.laba4;

public class example2 {
    public static void main(String[] args) {
        outler: for(int i = 0; i< 8; i++){
        for(int j= 0; j< 8; j++) {
            if(j>i){
                System.out.println();
                continue outler;
            }
            System.out.print("*");
        }
        }
        System.out.println();
    }
}
