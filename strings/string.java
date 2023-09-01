import java.util.Scanner;

public class string{
    public static void main(String[] args) {
        String str = "abcd e";
        String str1 = new String("Tony Stark");
        System.out.println(str1);
        System.out.println(str);
        System.out.println(str.charAt(4));
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();  // it take multiple line as input
        System.out.println(name);
        String name2 = sc.next();  // only input a single line if we give a space its not considered
        System.out.println(name2);
        System.out.println(name.length());
        String str3 = name.concat(name2);
        System.out.println(str3);

    }
}
