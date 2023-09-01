import java.util.Scanner;

public class recursion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        factorial(n - 1);
        return n*factorial(n-1);
    }
}
