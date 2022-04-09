package com.company.laba10;

public class example1_7 {
    public static void main(String[] args) {
        try {
            System.out.println("Попытка выполнить - начата:");
            throw new NullPointerException("Создан экземпляр NullPointerException");
        } catch (NullPointerException s) {
            System.out.println("Это исключение перехвачено NullPointerException");
        }
        try{
            System.out.println("Попытка выполнить - начата:");
            throw new ArithmeticException("Создан экземпляр ArithmeticException");
        } catch (ArithmeticException x) {
            System.out.println("Это исключение перехвачено ArithmeticException");
        }
        System.out.println("Вышли из try / catch двумя обработчиками:NullPointerException и  ArithmeticException");

    }
}
