package com.company.laba11;

import java.io.*;
import java.net.URL;

public class example1_2 {
    // Метод для чтения данных из потока по байтам  с выводом
    public static void readAllByByte(InputStream in) throws IOException {
        while (true) { // пока не конец файла
            int oneByte = in.read();    // читает один байт
            if(oneByte != -1){ // признак отсутствия конца файла (пока не конец файла)
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        try {
            // С потоком чтения связан Файл:
            InputStream inFile = new FileInputStream("C://Users/VolodarKS/IdeaProjects/JavaLessons/testFile1_2.txt");
            readAllByByte(inFile);
            System.out.print("n\n\n");
            inFile.close();

            // С потоком чтения связана интернет-страница
            InputStream inUrl = new URL("https://yandex.ru/").openStream();
            readAllByByte(inUrl);
            System.out.print("n\n\n");
            inUrl.close();

            // С потоком чтения связан массив типа byte
            InputStream inArray = new ByteArrayInputStream(new byte[]{1, 2, 3, 4, 5});
            readAllByByte(inArray);
            System.out.print("n\n\n");
            inArray.close();

        } catch (IOException e){
            System.out.println("Error: " + e);
        }
    }
}

// Прочитать и вывести на экран информацию из трех источников:
//файла на диске, интернет-страницы и массива типа byte.
