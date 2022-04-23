package com.company.laba11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class example1_3 {
    // Считывание по 5 символов в буфер
    public static void readAllByArray(InputStream in) throws IOException{
        byte [] buff = new byte[5];
        while(true){    // пока не конец файла
            int count = in.read(buff);
            if(count!= -1) {// признак отсутствия конца файла (пока не конец файла)
                System.out.println("Amount = " + count);
                System.out.println(", buff = " + Arrays.toString(buff));
                System.out.println(", str = " + new String(buff, 0, count,"cp1251")); // Данные буфера преобразовываются в строку  UTF8"
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException{
        String name = "C://Users/VolodarKS/IdeaProjects/JavaLessons/testFile1_2.txt";
        InputStream inFile = null; //переменная объявляется до секции try чтобы не ограничивать область видимости

        try{
            inFile = new FileInputStream(name);
            readAllByArray(inFile);
        } catch (IOException e){
            System.out.println("Error of opening-closing file." + name + e);
        } finally {
            if(inFile!= null){
                try{
                    inFile.close();
                } catch (IOException ignore){
                    /*NOP*/ // ничего не делать
                }
            }
        }

    }
}
// Прочитать и вывести на экран информацию из предварительно
//созданного файла с использованием буфера в 5 байт
