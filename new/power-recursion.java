public class main{
    public static void main(String args[]){
        System.out.println(powerrec(3, 6));
    }
    public static void powerfor(int a,int n){
        int temp = 1;
        for (int i=1; i<=n; i++){
          temp = temp*a;
        }
        System.out.println(a+" power "+n+" is "+temp);
    }
    public static int powerrec(int a ,int n){
        if(n==0){
            return 1;
        }        
        int b = powerrec(a, n-1);
        int c = a*b;
        return c;
        //return a*powerrec(a, n-1);
        

    }

}