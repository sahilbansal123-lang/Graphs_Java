import java.util.PriorityQueue;

public class ConnectingCitiesWithMinCost {

    public static class Edge implements Comparable<Edge>{
        int dest;
        int cost;
        public Edge(int d, int c) {
            this.dest = d;
            this.cost = c;
        }
        @Override
        public int compareTo(Edge e2) {
            return this.cost - e2.cost;
        }
    }

    public static void MinCost(int[][] cities) {
        boolean[] isVis = new boolean[cities.length];
        PriorityQueue<Edge> pq = new PriorityQueue<>();

        int finalCost = 0;
        pq.add(new Edge(0, 0));

        while (!pq.isEmpty()) {
            Edge curr = pq.remove();
            if (!isVis[curr.dest]) {
                isVis[curr.dest] = true;
                finalCost += curr.cost;

                for (int i = 0; i < cities[curr.dest].length; i++) {
                    if (cities[curr.dest][i] != 0) {
                        pq.add(new Edge(i, cities[curr.dest][i]));
                    }
                }
            }
        }
        System.out.println(finalCost);
    }

    public static void main(String[] args) {
        int[][] cities = {{0, 1, 2, 3, 4},
                          {1, 0, 5, 0, 7},
                          {2, 5, 0, 6, 0},
                          {3, 0, 6, 0, 0},
                          {4, 7, 0, 0, 0}};

        MinCost(cities);
    }
}
