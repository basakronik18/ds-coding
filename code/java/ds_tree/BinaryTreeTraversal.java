

/**
 * Created by ronik.basak on 07/08/16.
 */
public class BinaryTreeTraversal {
    Node root;
    public BinaryTreeTraversal(){
        root=null;
    }
    public BinaryTreeTraversal(int item){
        root = new Node(item);
    }

    public void printPostorder(Node node){
        if(node==null){
            return;
        }
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }

    public void printInorder(Node node){
        if(node==null){
            return;
        }
        printInorder(node.left);
        System.out.print(node.key+" ");
        printInorder(node.right);
    }

    public void printPreorder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.key+" ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    public static void main(String args[]){
        BinaryTreeTraversal tree = new BinaryTreeTraversal();
        Node root;
        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.printInorder(tree.root);
        tree.printPreorder(tree.root);
        tree.printPostorder(tree.root);


    }
}
