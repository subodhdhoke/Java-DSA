import java.util.ArrayList;

public class mainclass {

    public static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        // 4 funcions needed for stack implementation push,pop,peek,isempty
        public static boolean isempty() {
            if (list.size() == 0) {
                return true;
            }
            return false;
        }

        // push
        public static void push(int data) {
            list.add(data);
        }

        // pop
        public static int pop() {
            if(isempty()){
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public static int peek() {
            if(isempty()){
                return -1;
            }
            return list.get(list.size() - 1);
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (s.isempty() != true) {
            System.out.print(s.peek()+ " ");
            s.pop();

        }
        
    }
}