public class recursion {
    public static void main(String args[]){
        String str = "aappnacollage";
        removeduplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
    public static void removeduplicates(String a , int i , StringBuilder newstr , boolean map[]){
        if(i == a.length()){
            System.out.print(newstr);
            return;
        }
        char currchar = a.charAt(i);
        if( map[currchar-'a'] == true){
            removeduplicates(a, i+1, newstr, map);
        }
        else{
            map[currchar - 'a'] = true;
            removeduplicates(a, i, newstr.append(currchar), map);
        }
    }
}
