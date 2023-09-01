import java.util.Arrays;
import java.util.Comparator;

public class main2 {
    public static double fractionalKnapsack(int[] value, int[] weight, int w) {
        double[][] valuePerWeight = new double[value.length][2];
        // 0th column = index and 1st column valueperweight
        for (int i = 0; i < value.length; i++) {
            valuePerWeight[i][0] = i;
            valuePerWeight[i][1] = value[i] / (double) weight[i];
        }
        Arrays.sort(valuePerWeight, Comparator.comparingDouble(o -> -o[1]));
        double capacity = w;
        double maxvalue = 0;
        for (int i = 0; i < valuePerWeight.length; i++) {
            int index = (int)valuePerWeight[i][0];
            if (capacity >= weight[index]) {
                maxvalue = maxvalue + value[index];
                capacity = capacity - weight[index];
            }else{
                maxvalue = maxvalue + (value[i]/weight[i]*capacity);
                capacity = 0 ;
                break;
            }
        }
        return maxvalue;

    }

    public static void main(String[] args) {
        int[] value = { 60, 100, 120, 34, 78, 102, 110 };
        int[] weight = { 10, 20, 30, 13 , 37 , 5 , 251 };
        int w = 100;
        System.out.println(fractionalKnapsack(value, weight, w));
    }
}