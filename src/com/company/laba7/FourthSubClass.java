package com.company.laba7;

public class FourthSubClass extends FourthSuperClass{
    public String text;

    FourthSubClass(char t, String text) {
        super(t);
        this.text = text;
        System.out.println("Sub char: " + d + "\n" +
                            "Sub text: " + text);
    }

    FourthSubClass(FourthSubClass four) {
        super(four);
        text = four.text;
        System.out.println("Sub clonechar: " + d + "\n" +
                "Sub clone text: " + text);
    }
}
