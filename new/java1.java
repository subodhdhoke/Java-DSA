public class strings{
    public static void main(String args[]){
        // StringBuilder sb = new StringBuilder("subodh");
        // for(char ch='a' ; ch<='z' ; ch++){
        //     sb.append(ch);
        //     //for this condition we are using string builder thats why the time coplecxity of the is low O(26)
        // }
        // System.out.println(sb);
        String str = "appnnacollege";
        removeduplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
    public static void removeduplicates(String str , int index , StringBuilder newstr , boolean map[]){
    
        if(index == str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(index);
        if(map[currchar-'a']==true){
            removeduplicates(str, index+1, newstr, map);
        }
        else{
            map[currchar-'a'] = true;
            removeduplicates(str, index+1, newstr.append(currchar), map);
        }



    }
}