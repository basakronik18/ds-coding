import DevelopmentLevel2.Node;

/**
 * Created by ronik.basak on 07/08/16.
 */
public class DiameterofBinaryTree {

    Node root;
    public int diameter (Node root){
        if (root == null){
            return 0;
        }
        int lheight = height(root.left);
        int rheight = height(root.right);

        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);

        /* Return max of following three
         1) Diameter of left subtree
         2) Diameter of right subtree
         3) Height of left subtree + height of right subtree + 1 */
        return Math.max(lheight+rheight+1, Math.max(ldiameter,rdiameter));

    }

    public int height (Node root){
        if (root == null)
            return 0;
        else
            return Math.max((1 + height(root.left)), (1 + height(root.right)));
    }

    public static void main(String[] args) {
        DiameterofBinaryTree tree = new DiameterofBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        int d = tree.diameter(tree.root);
        System.out.println("Diameter of the tree = " + d);
    }
}
