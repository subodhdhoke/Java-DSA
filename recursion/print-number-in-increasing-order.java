public class recursion {
    public static void main(String args[]) {
        int n = 10;
        increasing(n);
    }

    public static void increasing(int n) {
        if (n == 0) {
            return;
        }
        increasing(n-1);
        System.out.print(n+" ");
    }

}
