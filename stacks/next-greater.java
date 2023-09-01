import java.util.Stack;

public class main {

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 1, 8, 6, 3, 4 };
        // int nextGreater[] = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        //     nextGreater[i] = -1;
        //     for (int j = i + 1; j < arr.length; j++) {

        //         if (arr[j] > arr[i]) {
        //             nextGreater[i] = arr[j];
        //             break;
        //         }
        //     }
        // }

        // for (int i = 0; i < nextGreater.length; i++) {
        //     System.out.print(nextGreater[i] + " ");
        // }

        

        int res[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        res[n - 1] = -1;
        st.push(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while ( st.size() > 0 && st.peek() <= arr[i]) {
                st.pop();
            }
            if(st.size() == 0){
                res[i] = -1;
            }else{
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }

        for(int i=0 ; i<res.length ; i++){
            System.out.print(res[i]+" ");
        }
    }
}