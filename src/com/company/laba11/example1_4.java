package com.company.laba11;

import java.io.*;
import java.util.Scanner;

public class example1_4 {
    public static void main(String[] args) throws IOException {
        try {
            // Создание исходного файла numIsh.txt и запись в него чисел типа float:
            File file1 = new File("C://My/numIsh.txt");    // создали файл для записи
            file1.createNewFile();

            Scanner in = new Scanner(System.in, "cp1251"); // кодировка кириллицы
            System.out.println("How many numbers you need to write? ");
            int count = in.nextInt();

            DataOutputStream wr = new DataOutputStream(new FileOutputStream(file1.getAbsolutePath()));

            System.out.println("Input numbers: ");
            for (int i = 0; i < count; i++) {
                wr.writeFloat(in.nextFloat());
            }
            wr.flush();
            wr.close();

            // Создание файла numRez.txt и переписывание в него чисел из numIsh.txt:

            File file2 = new File("C://My/numRez.txt");
            file2.createNewFile();

            // поток для чтения из исходного файла numIsh.txt:
            DataInputStream rd = new DataInputStream(new FileInputStream(file1.getAbsolutePath()));

            // поток для записи в результирующий файл numRez.txt:
            DataOutputStream reg = new DataOutputStream(new FileOutputStream(file2.getAbsolutePath()));

            try {
                while (true) {
                    float number = rd.readFloat();
                    reg.writeFloat(number);
                    System.out.println("Number " + number);
                }
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
            reg.flush();
            reg.close();
            rd.close();
        } catch (IOException e){
            System.out.println("End of file.");
        }
    }
}

// Создать первый файл на диске и записать в него заданное
//количество вещественных чисел. Далее создать второй файл и переписать в него
//все числа из первого файла.
