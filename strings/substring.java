public class substring {
    public static String subString(String str , int si , int ei){
        String substr = "";
        for(int i=si ; i<ei ; i++){
            substr+= str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "helloWorld";
        System.out.println(subString(str, 0, 3));
    }
}
