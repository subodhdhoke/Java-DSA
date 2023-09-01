import java.util.LinkedList;
import java.util.Queue;

public class main2 {
    public static String firstNonRepeating(String str) {
        StringBuilder ans = new StringBuilder();
        Queue<Character> q = new LinkedList<>();
        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;
            while (q.size() > 0 && freq[q.peek()-'a'] > 1) {
                q.remove();
            }
            if(q.isEmpty()){
                ans = ans.append(-1);
            } else{
                ans = ans.append(q.peek());
            }
        }

        str = ans.toString();
        return str;
    }

    public static void main(String[] args) {
        String str = "aabccxb";
        System.out.println(firstNonRepeating(str));
        System.out.println(str);
    }
}