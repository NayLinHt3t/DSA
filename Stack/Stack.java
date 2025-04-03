package Stack;
//stack is first in last out(FIFO)
//Add from the top and remove from the top
public class Stack {

    private Node top;
    private int size;
    public Stack(int data){
        Node newNode = new Node(data);
        top = newNode;
        size = 1;
    }
    public void push(int data){
        Node newNode = new Node(data);
        Node temp = top;
        top = newNode;
        top.link(temp);
        size++;
    }
    public void pop(){
        if(size == 1){
            top = null;
        }else{
            Node temp = top;
            top = top.getNextNode();
            temp = null;
            size--;
        }
    }
    public void printAll(){
        //just like the logic from temp pointer to print all element we use p pointer as a temp
        for(Node p = top; p != null; p=p.getNextNode()){
            System.out.print(p.getElement()+ " ");

        }
        System.out.println();
    }
    public static void main(String [] args){
        Stack stack = new Stack(3);
        stack.push(4);
        stack.push(5);
        stack.printAll();
        stack.pop();
        stack.printAll();
    }
}
