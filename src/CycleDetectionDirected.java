import java.util.ArrayList;
import java.util.Stack;

public class CycleDetectionDirected {

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

        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));

    }

    public static boolean containsCycle(ArrayList<Edge>[] graph) {
        boolean isVis[] = new boolean[graph.length]
        boolean stack[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!isVis[i]) {
                containsCycleUtil(graph, i, isVis, stack);
            }
        }
    }

    public static boolean containsCycleUtil(ArrayList<Edge>[] graph, int i, boolean[] isVis, boolean[] stack) {

    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for (int i = 0; i < graph.length; i++) {
            createGraph(graph);
        }
    }
}
