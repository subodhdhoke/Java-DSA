public class recursion {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 4, 2, 5, 2, 5, 23, 6, 2, 6, 2, 6, 2, 6, 3 };
        firstoccurance(arr, 0, 6);
    }

    public static void firstoccurance(int arr[], int i, int key) {
        if (arr[i] == key) {
            System.out.print(i);
            return;
        }
        if (i == arr.length - 1) {
            System.out.print("Not found : " + key);
            return;
        }
        firstoccurance(arr, i + 1, key);

    }
}
