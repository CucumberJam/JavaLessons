package com.company.laba5;

public class SecondClass {
    char ch1;
    char ch2;

    public char[] method(char ch1, char ch2) {
        int X = (int) ch1;
        int Y = (int) ch2;
        if (X < Y) {
            int Z = Y - X;
            char array[] = new char[Z];
            for (int i = 0; i < Z; i++) {
                array[i] = (char) (X + i);
                System.out.print(array[i]);
            }
        } else {
            int Z = X - Y;
            char array[] = new char[Z];
            for (int i = 0; i < Z; i++) {
                array[i] = (char) (Y + i);
                System.out.print(array[i]);
            }
        }
        return new char[0];
    }
}
