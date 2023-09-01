import java.util.*;

public class RemoveDuplicates {
    public static void remove(int[] arr) {
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int min = arr[0];
        int[] count = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                arr[k] = i+min;
                k++;
                
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 0, 4, 3, 6, 1, 1, 6, 2, 3, 10, 12, 13, 12, 10 };
        int[] arr1 = { -1, 0, 0, 0, 0, 3, 3 };
        remove(arr1);
    }
}
