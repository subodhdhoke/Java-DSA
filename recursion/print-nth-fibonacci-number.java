public class recursion {
    public static void main(String args[]) {
        int n = 55;
        // System.out.print(fibo(n));
        System.out.println();
        printfibonacciseries(n);
    }
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

    public static void printfibonacciseries(int n){
        if(n == 0){
            System.out.print("0 ");
        } else if(n==1){
            System.out.print("1 ");
        } else{
            System.out.print("0 ");
            System.out.print("1 ");
            int a = 0;
            int b = 1;
            int c;
            for(int i=2 ; i<=n ; i++){
                c = a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
        }
    }

}
