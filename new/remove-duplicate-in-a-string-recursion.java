import javax.swing.plaf.BorderUIResource;

public class main{
    
    public static void removeduplicates(String str , int idx , StringBuilder newstr , boolean map[]){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        //kaam
        char currchar = str.charAt(idx);
        if(map[currchar-'a'] == true){
            //duplicate
            removeduplicates(str, idx+1, newstr, map);
        }
        else{
            map[currchar-'a'] = true;
            removeduplicates(str, idx+1, newstr.append(currchar), map);
        }
    }
    public static void main(String args[]){
        String str = "appnnacollege";
        removeduplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}