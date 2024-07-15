package org.practiceDSA.Collection.list.LinkedList.singleLinkedList.example1.example2;

public class MainClass {

    public static void main(String[] args) {

        LinkedListService listService = new LinkedListService();
        listService.insertAtLast("Depp");
        listService.insertAtLast("khem");
        listService.insertAtLast("lalit");
        listService.insertAtLast("rabin");
        listService.display();

//        listService.deleteFirst();
//        listService.display();

//        listService.deleteLast();
//        listService.display();
//        System.out.println(listService.deleteLast());
//        listService.display();

        listService.deleteByIndex(1);
        listService.display();

    }
}
