public class main1 {
    public static void main(String[] args) {
        int n = 1000000;
        getPrimes(n);
    }
    public static void getPrimes(int n) {
        for (int i = 1; i <= n; i++) {
            if (isPrime(i) == true) {
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}