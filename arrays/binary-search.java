public class main1 {
    public static int binarySearch(int[] arr, int key) {
        int mid = arr.length / 2;
        int si = 0;
        int ei = arr.length;
        while (arr[mid] != key) {
            if (key > arr[mid]) {
                si = mid+1;
                mid = (si + ei) / 2;
            } else {
                ei = mid - 1;
                mid = (si + ei) / 2;
            }
        }
        return mid;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        System.out.println(binarySearch(arr, 20));
    }
}