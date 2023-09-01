public class recursion {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 7, 6, 8, 9, 10 };
        issorted(arr, 0);
    }

    public static void issorted(int arr[], int i) {
        if (i == arr.length - 1) {
            System.out.print("Array is sorted");
            return;
        }

        if (arr[i] > arr[i + 1]) {
            System.out.print("Array is not sorted");
            return;
        }
        issorted(arr, i + 1);

    }
}
