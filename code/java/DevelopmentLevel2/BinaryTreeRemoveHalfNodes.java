package DevelopmentLevel2;
import DevelopmentLevel2.*;
import com.sun.source.tree.BinaryTree;

/**
 * Created by ronik.basak on 02/09/16.
 */
public class BinaryTreeRemoveHalfNodes {
    Node root;

    public Node removeHalfNodes(Node node){
        if(node==null){
            return null;
        }

        node.left = removeHalfNodes(node.left);
        node.right = removeHalfNodes(node.right);

        if(node.left == null && node.right == null) {
            return node;
        }

        if(node.left == null){
            Node new_node = node.right;
            return new_node;
        }

        if(node.right == null){
            Node new_node = node.left;
            return new_node;
        }
        return node;
    }

    public void printInorder(Node node){
        if(node == null) return;
        printInorder(node.left);
        System.out.println("Node Data "+ node.data);
        printInorder(node.right);
    }

    public static void main(String[] args) {
        BinaryTreeRemoveHalfNodes tree = new BinaryTreeRemoveHalfNodes();
        Node NewRoot = null;
        tree.root = new Node(2);
        tree.root.left = new Node(7);
        tree.root.right = new Node(5);
        tree.root.left.right = new Node(6);
        tree.root.left.right.left = new Node(1);
        tree.root.left.right.right = new Node(11);
        tree.root.right.right = new Node(9);
        tree.root.right.right.left = new Node(4);

        System.out.println("the inorder traversal of tree is ");
        tree.printInorder(tree.root);

        NewRoot = tree.removeHalfNodes(tree.root);

        System.out.print("\nInorder traversal of the modified tree \n");
        tree.printInorder(NewRoot);

    }
}
