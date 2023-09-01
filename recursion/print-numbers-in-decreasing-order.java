public class recursions {
    public static void main(String args[]) {
        int n = 10;
        decreasing(n);
    }

    public static void decreasing(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n+" ");
        decreasing(n-1);
    }
}