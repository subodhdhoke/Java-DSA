import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist {
    public static void main(String args[]) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(5);
        list1.add(9);
        list1.add(3);
        list1.add(6);
        System.out.println(list1);
        
        Collections.sort(list1); //sorting in scending order
        System.out.println(list1);

        Collections.sort(list1, Collections.reverseOrder());  //comparator - it defines the logic of sorting
        System.out.println(list1);
    }
}
