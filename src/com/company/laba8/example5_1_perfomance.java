package com.company.laba8;

public class example5_1_perfomance {
    public static void main(String[] args) {

        // создание 1-го узла, который изначально является и головой, и хвостом списка
        Node head = new Node(0, null);
        Node tail = head;
        // добавление элементов с наращиванием хвоста
        for(int i = 0; i<9; i++){
            tail.next = new Node(i+1, null);
            tail = (Node) tail.next;   // указатель на созданный элемент запоминается
        }                       // как указатель на новый хвост

        // вывод элементов на экран
        Node ref = head;
        while(ref != null){
            System.out.print(" " + ref.value);
            ref = (Node) ref.next;
        }
    }
}
