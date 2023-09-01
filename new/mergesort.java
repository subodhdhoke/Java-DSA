public class mergesort {
    public static void main(String args[]){
        int array[] = {6,3,9,5,2,8};
        mergesort(array, 0, array.length-1); 
        printarray(array);     
    }
    public static void mergesort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = (si + ei)/2;
        mergesort(arr, si, mid);  //right part
        mergesort(arr, mid+1, ei);  //left part
        merge(arr, si, ei, mid);

        
    }
    public static void merge(int arr[],int si,int ei,int mid){
        int temp[] = new int[ei-si+1];
        int i = si;   //iterator for left part
        int j = mid +1;  //iterrator for right side part
        int k = 0;  //iterator for temp array
        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
                //k++;
            }
            else{
                temp[k] = arr[j];
                j++;
                //k++;
            }
            k++;    
            //for leftover elements of 1st sorted part
            while(i<=mid){
                temp[k++] = arr[i++];
            }
            //for leftoverpart of 2nd sorted part
            while(j<=ei){
                temp[k++] = arr[j++];
            }
            //copy from temp to arr
            for(k=0,i=si ; k<temp.length ; k++,i++){
                arr[i] = temp[k];
            }
        }
    }
    public static void printarray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
