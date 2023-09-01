public class bit{
    public static void setith(int n,int i){
        int bitmask = 1<<i;
        n = n|bitmask;
        System.out.println(n);
    }
    public static void main(String args[]){
        setith(10, 2);
    }
}