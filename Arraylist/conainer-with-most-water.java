import java.time.format.SignStyle;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();

        
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(maxwater(height));
        System.out.println(height.size());
        System.out.println(height.get(0));
        System.out.println(height.get(1));
        System.out.println(height.get(7));
        System.out.println(height.get(8));

    }
    public static int maxwater(ArrayList<Integer> height){
        int maxwater = 0;
        for(int i=0 ; i<height.size() ; i++){
            for(int j=i+1 ; j<height.size() ; j++){
                int waterarea = Math.min(height.get(i), height.get(j)) * (j-i);
                maxwater = Math.max(maxwater, waterarea);

            }
        }
        return maxwater;
    }
}