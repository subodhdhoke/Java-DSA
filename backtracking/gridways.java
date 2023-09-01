public class gridways {
    public static void main(String args[]) {
        int n = 5, m = 4;
        System.out.println(countways(0, 0, n, m));

    }

    public static int countways(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }

        return countways(i + 1, j, n, m) + countways(i, j + 1, n, m);
    }

}
