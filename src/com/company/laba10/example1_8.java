package com.company.laba10;

public class example1_8 {
    public static int h(){
        try{
            System.out.println("Попытка выполнить в методе - начата:");
            throw new RuntimeException("Создан экземпляр RuntimeException");
        } finally {
            System.out.println("перехвачено finally вместо catch");
        }
    }

    public static void main(String[] args) {
        System.out.println(h());
    }
}
