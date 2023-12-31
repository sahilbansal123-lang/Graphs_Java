package Traversals;

import java.util.*;

public class ConnectedComponentsBFS {

    public static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int wt) {
            this.src = s;
            this.dest = d;
            this.weight = wt;
        }
    }

    public static void bfs(ArrayList<Edge> []graph) {
        boolean[] isVis = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!isVis[i]) {
                bfsUtil(graph, isVis);
            }
        }
    }

    public static void bfsUtil(ArrayList<Edge> []graph, boolean[] isVis) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!isVis[curr]) {
                System.out.print(curr + " ");
                isVis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }

    }

    public static void main(String[] args) {

    }
}
