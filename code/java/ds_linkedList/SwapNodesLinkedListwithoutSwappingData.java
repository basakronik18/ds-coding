import java.util.LinkedList;

/**
 * Created by ronik.basak on 30/08/16.
 */
public class SwapNodesLinkedListwithoutSwappingData {
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

        public void swapNodes(int x, int y){
            if(x == y) return;

            // Search for x (keep track of prevX and CurrX)
            Node prevX = null, currX = head;
            while(currX!=null && currX.data!=x){
                prevX=currX;
                currX=currX.next;
            }

            // Search for y (keep track of prevY and CurrY)
            Node prevY = null, currY = head;
            while(currY!=null && currY.data!=y){
                prevY=currY;
                currY=currY.next;
            }

            // If either x or y is not present, nothing to do
            if(currX==null || currY==null) {
                return;
            }
            //If x is not head of the linked list
            if (prevX != null) {
                prevX.next=currY;
            }
            //else make y the new head
            else {
                head = currY;
            }

            //If y is not head of the linked list
            if(prevY != null){
                prevY.next=currX;
            }
            //else make x the new head
            else {
                head = currX;
            }

            //Swap next pointers

            Node tempNode = currX.next;
            currX.next = currY.next;
            currY.next = tempNode;

        }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        SwapNodesLinkedListwithoutSwappingData llist = new SwapNodesLinkedListwithoutSwappingData();

        /* The constructed linked list is:
            1->2->3->4->5->6->7 */
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        System.out.print("\n Linked list before calling swapNodes() \n");
        llist.printList();

        llist.swapNodes(4, 3);

        System.out.print("\n Linked list after calling swapNodes() \n");
        llist.printList();
    }

}
