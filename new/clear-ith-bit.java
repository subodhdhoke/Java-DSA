public class bit{
    public static void clearithbit(int n,int i){
        int bitmask = ~(1<<i);
        n = n & bitmask;
        System.out.println(n);
    }
    public static void main(String args[]){
        clearithbit(10, 3);
    }
}