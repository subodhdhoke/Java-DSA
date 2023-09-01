import javax.swing.plaf.basic.BasicTextUI.BasicHighlighter;

public class bits{
    public static void checkifpowerof2(int n){
        int b = n-1;
        int c = n & b;
        if(c == 0){
            System.out.println(n+" is power of 2.");
        }
        else{
            System.out.println(n+" is not a power of 2.");
        }
    }
    public static void main(String args[]){
        checkifpowerof2(10);
    }
}