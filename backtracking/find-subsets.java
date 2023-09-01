public class backtrack {
    public static void main(String args[]){
        String str = "abc";
        findsubsets(str, 0, "");
    }
    public static void findsubsets(String str , int i ,String ans){
        if(i==str.length()){
            System.out.println(ans+" ");
            return;
        }


        // yes choice will run when the funtion is in recursive call(up to down)
        findsubsets(str, i+1, ans+str.charAt(i));

        // no choice is also a recursive call but it run after the backtrack
        findsubsets(str, i+1, ans);
        return;
        

    }
}
