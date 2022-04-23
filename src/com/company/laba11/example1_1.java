package com.company.laba11;

import java.io.File;

public class example1_1 {
    public static void main(String[] args) {

        try{
            // Создание файла в текущей папке, где находится файл example1_1
            File f1 = new File("MyFile1.txt");
            f1.createNewFile();
            if(f1.exists()){
                System.out.println("File created.");
                System.out.println("Whole path to the File 1: " + f1.getAbsolutePath());
            }
            // Создание файла на диске Е и вывод полного пути
            File f2 = new File("C://Users/VolodarKS/IdeaProjects/JavaLessons/MyFile2.txt");
            f2.createNewFile();
            System.out.println("Whole path to the File 2: " + f2.getAbsolutePath());

            // Создание файла на диске Е в нескольких вложенных папках
            File f3 = new File("C://Papka1/Folder2//Boite3/MyFile3.txt");
            f3.mkdirs();
            System.out.println("Whole path to the File 3: " + f3.getAbsolutePath());

        } catch (java.io.IOException e){
            System.out.println("Error: " + e);
        }
    }
}
// Создание файлов и папок.