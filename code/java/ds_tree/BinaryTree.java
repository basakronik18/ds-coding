import DevelopmentLevel2.Node;

/**
 * Created by ronik.basak on 07/08/16.
 */
public class BinaryTree {
    Node root;
    public BinaryTree(int item){
        root = new Node(item);
    }
    public BinaryTree(){
        root=null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
    }
}
