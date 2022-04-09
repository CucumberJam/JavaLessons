package com.company.laba5;

public class TestMain {
    public static void main(String[] args) {
        TestClass testclass1 = new TestClass();
        testclass1.setFirstname("Kukov");
        testclass1.setLastname("Kuka");
        testclass1.setAge(29);
        System.out.println(testclass1.getFirstname() + " " + testclass1.getLastname());
        System.out.println(testclass1.getAge());


        TestClass testclass2 = new TestClass("Puka", "Puk", 67);

        System.out.println(testclass2.getFirstname() + " " + testclass2.getLastname());
        System.out.println(testclass2.getAge());

    }
}
