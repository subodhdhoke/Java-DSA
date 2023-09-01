import java.util.*;

public class arraylist {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=10;
        pairsum(list, target);
        System.out.println(pairsum(list, target));
    }
    public static boolean pairsum(ArrayList<Integer> list , int target){
            for(int i=0 ; i<list.size() ; i++){
                for(int j=i+1 ; j<list.size() ; j++){
                    if(list.get(i)+list.get(j)==target){
                        System.out.println("Exist");
                        return true;
                    }
                }
            } 
            return false;  
    }
}