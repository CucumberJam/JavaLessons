package com.company.laba8;

import java.util.Scanner;

public class example6_b_recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a value of first stack: ");
        int value = in.nextInt();

        System.out.print("Input a step of stacks: ");
        int step = in.nextInt();

        System.out.print("Input an amount of stacks: ");
        int amount = in.nextInt();

        Node c = new Node(value, null);     //ввод, вывод и изменение односвязного линейного списка
        System.out.println("method - createHeadRec(): ");
        c.createHeadRec(step,amount);        //с использованием рекурсии
        System.out.println("method - createTailRec(): ");
        c.createTailRec(step,amount);
        System.out.println("method - toStringRec(): ");
        c.toStringRec(amount);
    }
}
