package Backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;

public class RatMaze {

    public static void helper(int maze[][], int r, int c, String path, HashSet<String> ans) {
        int n = maze.length;

        if (r < 0 || c < 0 || r >= n || c >= n || maze[r][c] == 0 || maze[r][c] == -1) {
            return;
        }

        if (r == n - 1 && c == n - 1) {
            ans.add(path);
            return;
        }

        maze[r][c] = -1;

        helper(maze, r + 1, c, path + "D", ans);
        helper(maze, r - 1, c, path + "U", ans);
        helper(maze, r, c + 1, path + "R", ans);
        helper(maze, r, c - 1, path + "L", ans);

        maze[r][c] = 1;
    }

    public static ArrayList<String> getPath(int maze[][]) {
        HashSet<String> set = new HashSet<>();

        if (maze[0][0] == 0) {
            return new ArrayList<>();
        }

        helper(maze, 0, 0, "", set);

        ArrayList<String> ans = new ArrayList<>(set);
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1 } };
        ArrayList<String> result = getPath(maze);

        for (String path : result) {
            System.out.println(path);
        }
    }
}
