package com.company.laba10;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class example2_2_2 {
    static void throwOne(int a, int b) throws InputMismatchException {

    }
    static void throwTwo(int str, int chostr, int stl, int chstl) throws ArrayIndexOutOfBoundsException {
        if (str < chostr | stl< chstl) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void main(String[] args) {
        int stroki = 10;
        int stolby = 10;
        int nums[][] = new int[stroki] [stolby];
        Random r = new Random(100);
        for(int i = 0; i < stroki; i++) {
            for (int j = 0; j < stolby; j++) {
                nums[i][j] = r.nextInt(100);
            }
        }

        System.out.println("Массив: "); //  для проверки корректности заполнения массива
        for(int i=0; i < stroki; i++){
            for(int j=0; j< stolby; j++){
                System.out.print(nums [i][j] +  " ");
            }
            System.out.println();
        }

        Scanner in = new Scanner(System.in);
        int chooseLine;
        int chooseColumn;

        try {
            System.out.println("Введите номер строки: ");
            chooseLine = in.nextInt();
            System.out.println("Введите номер столба: ");
            chooseColumn = in.nextInt();

            throwOne(chooseLine, chooseColumn);
            throwTwo(stroki, chooseLine, stolby, chooseColumn);

            System.out.print(nums [chooseLine-1][chooseColumn-1] +  " ");

        } catch (InputMismatchException l){
            System.out.println("ОШИБКА: ввод строки вместо числа");
        } catch (ArrayIndexOutOfBoundsException d) {
            System.out.println("ОШИБКА: нет столбца/ строки с таким номером");
        }

    }


}
