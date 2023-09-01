import java.util.*;
public class main1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i< arr.length ; i++){
            int curr = i;
            int temp = i+1;
            while(temp != 0){
                list.add(arr[curr]);
                temp--;
            }
        }
        System.out.println(list);
        
    }
}
