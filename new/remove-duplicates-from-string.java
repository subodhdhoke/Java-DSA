public class binarystringproblem{
    public static void main(String args[]){
        String str = "appnnacollege";
        removeduplicates(str, new boolean[26],new StringBuilder(""), 0);
    }
    public static void removeduplicates(String str , boolean a[] , StringBuilder newstr , int i){
        if(i==str.length()){
            System.out.println(newstr);
            return;
        }
        if(a[str.charAt(i)-'a']==true){
            removeduplicates(str, a, newstr, i+1);
        }
        else{
            a[str.charAt(i)-'a']=true;
            removeduplicates(str, a, newstr.append(str.charAt(i)), i+1);
        }
    }
}