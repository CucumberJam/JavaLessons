package com.company.laba11;

import java.io.*;

public class example1_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = null;
        BufferedWriter wr = null;
        try{
            // Создание потоков для чтения и записи с нужной кодировкой:
            rd = new BufferedReader(new InputStreamReader(new FileInputStream("C://Users/VolodarKS/" +
                    "IdeaProjects/JavaLessons/testFile.txt"), "cp1251"));
            wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C://Users/VolodarKS/" +
                    "IdeaProjects/JavaLessons/tutu.txt"), "cp1251"));

            // Переписывание информации из одного файла в другой:
            int lineCount = 0;   // счетчик строк
            String stroka;
            while((stroka= rd.readLine()) != null){
                lineCount++;
                System.out.println(lineCount + ":" + stroka);
                wr.write(lineCount+ stroka);    // запись без перевода строки
                wr.newLine();       // принудительный переход на новую строку
            }
        } catch (IOException e){
            System.out.println("Fuck off " + e);
        } finally {
            rd.close();
            wr.flush();
            wr.close();
        }
    }
}
//Чтение из одного файла и запись в другой файл данных
//построчно с использованием буферизации символьных потоков основанных на
//байтовых файловых потоках.