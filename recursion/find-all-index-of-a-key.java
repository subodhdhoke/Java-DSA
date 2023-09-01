public class recursion {
    public static void main(String args[]){
        int arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        indexofkey(arr, key, 0);
    }
    public static void indexofkey(int arr[] , int key , int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        indexofkey(arr, key, i+1);
    }

}
