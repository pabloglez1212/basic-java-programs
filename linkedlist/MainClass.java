package linkedlist;
/**
 * Created by papple on 4/9/18.
 */
public class MainClass {

    public static void main(String[] args){
        Node headNode = new Node(4);
        headNode.appendNode(4);
        headNode.appendNode(4);
        headNode.appendNode(1);
        headNode.appendNode(6);
        headNode.appendNode(5);
        headNode.appendNode(5);
        headNode.appendNode(5);
        headNode.appendNode(6);
        headNode.appendNode(6);
        headNode.appendNode(7);
        headNode.appendNode(7);
        headNode.appendNode(8);
        headNode.appendNode(9);
        headNode.appendNode(9);
        headNode.printList(headNode);
        System.out.println("CRUSHED:");
        headNode = headNode.crushNodes(headNode);
        headNode.printList(headNode);
        System.out.println("DELETE:");
        headNode = headNode.deleteNode(headNode,2);
        headNode.printList(headNode);
    }
}
