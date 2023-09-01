public class mergesort {
    public static void printarr(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void mergesort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si)/2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        // left side {0,1,2,3} = 4 Elements right side {4,5,6} = 3 Elements -> (6-0)+1 =
        // ei-si+1
        int temp[] = new int[ei-si+1];
        int i = si; // iterator for left part array
        int j = mid+1; // iterator for right part array
        int k = 0; // iterator for temp arr
        while(i <= mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }
            else{
                temp[k] = arr[j];
                j++;
                k++;
               
            }
        
        }
        //left part: leftover elements which are already sorted
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        //right part: leftover elements which are already sorted
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        //copy the temp array to orignal array
        for(k=0 , i=si ; k<temp.length ; k++ , i++){
            arr[i] = temp[k];

        }
    }
        public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        
        mergesort(arr, 0, arr.length-1);
        printarr(arr);

    }
}