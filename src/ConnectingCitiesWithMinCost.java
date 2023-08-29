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

    public static void MinCost(int cities[][]) {
        boolean isVis[] = new boolean[cities.length];

    }

    public static void main(String[] args) {
        int cities[][] = {{0, 1, 2, 3, 4},
                          {1, 0, 5, 0, 7},
                          {2, 5, 0, 6, 0},
                          {3, 0, 6, 0, 0},
                          {4, 7, 0, 0, 0}};

    }
}
