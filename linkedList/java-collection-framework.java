import java.util.LinkedList;
import java.util.*;

public class Classroom{
    public static void main(String[] args) {
        // create
        LinkedList<Integer> list = new LinkedList<>();
    
        // add
        list.addLast(50);
        list.addLast(60);
        list.addFirst(40);
        list.addFirst(30);
        System.out.println(list);

        //remove
        list.remove(0);
        list.remove(1);
        System.out.println(list);

    }
}
