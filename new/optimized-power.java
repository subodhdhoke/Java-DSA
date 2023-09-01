public class main{
    public static void main(String args[]){
        System.out.println(optimizedpower(2, 11));
    }
    public static int optimizedpower(int a ,int n){
        if(n==0){
            return 1;
        }
        int halfpower = optimizedpower(a, n/2);
        int halfpowersqr = halfpower*halfpower;
        
        if(n%2==1){
            halfpowersqr = a*halfpowersqr;
            return halfpowersqr;
        }
        return halfpowersqr;
    }
}