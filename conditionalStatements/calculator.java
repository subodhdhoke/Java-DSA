import java.util.Scanner;

public class calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char c  = sc.next().charAt(0);
        int b = sc.nextInt();
        if(c=='+'){
            System.out.println(a+b);
        } 
        else if(c == '-'){
            System.out.println(a-b);
        }
        else if(c == '*'){
            System.out.println(a*b);
        }
        else if(c == '/'){
            System.out.println(a/b);
        }
    }
}