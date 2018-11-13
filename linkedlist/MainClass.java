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
        /*System.out.println("DELETE:");
        headNode = headNode.deleteNode(headNode,2);
        headNode.printList(headNode);*/
    }

    /*public static void candyArray(){
        int[] numArray = {8,1,1,1,5,3,3,4,2,2,2,2,2,0,2,2,1,19,19,20,20,20,20,4,4,3};

        Stack<Integer> stack = new Stack<Integer>();
        boolean repeated = false;

        stack.push(numArray[0]);
        for(int i = 1; i < numArray.length; i++){
            if(stack.peek() == numArray[i]){
                repeated = true;
            } else if(repeated){
                stack.pop();
                stack.push(numArray[i]);
                repeated = false;
            } else{
                stack.push(numArray[i]);
            }
        }
        if(repeated)
            stack.pop();
        System.out.println(stack);

    }*/

}
