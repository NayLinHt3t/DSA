package DoubleLinkedList;
//DoubleLinkedList consist of three attributes: 1.element,2.next,3.prev
//an element is an integer and next and prev is the Node itself
//next refers to the next Node and prev refers to the previous Node
//double linked-list has two directions
public class Node {
    private int element;
    private Node next;
    private Node prev;
    public Node(int data){
        element = data;
        next = null;
        prev = null;
    }
    public void linkNext(Node node){
       next = node;
    }
    public void linkPrev(Node node){
        prev = node;
    }

    public int getElement() {
        return element;
    }

    public Node getNextNode() {
        return next;
    }
    public Node getPrevNode(){
        return prev;
    }
}
