import java.util.ArrayList;

public class KruskalAlgorithm {

    public static class Edge implements Comparable<Edge> {
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int wt) {
            this.src = s;
            this.dest = d;
            this.weight = wt;
        }

        @Override
        public int compareTo(Edge e2) {
            return this.weight - e2.weight;
        }
    }

    public static void createGraph(ArrayList<MSTPrimsAlgo.Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new MSTPrimsAlgo.Edge(0, 1, 10));
        graph[0].add(new MSTPrimsAlgo.Edge(0, 2, 15));
        graph[0].add(new MSTPrimsAlgo.Edge(0, 3, 30));

        graph[1].add(new MSTPrimsAlgo.Edge(1, 3, 40));
        graph[1].add(new MSTPrimsAlgo.Edge(1, 0, 10));

        graph[2].add(new MSTPrimsAlgo.Edge(2, 3, 50));
        graph[2].add(new MSTPrimsAlgo.Edge(2, 0, 15));

        graph[3].add(new MSTPrimsAlgo.Edge(3, 0, 30));
        graph[3].add(new MSTPrimsAlgo.Edge(3, 2, 50));
        graph[3].add(new MSTPrimsAlgo.Edge(3, 1, 40));

    }

    public static void main(String[] args) {

    }
}
