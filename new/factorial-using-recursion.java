public class factorial{
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int b = fact(n-1);
        int c = n*b;
        return c;
    }
    // public static int factfor(int n){
    //     int a = 1;
    //     for(int i=1;i<=n;i++){
    //         a = a*i;
    //     }
    //     return a;
    // }
    public static void main(String args[]){
        System.out.println(fact(5));
        //System.out.println(factfor(5));
    }
}