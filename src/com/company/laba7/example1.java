package com.company.laba7;

public class example1 {
    public static void main(String[] args) {
        FirstSuperClass superClassObject = new FirstSuperClass("передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);
        FirstSecondClass subClassObject1 = new FirstSecondClass("передал в конструктор подкласса");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);
        FirstSecondClass subClassObject2 = new FirstSecondClass("передал в конструктор подкласса", "где два параметра");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}
