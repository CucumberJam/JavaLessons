package com.company.laba10;

public class example1_13 {
    public static void main(String[] args) {
        try{
            int l = args.length;
            System.out.println("размер массива" + l);
            int j = 10/l;
            args[l+l] = "10";
        } catch (ArithmeticException e){
            System.out.print("Деление на ноль - ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException g){
            System.out.println("Индекс не существует - ArrayIndexOutOfBoundsException");
        }
    }
}
