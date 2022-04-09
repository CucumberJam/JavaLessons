package com.company.laba10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class example2_3_2 {
    static void throwOne(byte a) throws NumberFormatException{

    }
    static void throwTwo(byte a) throws IllegalArgumentException {
        if(a>8){
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        List<Byte> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        byte sum = 0;
        String word;

        System.out.println("Введите  элементы одномерного массива: ");

        try {
            while (!(word = in.nextLine()).equals(" ")) {
                byte h = Byte.parseByte(word);
                throwOne(h);
                throwTwo(h);
                list.add(h);
            }
        } catch (NumberFormatException p) {
            System.out.println("ОШИБКА: ввод строки вместо числа");
        }catch (IllegalArgumentException d){
            System.out.println("ОШИБКА: ввод или вычисление значения за границами диапазона типа");
        }
        for (int i : list){   // вычисляет сумму чисел
            sum += i;
        }
        System.out.println("Сумма элементов типа byte одномерного массива: "
                + sum);
    }
}
