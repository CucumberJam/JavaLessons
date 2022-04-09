package com.company.laba10;

public class example1_11 {
    public static void main(String[] args) {
        try {
            System.out.println("Начата команда");
            throw new NullPointerException("создан объект NullPointerException");
        } catch (NullPointerException r) {
            System.out.println("пойман с catch");
        } finally {
            System.out.println("пойман с finally");
        }
        System.out.println("вышел из finally");
    }

}

