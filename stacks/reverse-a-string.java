import java.util.Stack;

public class main {
    public static String reverseAString(String str) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        while (i < str.length()) {
            st.push(str.charAt(i));
            i++;
        }

        StringBuilder result = new StringBuilder("");
        while (st.size() != 0) {
            result.append(st.pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "Helloworld";
        System.out.println(str);

        System.out.println(reverseAString(str));

    }
}