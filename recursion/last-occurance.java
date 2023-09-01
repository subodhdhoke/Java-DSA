public class recursion {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 4, 2, 5, 2, 5, 23, 6, 2, 6, 2, 6, 2, 6, 3 };
        
        lastoccurance(arr, 100, arr.length-1 );
    }

    public static void lastoccurance(int arr[], int key, int i) {
        if(i==-1){
            System.out.print("Not present in the array");
            return;
        }
        if(arr[i] == key){
            System.out.print(i);
            return;
        }
        lastoccurance(arr, key, i-1);
    }
}
