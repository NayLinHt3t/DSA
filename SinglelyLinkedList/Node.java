package SinglelyLinkedList;

//SingelyLinkedList Node consist of two attributes, 1.element and 2.next
//an element is an integer value and next is a node itself
//an example of Node look like this  {element: 4,next: null}
//links of node element will look like
//{element:4, next:
//                  {element: 3, next :
//                                      {element:2, next:  null}
//                    }
//  }
//logically it gonna look like
// 4 -> 3 -> 2

public class Node {
    private int element;
    private Node next;

//constructor to create a node
//example code: Node newNode = new Node(4);
    public Node(int data) {
        element = data;
        next = null;
    }
//this link method will use when you want to link one node to another
//example code: newNode.link(node);
    public void link(Node newNode) {
        next = newNode;
    }

    public Node getNextNode() {
        return next;
    }

    public int getElement() {
        return element;
    }

}

