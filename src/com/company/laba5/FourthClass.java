package com.company.laba5;

public class FourthClass {
    char C;
    int I;

    public char getC() {
        return C;
    }

    public int getI() {
        return I;
    }

    public void setI(int i) {
        I = i;
    }

    public void setC(char c, int i) {
        C = c;
        I = i;
    }

    double volume() {
        double S = (double) C;
        if (I < 100) {
            double A = (double) I / 100;
            return A + S;
        } else if (I > 100) {
            double A = (double) I / 1000;
            double roundOff = (double) Math.round(A * 100) / 100;
            return roundOff + S;
        }
        return S;
    }
}