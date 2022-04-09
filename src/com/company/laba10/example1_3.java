package com.company.laba10;

public class example1_3 {
    public static void main(String[] args) {
        try{
            System.out.println("Попытка выполнить - начата:");
            throw new RuntimeException("Создан экземпляр RuntimeException с сообщением");
        } catch (NullPointerException d){
            System.out.println("Исключение перехвачено и обработано NullPointerException");
        } catch (RuntimeException d){
            System.out.println("Исключение перехвачено и обработано RuntimeException");
        } catch (Exception d){
            System.out.println("Исключение перехвачено и обработано предком Exception");
        }
        System.out.println("Вышли из try / catch с обработкой подходящего класса");
    }
}
