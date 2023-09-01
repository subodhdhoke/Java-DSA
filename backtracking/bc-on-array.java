public class bc{
    public static void main(String args[]){
        int arr[] = new int[5];
        bcarray(arr, 0, 1);
        printarr(arr);
    }
    public static void bcarray(int arr[] ,int i , int n){
        if(i==arr.length){
            printarr(arr);
            return;
        }
        arr[i] = n;
        bcarray(arr, i+1, n+1);
        
        arr[i] =n-2;


    }
    public static void printarr(int arr[]){
        for(int i=0 ; i<=arr.length-1 ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
