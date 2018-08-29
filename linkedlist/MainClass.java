package linkedlist;
/**
 * Created by papple on 4/9/18.
 */
public class MainClass {

    public static void main(String[] args){
        Node headNode = new Node(4);
        headNode.appendNode(5);
        headNode.appendNode(6);
        headNode.appendNode(7);
        headNode.appendNode(8);
        headNode.appendNode(9);
        headNode = headNode.deleteNode(headNode,7);
        headNode.printList(headNode);
    }

}
