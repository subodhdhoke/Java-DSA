import java.util.*;
public class main1{
    public static void main(String[] args) {
        decimalToBinary(10);
        
    }
    public static void decimalToBinary(int decimal){
        ArrayList<Integer> binary = new ArrayList<>();
        while(decimal != 0){
            binary.add(decimal%2);
            decimal = decimal/2;
        }
        for(int i=binary.size()-1 ; i>=0 ; i--){
            System.out.print(binary.get(i));
        }
    }
}