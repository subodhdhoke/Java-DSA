public class strings{
    public static void substring(String str,int si,int ei){
        String substr = "";
        for(int i=si ; i<ei ; i++){
            substr += str.charAt(i);
        }
        System.out.println("Substring is : "+substr);
    }
    public static void main(String args[]){
        String s = "HelloWorld";
        substring(s, 3, 7);
        System.out.println(s.substring(3, 7));
       
    }
}