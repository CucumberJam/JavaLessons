package com.company.laba7;

public class example5 {
    public static void main(String[] args) {
        FifthSuperClass cuper1 = new FifthSuperClass("What's going on here?");
        String haha1 = cuper1.toString();
        System.out.println(haha1);

        FifthSub1Class cuper2 = new FifthSub1Class("I wonna go home", 43);
        String haha2 = cuper2.toString();
        System.out.println(haha2);

        FifthSub2Class cuper3 = new FifthSub2Class("Leave me alone", '@');
        String haha3 = cuper3.toString();
        System.out.println(haha3);

    }
}
