package com.company.laba3;

import java.util.Random;
import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a size of massive with random numbers: ");
        int Size = in.nextInt();
        int[] nums = new int[Size];
        int sum = 0;

        Random rd = new Random();
        for(int i=0; i < nums.length; i++){
            nums[i] = rd.nextInt(100);
        }

        System.out.println("These numbers correspond requirements: being divided by 5 with 1 in remain or 3 with 1 accordingly:");

        for (int x: nums){
            if(x%5 == 2 || x%3 == 1) {
                System.out.println("Number is: " + x);
                sum += x;
            }
        }

        System.out.println("The sum of numbers above mentioned: " + sum);

    }
}

