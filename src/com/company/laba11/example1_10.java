package com.company.laba11;

import java.io.*;

public class example1_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = null;
        PrintWriter wr = null;

        try{
            // Создание потоков:
            rd = new BufferedReader(new InputStreamReader(new FileInputStream("C://Users/VolodarKS/" +
                    "IdeaProjects/JavaLessons/testFile.txt"), "cp1251"));
            wr = new PrintWriter("C://Users/VolodarKS/" +
                    "IdeaProjects/JavaLessons/Vovo.txt", "cp1251");

            // Переписывание информации из одного файла в другой:
            int lineCount = 0;
            String stroka;

            while((stroka = rd.readLine()) != null){
                lineCount++;
                System.out.println(lineCount + ":" + stroka);
            }



        } catch (IOException e) {
            System.out.println("Fuck off " + e);
        } finally {
            rd.close();
            wr.flush();
            wr.close();
        }
    }
}
// Выполнить чтение из одного файла и запись в дру- гой
//файл с использованием класса PrintWriter


// Представленный ниже фрагмент кода демонстрирует работу
//PrintWriter с системным выходным потоком:
//…
//PrintWriter out = new PrintWriter(System.out);
//int lineCount = 0;
//String s;
//// Вывод информации из файла на монитор
//while ((s = br.readLine()) != null)
//{
//lineCount++;
//out.println(lineCount + ": " + s);
//}