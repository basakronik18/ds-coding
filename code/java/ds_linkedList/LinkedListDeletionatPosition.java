
/**
 * Created by ronik.basak on 30/08/16.
 */
public class LinkedListDeletionatPosition {

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

        public void deleteNode(int position) {
            Node temp = head, prev = null;
            if (head == null) {
                return;
            }
            if (position == 0) {
                head = temp.next;
                return;
            }
            //Find previous node of the node to be deleted
            for (int i = 0; temp != null && i < position - 1; i++) {
                temp = temp.next;
            }

            // If position is more than number of nodes
            if (temp == null || temp.next == null) {
                return;
            }

                temp.next = temp.next.next;

        }

        public static void main(String[] args)
        {
            LinkedListDeletionatPosition llist = new LinkedListDeletionatPosition();

            llist.push(7);
            llist.push(1);
            llist.push(3);
            llist.push(2);

            System.out.println("\nCreated Linked list is:");
            llist.printList();

            llist.deleteNode(2); // Delete node at position 4

            System.out.println("\nLinked List after Deletion at position 4:");
            llist.printList();
        }
    }



