import java.util.*;

public class copystacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> copy = new Stack<>();


        while (st.size() != 0) {
            st2.push(st.pop());
        }
        System.out.println(st2);

        while (st2.size() != 0) {
            copy.push(st2.pop());
        }
        System.out.println(copy);

    }
}