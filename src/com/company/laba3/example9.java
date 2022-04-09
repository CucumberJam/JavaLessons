package com.company.laba3;

import java.util.Random;
import java.util.Scanner;

public class example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the size of massive: ");
        int Size = in.nextInt();

        System.out.println("The size of massive is " + Size);
        int[] nums = new int[Size];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(400);
        }
        int min = nums[0];

        for(int i = 0; i < nums.length; i ++){
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == min) {
                System.out.println("The minimal element of massive ["+i+"] is = " + nums[i]);
            }
        }
    }
}
