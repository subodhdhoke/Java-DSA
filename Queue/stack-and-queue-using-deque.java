import java.util.Deque;
import java.util.LinkedList;

public class Classroom{

    public static class Stack{
        static Deque<Integer> dq = new LinkedList<>();
        
        public boolean isEmpty(){
            return dq.isEmpty();
        }
        
        public void push(int data){
            dq.addLast(data);
        }
        
        public int pop(){
            if(dq.size()==0){
                System.out.println("Sack is Empty");
                return -1;
            }
            return dq.removeLast();
        }
        
        public int peek(){
            if(dq.size()==0){
                System.out.println("Sack is Empty");
                return -1;
            }
            return dq.getLast();
        }
    }
    
    public static class Queue{
        static Deque<Integer> dq = new LinkedList<>();

        public void add(int data){
            dq.addLast(data);
        }

        public int remove(){
            if(dq.size()==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return dq.removeFirst();
        }

        public int peek(){
            if(dq.size()==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return dq.getFirst();
        }

    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
        System.out.println();

        System.out.println("Queue");
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        System.out.println(q.remove());
        // System.out.println(q.remove());
        // System.out.println(q.remove());
        // System.out.println(q.remove());
        System.out.println(q.peek());
        
    }
}