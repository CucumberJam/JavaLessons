package com.company.laba10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class example2_1_1 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int amount = 0;

        System.out.println("Введите  элементы одномерного массива: ");

        try {
        for(int i=1; i < 10; i++) {

            int h = in.nextInt();

            if (h < 0) {
                throw new ArithmeticException();
            }

            arrayList.add(h);
        }} catch (InputMismatchException j) {
                System.out.println("ОШИБКА: несоответствие типа данных.");
        } catch (ArithmeticException j) {
            System.out.println("ОШИБКА: введенное число не положительное.");
        }


        for (int i : arrayList){   // вычисляет сумму чисел
            sum += i;
        }

        try {
            for (int i : arrayList) {    // вычисляет количество чисел
                amount++;
            }
            System.out.println("среднее значение среди положительных элементов \n" +
                    "одномерного массива: " +  sum / amount);
        } catch (ArithmeticException j){
            System.out.println("Попробуйте еще раз");
        }


    }
}
