package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphOperations {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void bfs(ArrayList<Edge> graph[]) {
        boolean vist[] = new boolean[graph.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!vist[curr]) {
                System.out.print(curr + " ");
                vist[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {

        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static boolean hasPath(ArrayList<Edge> graph[], int src, int dest, boolean vis[]) {
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

    public static void getAllPaths(ArrayList<Edge> graph[], boolean vis[], int curr, String path, int tar) {

        if (curr == tar) {
            System.err.println(path);
            return;
        }

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!vis[e.dest]) {
                vis[curr] = true;
                getAllPaths(graph, vis, e.dest, path + e.dest, tar);
                vis[curr] = false;
            }
        }
    }

    public static boolean isCycle(ArrayList<Edge> graph[], boolean vis[], int curr, boolean rec[]) {
        vis[curr] = true;
        rec[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (rec[e.dest]) {
                return true;
            } else if (!vis[e.dest] && isCycle(graph, vis, e.dest, rec)) {
                return true;
            }
        }

        rec[curr] = false;
        return false;
    }

    // Topological sorting is only work on Directed Acyclic Graph (DAG)
    public static void topoSortUtil(ArrayList<Edge> graph[], boolean vis[], int curr, Stack<Integer> stack) {

        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!vis[e.dest]) {
                topoSortUtil(graph, vis, e.dest, stack);
            }
        }

        stack.push(curr);
    }

    public static void topoSort(ArrayList<Edge> graph[], int V) {
        boolean vis[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                topoSortUtil(graph, vis, i, stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // graph[0].add(new Edge(0, 1));
        // graph[0].add(new Edge(0, 2));

        // graph[1].add(new Edge(1, 2));

        // graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        // graph[3].add(new Edge(3, 4));
        // graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        // graph[4].add(new Edge(4, 2));
        // graph[4].add(new Edge(4, 3));
        // graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
        // graph[5].add(new Edge(5, 3));
        // graph[5].add(new Edge(5, 4));
        // graph[5].add(new Edge(5, 6));

        // graph[6].add(new Edge(6, 5));
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        // dfs(graph, 0, new boolean[V]);
        // System.out.println(hasPath(graph, 0, 5, new boolean[V]));
        // getAllPaths(graph, new boolean[V], 0, "0", 5);
        // boolean vis[] = new boolean[V];
        // boolean rec[] = new boolean[V];

        // for (int i = 0; i < V; i++) {
        // if (!vis[i]) {
        // boolean checkCycle = isCycle(graph, new boolean[V], 0, new boolean[V]);
        // if (checkCycle) {
        // System.out.println(checkCycle);
        // break;
        // }
        // }
        // }
        // System.out.println(isCycle(graph, new boolean[V], 0, new boolean[V]));

        topoSort(graph, V);
    }
}
