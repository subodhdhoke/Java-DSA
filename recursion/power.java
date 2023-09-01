import javax.print.attribute.standard.RequestingUserName;

public class recursion {
    public static void main(String[] args) {
        System.out.print(optimisedpower(2, 9));

    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static int optimisedpower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpwr = optimisedpower(x, n / 2) * optimisedpower(x, n / 2);
        if (n % 2 == 0) {
            return halfpwr;
        }
        
        return x * halfpwr;
    }
}
