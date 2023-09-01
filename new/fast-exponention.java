public class bits{
    public static void fastexponentiation(int a , int n){
        int ans = 1;
        while(n>0){
            if((n&1) !=0){
                ans = ans*a;
            }
            a = a*a;
            n = n>>1;
        }
        System.out.println(ans);
    }
    public static void main(String args[]){
        fastexponentiation(7, 9);
    }
}