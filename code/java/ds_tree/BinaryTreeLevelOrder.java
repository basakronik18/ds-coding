

/**
 * Created by ronik.basak on 07/08/16.
 */
public class BinaryTreeLevelOrder {
    public static Node node;
    public BinaryTreeLevelOrder(){
        node=null;
    }
    public void printLevelOrder(){
        int i;
        int h = height(node);
        for (i=1;i<=h;i++){
            printGivenLevel(node,i);
        }
    }

    public static void printGivenLevel(Node root, int level){
        if(root == null){
            return;
        }
        if(level == 1){
            System.out.print(root.key + " ");
        }
        else if(level > 1){
            printGivenLevel(root.left,level-1);
            printGivenLevel(root.right,level-1);
        }
    }

    public static int height(Node node){
        if(node == null){
            return 0;
        }
        else{
            int lheight = height(node.left);
            int rheight = height(node.right);
            if (lheight > rheight){
                return (lheight + 1);
            }
            else{
                return (rheight + 1);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreeLevelOrder tree = new BinaryTreeLevelOrder();
        tree.node = new Node(1);
        tree.node.left = new Node(2);
        tree.node.right = new Node(3);
        tree.node.left.left = new Node(4);
        tree.node.left.right = new Node(5);
        tree.node.right.left = new Node(6);
        tree.node.right.right = new Node(7);

        tree.printLevelOrder();
    }
}
