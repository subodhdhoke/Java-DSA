public class main1 {
    public static void main(String[] args) {
        int n = 1000101111;
        System.out.println(binaryToDecimal(n));
    }
    public static int binaryToDecimal(int binary) {
        int sum = 0;
        int pow = 0;
        while(binary != 0){
            int r = binary%10;
            sum += r*(Math.pow(2, pow));
            binary = binary/10;
            pow++;
        }
        return sum;
    }
}