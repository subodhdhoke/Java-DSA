public class sumofnnaturalnum{
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int Sumnm1 = sum(n-1);
        int c = n+Sumnm1;
        return c;
    }
    public static void main(String args[]){
        System.out.println(sum(10));
    }
}