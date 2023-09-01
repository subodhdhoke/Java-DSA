import java.util.Stack;

public class main{
    public static void reverseAstack(Stack<Integer> st){
        Stack <Integer> st2 = new Stack<>();
        while(st.size() != 0){
            st2.push(st.pop());
        }
        Stack<Integer> st3 = new Stack<>();
        while(st2.size() != 0){
            st3.push(st2.pop());
        }
        while(st3.size() != 0){
            st.push(st3.pop());
        }

    }
    public static void pushAtBottom(Stack<Integer> st , int data){
        Stack<Integer> newst = new Stack<>();
        while (st.size() != 0) {
            newst.push(st.pop());
        }
        newst.push(data);
        while (newst.size() != 0) {
            st.push(newst.pop());
        } 
    } 

    public static void reverseAstackRecursive(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverseAstackRecursive(st);
        pushAtBottom(st, top);


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
        reverseAstack(st);
        System.out.println(st);
        
        reverseAstackRecursive(st);
        System.out.println(st);
        
    }
}