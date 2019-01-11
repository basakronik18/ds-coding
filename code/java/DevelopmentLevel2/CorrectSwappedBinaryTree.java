package DevelopmentLevel2;


import javax.swing.tree.TreeNode;

/**
 * Created by ronik.basak on 06/10/16.
 */
public class CorrectSwappedBinaryTree {

    public static class Node {
        public int data;
        public Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

        Node root;
        TreeNode first;
        TreeNode second;
        TreeNode pre;
/*
        public void inorder(TreeNode root){
            if(root==null)
                return;

            inorder(root.left);

            if(pre==null){
                pre=root;
            }else{
                if(root.data<pre.data){
                    if(first==null){
                        first=pre;
                    }

                    second=root;
                }
                pre=root;
            }

            inorder(root.right);
        }

        public void recoverTree(TreeNode root) {
            if(root==null)
                return;

            inorder(root);
            if(second!=null && first !=null){
                int val = second.val;
                second.val = first.val;
                first.val = val;
            }

        }
        */
}
