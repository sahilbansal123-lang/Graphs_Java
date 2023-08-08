import java.util.*;

public class Implementation {

    public static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }


    public static void main(String[] args) {
        int v = 5; // No of vertices
        ArrayList<Edge> [] graph = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[0].add(new Edge(0, 1, 5));
        graph[0].add(new Edge(0, 1, 5));
        graph[0].add(new Edge(0, 1, 5));
    }
}
