public class recursion {
    public static void main(String args[]){
        //convert(2342);
        String str = "abcdef";
        System.out.println(length(str, 0, 0));
    }
    static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    // public static void convert(int n){
    //     if(n == 0){
    //         return;
    //     }
    //     int a = n%10;
    //     convert(n/10);
    //     System.out.print(digits[a]+" ");
    // }
    public static int length(String str , int index ,int count){
        if(index == str.length()-1){
            return count;
        }
        length(str, index+1, count);
        count++;
        return count;
    }
}
