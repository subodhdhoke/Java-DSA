import java.util.*;
public class strings{
    boolean i = true;
    public static boolean ispalindrome(String str){
        for(int i=0 ; i<str.length()/2 ; i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }  
        
        return true;
    }
    public static void main(String args[]){
        Scanner sch = new Scanner(System.in);
        System.out.print("Enter your String :");
        String str = sch.nextLine();
        System.out.println(ispalindrome(str));

        

        
    }
}
