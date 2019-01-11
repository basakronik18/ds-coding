
/**
 * Created by ronik.basak on 31/08/16.
 */
public class LinkedListSortedMerge {

    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void printList(){
        Node tNode =head;
        while(tNode!=null){
            System.out.println(tNode.data);
            tNode=tNode.next;
        }
    }

    public static Node sortedMerge(Node head1, Node head2){
        Node result = null;

        //Base Cases
        if(head1 == null) return head2;
        if(head2 == null) return head1;

        if(head1.data <= head2.data){
            result = head1;
            result.next = sortedMerge(head1.next, head2);
        }
        else {
            result = head2;
            result.next = sortedMerge(head1,head2.next);
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedListSortedMerge llist1 = new LinkedListSortedMerge();
        llist1.push(6);
        llist1.push(4);
        llist1.push(2);
        llist1.push(1);

        LinkedListSortedMerge llist2 = new LinkedListSortedMerge();
        llist2.push(8);
        llist2.push(7);
        llist2.push(5);
        llist2.push(3);

        System.out.println("Created Linked List 1 is : ");
        llist1.printList();

        System.out.println("Created Linked List 2 is : ");
        llist2.printList();

        LinkedListSortedMerge llistfinal = new LinkedListSortedMerge();
        llistfinal.head = sortedMerge(llist1.head, llist2.head);

        System.out.println("Merged Sorted Linked List is : ");
        llistfinal.printList();
    }
}
