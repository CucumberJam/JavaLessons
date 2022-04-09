package com.company.laba5;

class FirstClass {
    private char A;

    public char firstmethod (char A){
        return this.A = A;
    }

   public int secondmethod (char A){
        int B = (int) A;
        return B;
    }

    public void thirdmethod (char A, int B){
        System.out.print("The symbol is: " + A + ". The value is: " + B);
    }
}
