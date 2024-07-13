package org.practiceDSA.Collection.list.LinkedList.example1;

public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }


    public void insertAtFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insertAtLast(int val){
        Node node = new Node(val);
        if (tail == null){
            insertAtFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size += 1;
    }


    public void insertAtPosition(int val, int position){
        if (position < 0 || position > size){
            throw new IndexOutOfBoundsException("Invalid position");
        }

        if (position == 0){
            insertAtFirst(val);
            return;
        }
        if (position == size){
            insertAtLast(val);
            return;
        }

        Node node = new Node(val);
        Node temp = head;

        for (int i = 1; i < position; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size += 1;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
