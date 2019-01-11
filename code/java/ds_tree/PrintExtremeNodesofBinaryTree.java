package ds_tree;
import DevelopmentLevel2.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ronik.basak on 25/09/16.
 */
public class PrintExtremeNodesofBinaryTree {

    public static void printCornerNodes(Node root){
        //  star node is for keeping track of levels
        Queue<Node> q = new LinkedList<Node>();

        //Pushing root node and star node
        q.add(root);
        q.add(null);

        // if isFirst = true then left most node of that level
        // will be printed
        boolean isFirst = false;

        // if isOne = true then that level has only one node
        boolean isOne = false;

        // last will store right most node of that level
        int last = 0;

        // Do level order traversal of Binary Tree
        while(!q.isEmpty()){
            //dequeue the front node form the queue
            Node temp = q.peek();
            q.poll();

            // if isFirst is true, then temp is leftmost node
            if(isFirst){
                System.out.print(temp.data + " ");
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);

                // make isFirst as false and one = 1
                isFirst=false;
                isOne=true;
            }

            // Else if temp is a separator between two levels
            else if(temp == null){
                // Insert new separator if there are items in queue
                if(q.size() >= 1)
                    q.add(null);

                // making isFirst as true because next node will be
                // leftmost node of that level
                isFirst = true;

                // printing last node, only if that level
                // doesn't contain single node otherwise
                // that single node will be printed twice
                if (!isOne)
                    System.out.print(last + "  ");
            }
            else {
                // Store current key as last
                last = temp.data;
                // Here we are making isOne = false to signify
                // that level has more than one node
                isOne = false;
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }

        }
    }

    public static void printExtremeNodes (Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        // flag to indicate whether leftmost node or
        // the rightmost node has to be printed
        boolean flag = false;

        while(!q.isEmpty()){
            // nodeCount indicates number of nodes
            // at current level.
            int nodeCount = q.size();
            int n = nodeCount;

            // Dequeue all nodes of current level
            // and Enqueue all nodes of next level
            while(n>=0){
                Node curr = q.peek();

                //Enqueue left child
                if(curr.left!=null)
                    q.add(curr.left);

                //Enqueue right child
                if(curr.right!=null)
                    q.add(curr.right);

                //Dequeue node
                q.poll();

                // if flag is true, print leftmost node
                if(flag && n==(nodeCount-1)){
                    System.out.print(curr.data);
                }

                // if flag is false, print rightmost node
                if(!flag && n==0){
                    System.out.print(curr.data);
                }
                n--;

            }
            flag = !flag;
        }
    }
}
