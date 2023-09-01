import java.util.Arrays;
import java.util.Collection;
import java.util.*;

public class main2 {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVer[] = { 2, 1, 3, 1, 4 };
        Integer costHor[] = { 4, 1, 2 };

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0;
        int hparts = 1, vparts = 1;
        int cost = 0;

        while (h < costHor.length && v < costVer.length) {
            // vertical cost is less
            if (costVer[v] <= costHor[h]) { // horizontal cut
                cost += (costHor[h] * vparts);
                hparts++;
                h++;
            } else { // vertical cut
                cost += (costVer[v] * hparts);
                vparts++;
                v++;
            }
        }
        while (h < costHor.length) {
            cost += (costHor[h] * vparts);
            hparts++;
            h++;
        }

        while (v < costVer.length) {
            cost += (costVer[v] * hparts);
            vparts++;
            v++;
        }

        System.out.println("Min Cost of Cutting = "+cost);

    }
}