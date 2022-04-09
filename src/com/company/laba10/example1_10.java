package com.company.laba10;

public class example1_10 {
    public static int h(){
        try{
            System.out.println("Попытка выполнить в методе - начата:");
            return 23;
        }finally {
            System.out.println("перехвачено finally return в блоке finally");
            return 13;
        }
    }
    public static void main(String[] args){
        System.out.println(h());
    }
}
