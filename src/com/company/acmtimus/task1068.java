package com.company.acmtimus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        int A = 1;
        int N = in.nextInt();
        int sum = 0;
        int k = 2;
        
        if(N == 0){
            sum = A;
            out.println(sum);
            out.flush();
        }
        else if(N == -1 || N == 1){
            sum = 0;
            out.println(sum);
            out.flush();
        }
        else if(N < -1){
            N = - N;
            int nums[] = new int[N];
            for(int i = 2; i <= nums.length; i++){
                nums [i] = k;
                sum += nums[i];
                k++;
            }
            sum = - sum;
            out.println(sum);
            out.flush();
        }
        else if(N > 1) {
            int nums[] = new int[N];
            for (int i = 2; i <= nums.length; i++) {
                nums[i] = k;
                sum += nums[i];
                k++;
            }
            out.println(sum);
            out.flush();
        }
    }
}
