package com.company.laba10;

public class example1_12 {
    public static void m(String str,  double d){
        if( str == null){
          throw new IllegalArgumentException("Строка введена неверно - IllegalAccessException");
        }
        if (d > 0.001){
            throw new IllegalArgumentException("Неверное число - IllegalArgumentException");
        }
    }

    public static void main(String[] args) {
        m("null", 0.0001);
    }
}
