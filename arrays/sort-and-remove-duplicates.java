import java.util.*;

public class Main1 {
    public static void countingsortandremoveduplicates(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        int[] count = new int[max + 1]; 
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]] += 1;
        }
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                arr[k] = i;
                k++;
            }
        }
        for (int i = 0; i < k; i++) { 
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 3, 8, 1, 4, 5, 1, 4, 5, 6 };
        countingsortandremoveduplicates(arr); 
    }
}
