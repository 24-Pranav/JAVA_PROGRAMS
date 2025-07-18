package Greedy;

import java.util.*;
import java.util.Arrays;

public class ActivitySelection {
    public static void main(String[] args) {
        // int start[] = { 1, 3, 2, 5 };
        // int end[] = { 2, 4, 3, 6 };

        // // sorting
        // int activities[][] = new int[start.length][3]; // TC = O(log(n))

        // for (int i = 0; i < start.length; i++) {
        // activities[i][0] = i;
        // activities[i][1] = start[i];
        // activities[i][2] = end[i];
        // }

        // Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // // end time basis sorted
        // int maxAct = 0;
        // ArrayList<Integer> list = new ArrayList<>();

        // // 1st activity
        // maxAct = 1;
        // list.add(activities[0][0]);
        // int lastEnd = activities[0][2];

        // for (int i = 1; i < end.length; i++) {
        // if (activities[i][1] >= lastEnd) {
        // maxAct++;
        // list.add(activities[i][0]);
        // lastEnd = activities[i][2];
        // }
        // }

        // System.out.println("max activities = " + maxAct);
        // for (int i = 0; i < list.size(); i++) {
        // System.out.print("A" + list.get(i) + " ");
        // }
        // System.out.println();

        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // sorted end time basis
        ArrayList<Integer> ans = new ArrayList<>();

        int maxAct = 1;

        ans.add(0);
        int lastEnd = end[0];

        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("Maximum number of activities: " + maxAct);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
    }
}
