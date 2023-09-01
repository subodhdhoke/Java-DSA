public class recursion {
    public static void main(String args[]) {
        String str = "subodh";
        System.out.print(findLength(str));
    }

    public static int findLength(String str) {
        if (str == "") {
            return 0;
        } else {
            return 1 + findLength(str.substring(1));
        }
    }

}
