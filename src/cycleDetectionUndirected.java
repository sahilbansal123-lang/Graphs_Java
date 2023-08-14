import java.util.ArrayList;

public class cycleDetectionUndirected {

    public static class Edge{
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 0));

        graph[4].add(new Edge(4, 3));

    }
    
    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean isVis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!isVis[i]) {
                if (detectCycleUtil(graph, isVis, i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] isVis, int curr, int parent) {

    }

    public static void main(String[] args) {

    }
}
