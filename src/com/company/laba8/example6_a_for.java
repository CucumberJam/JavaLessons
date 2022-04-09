package com.company.laba8;

import java.util.Scanner;

public class example6_a_for {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a value of first stack: ");
        int value = in.nextInt();

        System.out.print("Input an amount of stacks: ");
        int amount = in.nextInt();

        Node x = new Node(value, null);

        x.createHead(amount);
        x.createTail(amount);
        x.toString();

        System.out.print("Input a new value of additional stack: ");
        int newValue = in.nextInt();
        x.AddFirst(newValue);
        x.AddLast(newValue);

        System.out.print("Input a number of stack needed to put new stack: ");
        int beforeNumber = in.nextInt();
        x.Insert(newValue,beforeNumber);
        x.RemoveFirst();
        x.RemoveLast();

        System.out.print("Input a number of stack before which need to delete stack: ");
        int deleteNumber = in.nextInt();
        x.Remove(deleteNumber);

    }
}
