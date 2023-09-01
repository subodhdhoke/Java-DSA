import java.util.*;
public class main1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String str = "abcde";
        list.add("a"); list.add("b"); list.add("c"); list.add("d"); list.add("e");
        StringBuilder str1 = new StringBuilder();
        for(int i=0 ; i<5 ; i++){
            str1.append(str.charAt(i));
            for(int j=0 ; j<5 ; j++){
                str1.append(str.charAt(j));
                list.add(str1.toString());   
                str1.deleteCharAt(1);      
            }
            str1.setLength(0);
        }
        System.out.print("Enter a string: ");
        String str2 = sc.nextLine();
        System.out.println(list.indexOf(str2));
    }
}