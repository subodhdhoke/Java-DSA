public class main1 {
    public static int factorial(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        return fac;
    }

    public static void main(String[] args) {
        int a = 3;
        System.out.println(factorial(a));
    }
}