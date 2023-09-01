import java.util.LinkedList;
import java.util.Queue;

public class main1{
    public static class stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty();
        }

        public static void push(int data){
            while(q1.size()>0){
                q2.add(q1.remove());
            }
            q1.add(data);
            while(q2.size()>0){
                q1.add(q2.remove());
            }
        }

        public static int pop(){
            if(q1.isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            return q1.remove();
        }

        public static int peek(){
            if(q1.isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            return q1.peek();
        }
    }
    public static void main(String[] args) {
        stack s1 = new stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);

        System.out.println(s1.pop());
        System.out.println(s1.isEmpty());
        System.out.println(s1.peek());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.isEmpty());
    }
}