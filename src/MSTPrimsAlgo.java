import ShortestDistCalculation.BellmenFordAlgo;

import java.util.ArrayList;
import java.util.PriorityQueue;

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

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 3, 40));
        graph[1].add(new Edge(1, 0, 10));

        graph[2].add(new Edge(2, 3, 50));
        graph[2].add(new Edge(2, 0, 15));

        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 2, 50));
        graph[3].add(new Edge(3, 1, 40));


    }

    public static class Pair implements Comparable<Pair>{
        int vertex;
        int cost;
        Pair(int v, int c) {
            this.vertex = v;
            this.cost = c;
        }
        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static void mstPrim(ArrayList<Edge> []graph) {
        boolean isVis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();


    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);

    }
}
