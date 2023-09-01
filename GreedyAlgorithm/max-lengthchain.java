import java.util.Arrays;
import java.util.Comparator;

public class main1 {
    public static int maxLengthChain(int[][] pairs){
        Arrays.sort(pairs,Comparator.comparingInt(o -> o[1]));

        int count = 1;
        int idx =0;
        
        for(int i=1 ; i<pairs.length ; i++){
            if(pairs[i][0] > pairs[idx][1]){
                count++;
                idx = i;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] pairs = { { 5, 24 },
                          { 39, 60 },
                          { 5, 28 },
                          { 27, 40 },
                          { 50, 90 } };


        System.out.println(maxLengthChain(pairs));
        

    }
}