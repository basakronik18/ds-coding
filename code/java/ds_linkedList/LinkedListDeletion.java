

import java.util.LinkedList;

/**
 * Created by ronik.basak on 30/08/16.
 */
public class LinkedListDeletion {
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

    public void deleteNode(int key){
        Node temp, prev=null;
        temp=head;

        /* Head node itself holds the data*/
        if(temp!=null && temp.data==key){
            head=temp.next;
            return;
        }

        // Search for the key to be deleted, keep track of the
        // previous node as we need to change temp.next
        while(temp!=null && temp.data!=key){
            prev=temp;
            temp=temp.next;
        }

        if(temp==null){
            System.out.println("Data not present in the list");
            return;
        }

        prev.next = temp.next;
    }

    public static void main(String[] args)
    {
        LinkedListDeletion llist = new LinkedListDeletion();

        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);

        System.out.println("\nCreated Linked list is:");
        llist.printList();

        llist.deleteNode(1); // Delete node at position 4

        System.out.println("\nLinked List after Deletion at position 4:");
        llist.printList();
    }
}

