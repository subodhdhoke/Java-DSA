public class main1 {
    public static void printSubarray(int[] arr) {
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                }
                if (sum > maxsum) {
                    maxsum = sum;
                }
                System.out.print(" : " + sum);
                System.out.print(" | ");
                sum = 0;
            }
            System.out.println();
        }
        System.out.println("MaxSum in Subarray = " + maxsum);
    }

    public static void prefixsum(int[] arr) {
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;

        int[] prefixsum = new int[arr.length];
        prefixsum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixsum[i] = prefixsum[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==0){
                    sum = prefixsum[j];
                } else{
                    sum = prefixsum[j] - prefixsum[i-1];
                }
                if(sum > maxsum){
                    maxsum = sum;
                }
            }
        }
        System.out.println("MaxSum in Subarray = " + maxsum);
    }

    public static void main(String[] args) {
        int[] arr = { -1, -2, -6, -1, -3 };
        printSubarray(arr);
        prefixsum(arr);
    }
}