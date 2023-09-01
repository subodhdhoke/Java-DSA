public class main1 {
    public static int kadanes(int arr[]) {
        int sum = arr[0];
        int maxsum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (sum >= 0) {
                sum = sum + arr[i];
            } else {
                sum = arr[i];
            }
            if (sum > maxsum) {
                maxsum = sum;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int arr[] = { -1, -2, -6, -1, -3 };
        System.out.println("Maxsum = "+kadanes(arr));

    }
}