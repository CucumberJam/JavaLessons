package com.company.laba5;

class SixthClass {
    private int min, max;

    SixthClass(){
    }

    SixthClass(int i, int j){       // конструктор с двумя аргументами
        if (i < j){
            min = i;
            max = j;
        }
        else {
            max = i;
            min = j;
        }
        System.out.print("The biggest number in constructor is: " + max + " and the smallest number is: " + min);
    }

    void getMinMax(int i, int j){       // метод для присвоения значений с двумя аргументами
          if (i < j){
              min = i;
              max = j;
          }
          else {
              max = i;
              min = j;
          }
        System.out.print("The biggest number is: " + max + " and the smallest number is: " + min);
      }

     void Comparison (SixthClass p){            // метод в котором сраниваются текуущие аргументы и новые новго объекта
          if(p.min < min && p.min < p.max){
              min = p.min;
          }
          else if(p.max < min && p.max < p.min){
              min = p.max;
          }
          else if(p.min > max && p.min > p.max){
              max = p.min;
          }
          else if(p.max > max && p.max > p.min){
              max = p.max;
          }
         System.out.print("\n");
          System.out.print("In method the biggest number from above mentioned constructors is: " + max + " and the smallest number is: " + min);
    }

    SixthClass (SixthClass a, SixthClass b){            // конструктор в котором сравниваются текащие аргументы с новыми нового объекта
        if (a.min < b.min){
            b.min = a.min;
        }
        else if (a.max > b.max){
            b.max = a.max;
        }
        System.out.print("\n");
        System.out.print("The biggest in constructor is: " + b.max + " and the smallest is " + b.min);
        System.out.print("\n");
    }

}



