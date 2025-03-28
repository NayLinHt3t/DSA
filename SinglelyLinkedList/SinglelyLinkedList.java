package SinglelyLinkedList;
public class SinglelyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int data){

        Node newNode = new Node(data);
        //the above code will create a node object

        if(size == 0){

            head = newNode;
            tail = newNode;
        }else{
            //adding new node to the head node if already exist
            newNode.link(head);
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
            tail.link(newNode);
            tail = newNode;
        }
        size++;
    }
    public void removeFirst(){
        //if there is more than one node
        if(head.getNextNode() != null){
            //use the temp pointer to get rid of the first node(head)
            Node temp = head;
            //point head to the next node
            head = head.getNextNode();
            //get rid of the first node(the original head pointed variable)
            temp = null;
        }else{
            head = null;
            tail = null;
        }
    }

public void removeLast(){
        //if there is more than one node
    if(head.getNextNode() != null){
        //we need a record of a head node so we use temp variable for the looping attempt
        Node temp = head;
        //we want to get rid of the last node so we have to put the point node before the last node as
        //a temp node
        while(temp.getNextNode().getNextNode() != null){
            temp = temp.getNextNode();
        }
        //put the node before the last node as a tail(temp)
        tail = temp;
        //to get rid of the last node, point the temp pointer as the last node
        temp = temp.getNextNode();
        //get rid of last node by giving the null variable
        temp = null;
        //link the tail pointer with the temp variable(null) so that the tail become the last node
        tail.link(temp);
    }
    else{
        head = null;
        tail = null;
    }
}
    public void printAll(){
        //just like the logic from temp pointer to print all element we use p pointer as a temp
        for(Node p=head;p != null;p=p.getNextNode()){
            System.out.print(p.getElement()+ " ");

        }
        System.out.println();
    }
    public static void main(String [] args){
        //using the default constructor cuz there is no constructor defined

        SinglelyLinkedList sll = new SinglelyLinkedList();
        sll.addFirst(3);
        sll.addLast(4);
        sll.addFirst(5);
        sll.addLast(6);
        sll.printAll();
        sll.removeFirst();
        sll.printAll();
        sll.removeLast();
        sll.printAll();
    }
}






