import java.util.*;
public class main{
    public static void main(String[] args) {
        Queue<Character> q1 = new ArrayDeque<>();
        q1.add('a');
        q1.add('b');
        q1.add('c');
        System.out.println(q1);
        
        Queue<Integer> q2 = new LinkedList<>();
        q2.add(1);
        q2.add(2);
        q2.add(3);
        q2.add(4);
        System.out.println(q2);
        q2.remove();
        System.out.println(q2);
        System.out.println(q2.remove());
        System.out.println(q2);
        System.out.println();

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        Queue<Integer> qe = new LinkedList<>();

        while(q.size() > 0){
            System.out.println(q.peek());
            qe.add(q.remove());
        }
        System.out.println(q);
        q = qe;
        System.out.println(q);

    }
}