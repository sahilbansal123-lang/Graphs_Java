import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph {

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
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));
        graph[3].add(new Edge(3, 0));

//        graph[4].add(new Edge(4, 2));
//        graph[4].add(new Edge(4, 3));

    }

    public static boolean isBipartite(ArrayList<Edge>[] graph) {
        int[] color = new int[graph.length];
        // -1 == no color
        //  0 == yellow color
        //  1 == blue color

        for (int i = 0; i < color.length; i++) {
            color[i] = -1;
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (color[i] == -1) {
                q.add(i);
                color[i] = 0;

                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);
                        if (color[e.dest] == -1) {
                            int nextColor = color[curr] == 0 ? 1 : 0;
                            color[e.dest] = nextColor;
                            q.add(e.dest);
                        } else if (color[e.dest] == color[curr]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];

        for (int i = 0; i < graph.length; i++) {
            createGraph(graph);
        }

        System.out.println(isBipartite(graph));
    }

    public static class HasPath {

        static class Edge {
            int src;
            int dest;
            int weight;

            public Edge(int s, int d, int w) {
                this.src = s;
                this.dest = d;
                this.weight = w;
            }
        }

        static void createGraph(ArrayList<Edge>[] graph) {

            for (int i = 0; i < graph.length; i++) {
                graph[i] = new ArrayList<>();
            }

            graph[0].add(new Edge(0, 1, 1));
            graph[0].add(new Edge(0, 2, 1));

            graph[1].add(new Edge(1, 0, 1));
            graph[1].add(new Edge(1, 3, 1));

            graph[2].add(new Edge(2, 0, 1));
            graph[2].add(new Edge(2, 4, 1));

            graph[3].add(new Edge(3, 4, 1));
            graph[3].add(new Edge(3, 1,1));
            graph[3].add(new Edge(3, 5,1));

            graph[4].add(new Edge(4, 2,1));
            graph[4].add(new Edge(4, 3,1));
            graph[4].add(new Edge(4, 5,1));

            graph[5].add(new Edge(5, 3,1));
            graph[5].add(new Edge(5, 4,1));
            graph[5].add(new Edge(5, 6,1));

            graph[6].add(new Edge(6, 5,1));

        }

        public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] vis) {

            if (src == dest) {
                return true;
            }
            vis[src] = true;
            for (int i = 0; i < graph[src].size(); i++) {
                Edge e = graph[src].get(i);
                if (!vis[e.dest] && hasPath(graph, e.dest, dest, vis)) {
                    return true;
                }
            }
            return false;
        }
        public static void main(String[] args) {
            int v = 7;
            ArrayList<Edge> [] graph = new ArrayList[v];
            createGraph(graph);
            System.out.println(hasPath(graph, 0, 4, new boolean[v]));
        }
    }
}
