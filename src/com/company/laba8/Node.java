package com.company.laba8;

class Node {
    public int value; // значение
    public Node next; // поле – ссылка (указатель) на следующий узел
    public int amount;
    Node head;
    Node tail;

    Node(int value, Node next) {    // поле – ссылка (указатель) на следующий узел
        this.value = value;
        this.next = next;
    }

    //методы ввода, вывода и изменения односвязного линейного списка с использованием цикла:

    public void createHead(int amount) {                   // ввод односвязного линейного списка с головы
        this.amount = amount;
        Node head = null;
        value = value + amount - 1;
        System.out.println("method - createHead: ");
        for (int i = amount; i > 0; i--) {
            head = new Node(value, head);
            System.out.print(" " + head.value);
            value--;
        }
        System.out.println();
        value++;
    }

    public void createTail(int amount) {                           // ввод односвязного линейного списка с хвоста
        this.amount = amount;
        Node tail = new Node(0, null);
        this.tail = tail;
        head = new Node(value, tail);
        System.out.println("method - createTail: ");
        System.out.print(" " + head.value);
        System.out.print(" " + tail.value);
        for (int i = 0; i < amount; i++) {
            value++;
            tail.next = new Node(value, null);
            tail = tail.next;
            System.out.print(" " + tail.value);
        }
        System.out.println();
    }

    public String toString() {    // вывод списка (возвращается строка, сформированная из элементов списка)
        tail = head;
        Node ref = head;
        System.out.println("method - toString: ");
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
        System.out.println();
        return null;
    }

    public void AddFirst(int newValue) {          //добавление элемента в начало списка
        Node firstHead = new Node(newValue, null);
        firstHead.next = head;
        head = firstHead;
        Node ref = head;
        System.out.println("method - AddFirst: ");
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
        System.out.println();
    }

    public void AddLast(int newValue) {                  // добавление элемента в конец списка
        Node newtail = new Node(newValue, null);    // создается новый элемент со значением 123 – будущий хвост
        Node ref = tail = head;                                // для перемещения по списку используется вспомогательная переменная ref,которой в качестве начальной ссылки передается указатель на «голову»
        System.out.println("method - AddLast: ");      //  пока не последний элемент
        System.out.print(" " + ref.value);
        while (ref.next != null) {
            ref = ref.next;
            System.out.print(" " + ref.value);
        }
        ref.next = newtail;
        System.out.print(" " + newtail.value);
        System.out.println();
    }

    public void Insert(int newValue, int number) {             // вставка элемента в список с указанным номером
        Node newNode = new Node(newValue, null);           // создается новый элемент с новым значением для вставки
        Node ref = tail = head;                                      // используем временную переменную
        int k = number - 1;                                   // счетчик элементов
        System.out.println("method - Insert: ");
        System.out.print(" " + ref.value);
        while (ref.next != null && (k < number)) {
            ref = ref.next;                            // поиск нужного положения узла для вставки
            k++;
        }
        newNode.next = ref.next;
        ref.next = newNode;

        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
        System.out.println();

    }

    public void RemoveFirst() {    // удаление элемента с головы списка
        head = head.next;

        Node ref = tail = head;
        System.out.println("method - RemoveFirst: ");
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
        System.out.println();
    }

    public void RemoveLast() {                                   //удаление последнего элемента списка
        Node deleteTail = tail = head;                        // создаем вспомогательную переменную
        while (deleteTail.next.next != null) {         // перемещаемся на предпоследний элемент
            deleteTail = deleteTail.next;
        }
        deleteTail.next = null;                                        // полю next предпоследнего элемента присваиваем null

        System.out.println("method - RemoveLast: ");
        Node ref = tail = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
        System.out.println();
    }

    public void Remove(int number) {                   // удаление из списка элемента с указанным номером
        number--;
        Node delete = tail = head;                      // создаем вспомогательную переменную
        int k = 1;                                     // счетчик элементов
        while (delete.next != null && (k < number)) {  // поиск положения узла, предшествующего удаляемому
            delete = delete.next;
            k++;
        }
        delete.next = delete.next.next;
        System.out.println("method - Remove: ");
        Node ref = tail = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
        System.out.println();
    }


    //методы ввода, вывода и изменения односвязного линейного списка с использованием рекурсии:

    int k = 0;

    public Node createHeadRec(int step, int amount) { // ввод с головы
        this.amount = amount;                  //с использованием рекурсии
        value = value + step;
        if (amount > 0) {
            head = new Node(value, head);
            System.out.println(" " + head.value);
            head.createHeadRec(step, amount - 1);

        }
        return head;

    }

    Node tailRec;

    public Node createTailRec(int step, int amount) { // ввод с хвоста
        this.amount = amount;                  //с использованием рекурсии
        head = new Node(value, tailRec);
        value = value + step;
        if (amount > 0) {
            head.next = new Node(value, head);
            System.out.println(" " + head.value);
            head.createHeadRec(step, amount - 1);

        }
        return head;
    }

    public Node toStringRec(int amount) {         //вывод (возвращается строка, сформированная
        Node ref = head;                   // из элементов списка)
        this.amount = amount;
        if (amount > 0) {
            head.next = new Node(value, head);
            System.out.println(" " + head.value);
            head.toStringRec(amount - 1);
        }
        return head;
    }


}

