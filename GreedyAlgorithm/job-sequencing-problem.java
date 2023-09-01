import java.util.Arrays;
import java.util.Comparator;
import java.util.*;

public class main2 {
    public static class Job {
        int profit;
        int deadline;
        int idx;

        public Job(int i, int d, int p) {
            this.idx = i;
            this.deadline = d;
            this.profit = p;
        }
    }

    public static void jobSequencing(int[][] jobs) {
        Arrays.sort(jobs, Comparator.comparingInt(o -> -o[1]));
        int time = 0;
        int profit = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < jobs.length; i++) {
            if (jobs[i][0] > time) {
                ans.add(i);
                profit = profit + jobs[i][1];
                time++;
            }
        }
        System.out.println(" jobs for maxprofit  = " + ans.size());
        System.out.println("max Profit = " + profit);
        System.out.println(ans);

    }

    public static void main(String[] args) {

        int[][] jobslist = { { 4, 20 },
                { 1, 10 },
                { 1, 40 },
                { 1, 30 },
                { 5, 30 },
                { 7, 100 },
                { 3, 500 },
                { 2, 50 },
                { 2, 80 } };

        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 0; i < jobslist.length; i++) {
            jobs.add(new Job(i, jobslist[i][0], jobslist[i][1]));
        }
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);

        int profit = 0;
        int time = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < jobs.size(); i++) {
            if (jobs.get(i).deadline > time) {
                profit += jobs.get(i).profit;
                ans.add(jobs.get(i).idx);
                time++;
            }
        }
        System.out.println("Max Profit = " + profit);
        System.out.println("Chosen jobs : " + ans);

    }
}