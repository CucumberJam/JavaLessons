package com.company.laba10;

public class example1_6 {
    public static void main(String[] args) {
        try{
            System.out.println("Попытка выполнить - начата:");
            throw new NullPointerException("Создан экземпляр NullPointerException");
        } catch (ArithmeticException f){
            System.out.println("Это исключение не будет перехвачено > ArithmeticException потомок.");
        } catch (RuntimeException  g){
            System.out.println("Это исключение изначально было перехвачено Exception");
        } catch (Exception n){
            System.out.println("Это исключение изначально пыталось быть пойманым RuntimeException" +
                    " и на этапе выполнения не может быть перехвачено потому что уже было ранее перехвачено Предком");
        }
        System.out.println("код выполнен - потому что RuntimeException и Exception поменяли местами.");
    }
}
