public class main1 {
    public static int factorial(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        return fac;
    }

    public static int binomialCoefficient(int n, int r) {
        int out = factorial(n) / (factorial(r) * factorial(n - r));
        return out;
    }

    public static void main(String[] args) {
        int n = 10;
        int r = 3;
        System.out.println(binomialCoefficient(n, r));
    }
}