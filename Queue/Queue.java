package Queue;
//queue is add from the last and remove from the first
public class Queue {
    private Node first;
    private Node last;
    private int size;
    public Queue(int data){
        Node newNode = new Node(data);
        first = newNode;
        last = newNode;
        size = 1;
    }
    //adding from the last element
    public void enqueue(int data){
        Node newNode = new Node(data);
        if(size == 0){
            first = newNode;
            last = newNode;
        }else{
            last.link(newNode);
            last = last.getNext();
        }
        size++;
    }
    //removing from the first element
    public void dequeue(){
        if(size == 0){
            first = null;
            last = null;
        }else{
            Node temp = first;
            first = first.getNext();
            temp = null;

        }
        size--;
    }
    public void printAll(){
        for(Node p=first;p !=null;p=p.getNext()){
            System.out.print(p.getElement() + " ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        Queue queue = new Queue(3);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(1);
        queue.printAll();
        queue.dequeue();
        queue.printAll();
        queue.dequeue();
        queue.printAll();
    }
}
