public class Equilibrium {
    public static int eqlibrium(int[] arr) {
        int totalsum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalsum = totalsum + arr[i];
        }
        int leftsum = 0;
        if (arr[0] == totalsum - arr[0]) {
            return 0;
        }
        leftsum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            leftsum = leftsum + arr[i];
            if (leftsum == totalsum - leftsum) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 2 ,5, 1, 1 };
        System.out.println(eqlibrium(arr));
    }
}
