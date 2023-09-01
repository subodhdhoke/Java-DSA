public class binary{
    public static void main(String args[]){
        int arr[] = {2,6,1,8,12,56,43,78,9};
        System.out.println(binarysearch(arr, 43));
    }
    public static int binarysearch(int arr[],int key){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}