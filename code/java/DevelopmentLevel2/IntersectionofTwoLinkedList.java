
/**
 * Created by ronik.basak on 31/08/16.
 */
public class IntersectionofTwoLinkedList {
    private static int MAX = 1000000;
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
        new_node.next=head;
        head=new_node;
    }

    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }
    }

    public static void getIntersection(Node head1, Node head2){
        boolean[] binMap = new boolean[MAX];
        Node temp1 = head1;
        while(temp1!=null){
            binMap[temp1.data]=true;
            temp1=temp1.next;
        }

        Node temp2 = head2;
        while(temp2!=null){
            if(binMap[temp2.data]==true){
                System.out.println("The intersection Node is = "+temp2.data);
                return;
            }
            temp2 = temp2.next;
        }

        System.out.println("No intersection node is present");
        return;
    }

    /*Driver Function*/
    public static void main(String[] args) {
        IntersectionofTwoLinkedList llist1 = new IntersectionofTwoLinkedList();
        IntersectionofTwoLinkedList llist2 = new IntersectionofTwoLinkedList();

        llist1.push(4);
        llist1.push(3);
        llist1.push(2);
        llist1.push(1);

        llist2.push(7);
        llist2.push(6);
        llist2.push(2);
        llist2.push(5);

        getIntersection(llist1.head, llist2.head);
    }
}
