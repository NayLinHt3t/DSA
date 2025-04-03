package DoubleLinkedList;
public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public void addFrist(int data){
        Node newNode = new Node(data);
        if(size == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.linkNext(head);
            head.linkPrev(newNode);
            head = newNode;
        }
        size++;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(size == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.linkNext(newNode);
            newNode.linkPrev(tail);
            tail = newNode;

        }
        size++;
    }
    public void removeFirst(){
        if(head.getNextNode() != null || tail.getPrevNode() != null){
            Node temp = head;
            head = head.getNextNode();
            temp = null;
        }else{
            head = null;
            tail = null;
        }
        size --;
    }
    public void removeLast(){
        if(head.getNextNode() != null || tail.getPrevNode() != null){
            Node temp = tail;
            tail = tail.getPrevNode();
            temp = null;
            tail.linkNext(temp);

        }else{
            head = null;
            tail = head;

        }
        size --;

    }
    public void printAll(){
        for( Node p = head; p != null; p=p.getNextNode()){
            System.out.print(p.getElement()+ " ");

        }
        System.out.println();
    }
    public static void main(String [] args){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFrist(12);
        dll.addFrist(22);
        dll.addFrist(34);
        dll.addLast(11);

    }
}

