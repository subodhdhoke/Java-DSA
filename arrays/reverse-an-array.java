import java.util.*;
public class main1 {
    public static void reverse(int[] arr){
        Stack<Integer> st = new Stack<>();
        for(int i =0 ; i<arr.length ; i++){
            st.push(arr[i]);
        }
        int n = st.size();
        for(int i=0 ; i<n ; i++){
            arr[i] = st.pop();
        }
    }
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8 };
        reverse(arr);
        System.out.println(arr[1]);
    }
}