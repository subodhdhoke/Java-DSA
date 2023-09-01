public class countingsort {
    public static void printarr(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void countingsort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0; i<count.length ; i++){
            if(count[i] != 0){
                while(count[i] != 0){
                    arr[j] = i;
                    count[i]--;
                    j++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2 };
    }
}
