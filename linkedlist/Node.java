package linkedlist;
import java.util.Stack;

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
  

    public Node crushNodes(Node top){
        Stack<Node> stack = new Stack<Node>();
        boolean repeated = false;
        Node currentValidNode = top;
        Node tempNode = top.next;
        stack.push(currentValidNode);
        while(tempNode != null){
            if(currentValidNode.data == tempNode.data){
                repeated = true;
            } else if(repeated){
                stack.pop();
                if(stack.size() == 0){
                   top = tempNode; 
                }
                else{
                    currentValidNode = stack.peek();
                    if(currentValidNode.data == tempNode.data){
                        continue;
                    }
                    currentValidNode.next = tempNode;
                }
                
                stack.push(tempNode);
                currentValidNode = stack.peek();
                repeated = false;
                
            } else{
                currentValidNode.next = tempNode;
                stack.push(tempNode);
                currentValidNode = stack.peek();
            }
            tempNode = tempNode.next;
        }
        if(repeated){
            stack.pop();
            if(stack.size() > 0){
                currentValidNode = stack.peek();
                currentValidNode.next = null;
            } else {
                top = null;
            }
            
        }
        
        return top;
    }
}
