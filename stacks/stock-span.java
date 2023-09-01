import java.util.Stack;

public class main{
    public static void main(String[] args) {
        int arr[] = {100 , 80 , 60 , 70 , 60 , 85 , 100};
        Stack<Integer> st = new Stack<>();

        int span[] = new int[arr.length];
        span[0] = 1;
        st.push(0);

        for(int i=1 ; i<arr.length ; i++){
            while(st.size() > 0 && arr[i] > arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                span[i] = 1;
            } else{
                int previousHighIndex = st.peek();
                span[i] = i - previousHighIndex;
            }
            st.push(i);
        }

        for(int i=0 ; i<span.length ; i++){
            System.out.print(span[i]+" ");
        }

    }
}