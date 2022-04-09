package com.company.laba3;

import java.util.Scanner;

public class example6_2_not_working {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a size of massive: ");
        if (in.hasNextInt()) {
            int Size = in.nextInt();
            if (Size > 0) {
                System.out.println("The size of massive is "+ Size);
                int[] nums = new int[Size];
                int x = 0;
                int i = 0;
                while (x<Size) {
                    i++;
                    if (i%5 == 2) {
                        nums[x] = i;
                        System.out.println("An element of massive ["+x+"] = " + nums[x]);
                        x++;
                    }
                }
                System.out.println("The end of the massive");
            }
            else {
                System.out.println("Inappropriate number.");
            }
        }
        else {
            System.out.println("Unclear statement.");
        }
    }
}

