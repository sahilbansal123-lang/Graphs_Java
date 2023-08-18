package Traversals;

import java.util.*;

public class ConnectedComponentsDfs {
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

    public static void dfs(ArrayList<Edge>[] graph) {
        boolean isVis[] = new boolean[graph.length];
            for (int i = 0; i < graph.length; i++) {
                dfsUtil(graph, i, isVis);
            }
        }

    public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean isVis[]) {
        System.out.print(curr + " ");
        isVis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!isVis[e.dest]) {
                dfsUtil(graph, e.dest, isVis);
            }
        }
    }

    public static void main(String[] args) {

    }
}
