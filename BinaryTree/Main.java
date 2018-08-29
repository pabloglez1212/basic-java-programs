package BinaryTree;

/**
 * Created by papple on 5/18/18.
 */

public class Main {

    /*
    *                         8
    *               6                    13
    *         2         7        9               20
    *     1       3                10       17       21
    *                4                 11        19        26
    *
    * */

    public static void main(String []args){
        Node root = new Node(8);
        root.insertNode(6);
        root.insertNode(13);
        root.insertNode(2);
        root.insertNode(3);
        root.insertNode(9);
        root.insertNode(10);
        root.insertNode(20);
        root.insertNode(4);
        root.insertNode(1);
        root.insertNode(17);
        root.insertNode(21);
        root.insertNode(7);
        root.insertNode(11);
        root.insertNode(19);
        root.insertNode(26);
        int valueToSearch = 21;
        System.out.println("Searching value: " + valueToSearch);
        Node x = root.searchNode(valueToSearch);
        System.out.println("Value found: " + x.data);
        root.getHeightTotal(8);
        System.out.println("DEPTH FIRST IN ORDER");
        root.printInOrder();
        System.out.println("");
        System.out.println("BREADTH FIRST");
        root.printBreadthFirst();
        System.out.println("");
        System.out.println("the level of nodes Breadth first");
        root.getLevelBreadthFirst();

    }
}
