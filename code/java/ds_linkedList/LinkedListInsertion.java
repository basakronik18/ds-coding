

/**
 * Created by ronik.basak on 30/08/16.
 */
public class LinkedListInsertion {
    Node head; //head of list

    /*Linked List Node*/
    static class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }

    /*Inserts new node in front of the list*/
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next=head;
        head=new_node;
    }

    /*Inserts a new node after a given previous node*/
    public void insertAfter(Node prev_node, int new_data){
        if(prev_node == null){
            System.out.println("The previous node can not be null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next=prev_node.next;
        prev_node.next=new_node;
    }

    /*Appends a new node at the end*/
    public void append(int new_data){
        Node new_node = new Node(new_data);
        new_node.next=null;

        if (head == null){
            head = new_node;
            return;
        }
        Node temp = head;

        while(temp.next != null){
            temp=temp.next;
        }
        temp.next = new_node;
        return;
    }

    /*Print the linked list*/
    public void printList(){
        Node tNode = head;
        while(tNode != null){
            System.out.print(tNode.data);
            tNode = tNode.next;
        }
    }

    /*Driver Program*/
    public static void main(String[] args) {
        LinkedListInsertion llist = new LinkedListInsertion();
        llist.append(6);
        llist.push(7);
        llist.push(1);
        llist.append(4);

        llist.insertAfter(llist.head.next,8);

        System.out.println("Created Linked List is : ");
        llist.printList();
    }

}
