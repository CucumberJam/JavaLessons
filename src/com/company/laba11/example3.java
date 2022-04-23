package com.company.laba11;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class example3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br;
        PrintWriter bw;
        String path1 = "C://Users/VolodarKS/IdeaProjects/JavaLessons/StixRead.txt";
        String path2 = "C://Users/VolodarKS/IdeaProjects/JavaLessons/StixWrite.txt";
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(path1), StandardCharsets.UTF_8));
            bw = new PrintWriter((path2), StandardCharsets.UTF_8);

            int lineCount = 0;
            int wordsCount;
            String s;
            String[] words;
            String vowels = "AaEeIiOoYyUu";

            while ((s = br.readLine()) != null) {
                lineCount++;
                wordsCount = 0;
                words = s.split(" ");
                for (String word: words) {
                    if(!vowels.contains(word.substring(0, 1))){
                        bw.print(word + " ");
                        System.out.println(word);
                        wordsCount++;
                    }
                }
                System.out.println("In line " + lineCount + " were " + wordsCount + " words without vowels.");

            }
            br.close();
            bw.flush();
            bw.close();

        }catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
// Создать проект, позволяющий из одного текстового файла,
//содержащего несколько строк (тип String) заранее подготовленного текста
//на русском языке (Пушкин, Лермонтов или другой российсмки классик на
//Ваш вкус), построчно переписать в другой текстовый файл слова
//начинающиеся с согласных букв..
//Требования:
//– слова из предложения выделять методом split();
//– в новом файле следует указать номер строки, в которой иско- мые
//слова находились в исходном файле;
//– для каждой строки указать количество выбранных слов