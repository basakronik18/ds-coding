
/**
 * Created by ronik.basak on 26/08/16.
 */
public class UnionandIntersectionofTwoLinkedList {

    private static final int MAX = 100000;
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    void intersectionList(Node head1, Node head2){
        Node result = null;

        // Declares and initializes the whole array as false
        boolean[] binmap = new boolean[MAX];

        Node t1 = head1;
        while(t1!=null){
            binmap[t1.data]=true;
            t1=t1.next;
        }

        Node t2 = head2;
        while(t2!=null){
            if(binmap[t2.data]){
                push(t2.data);
            }
            t2=t2.next;
        }

    }

    void unionList(Node head1, Node head2){

        // Declares and initializes the whole array as false
        boolean[] binmap = new boolean[MAX];

        Node t1 = head1;
        while(t1!=null){
            binmap[t1.data]=true;
            push(t1.data);
            t1=t1.next;
        }

        Node t2 = head2;
        while(t2!=null){
            if(!binmap[t2.data]){
                push(t2.data);
            }
            t2=t2.next;
        }

    }

    void push(int new_data){
        /*Allocate the node and put in the new data*/
        Node new_node = new Node(new_data);

        /*Make next of new node as head*/
        new_node.next=head;

        /*Move the head to oint to new node*/
        head=new_node;
    }

    void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        UnionandIntersectionofTwoLinkedList llist1 = new UnionandIntersectionofTwoLinkedList();
        UnionandIntersectionofTwoLinkedList llist2 = new UnionandIntersectionofTwoLinkedList();
        UnionandIntersectionofTwoLinkedList lunion = new UnionandIntersectionofTwoLinkedList();
        UnionandIntersectionofTwoLinkedList lintersec = new UnionandIntersectionofTwoLinkedList();

        /*create a linked lits 10->15->5->20 */
        llist1.push(20);
        llist1.push(4);
        llist1.push(15);
        llist1.push(10);

        /*create a linked lits 8->4->2->10 */
        llist2.push(10);
        llist2.push(2);
        llist2.push(4);
        llist2.push(8);

        System.out.println("First List is");
        llist1.printList();

        System.out.println("Second List is");
        llist2.printList();

        lintersec.intersectionList(llist1.head,llist2.head);
        System.out.println("Intersection List is");
        lintersec.printList();

        lunion.unionList(llist1.head,llist2.head);
        System.out.println("Union List is");
        lunion.printList();
    }
}
