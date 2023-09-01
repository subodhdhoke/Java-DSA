import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your radius : ");
        int a = sc.nextInt();
        System.out.print("area of circle is : ");
        System.out.print(3.14*a*a);
    }
}
