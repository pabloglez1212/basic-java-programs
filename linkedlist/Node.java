package linkedlist;

/**
 * Created by papple on 4/9/18.
 */
public class Node {

    int data;
    Node next = null;

    public Node(int data){
        this.data = data;
    }

    public void appendNode(int d){
        Node newNode = new Node(d);
        Node actualNode = this;
        while(actualNode.next != null){
            actualNode =  actualNode.next;
        }
        actualNode.next = newNode;
    }

    public Node deleteNode(Node top, int d){
        Node aux = top;

        if(top.data == d){
            top = top.next;
        }
        while(aux.next != null){
            if(aux.next.data == d){
                aux.next = aux.next.next;
                return top;
            }
            aux= aux.next;
        }
        return top;
    }

    public Node printList(Node top){
        Node aux = top;
        System.out.println(data + ",");
        while(aux.next != null){
            System.out.println(aux.next.data + ",");
            aux = aux.next;
        }
        return top;
    }
}
