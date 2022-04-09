package com.company.laba7;

public class example2 {
    public static void main(String[] args) {
        SecondSuperClass SOS = new SecondSuperClass("pomogite");
        System.out.print("Long of this: " + SOS.getIlong());

        System.out.println();

        SecondSubClass LOL = new SecondSubClass("help in sub class", 20);
        System.out.print("Long of this: " + LOL.getIlong());
        LOL.nothing();
        LOL.getV();



    }
}
