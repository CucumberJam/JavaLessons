package com.company.laba10;

public class example1_2 {
    public static void main(String[] args) {
        try{
            System.out.println("Попытка выполнить - начата:");
            throw new RuntimeException("Создан экземпляр RuntimeException с сообщением");
        } catch (Exception d){
            System.out.println("Исключение перехвачено и обработано Классом предком - Exception");
        }
        System.out.println("Вышли из try - RuntimeException/ catch - Exception");

    }
}
