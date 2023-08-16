import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {

    public static class Edge {
        int src;
        int dest;
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[3].add(new Edge(3, 1));
        graph[2].add(new Edge(2, 3));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }

    public static void topologicalSort (ArrayList<Edge>[] graph, int curr, boolean isvis[], Stack<Integer> s) {

    }

    public static void main(String[] args) {
        int v = 7; // No of vertices
        ArrayList<Edge>[] graph = new ArrayList[v];
        for (int i = 0; i < graph.length; i++) {
            createGraph(graph);
        }

    }
}
