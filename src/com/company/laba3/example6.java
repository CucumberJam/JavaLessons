package com.company.laba3;

import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input an amount of massive: ");
        int Size = in.nextInt();
        int[] nums = new int[Size];
        int A = 2;
        System.out.println("Numbers in massive which correspond requirements are: ");
        if (Size > 0){
            for (int i=0; i < nums.length; i++){
                nums[i] = A;
                System.out.println(nums[i]);
                A = A + 5;
            }
        }
        else {
            System.out.print("This number is not appropriate, try another one");
            System.exit(0);
        }
    }
}
