package com.company.laba3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Input the size of massive: ");
        int Size = in.nextInt();

        int[] nums = new int[Size];
        int[] target = new int[Size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
        }

        Arrays.sort(nums);
        System.out.println("\n Massive is sorted from the highest to the lowest point: ");

        for (int i = nums.length - 1, j = 0; i >= 0; i--, j++) {
            target[j] = nums[i];

        }
        for (int i = 0; i < target.length; i++) {
            System.out.println("An element of massive [" + i + "] = " + target[i]);
        }
    }
}
