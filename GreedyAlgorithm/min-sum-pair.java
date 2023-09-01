import java.util.Arrays;

public class main2 {
    public static int minPairSum(int[] a, int[] b) {
        int sum = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            // int pairsum = a[i] - b[i];
            // if (pairsum >= 0) {
            //     sum = sum + pairsum;
            // } else {
            //     sum = sum + -(pairsum);
            // }
            sum += Math.abs(a[i]-b[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = { 1,7,5 };
        int[] b = { 2,3,5 };
        System.out.println(minPairSum(a, b));

    }
}