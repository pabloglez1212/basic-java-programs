package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by papple on 5/18/18.
 */
public class Node {

    Node right;
    Node left;
    int data;
    int heigh=0;

    public  Node(int data){
        System.out.println("tree created with " + data);
        this.data = data;
        right = left = null;
    }

    public void insertNode(int data){

        if(this.data > data){
            if(left != null){
                left.insertNode(data);
            } else {
                Node temp = new Node(data);
                left = temp;
            }
        } else if(this.data < data){
            if(right != null){
                right.insertNode(data);
            } else {
                Node temp = new Node(data);
                right = temp;
            }
        }
    }

    public void printInOrder(){
        if(left != null){
            left.printInOrder();
        }
        System.out.print(data + ", ");
        if(right != null){
            right.printInOrder();
        }
    }

    public Node searchNode(int data){
        if(this.data == data)
            return this;

        if(this.data > data){
            if(left != null){
                return left.searchNode(data);
            } else {
                return null;
            }
        } else{
            if(right != null){
                return right.searchNode(data);
            } else {
                return null;
            }
        }
    }

    public void getHeightTotal(int data){
        Node rootTemp = searchNode(data);
        System.out.println("The height from node " + rootTemp.data + " is " + rootTemp.getHeight());
    }

    public int getHeight(){

        if (left == null && right == null)
            return -1;

        if(left == null && right != null)
            return right.getHeight() + 1;
        if(left != null && right == null)
            return left.getHeight() + 1;

        if(left.getHeight() > right.getHeight())
            return left.getHeight() + 1;
        else
            return right.getHeight() + 1;

    }

    public void printBreadthFirst(){

        Queue<Node> treeQueue = new LinkedList<Node>();
        treeQueue.add(this);

        while(treeQueue.size() > 0){
            Node aux = treeQueue.remove();
            System.out.print(aux.data + ", ");
            if(aux.left != null)
                treeQueue.add(aux.left);
            if(aux.right != null)
                treeQueue.add(aux.right);
        }


    }

    public void getLevelBreadthFirst(){

        Queue<Node> treeQueue = new LinkedList<Node>();
        treeQueue.add(this);
        int level = 0;
        int levelCount = 1;
        int idx=1;

        while(treeQueue.size() > 0){

            if(levelCount < treeQueue.size()) {
                levelCount = treeQueue.size();
                level = idx;
            }

            ArrayList<Node> levelList = new ArrayList<Node>();
            while(treeQueue.size() > 0){
                levelList.add(treeQueue.remove());
            }

            for (int i = 0; i < levelList.size(); i++) {
                Node aux = levelList.get(i);
                if(aux.left != null)
                    treeQueue.add(aux.left);
                if(aux.right != null)
                    treeQueue.add(aux.right);
            }
                idx++;
        }

        System.out.println("The level with more nodes is: " + level + ", with " + levelCount + " nodes");

    }

}

