package Practice;

import javax.swing.tree.TreeNode;
import java.util.*;

/**
 * Created by ronik.basak on 27/11/16.
 */
public class TreePrograms {

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    public int height(Node node) {
        if (node == null)
            return 0;
        else {
            int lheight = height(node.left);
            int rheight = height(node.right);
            if (lheight > rheight)
                return lheight + 1;
            else
                return rheight + 1;
        }
    }

    public void printLevelOrder() {
        int h = height(root);
        for (int i = 1; i <= h; i++)
            printGivenLevel(root, i);
    }

    private void printGivenLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data);
        else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }

    public void qprintGivenLevel() {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node tempnode = queue.peek();
            queue.poll();
            System.out.print(tempnode.data);

            if (tempnode.left != null)
                queue.add(tempnode.left);
            if (tempnode.right != null)
                queue.add(tempnode.right);
        }
    }

    public int toSumTree(Node node) {
        if (node == null)
            return 0;
        int old_val = node.data;
        node.data = toSumTree(node.left) + toSumTree(node.right);
        return old_val + node.data;
    }

    public int calcDiameter(Node node) {
        if (node == null)
            return 0;
        else {
            int lheight = height(node.left);
            int rheight = height(node.right);

            int ldiam = calcDiameter(node.left);
            int rdiam = calcDiameter(node.right);

            return Math.max((lheight + rheight + 1), Math.max(ldiam, rdiam));
        }
    }

    class Height {
        int h;
    }

    public int optcalcDiameter(Node node, Height height) {
        Height lh = new Height(), rh = new Height();
        if (node == null) {
            height.h = 0;
            return 0;
        } else {
            lh.h++;
            rh.h++;
            int ldiam = optcalcDiameter(node.left, lh);
            int rdiam = optcalcDiameter(node.right, rh);

            height.h = Math.max(lh.h, rh.h) + 1;
            return Math.max(lh.h + rh.h + 1, Math.max(ldiam, rdiam));
        }
    }

    void printSpiralLevelOrder(Node node) {
        if (node == null)
            return;
        else {
            Stack<Node> s1 = new Stack<Node>();
            Stack<Node> s2 = new Stack<Node>();

            s1.push(node);

            while (!s1.empty() || !s2.empty()) {
                while (!s1.empty()) {
                    Node temp = s1.peek();
                    s1.pop();
                    System.out.print(temp.data);

                    if (temp.right != null)
                        s2.push(temp.right);
                    if (temp.left != null)
                        s2.push(temp.left);
                }

                while (!s2.empty()) {
                    Node temp = s2.peek();
                    s2.pop();
                    System.out.print(temp.data);

                    if (temp.left != null)
                        s1.push(temp.left);
                    if (temp.right != null)
                        s1.push(temp.right);
                }
            }
        }
    }

//Boundary Traversal Start

    public void printBoundary(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            printBoundaryLeft(node.left);
            printLeaves(node.left);
            printLeaves(node.right);
            printBoundaryRight(node.right);
        }
    }

    private void printBoundaryRight(Node node) {
        if (node != null) {
            if (node.right != null) {
                printBoundaryRight(node.right);
                System.out.print(node.data + " ");
            } else if (node.left != null) {
                printBoundaryRight(node.left);
                System.out.print(node.data + " ");
            }
        }
    }

    private void printLeaves(Node node) {
        if (node != null) {
            printLeaves(node.left);
            if (node.left == null && node.right == null)
                System.out.print(node.data + " ");
            printLeaves(node.right);
        }
    }

    private void printBoundaryLeft(Node node) {
        if (node != null) {
            if (node.left != null) {
                System.out.print(node.data + " ");
                printBoundaryLeft(node.left);
            } else if (node.right != null) {
                System.out.print(node.data + " ");
                printBoundaryLeft(node.right);
            }
        }

    }
//Boundary Traversal End

    //Print Extreme Nodes in Alternate Order Start
    public void printaltExtremeNodes(Node root) {
        if (root == null)
            return;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        boolean flag = false;

        while (!queue.isEmpty()) {
            int nodecount = queue.size();
            int n = nodecount;
            while (n >= 0) {
                Node tempnode = queue.peek();
                if (tempnode.left != null)
                    queue.add(root.left);
                if (tempnode.right != null)
                    queue.add(root.right);
                queue.poll();
                if (flag && n == nodecount - 1)
                    System.out.print(tempnode.data);
                if (!flag && n == 0)
                    System.out.print(tempnode.data);
            }
            n--;
        }
        flag = !flag;

    }
}
//Print Extreme Nodes in Alternate Order End

/*//Vertical Order
public List<List<Integer>> verticalOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    if(root==null)
        return result;

    // level and list
    HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();

    LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
    LinkedList<Integer> level = new LinkedList<Integer>();

    queue.offer(root);
    level.offer(0);

    int minLevel=0;
    int maxLevel=0;

    while(!queue.isEmpty()){
        TreeNode p = queue.poll();
        int l = level.poll();

        //track min and max levels
        minLevel=Math.min(minLevel, l);
        maxLevel=Math.max(maxLevel, l);

        if(map.containsKey(l)){
            map.get(l).add(p.val);
        }else{
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(p.val);
            map.put(l, list);
        }

        if(p.left!=null){
            queue.offer(p.left);
            level.offer(l-1);
        }

        if(p.right!=null){
            queue.offer(p.right);
            level.offer(l+1);
        }
    }


    for(int i=minLevel; i<=maxLevel; i++){
        if(map.containsKey(i)){
            result.add(map.get(i));
        }
    }

    return result;
}


    public static void main(String[] args) {
        TreePrograms tree = new TreePrograms();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(4);

    }
}*/
