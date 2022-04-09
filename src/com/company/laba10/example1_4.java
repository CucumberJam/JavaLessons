package com.company.laba10;

public class example1_4 {
    public static void main(String[] args) {
        try{
            System.out.println("Попытка выполнить - начата:");
            throw new RuntimeException("Создан экземпляр RuntimeException с сообщением");
        } catch (NullPointerException d){
            System.out.println("Исключение перехвачено и обработано Классом предком - ullPointerException");
        } catch (Exception d){
            System.out.println("Исключение перехвачено и обработано предком Exception");
        } catch (Error d){
            System.out.println("Исключение перехвачено и обработано Error");
        }
        System.out.println("Вышли из try / catch с обработкой подходящего класса - предка");
    }
}
