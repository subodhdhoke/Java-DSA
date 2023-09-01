public class sortedandrotatedarray {
    public static int search(int arr[] , int si , int ei , int tar){
        //base case
        if(si>ei){
            return -1;
        }
        //kaaam
        int mid = (si+ei)/2;
        //case found on mid
        if(arr[mid]==tar){
            return mid;
        }

        //if found on line 1
        if(arr[si]<=arr[mid]){
             //case a: target on left side of mid on line1
             if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr, si, mid-1, tar);
             }
             else{  //case b:target on the right side of mid in the 1st line
                return search(arr, mid+1, ei, tar);
             }
        }

        //if found on line 2
        else{
            //line 2
            //case a:right of mid on line 2
            if(tar<=arr[ei] && tar>=arr[mid]){
                return search(arr, mid+1, ei, tar);
            }
            else{  //case b: left of mid on line 2
                return search(arr, si, mid-1, tar);
            }

        }
    }
    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;   //output = 4
        int targetindex = search(arr, 0, arr.length-1, 0);
        System.out.println(targetindex);
    }
}
