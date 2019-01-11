package ds_linkedList;

/**
 * Created by ronik.basak on 26/09/16.
 */
public class DetectLoopinLinkedListFloyds {

    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    public static void detectRemoveLoop(Node node){
        Node slow = node;
        Node fast = node.next;

        //Search for loop using slow and fast pointer
        while(fast!=null && fast.next!=null){
            if(slow == fast) break;
            slow = slow.next;
            fast = fast.next.next;
        }

        //If loop exists
        if(slow ==fast) {
            slow = node;
            while(slow!=fast.next) {
                slow = slow.next;
                fast = fast.next;
            }

            /* since fast->next is the looping point */
            fast.next = null; /* remove loop */
        }
    }
}
