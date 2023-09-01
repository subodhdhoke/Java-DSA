import java.util.Stack;

public class main1 {
    public static boolean duplcateparentheses(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (c != ')') {
                st.push(c);
            } else {
                // Check for duplicate parentheses
                int count = 0;
                while (!st.isEmpty() && st.peek() != '(') {
                    st.pop();
                    count++;
                }
                if (count == 0) {  // Duplicate parentheses found
                    return true; 
                }
                st.pop(); // Pop the opening parenthesis
            }
        }
        return false; // No duplicate parentheses found
    }

    public static void main(String[] args) {
        String str = "((a+b)+(c+d))";
        System.out.println(duplcateparentheses(str));

    }
}