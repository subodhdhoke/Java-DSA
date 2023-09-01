import java.util.Arrays;
import java.util.Comparator;
import java.util.*;

public class main2 {
    public static int indianCoins(Integer[] currency, int value) {
        Arrays.sort(currency, Comparator.reverseOrder());
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < currency.length; i++) {
            while (value >= currency[i]) {
                count++;
                ans.add(currency[i]);
                value -= currency[i];
            }
        }
        System.out.println(ans);
        return count;
    }

    public static void main(String[] args) {
        Integer[] currency = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int value = 1059;
        System.out.println(indianCoins(currency, value));
    }
}
