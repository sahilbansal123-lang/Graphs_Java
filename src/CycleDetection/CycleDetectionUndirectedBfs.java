package CycleDetection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleDetectionUndirectedBfs {

    public static class Edge{
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
//        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

//        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 0));

        graph[4].add(new Edge(4, 3));

    }

    public static boolean cycleDetection(ArrayList<Edge>[] graph) {
        boolean isVis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!isVis[i]) {
                if (cycleDetectionUtil(graph, i, isVis)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean cycleDetectionUtil(ArrayList<Edge>[] graph, int st, boolean[] isVis) {
        Queue<Integer> q = new LinkedList<>();
        isVis[st] = true;
        q.add(0);
        int [] parent = new int[graph.length];

        while (!q.isEmpty()) {
            int curr = q.remove();
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if (!isVis[e.dest]) {
                    isVis[e.dest] = true;
                    q.add(e.dest);
                    parent[e.dest] = curr;
                } else if (parent[curr] != e.dest) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < graph.length; i++) {
            createGraph(graph);
        }
        System.out.println(cycleDetection(graph));
    }
}
