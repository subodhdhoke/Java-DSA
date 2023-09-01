public class recursion {
    public static void main(String args[]){
        int n = 1947;
        System.out.print(convertintowwords(n));

    }
    public static String convertintowwords(int n){
        String words[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        if(n<=10){
            return words[n];
        }
        int que = n/10;
        int rem = n%10;
        String remword = words[rem];
        String queword = convertintowwords(que);

        return queword+" "+remword;
        
    }
}
