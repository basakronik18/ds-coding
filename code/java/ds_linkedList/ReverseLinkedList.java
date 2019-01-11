
/**
 * Created by ronik.basak on 30/08/16.
 */
public class ReverseLinkedList {
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

        public Node rev_ll(Node head){
            if(head == null) return null;
            if(head.next == null) return head;

            Node temp = rev_ll(head.next);
            head.next.next = head;
            head.next = null;
            return temp;

        }

    public static void main(String[] args) {
        ReverseLinkedList llist = new ReverseLinkedList();
        llist.push(6);
        llist.push(7);
        llist.push(1);
        llist.push(4);

        System.out.println("Created Linked List is : ");
        llist.printList();

        llist.head = llist.rev_ll(llist.head);

        System.out.println("Reversed Linked List is : ");
        llist.printList();
    }

    }
