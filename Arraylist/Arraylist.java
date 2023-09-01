import java.time.format.SignStyle;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String args[]) {
        // java collection frameworks
        // classname objectname = new classname();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        // add operation
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(5);

        // print arraylist
        System.out.println(list1);

        // get operation
        System.out.println(list1.get(0));

        // remove operation
        list1.remove(3);
        System.out.println(list1);

        // set operation
        list1.set(1, 220);
        System.out.println(list1);

        // contains check whether element is present or not
        System.out.println(list1.contains(3));
        System.out.println(list1.contains(220));
        System.out.println(list1.contains(6));

        // size of arraylist
        System.out.println(list1.size());
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
    }
}

