package com.company.laba7;

public class FourthSubSubClass extends FourthSubClass{
    public int y;

    FourthSubSubClass(char t, String text, int j) {
        super(t, text);
        y = j;
        System.out.println("Sub-sub char: " + d + "\n" +
                "Sub-sub text: " + text + "\n" +
                "Sub-sub number: " + y);
    }

    FourthSubSubClass(FourthSubSubClass four) {
        super(four);
        y = four.y;
        System.out.println("Sub-sub clone char: " + d + "\n" +
                "Sub-sub clone text: " + text+ "\n" +
                "Sub-sub clone number: " + y);
    }
}
