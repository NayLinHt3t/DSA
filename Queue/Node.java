package Queue;

public class Node {
    private int element;
    private Node next;

    public Node(int data){
        element = data;
        next = null;
    }
    public void link(Node newNode){
        next = newNode;
    }
    public Node getNext(){
        return next;
    }
    public int getElement(){
        return element;
    }
}
