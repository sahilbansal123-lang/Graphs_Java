import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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

    public static void createGraph(ArrayList<Edge> graph) {

        graph.add(new Edge(0, 1, 10));
        graph.add(new Edge(0, 2, 15));
        graph.add(new Edge(0, 3, 30));
        graph.add(new Edge(1, 3, 40));
        graph.add(new Edge(2, 3, 50));

    }

    static int n = 4;
    static int[] par = new int[n];
    static int[] rank = new int[n];

    public static void init() {
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    public static int find(int x) {
        if (par[x] == x) {
            return x;
        }
        return par[x] = find(par[x]);
    }

    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] > rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else {
            par[parA] = parB;
            rank[parB]++;
        }
    }

    public static void kruskalFindMST(ArrayList<Edge> graph, int v){
        init();
        Collections.sort(graph);
        int mstCost = 0;
        int count = 0;

        for (int i = 0; count < v-1; i++) {
            Edge e = graph.get(i);
            int parA = find(e.src);
            int parB = find(e.dest);
            if (parA != parB) {
                union(e.src, e.dest);
                mstCost += e.weight;
                count++;
            }
        }
        System.out.println(mstCost);
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph = new ArrayList<>();
        createGraph(graph);

        kruskalFindMST(graph, v);
    }
}
