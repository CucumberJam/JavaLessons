package com.company.laba10;

public class example1_1 {
    public static void main(String[] args) {
        try{
            System.out.println("Попытка выполнить - начата:");
            throw new RuntimeException("Создан экземпляр RuntimeException с сообщением");
        } catch (RuntimeException d){
            System.out.println("Исключение перехвачено и обработано");
        }
        System.out.println("Вышли из try / catch. ");
    }
}
