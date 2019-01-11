

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ronik.basak on 07/08/16.
 */
public class BinaryTreeLevelOrderUsingQueue {
    public static Node root;
    public static void printLevelOrderQ(){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node tempNode = queue.poll();
            System.out.print(tempNode.key+" ");

            if(tempNode.left!=null){
                queue.add(tempNode.left);
            }

            if(tempNode.right!=null){
                queue.add(tempNode.right);
            }
        }
    }

    public static void main (String args[]){
        BinaryTreeLevelOrderUsingQueue tree = new BinaryTreeLevelOrderUsingQueue();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        printLevelOrderQ();
    }
}
