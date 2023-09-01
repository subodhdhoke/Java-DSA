public class bits{
    public static void clearrangeofbits(int n,int i,int j){
        int a = (~0)<<j+1;
        int b = ~((~0)<<i);
        int bitmask = a|b;
        n = n & bitmask;
        System.out.println(n);
    }
    public static void main(String args[]){
        clearrangeofbits(10, 2, 4);
    }
}