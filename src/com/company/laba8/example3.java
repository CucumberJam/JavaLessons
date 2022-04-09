package com.company.laba8;

public class example3 {
    int array[];
    example3(int i){
        array = new int[i];
    }
    int step = 0;
    void setArray(int i) {
        if (step < array.length) {
            array[step] = i;
            System.out.println("[" + (step) + "]" + array[step]);
            step++;
            setArray(i + 1);
        }
    }
}


