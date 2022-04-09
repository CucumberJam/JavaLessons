package com.company.laba7;

public class FourthSuperClass {
    public char d;

    FourthSuperClass(char t){
        d = t;
        System.out.println("Super char: " + d);
    }
    FourthSuperClass(FourthSuperClass four){
        d = four.d;
        System.out.println("Super clone char: " + d);
    }
}
