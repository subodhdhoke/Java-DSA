import java.util.*;
public class fibonaccinum{
    public static void fibonumfor(int n){
        int n1=0;
        int n2=1;
        int n3;
        System.out.print(n1+" "+n2+ " ");
        for(int i=3 ; i<=n ; i++){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3);
            System.out.print(" ");
        }
    }
    public static void main(String args[]){
        Scanner sch = new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int n = sch.nextInt();
        if(n==0){
            System.out.println("Invalid Input");
        }
        else if(n==1){
            System.out.println("0");
        }
        else{
            fibonumfor(n);
        }
        //System.out.println(fibonacci(50));
    }
    // public static int fibonacci(int n){
    //     if(n==0 || n==1){
    //         return n;
    //     }
    //     int n1 = fibonacci(n-1);
    //     int n2 = fibonacci(n-2);
    //     int n3 = n1+n2;
    //     return n3;
    // }
}