
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



    public static void main(String[] args) {

    }
}
