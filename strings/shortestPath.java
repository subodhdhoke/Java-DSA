public class ShortestPath {
    public static double shortestPath(String str) {
        double vertical = 0;
        double horizontal = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'n') {
                vertical++;
            } else if (str.charAt(i) == 's') {
                vertical--;
            } else if (str.charAt(i) == 'e') {
                horizontal++;
            } else if (str.charAt(i) == 'w') {
                horizontal--;
            }
        }
        return Math.sqrt(vertical * vertical + horizontal * horizontal);
    }

    public static void main(String[] args) {
        String str = "wneenesennnnnneeewwwsnsnssnsnnesweennnss";
        System.out.println(shortestPath(str));
    }
}
