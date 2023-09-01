public class main1{
    public static int largest(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {34,4,2345,235,325,2,5,5,346,23,6724,5,235,34,6,346,346,37,4236,34,543,5,346,2365,36};
        System.out.println(largest(arr));

    }
}