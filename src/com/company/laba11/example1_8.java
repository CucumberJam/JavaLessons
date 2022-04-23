package com.company.laba11;

import java.io.*;
import java.net.URL;

public class example1_8 {
    public static void readAllByByte(Reader rd) throws IOException{
        while (true){
            int oneByte = rd.read();        // читает 1 байт
            if(oneByte != -1){
                System.out.print((char) oneByte);
            } else{
                System.out.println("End of the file.");
                break;
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        try{
            // С потоком связан файл:
            // байтовый поток:
            InputStream inFile = new FileInputStream("C://Users/VolodarKS/IdeaProjects/JavaLessons/testFile.txt");
            // символьный поток:
            Reader rFile = new InputStreamReader(inFile, "cp1251");

            readAllByByte(rFile);
            System.out.println("n\n\n");

            inFile.close();
            rFile.close();

            // С потоком связана интернет-страница:
            // байтовый поток:
            InputStream inUrl = new URL("https://mail.ru/").openStream();
            // символьный поток:
            Reader rUrl = new InputStreamReader(inUrl, "cp1251");

            readAllByByte(rUrl);
            System.out.println("n\n\n");

            inUrl.close();
            rUrl.close();

            // С потоком связан массив типа byte:
            // байтовый поток:
            InputStream inArray = new ByteArrayInputStream(new byte[]{0, 4, 65, 55, 32, 18});
            // символьный поток:
            Reader rArray = new InputStreamReader(inArray, "cp1251");

            readAllByByte(rArray);
            System.out.println("n\n\n");

            inArray.close();
            rArray.close();
        } catch (IOException e){
            System.out.println("Fuck off " + e);
        }
    }
}
// Прочитать и вывести на экран информацию из трех источников: файла
//на диске, интернет-страницы и массива данных типа byte. Указать кодировку,
//поддерживающую кириллицу.