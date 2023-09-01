import java.util.Scanner;
import java.util.Stack;

public class pushatbottom {
    public static void pushAtBottomRecursive(Stack<Integer> st , int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        pushAtBottomRecursive(st, data);
        st.push(top);
        
    }

    public static void pushAtBottom(Stack<Integer> st , int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        } 
        int top = st.pop();
        pushAtBottom(st, data);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Stack is : ");
        System.out.println(st);
    
        pushAtBottomRecursive(st, 85);
        System.out.println(st);

        pushAtBottom(st, 100);
        System.out.println(st);
        

    }
}