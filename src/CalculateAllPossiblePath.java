import java.util.ArrayList;

public class CalculateAllPossiblePath {

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

        graph[0].add(new Edge(0, 3));
        graph[3].add(new Edge(3, 1));
        graph[2].add(new Edge(2, 3));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }

    public static void possiblePaths(ArrayList<Edge>[] graph, int src, int dest, String paths) {
        if (src == dest) {
            System.out.println(paths + dest + " ");
            return;
        }

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            possiblePaths(graph, e.dest, dest, paths + src);
        }
    }

    public static void main(String[] args) {
        int v = 6; // No of vertices
        ArrayList<Edge>[] graph = new ArrayList[v];
        for (int i = 0; i < graph.length; i++) {
            createGraph(graph);
        }
        possiblePaths(graph, 5, 1, " ");
    }
}
