package com.company.laba3;

public class example8_not_working {
    public static void main(String[] args) {
        char alphabet[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int Size = 10;

         for (int i : alphabet) {
            if (i == 'A' && i == 'E' && i == 'I' && i == 'O' && i == 'U' && i == 'Y') continue;
            System.out.println(" ");
         }
    }
}


