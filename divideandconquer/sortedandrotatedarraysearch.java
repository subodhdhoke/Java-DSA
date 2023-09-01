public class sortedandrotatedarraysearch {
    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    public static int search(int arr[], int target, int si, int ei) {
        if(si>ei){
            System.out.print("Target not found");
            return -1;
        }


        int mid = (si + ei) / 2;
        //case found on mid
        if (arr[mid] == target) {
            return mid;
        }
        //case found on l1
        if(arr[si] <= arr[mid]){
            // case a : left of mid
            if(arr[si] <=target && target <=arr[mid]){
                return search(arr, target, si, mid);
            }else{
                //caes b:right of mid
                return search(arr, target, mid+1, ei);
            }

        }

        //mid on l2
        else{
                //case c: right
                if(arr[mid] <= target && target<=arr[ei]){
                    return search(arr, target, mid+1, ei);
                }else{
                    //case d:left of mid
                    return search(arr, target, si, mid-1);
                }
        }
    }
}
