package org.practiceDSA.Collection.list.LinkedList.CircularLinkedList;

public class Main {

    public static void main(String[] args) {

        CircularLL cList = new CircularLL();
        cList.insertAtTail(1);
        cList.insertAtTail(2);
        cList.insertAtTail(3);
        cList.insertAtTail(4);
        cList.insertAtTail(5);
        cList.insertAtTail(6);
//        cList.insertAtTail(3);
//        cList.insertAtTail(4);
        cList.display();

    }
}
