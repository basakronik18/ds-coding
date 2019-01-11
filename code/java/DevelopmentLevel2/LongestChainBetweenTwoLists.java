package DevelopmentLevel2;

import java.util.HashMap;

/**
 * Created by ronik.basak on 08/10/16.
 */
public class LongestChainBetweenTwoLists {

    public static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    Node head;

    public void append(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = null;

        if(head == null) {
            head = new_node;
            return;
        }

        Node temp = head;
        while(temp.next != null)
            temp = temp.next;

        temp.next = new_node;

        return;
    }

    public void printList(){
        Node tnode = head;
        while(tnode!=null){
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }

    public static void longestChain(Node head1, Node head2){
        if(head1 == null || head2 == null)
            return;

        Node tnode1 = head1;
        HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();

        while(tnode1 != null){
            map.put(tnode1.data,true);
            tnode1 = tnode1.next;
        }

        Node tnode2 = head2;
        while(tnode2 != null){
            if(map.containsKey(tnode2.data))
                System.out.print(tnode2.data+" ");
            tnode2 = tnode2.next;
        }
    }

    public static void main(String[] args) {
        LongestChainBetweenTwoLists lc1 = new LongestChainBetweenTwoLists();
        LongestChainBetweenTwoLists lc2 = new LongestChainBetweenTwoLists();
        lc1.append(2);
        lc1.append(7);
        lc1.append(4);
        lc1.append(8);
        lc1.append(9);
        lc1.append(10);
        lc2.append(1);
        lc2.append(2);
        lc2.append(8);
        lc2.append(9);
        lc2.append(4);

        System.out.println("The first list is: ");
        lc1.printList();

        System.out.println("\nThe second list is: ");
        lc2.printList();

        System.out.println("\nThe longest chain is: ");
        longestChain(lc1.head,lc2.head);

    }
}
