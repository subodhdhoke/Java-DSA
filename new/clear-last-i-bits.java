public class bits{
    public static void clearlastibits(int n,int i){
        int bitmask = ~0;
        bitmask = bitmask<<2;
        n = n & bitmask;
        System.out.println(n);
    }
    public static void main(String args[]){
        clearlastibits(15, 2);
    }
}