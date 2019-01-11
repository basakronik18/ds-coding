package DevelopmentLevel2;

import DevelopmentLevel2.*;
import com.sun.source.tree.BinaryTree;

/**
 * Created by ronik.basak on 01/09/16.
 */
public class WidthofBinaryTree {
    Node root;

    public int maxWidth(Node node){
        int width;
        int h = height(node);

        //create an array which will store the count of nodes at each level
        int count[] = new int[10];

        int level = 0;

        //Fill the count array using preorder traversal
        getMaxWidthRecur(node,count,level);

        //return the maximum value from the count array
        return getMax(count,h);
    }

    private int getMax(int[] arr, int h) {
        int max = arr[0];
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }

    private void getMaxWidthRecur(Node node, int[] count, int level) {
        if(node != null){
            count[level]++;
            getMaxWidthRecur(node.left,count,level+1);
            getMaxWidthRecur(node.right,count,level+1);
        }

    }

    private int height(Node node) {
        if (node == null) return  0;

        int lheight = height(node.left);
        int rheight = height(node.right);

        return (Math.max(lheight,rheight)+1);
    }

    public static void main(String[] args) {
        WidthofBinaryTree tree = new WidthofBinaryTree();

        /*
        Constructed bunary tree is:
              1
            /  \
           2    3
          / \    \
         4   5    8
                 / \
                6   7 */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(8);
        tree.root.right.right.left = new Node(6);
        tree.root.right.right.right = new Node(7);

        System.out.println("Maximum width is " +
                tree.maxWidth(tree.root));
    }

}
