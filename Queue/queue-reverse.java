import java.util.LinkedList;
import java.util.Queue;

public class Classroom{
    public static void reverseQueue(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }
        int top = q.remove();
        reverseQueue(q);
        q.add(top);
    }
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        System.out.println("Queue is : "+q1);
        reverseQueue(q1);
        System.out.println(q1);
    }
}