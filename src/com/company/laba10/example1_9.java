package com.company.laba10;

public class example1_9 {
    public static int k(){
        try{
            System.out.println("Попытка выполнить в методе - начата:");
            return 23;
        } finally {
            System.out.println("перехвачено finally вместо catch");
        }
    }
    public static void main(String[]args){
        System.out.println(k());
    }
}
