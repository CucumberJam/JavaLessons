package com.company.laba11;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class example2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        PrintWriter bw = null;
        Scanner in = new Scanner(System.in);

        try {
            // Создание файлов:
            File f1 = new File("C://Users/VolodarKS/IdeaProjects/JavaLessons/File1Ex2.txt");
            f1.createNewFile(); // для чтения
            File f2 = new File("C://Users/VolodarKS/IdeaProjects/JavaLessons/File2Ex2.txt");
            f2.createNewFile();  // для записи


            //  Создается поток для записи с учетом типа данных:
            bw = new PrintWriter(f1.getAbsolutePath(), StandardCharsets.UTF_8);
            String stroka;

            for (int i = 1; i < 3; i++) {
                System.out.println("Input line for writing in file: ");
                stroka = in.nextLine();
                bw.println(stroka);
                }
            for (int i = 1; i < 6; i++) {
                    System.out.println("Input number: ");
                    double number = in.nextDouble();
                    bw.println(number);
            }

            bw.flush();
            bw.close();

            // Создание потоков для чтения и записи:
            br = new BufferedReader(new InputStreamReader(new FileInputStream(f1.getAbsolutePath()), StandardCharsets.UTF_8));
            bw = new PrintWriter(f2.getAbsolutePath(),StandardCharsets.UTF_8);

            double number;

            for(int i = 1; i< 3; i++){
                stroka= br.readLine();
                if (i == 2) {       // когда дойдет до 2 строки
                    bw.println(stroka);
                }
            }
            for(int i = 1; i< 3; i++){
                number = Double.parseDouble(br.readLine());
               if (number > 0) bw.println(number);
            }

        }catch(IOException e){
            System.out.println("Error: " + e);
        } finally{
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
//  Создать проект, позволяющий из одного, предварительно
//созданного программными средствами файла, переписать данные,
//соответствующие условию - в исходном файле содержится две строки в
//формате UTF-8 и 5 чисел типа double. В результирующий файл переписать
//вторую строку и положительные числа
