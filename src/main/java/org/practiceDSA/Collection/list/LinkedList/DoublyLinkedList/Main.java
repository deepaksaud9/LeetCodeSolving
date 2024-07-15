package org.practiceDSA.Collection.list.LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DLL dll = new DLL();

        dll.insertFirst(1);
        dll.insertFirst(2);
        dll.insertFirst(3);
        dll.insertFirst(4);

        dll.display();

        dll.insertLast(6);
        dll.display();

        dll.insertAfter(3, 99);
        dll.display();
    }
}
