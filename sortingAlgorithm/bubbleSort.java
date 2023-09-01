package sortingAlgorithm;

public class bubbleSort {
    public static void printarr(int[] arr){
        System.out.print("[ ");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
        System.out.println();
    }
    public static void bubblesortIncreasing(int[] arr){
        for(int i=0 ; i<arr.length-1 ; i++){
            for(int k = 0 ; k<arr.length-1-i ; k++){
                if(arr[k]>arr[k+1]){
                    int temp = arr[k+1];
                    arr[k+1] = arr[k];
                    arr[k] = temp;
                }
            }

        }
    }
    public static void bubblesortDecreasing(int[] arr){
        for(int i=0 ; i<arr.length-1 ; i++){
            for(int k = 0 ; k<arr.length-1-i ; k++){
                if(arr[k]<arr[k+1]){
                    int temp = arr[k+1];
                    arr[k+1] = arr[k];
                    arr[k] = temp;
                }
            }

        }
    }
    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2 ,543,53,5,35,34,45,6,34,4,6,7,25,3,5,26,45,745,62,52,35,236,7,3,6,5,8,5,347,5,8,4,6,5};
        printarr(arr);
        bubblesortIncreasing(arr);
        System.out.print("Sorted Increasing :");
        printarr(arr);
        bubblesortDecreasing(arr);
        System.out.print("Sorted Decreasing :");
        printarr(arr);

    }
}
