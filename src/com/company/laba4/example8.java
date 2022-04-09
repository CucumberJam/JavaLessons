package com.company.laba4;

import java.util.Objects;
import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String Text = in.nextLine();
        char[] Textafter = new char[Text.length()];
        System.out.print("Введите ключ: ");
        int key = in.nextInt();

        for (int i = 0; i < Text.length(); i++) {
            Textafter[i] = (char) (Text.charAt(i) + key);
        }

        System.out.print("Текст после преобразования : " + new String(Textafter));
        System.out.println();


        System.out.print("Выполнить обратное преобразование? (y/n): ");
        String str = in.next();

        System.out.println("\n");


        if (Objects.equals(str, "y")) {
            for (int i = 0; i < Textafter.length; i++) {
                Textafter[i] = (char) ((char) Textafter[i] - key);
                System.out.print("Текст после преобразования : " + Textafter[i] + "\n");
            }
        }
        else if (Objects.equals(str, "n")){
                System.out.print("До свидания!");
        }
        else{
            System.out.print("Введите корректный ответ: ");
        }
    }
}

