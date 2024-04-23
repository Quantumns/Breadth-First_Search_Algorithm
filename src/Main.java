public class Main {
    public static void main(String args[]) {
        // Create a graph with 8 vertices
        Graph g = new Graph(8);

        // Add edges to the graph
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);
        g.addEdge(2, 6);
        g.addEdge(3, 7);
        g.addEdge(4, 7);
        g.addEdge(5, 7);
        g.addEdge(6, 7);

        System.out.println("Breadth First Search (BFS) starting from node 0:");
        g.BFS(0); // Perform BFS starting from node 0
    }
}