package org.practiceDSA.Collection.list.LinkedList.example2;

public class LinkedListService {

   private final LinkedList list;

   public LinkedListService(){
       this.list = new LinkedList();
   }

    public void insertAtFirst(String data){
       Node node = new Node(data);
        node.setNext(list.getHead());
        list.setHead(node);

        if (list.getTail() == null){
            list.setTail(list.getHead());
        }
        list.incrementSize();
    }

    public void insertAtLast(String data){
        Node node = new Node(data);
        if (list.getTail() == null){
            insertAtFirst(data);
            return;
        }
        list.getTail().setNext(node);
        list.setTail(node);
        list.incrementSize();
    }

    public void insertAtPosition(String data, int position){
        if (position < 0 || position > list.getSize()){
            throw new IndexOutOfBoundsException("invalid position");
        }

        if (position == 0){
            insertAtFirst(data);
        }
        if (position == list.getSize()){
            insertAtLast(data);
        }
        Node node = new Node(data);
        Node temp = list.getHead();
        for (int i = 1; i < position; i++){
            temp = temp.getNext();
        }
        node.setNext( temp.getNext());
        temp.setNext(node);
        list.incrementSize();
    }

    public void display(){
        Node temp = list.getHead();
        while (temp != null){
            System.out.print(temp.getData()+" -> ");
            temp = temp.getNext();
        }
        System.out.println("End");

    }
}
