package com.company.laba11;

import java.io.*;

public class example1_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try{
            // Создание файловых символьных потоков для чтения и записи:
            br = new BufferedReader(new FileReader("C://Users/VolodarKS/IdeaProjects/JavaLessons/Myfile1.txt"), 1024);
            bw = new BufferedWriter(new FileWriter("C://Users/VolodarKS/IdeaProjects/JavaLessons/Myfile2.txt"));

            int lineCount = 0; // счетчик строк
            String stroka;

            // Переписывание информации из одного файла в другой:
            while ((stroka = br.readLine()) != null){
                lineCount++;
                System.out.println(lineCount+ " : " +stroka);
                bw.write(stroka);
                bw.newLine();   // переход на новую строку
            }

        }catch (IOException e){
            System.out.println("Fuck off" + e);
        } finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}

// Чтение из одного файла и запись в другой файл данных построчно с использованием буфера в 1 килобайт.
