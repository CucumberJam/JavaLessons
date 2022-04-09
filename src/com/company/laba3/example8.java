package com.company.laba3;

public class example8 {
    public static void main(String[] args) {
        final int letterA = 65;
        char[] alphabet = new char[26];
        char[] targetArray = new char[10];

        for (int count =0; count < 26; count++){
            alphabet[count] = (char) (letterA+count);
        }

        for (int count = 0, i = 0; count < 10; i++) {
            if (alphabet[i] == 'A' && alphabet[i] == 'E' && alphabet[i] == 'I' && alphabet[i] == 'Y' && alphabet[i] == 'U') {
                continue;
            }
            targetArray[count] = alphabet[i];
            count++;
        }
        System.out.println("The list of first 10 letters: ");
    }
}
