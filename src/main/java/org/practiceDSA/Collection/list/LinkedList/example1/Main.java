package org.practiceDSA.Collection.list.LinkedList.example1;

import org.practiceDSA.Collection.list.LinkedList.example1.LL;

public class Main {

    public static void main(String[] args) {
        LL list = new LL();

        list.insertAtFirst(3);
        list.insertAtFirst(4);
        list.insertAtFirst(8);
        list.insertAtFirst(17);
        list.display();

        System.out.println(" ----------------->");
        list.insertAtPosition(2,2);
        list.display();
    }
}
