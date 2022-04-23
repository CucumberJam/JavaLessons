package com.company.laba11;

import java.io.*;
import java.util.Scanner;

public class example1_5 {
    public static void main(String[] args) {
        System.out.println("Input the name of the file: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        try{
            File file1 = new File(name);
            file1.createNewFile();
            System.out.println("The whole path to the file is " + file1.getAbsolutePath());

            System.out.println("Input an amount of lines: ");
            int count = in.nextInt();

        // Создается поток для записи с учетом типа данных – DataOutputStream,
        // и ему в качестве параметра передается поток FileOutputStream
            DataOutputStream reg = new DataOutputStream(new FileOutputStream(file1.getAbsolutePath()));

            in.nextLine();  //очистка буфера

            for(int i = 0; i< count; i++){
                System.out.println("Input words in line: ");
                String line = in.nextLine();    //запись отдельной строки в буфер
                reg.writeUTF(line);          // запись отдельных строк в файл
            }
            reg.flush();
            reg.close();

        // Чтение и вывод данных из созданного файла
            DataInputStream rd = new DataInputStream(new FileInputStream(file1));
            while (true){
                System.out.println(rd.readUTF());
            }

        }catch (IOException e){
            System.out.println("Get ot of here " + e);
        }
    }
}

// Создать файл на диске, ввести заданное с клавиату- ры
//количество строк текста и записать их в файл в формате UTF-8.
