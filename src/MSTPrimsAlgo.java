import ShortestDistCalculation.BellmenFordAlgo;

import java.util.ArrayList;

public class MSTPrimsAlgo {
    public static class Edge{
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int wt) {
            this.src = s;
            this.dest = d;
            this.weight = wt;
        }
    }

    static void createGraph(ArrayList<Edge> graph) {
        graph.add(new Edge(0, 1, 10));
        graph.add(new Edge(0, 2, 15));
        graph.add(new Edge(0, 3, 30));
        graph.add(new Edge(1, 3, 40));
        graph.add(new Edge(2, 3, 50));
    }



    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graph = new ArrayList<>();
        createGraph(graph);
    }
}
