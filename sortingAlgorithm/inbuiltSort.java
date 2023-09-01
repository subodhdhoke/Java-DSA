import java.util.*;

public class main1 {
    public static void printarr(Integer[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] arr = { 2, 4, 5, 1, 3 };
        printarr(arr);
        Arrays.sort(arr,Collections.reverseOrder());
        printarr(arr);

    }
}