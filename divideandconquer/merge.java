public class merge {
    public static void main(String args[]) {
        int arr[] = { 6, 4, 2, 1, 9, 8, 3, 5 };
        printarr(arr);
        mergesortarr(arr, 0, arr.length - 1);
        printarr(arr);

        int array[] = {10,11,12,5,3,7,8,1,4,100};
        merge merge1 = new merge();
        merge1.printarr(array);
        merge1.mergesortarr(array, 0, arr.length-1);
        merge1.printarr(array);

    }

    public static void printarr(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergesortarr(int arr[], int si, int ei) {
        if(si>=ei){
            return;
        }

        int mid = (si+ei)/2;
        mergesortarr(arr, si, mid);
        mergesortarr(arr, mid+1, ei);
        mergearr(arr, si, ei, mid);

    }
    public static void mergearr(int arr[] , int si , int ei , int mid){
          int temp[] = new int[ei-si+1];
          int i = si;
          int j =mid+1;
          int k = 0;
          while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }else{
                temp[k] = arr[j];
                j++;
                k++;
            }

    
          }
          while(i<=mid){
            temp[k] = arr[i];
            i++;
            k++;
          }
          while(j<=ei){
            temp[k] = arr[j];
            j++;
            k++;
          }

          for(k=0,i=si ; k<temp.length ; k++,i++){
            arr[i] = temp[k];
          }

    }
}