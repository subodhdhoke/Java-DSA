public class main1{
    public static void main(String[] args) {
        int a = 10;
        long b = a;
        System.out.println(b);

        long c = 13213;
        int d = (int)c;
        System.out.println(d);

        // type conversion is only possible in only this pattern
        // Byte -> short -> Int -> float -> long -> double
    }
}