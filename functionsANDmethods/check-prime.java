public class main1 {
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int n = 7919;
        int a = 10;
        System.out.println(isPrime(a));
    }
}