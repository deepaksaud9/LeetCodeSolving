package org.practiceDSA.Collection.list.LinkedList.singleLinkedList.example1.example2;

public class Node {
        private String data;
        private Node next;

        public Node(String data){
            this.data = data;
            this.next = null;
        }
        public String getData(){
            return this.data;
        }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
