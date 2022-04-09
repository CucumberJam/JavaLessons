package com.company.laba4;

import java.util.Objects;
import java.util.Scanner;

public class example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер для алфавита: ");
        int k = in.nextInt();
        char alphabet[] = new char[k];
        System.out.print("Введите ключ: ");
        int key = in.nextInt();
        final int letter = 99;

        for (int i =0; i < k; i++){
            alphabet[i] = (char) (letter+i+ key);
            System.out.print(alphabet[i] + "\n");
        }

        System.out.print("Выполнить обратное преобразование? (y/n) ");
        String n = in.next();

        if (Objects.equals(n, "y")){
            for (int i = 0; i < k; i++ ){
                alphabet[i] = (char) (letter+i);
                System.out.print(alphabet[i] + "\n");
            }
        }
        else if (Objects.equals(n, "n")){
            System.out.print("До свидания!");
        }
        else{
            System.out.print("Введите корректный ответ: ");

        }

    }

}
