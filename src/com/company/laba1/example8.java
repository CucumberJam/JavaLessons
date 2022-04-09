package com.company.laba1;

import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input surname: ");
        String surname = in.nextLine();
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input second name: ");
        String second = in.nextLine();
        System.out.printf("Hello  %s %s %s \n", surname, name, second);

    }
}
