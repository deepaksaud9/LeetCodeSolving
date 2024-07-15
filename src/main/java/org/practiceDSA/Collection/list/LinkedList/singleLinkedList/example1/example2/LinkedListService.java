package org.practiceDSA.Collection.list.LinkedList.singleLinkedList.example1.example2;

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

    public Node getNode(int index){
       Node node = list.getHead();
       for (int i = 0; i < index; i++){
            node = node.getNext();
       }
       return node;
    }

    public String deleteFirst(){
       String data = list.getHead().getData();
       list.setHead(list.getHead().getNext());
       if (list.getHead() == null){
           list.setTail(null);
       }
       list.decrementSize();

       return data;
    }

    public String deleteLast(){

        if (list.getTail() == null){
            return "already empty";
        }
       if (list.getSize() <= 1){
           return deleteFirst();
       }

       if (list.getHead() == list.getTail()){
           list.setHead(null);
           list.setTail(null);
       }
       Node secondLast = getNode(list.getSize() - 2);
       String data = list.getTail().getData();
       list.setTail(secondLast);
       list.getTail().setNext(null);
       return data;
    }

    public String deleteByIndex(int index){

       if (index < 0 || index > list.getSize()){
           throw new IndexOutOfBoundsException("invalid index");
       }
       if (index == 0 ){
           deleteFirst();
       }
       if (index == list.getSize()){
           deleteLast();
       }

       Node prev = getNode(index - 1);
       String data = prev.getNext().getData();
       prev.setNext(prev.getNext().getNext());
        return data;
    }
}
