package com.company.laba10;

public class example1_5 {
    public static void main(String[] args) {
        try{
            System.out.println("Попытка выполнить - начата:");
            throw new RuntimeException("Создан экземпляр RuntimeException с сообщением");
        } catch (NullPointerException d){
            System.out.println("Это исключение не будет перехвачено из-за того, что NullPointerException потомок,а не предок");
        }
        System.out.println("код не выполнен - ошибка компилятора.");
    }
}
