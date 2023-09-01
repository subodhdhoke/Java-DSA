import java.util.*;

public class arraylist {
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
    }

    public static int maxwater(ArrayList<Integer> height) {
        int maxwater = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            maxwater = Math.max(maxwater, Math.min(height.get(rp), height.get(lp)) * (rp - lp));

            if (height.get(lp) < height.get(rp)) {
                lp++;
            }else{
                rp--;
            }
        }
        return maxwater;
    }
}