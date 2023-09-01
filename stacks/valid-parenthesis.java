import java.util.Stack;

public class main{
    public static boolean isvalid(String str){
        Stack<Character> st = new Stack<>();

        for(int i = 0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if( ch == '('){
                st.push(')');
            }
            else if( ch == '['){
                st.push(']');
            }
            else if(ch == '{'){
                st.push('}');
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else if(st.pop() != ch){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String String1 = "(())(){[]}";  // true

        System.out.println(isvalid(String1));


    }
}