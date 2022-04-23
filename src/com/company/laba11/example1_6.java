package com.company.laba11;

import java.io.*;

public class example1_6 {
    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;

        try{
            in = new FileReader("C://Users/VolodarKS/IdeaProjects/JavaLessons/Myfile1.txt");
            out = new FileWriter("C://Users/VolodarKS/IdeaProjects/JavaLessons/Myfile2.txt", true);
            // разрешено добавление true

            // Данные считываются и записываются побайтно, как и для InputStream/OutputStream
            int oneByte;
            while ((oneByte = in.read()) != -1){
                // out.write((char)oneByte); // запись с уничтожением ранее
                                            // существующих данных
                out.append((char)oneByte);
                System.out.println((char)oneByte);
            }

        } catch (IOException e){
            System.out.println("Get the F*** out of here " + e);
        } finally {
            in.close();
            out.close();       // метод flush() в FileWriter() не нужен
        }
    }
}

// Чтение из одного файла и запись в другой файл данных посимвольно.
