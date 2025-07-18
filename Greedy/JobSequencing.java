package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class JobSequencing {

    public static void main(String[] args) {

        int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        Arrays.sort(jobsInfo, Comparator.comparingDouble(o -> o[1]));

        int time = 0;
        int jobCount = 0;
        int profit = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = jobsInfo.length - 1; i >= 0; i--) {

            if (jobsInfo[i][0] > time) {

                time++;
                ans.add(i - 1);
                jobCount++;
                profit += jobsInfo[i][1];
            }
        }

        System.err.println("Number of jobs scheduled = " + jobCount);
        System.out.println("Total Profit = " + profit);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

        System.err.println();
    }
}
