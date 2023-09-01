import java.util.ArrayList;

public class main1 {
    public static void activityselection(int[] start, int[] end) {
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        count = 1;
        int idx = 0;
        ans.add(0);
        for (int i = 1; i < start.length; i++) {
            if (start[i] >= end[idx]) {
                count++;
                idx = i;
                ans.add(i);
            }
        }
        System.out.println("Max Activities : "+count);
        System.out.println(ans);
        
    }

    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };
        activityselection(start, end);

    }
}