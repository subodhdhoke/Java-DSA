import java.util.Stack;

public class main1 {
    public static class queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public void add(int data) {
            
            while (s1.size() > 0) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (s2.size() > 0) {
                s1.push(s2.pop());
            }
        }

        public int remove() {
            if (s1.isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return s1.pop();
        }

        public int peek() {
            if (s1.isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        queue q1 = new queue();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.remove());
    }
}