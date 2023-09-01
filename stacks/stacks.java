package stacks;

// import java.util.ArrayList;
import java.util.Stack;

public class stacks {
    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        //peek
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println("Size is : "+st.size());
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());

    }
    
}
