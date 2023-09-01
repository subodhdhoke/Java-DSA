public class recursion {
    public static void main(String args[]) {
        int n=4;
        System.out.println(friendpairing(n));

    }

    public static int friendpairing(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return friendpairing(n-1)+((n-1)*friendpairing(n-2));
    }
}
