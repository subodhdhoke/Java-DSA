import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sch = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sch.nextInt();
        System.out.println(tillingproblem(n));
    }
    public static int tillingproblem(int n){  //2*n
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //kaam
        //verically
        int fnm1 = tillingproblem(n-1);
        //horizontally
        int fnm2 = tillingproblem(n-2);
        //total ways
        int total = fnm1 + fnm2;
        return total;
    }
}