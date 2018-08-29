/**
 * Created by papple on 8/28/18.
 */
public class QueueImplementation {

    //VERIFY ALL TEST CASES, THIS WAS JUST TO PRACTICE

    Node first = null;
    Node last = null;

    public void addElement(int data){
        Node node = new Node(data);
        if(first == null){
            first = node;
            last = node;
        } else{
            last.next = node;
            last = node;
        }
    }

    public void removeFirstElement(){
        if(first != null){
            first = first.next;
        }
    }

    public void removeLastElement(){
        if(first == null){
            System.out.println("Queue is empty");
        }
        else if(first == last && first != null){
            first = last = null;
        } else{
            Node aux = first;
            while(aux.next != last){
                aux = aux.next;
            }
            aux.next = null;
        }
    }

    public void printQueue(){
        System.out.println("Printing queue");
        Node aux = first;
        while(aux != null){
            System.out.println(aux.getData());
            aux = aux.next;
        }
    }


    public class Node{
        int data;
        Node next = null;

        public Node(int data){
            this.data = data;
        }

        public int getData(){
            return this.data;
        }
    }

    public static void main(String[] args){
        QueueImplementation queue = new QueueImplementation();
        queue.addElement(3);
        queue.addElement(4);
        queue.addElement(6);
        queue.addElement(8);
        queue.addElement(11);

        queue.printQueue();
        queue.removeLastElement();
        queue.printQueue();
        queue.removeFirstElement();
        queue.printQueue();

    }
}
