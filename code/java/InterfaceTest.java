import java.util.HashSet;
import java.util.Set;

class Tyre {
    public void front() throws RuntimeException {
        System.out.println("Tire");
    }

    public void front(long a) {
        System.out.println("Radial Tire with long");
    }
}



class RadialTyre extends Tyre {
    static class Node{
        int a;
        Node(int a){
            this.a=a;
        }
    }

    public void front() {
        System.out.println("Radial Tire");
    }
    public void front(int a) throws RuntimeException {
        System.out.println("Radial Tire with int");
    }

    /*public static void main(String... args) {
        System.out.println("This is just a test");
        Tyre t = new RadialTyre();
        Tyre t1 = new Tyre();
        RadialTyre r = new RadialTyre();

        System.out.println(Tyre instanceof t1);      //Line 1
        System.out.println(t1 instanceof RadialTyre);        //Line 2
        System.out.println(Tyre instanceof r);        //Line 3
        System.out.println(r instanceof RadialTyre);        //Line 4

        *//*public static void main(String... args) {
        Tyre t = new RadialTyre();
        int a = 10;
        t.front(a);

    }*//*
    }*/

    public static void main(String... args) {
        Set<Node> nodeSet = new HashSet<Node>();
        nodeSet.add(new Node(10));
        nodeSet.add(new Node(20));
        nodeSet.add(new Node(30));
        nodeSet.add(new Node(10));
        nodeSet.add(new Node(20));

                System.out.println(nodeSet.size());
        for (Node c : nodeSet) {

            System.out.println(c.a);
        }
    }
}