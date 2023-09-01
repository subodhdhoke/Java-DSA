import java.util.*;
public class main{
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 1, 8, 6, 3, 4 };

        Stack<Integer> st = new Stack<>();
        int res[] = new int[arr.length];
        res[0] = -1;
        st.push(arr[0]);
        for(int i = 1 ; i<arr.length ; i++){
            while(st.size() >0  && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.size() == 0){
                res[i] = -1;
            } else{
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }

        for(int i = 0 ; i < res.length ; i++){
            System.out.print(res[i]+" ");
        }


    }
}