package DevelopmentLevel2;


import DevelopmentLevel2.*;

/**
 * Created by ronik.basak on 31/08/16.
 */
public class MirrorofBinaryTree {

    Node root;
    void mirror(){
        root = mirror(root);
    }

    Node mirror(Node node){
        if(node == null){
            return node;
        }

        /*do the subtrees*/
        Node left = mirror(node.left);
        Node right = mirror(node.right);

        /*swap the left and right pointers*/
        node.left = right;
        node.right = left;

        return node;
    }

    void printSingles(Node node){
        if(node == null) return;

        if(node.left!=null && node.right!=null){
            printSingles(node.left);
            printSingles(node.right);
        }

        else if(node.right != null){
            System.out.print(node.right.data+ " ");
            printSingles(node.right);
        }

        else if(node.left != null){
            System.out.print(node.left.data+ " ");
            printSingles(node.left);
        }
    }

    void inOrder(){
        inOrder(root);
    }

    void inOrder(Node node){
        if(node == null) return;

        inOrder(node.left);
        System.out.print(node.data);
        inOrder(node.right);
    }

    /*Driver Function*/
    public static void main(String[] args) {
        MirrorofBinaryTree tree = new MirrorofBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        //tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(5);
        //tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(6);

        System.out.println("\nOriginal Tree");
        tree.inOrder(tree.root);

        tree.root = tree.mirror(tree.root);
        System.out.println("\nMirror Tree");
        tree.inOrder(tree.root);
        System.out.println("\nNodes without siblings are:\n");
        tree.printSingles(tree.root);

    }
}
