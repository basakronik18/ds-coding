package ds_tree;

import DevelopmentLevel2.Node;
import com.sun.source.tree.BinaryTree;
import ds_tree.*;

import java.util.LinkedList;

/**
 * Created by ronik.basak on 07/09/16.
 */


public class SumofLeafNodesatMinimumLevel {
    Node root;

    //Function to check if a node is a leaf of a tree
    public boolean isLeaf(Node node) {
        return ((node.left == null) && (node.right == null));
    }

    //Calculate sum of all leaf nodes at each level
    int sumLevelData() {
        return sumLevelData(root);
    }

    int sumLevelData(Node node) {
        //Tree is empty
        if (node == null) return 0;

        //Create an empty queue for level order traversal
        LinkedList<Node> q = new LinkedList<Node>();

        //Enqueue root and initialize height
        q.add(node);

        //initialize leaf sum for current level
        int levelSum = 0;

        //Do level order traversal
        while (true) {

            //Nodecount indicates number of node at current level
            int NodeCount = q.size();

            if (NodeCount == 0) break;


            //A boolean variable to indicate if found a leaf node at current level or not
            boolean leafFound = false;

            //Dequeue all nodes from current level and enqueue all nodes of next level
            while (NodeCount > 0) {
                Node node1;
                node1 = q.poll();

                if (isLeaf(node1)) {
                    levelSum += node1.data;
                }
                NodeCount--;

                //Will add children as we need sum of minimum level
                if(node1.left!=null){
                    q.add(node1.left);
                }

                if(node1.right!=null){
                    q.add(node1.right);
                }
            }

            if(levelSum > 0) break;
        }
        return levelSum;
    }

    public static void main(String args[]) {

        /* creating a binary tree and entering
         the nodes */
        SumofLeafNodesatMinimumLevel tree = new SumofLeafNodesatMinimumLevel();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);
        tree.root.left.right.left = new Node(70);
        tree.root.left.right.right = new Node(80);
        tree.root.right.right = new Node(60);
        System.out.println("The sum at minimum level value : "
                + tree.sumLevelData());
    }
}

