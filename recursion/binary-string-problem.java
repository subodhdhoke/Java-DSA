public class recursion {
    public static void main(String args[]) {
        binarystrings(3, 0, "");

    }

    public static void binarystrings(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        if (lastplace == 0) {
            // put zero in chair
            binarystrings(n - 1, 0, str+"0");
            binarystrings(n - 1, 1, str+"1");
        } 
        else {
            binarystrings(n - 1, 0, str+"0");
        }
    }
}
