import java.util.Scanner;

public class recursion{
    public static void numbersindecreasingorder(int n){
        if(n==5){
            System.out.print(n);
            return;
        }
            System.out.print(n+" ");
        numbersindecreasingorder(n-1);
        
    }
    public static void printnumbersinincreasingorder(int n){
        if(n==0){
            return;
        }
        printnumbersinincreasingorder(n-1);
        System.out.print(n+" ");
    }
    public static void rec(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        rec(n-1);
    }
    public static void main(String args[]){
        Scanner sch = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sch.nextInt();
        // for(int i=10 ; i>=0 ; i--){
        //     if(i==4){
        //         return;
        //     }
        //      System.out.print(i);
        //      System.out.print(" ");
        // }
        rec(n);
        System.out.println();
        numbersindecreasingorder(n);
    }
}