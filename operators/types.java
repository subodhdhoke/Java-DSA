package operators;

public class types {
    public static void main(String[] args) {
        // arithmetic opearator(binary and unary)
          //binary + - * / %
          int a = 10;
          int b = 20;
          int c,d,e,f,g;
          c = a+b;
          d = a-b;
          e = a*b;
          f = a/b;
          g = a%b;
          
          // unary ++ --
          int m = 10;
          System.out.println(m);
          ++m;
          System.out.println(m);
         // pre increment change -> use
        int i = 10;
        int j = ++a;
        System.out.println(i);
        System.out.println(j);

        // relational operators
        System.out.println(i==j);
        System.out.println(i!=j);
        System.out.println(i>j);
        System.out.println(i<j);
        System.out.println(i>=j);
        System.out.println(i<=j);

        //logical operators && ||
        System.out.println(6>5 && 5>1);
        System.out.println(6>5 || 5<1);


        // assignment operator = , += ,-= , *= , /=
        int z = 10;
        z += 20;
        System.out.println(z);

    }
}
