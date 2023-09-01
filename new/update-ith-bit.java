public class bit{
    public static void updateithbit(int n,int i,int newbit){
        n = n & ~(1<<i);  //clearithbit
        int bitmask = newbit<<i;
        n = n|bitmask;
        System.out.println(n);
    }
    public static void main(String args[]){
        updateithbit(10, 2, 1);
    }
}