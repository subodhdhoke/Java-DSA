public class recursion {
    public static void main(String args[]) {
        System.out.print(tiling(5));

    }

    public static int tiling(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        return tiling(n - 1) + tiling(n - 2);
    }

}
