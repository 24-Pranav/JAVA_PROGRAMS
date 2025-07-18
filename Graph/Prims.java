package Graph;

import java.util.*;

public class Prims {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static class Pair implements Comparable<Pair> {
        int node;
        int cost;

        public Pair(int n, int c) {
            this.node = n;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static void primsAlgo(ArrayList<Edge> graph[], int src, int V) {
        boolean vis[] = new boolean[V];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        int minCost = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

            if (!vis[curr.node]) {
                vis[curr.node] = true;
                minCost += curr.cost;

                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);

                    if (!vis[e.dest]) {
                        pq.add(new Pair(e.dest, e.wt));
                    }
                }
            }
        }
        System.out.println("Minimum spanning tree cost = " + minCost);
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 5));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 3));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 1, 3));
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        primsAlgo(graph, 0, V);
    }
}