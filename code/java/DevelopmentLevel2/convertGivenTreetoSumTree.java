package DevelopmentLevel2;
import DevelopmentLevel2.*;

/**
 * Created by ronik.basak on 01/09/16.
 */
public class ConvertGivenTreetoSumTree {
    Node root;

    public int toSumTree(Node node){
        //Base Case
        if(node==null) return 0;

        //Store the old value
        int old_value = node.data;

        //Recursively call for left and right subtrees and store the sum for new value in the node
        node.data = toSumTree(node.left) + toSumTree(node.right);

        // Return the sum of values of nodes in left and right subtrees
        // and old_value of this node
        return old_value + node.data;
    }

    void printInorder(Node node){
        if(node == null) return;
        printInorder(node.left);
        System.out.print(node.data);
        printInorder(node.right);
    }

    public static void main(String[] args) {
        ConvertGivenTreetoSumTree tree = new ConvertGivenTreetoSumTree();

        /* Constructing tree given in the above figure */
        tree.root = new Node(10);
        tree.root.left = new Node(-2);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(-4);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(5);

        tree.toSumTree(tree.root);

        // Print inorder traversal of the converted tree to test result
        // of toSumTree()
        System.out.println("Inorder Traversal of the resultant tree is:");
        tree.printInorder(tree.root);
    }
}
