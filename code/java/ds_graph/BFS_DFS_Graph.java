import java.util.*;

/**
 * Created by ronik.basak on 05/09/16.
 */
public class BFS_DFS_Graph {
    private int V; //Number of vertices
    private LinkedList<Integer> adj[];

    //constructor
    BFS_DFS_Graph(int v){
        V=v;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList();
        }
    }

    //Function to add an edge in the graph
    void addEdge(int v, int w){
        adj[v].add(w);
    }

    //A function used by graphDFS
    void DFSUtil(int v, boolean visited[]){
        //Mark the current node as visited and Print it
        visited[v] = true;
        System.out.print(v+" " );

        //Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = adj[v].listIterator();
        while(i.hasNext()){
            int n = i.next();
            if(!visited[n]){
                DFSUtil(n, visited);
            }
        }
    }

    //The function to do DFS Traversal. It uses recursive DFSUtil()
    void graphDFS(int v){
        //Mark all the vertices as not visited.
        boolean visited[] = new boolean[V];

        //Call the recursive helper function
        DFSUtil(v, visited);
    }

    //prints BFS Traversal  from a given source s
    void graphBFS(int s){
        //Mark all the vertices as not visited by default
        boolean visited[] = new boolean[V];

        //create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        //Mark the current node as visited and enqueue it
        visited[s]=true;
        queue.add(s);

        while(queue.size() != 0){
            //Dequeue a vertex from queue and print it
            s=queue.poll();
            System.out.print(s+" ");

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = adj[s].listIterator();
            while(i.hasNext()){
                int n = i.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }

    }
    
    //Driver Function
    public static void main(String[] args) {
        BFS_DFS_Graph g = new BFS_DFS_Graph(4);

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.graphBFS(2);

        System.out.println("\nFollowing is Depth First Traversal "+
                "(starting from vertex 2)");

        g.graphDFS(2);

    }
}
