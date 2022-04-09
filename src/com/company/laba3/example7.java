package com.company.laba3;

public class example7 {
    public static void main(String[] args) {
        int Size = 10;
        char[] symbs = new char[Size];
        char letter = 'a';

        for(int i=0; i < symbs.length; i++){
            symbs[i] = letter;
            System.out.println("The massive includes: " + symbs[i]);
             letter +=2;
            }
        System.out.print("\n");

        for (int j = 9; j >=0; j--){
            System.out.println("The massive after being reversed: " + symbs[j]);
        }
    }
}
